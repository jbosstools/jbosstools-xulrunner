/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIStringStream.idl
 */

package org.mozilla.interfaces;

/**
 * nsIStringInputStream
 *
 * Provides scriptable and specialized C++-only methods for initializing a
 * nsIInputStream implementation with a simple character array.
 *
 * @status UNDER_REVIEW
 */
public interface nsIStringInputStream extends nsIInputStream {

  String NS_ISTRINGINPUTSTREAM_IID =
    "{450cd2d4-f0fd-424d-b365-b1251f80fd53}";

  /**
     * SetData - assign data to the input stream (copied on assignment).
     *
     * @param data    - stream data
     * @param dataLen - stream data length (-1 if length should be computed)
     *
     * NOTE: C++ code should consider using AdoptData or ShareData to avoid
     * making an extra copy of the stream data.
     *
     * NOTE: For JS callers, the given data must not contain null characters
     * (other than a null terminator) because a null character in the middle of
     * the data string will be seen as a terminator when the data is converted
     * from a JS string to a C++ character array.
     */
  void setData(String data, int dataLen);

}