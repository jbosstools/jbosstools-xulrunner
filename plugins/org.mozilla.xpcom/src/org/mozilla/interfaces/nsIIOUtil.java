/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIIOUtil.idl
 */

package org.mozilla.interfaces;

/**
 * nsIIOUtil provdes various xpcom/io-related utility methods.
 */
public interface nsIIOUtil extends nsISupports {

  String NS_IIOUTIL_IID =
    "{e8152f7f-4209-4c63-ad23-c3d2aa0c5a49}";

  /**
   * Test whether an input stream is buffered.  See nsStreamUtils.h
   * documentation for NS_InputStreamIsBuffered for the definition of
   * "buffered" used here and for edge-case behavior.
   *
   * @throws NS_ERROR_INVALID_POINTER if null is passed in.
   */
  boolean inputStreamIsBuffered(nsIInputStream aStream);

  /**
   * Test whether an output stream is buffered.  See nsStreamUtils.h
   * documentation for NS_OutputStreamIsBuffered for the definition of
   * "buffered" used here and for edge-case behavior.
   *
   * @throws NS_ERROR_INVALID_POINTER if null is passed in.
   */
  boolean outputStreamIsBuffered(nsIOutputStream aStream);

}