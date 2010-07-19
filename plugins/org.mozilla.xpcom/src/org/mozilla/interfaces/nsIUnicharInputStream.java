/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIUnicharInputStream.idl
 */

package org.mozilla.interfaces;

public interface nsIUnicharInputStream extends nsISupports {

  String NS_IUNICHARINPUTSTREAM_IID =
    "{d5e3bd80-6723-4b92-b0c9-22f6162fd94f}";

  /**
   * Read into a string object.
   * @param aCount The number of characters that should be read
   * @return The number of characters that were read.
   */
  long readString(long aCount, String[] aString);

  /**
  * Close the stream and free associated resources. This also closes the
  * underlying stream, if any.
  */
  void close();

}