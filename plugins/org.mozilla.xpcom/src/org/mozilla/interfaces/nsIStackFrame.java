/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/base/nsIException.idl
 */

package org.mozilla.interfaces;

public interface nsIStackFrame extends nsISupports {

  String NS_ISTACKFRAME_IID =
    "{91d82105-7c62-4f8b-9779-154277c0ee90}";

  long getLanguage();

  String getLanguageName();

  String getFilename();

  String getName();

  int getLineNumber();

  String getSourceLine();

  nsIStackFrame getCaller();

  String toString();

}