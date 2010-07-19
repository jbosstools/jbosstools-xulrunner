/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/base/nsIException.idl
 */

package org.mozilla.interfaces;

public interface nsIException extends nsISupports {

  String NS_IEXCEPTION_IID =
    "{f3a8d3b4-c424-4edc-8bf6-8974c983ba78}";

  String getMessage();

  long getResult();

  String getName();

  String getFilename();

  long getLineNumber();

  long getColumnNumber();

  nsIStackFrame getLocation();

  nsIException getInner();

  nsISupports getData();

  String toString();

}