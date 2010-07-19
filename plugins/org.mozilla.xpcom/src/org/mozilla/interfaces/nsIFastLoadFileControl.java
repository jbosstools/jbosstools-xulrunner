/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIFastLoadFileControl.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIFastLoadFileControl interface and its subinterfaces are mix-ins for
 * classes implementing nsIObjectInputStream and nsIObjectOutputStream, so that
 * those stream types can be used with nsIFastLoadService to access and compute
 * FastLoad file checksums, update and check FastLoad file dependencies, and
 * multiplex documents loaded via non-blocking i/o.
 *
 * If an nsIObjectInputStream class doesn't support nsIFastLoadReadControl, or
 * an nsIObjectOutputStream class doesn't support nsIFastLoadWriteControl, that
 * implementation may still be useful for object serialization, but it can't be
 * used to read or write a Mozilla FastLoad file.
 */
public interface nsIFastLoadFileControl extends nsISupports {

  String NS_IFASTLOADFILECONTROL_IID =
    "{8a1e2c63-af50-4147-af7e-26289dc180dd}";

  /**
     * Get and set the recorded checksum value from the FastLoad file header.
     */
  long getChecksum();

  /**
     * Get and set the recorded checksum value from the FastLoad file header.
     */
  void setChecksum(long aChecksum);

  /**
     * Multiplexed document control methods.  A FastLoad file may contain
     * multiple interleaved documents identified by a URI specifier string,
     * and indexed for fast multiplexor select by an opaque URI object key.
     * You StartMuxedDocument when initiating a document load, then Select
     * before every batch of calls to (de)serialize document data, and End
     * when the load completes.
     *
     * Document multiplexing is necessary to support incremental FastLoad
     * development in a non-blocking i/o architecture such as Mozilla, where
     * some (but not all, at first, or for a while during development) of the
     * results of parsing and compiling various inputs can be multiplexed to
     * or from a FastLoad file.
     *
     * Note: Select returns the previously selected URI object in case the
     * caller is synchronously selecting and writing data to the FastLoad
     * file, so the caller can reselect the previous URI and return to code
     * the continues to write FastLoad data for the previous URI, unaware of
     * the nested select/write/reselect.
     */
  void startMuxedDocument(nsISupports aURI, String aURISpec);

  nsISupports selectMuxedDocument(nsISupports aURI);

  void endMuxedDocument(nsISupports aURI);

  /**
     * Return true if aURISpec identifies a muxed document in the FastLoad
     * file, false otherwise.
     */
  boolean hasMuxedDocument(String aURISpec);

}