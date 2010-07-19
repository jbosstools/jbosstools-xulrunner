/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsILineInputStream.idl
 */

package org.mozilla.interfaces;

public interface nsILineInputStream extends nsISupports {

  String NS_ILINEINPUTSTREAM_IID =
    "{c97b466c-1e6e-4773-a4ab-2b2b3190a7a6}";

  /**
   * Read a single line from the stream, where a line is a 
   * possibly zero length sequence of 8bit chars terminated by a
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