/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/src/xpconnect/idl/nsIXPCSecurityManager.idl
 */

package org.mozilla.interfaces;

public interface nsIXPCSecurityManager extends nsISupports {

  String NS_IXPCSECURITYMANAGER_IID =
    "{31431440-f1ce-11d2-985a-006008962422}";

  /**
    * These flags are used when calling nsIXPConnect::SetSecurityManager
    */
  long HOOK_CREATE_WRAPPER = 1L;

  long HOOK_CREATE_INSTANCE = 2L;

  long HOOK_GET_SERVICE = 4L;

  long HOOK_CALL_METHOD = 8L;

  long HOOK_GET_PROPERTY = 16L;

  long HOOK_SET_PROPERTY = 32L;

  long HOOK_ALL = 63L;

  long ACCESS_CALL_METHOD = 0L;

  long ACCESS_GET_PROPERTY = 1L;

  long ACCESS_SET_PROPERTY = 2L;

}