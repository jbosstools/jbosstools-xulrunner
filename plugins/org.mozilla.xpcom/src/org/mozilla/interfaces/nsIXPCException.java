/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/src/xpconnect/idl/xpcexception.idl
 */

package org.mozilla.interfaces;

public interface nsIXPCException extends nsIException {

  String NS_IXPCEXCEPTION_IID =
    "{cac29630-7bf2-4e22-811b-46855a7d5af0}";

  void initialize(String aMessage, long aResult, String aName, nsIStackFrame aLocation, nsISupports aData, nsIException aInner);

}