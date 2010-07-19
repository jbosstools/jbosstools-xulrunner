/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIUnicharLineInputStream.idl
 */

package org.mozilla.interfaces;

public interface nsIUnicharLineInputStream extends nsISupports {

  String NS_IUNICHARLINEINPUTSTREAM_IID =
    "{67f42475-ba80-40f8-ac0b-649c89230184}";

  /**
   * Read a single line from the stream, where a line is a 
   * possibly zero length sequence of characters terminated by a
   * CR, LF, CRLF, LFCR, or eof.
   * The line terminator is not returned.
   * @retval false
   *         End of file. This line is the last line of the file
   *         (aLine is valid).
   * @retval true
   *         The file contains further lines.
   * @note Do not mix readLine with other read functions.
   *       Doing so can cause various problems and is not supported.
   */
  boolean readLine(String[] aLine);

}