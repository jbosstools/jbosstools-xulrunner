/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIScriptableInputStream.idl
 */

package org.mozilla.interfaces;

/**
 * nsIScriptableInputStream provides scriptable access to an nsIInputStream
 * instance.
 *
 * @status FROZEN
 */
public interface nsIScriptableInputStream extends nsISupports {

  String NS_ISCRIPTABLEINPUTSTREAM_IID =
    "{a2a32f90-9b90-11d3-a189-0050041caf44}";

  /** 
     * Closes the stream. 
     */
  void close();

  /**
     * Wrap the given nsIInputStream with this nsIScriptableInputStream. 
     *
     * @param aInputStream parameter providing the stream to wrap 
     */
  void init(nsIInputStream aInputStream);

  /**
     * Return the number of bytes currently available in the stream 
     *
     * @return the number of bytes 
     *
     * @throws NS_BASE_STREAM_CLOSED if called after the stream has been closed
     */
  long available();

  /**
     * Read data from the stream.
     *
     * WARNING: If the data contains a null byte, then this method will return
     * a truncated string.
     *
     * @param aCount the maximum number of bytes to read 
     *
     * @return the data, which will be an empty string if the stream is at EOF.
     *
     * @throws NS_BASE_STREAM_CLOSED if called after the stream has been closed
     * @throws NS_ERROR_NOT_INITIALIZED if init was not called
     */
  String read(long aCount);

}