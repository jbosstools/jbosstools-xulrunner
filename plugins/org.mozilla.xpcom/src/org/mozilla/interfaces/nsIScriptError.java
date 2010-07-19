/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/src/xpconnect/idl/nsIScriptError.idl
 */

package org.mozilla.interfaces;

public interface nsIScriptError extends nsIConsoleMessage {

  String NS_ISCRIPTERROR_IID =
    "{b0196fc7-1913-441a-882a-453c0d8b89b8}";

  /** pseudo-flag for default case */
  long errorFlag = 0L;

  /** message is warning */
  long warningFlag = 1L;

  /** exception was thrown for this case - exception-aware hosts can ignore */
  long exceptionFlag = 2L;

  /** error or warning is due to strict option */
  long strictFlag = 4L;

  /**
     * The error message without any context/line number information.
     *
     * @note nsIConsoleMessage.message will return the error formatted
     *       with file/line information.
     */
  String getErrorMessage();

  String getSourceName();

  String getSourceLine();

  long getLineNumber();

  long getColumnNumber();

  long getFlags();

  /**
     * Categories I know about -
     * XUL javascript
     * content javascript (both of these from nsDocShell, currently)
     * component javascript (errors in JS components)
     */
  String getCategory();

  void init(String message, String sourceName, String sourceLine, long lineNumber, long columnNumber, long flags, String category);

  String toString();

}