/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/base/nsIDebug.idl
 */

package org.mozilla.interfaces;

/**
 * @status DEPRECATED  Replaced by the NS_DebugBreak function.
 * @status FROZEN
 */
public interface nsIDebug extends nsISupports {

  String NS_IDEBUG_IID =
    "{3bf0c3d7-3bd9-4cf2-a971-33572c503e1e}";

  void assertion(String aStr, String aExpr, String aFile, int aLine);

  void warning(String aStr, String aFile, int aLine);

  void _break(String aFile, int aLine);

  void abort(String aFile, int aLine);

}