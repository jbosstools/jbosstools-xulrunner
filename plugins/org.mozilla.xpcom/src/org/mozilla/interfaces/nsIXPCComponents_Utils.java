/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/src/xpconnect/idl/xpccomponents.idl
 */

package org.mozilla.interfaces;

/**
* interface of Components.utils
*/
public interface nsIXPCComponents_Utils extends nsISupports {

  String NS_IXPCCOMPONENTS_UTILS_IID =
    "{da2267f2-d4cc-448f-9d70-1c7fe134d2fe}";

  void reportError();

  void lookupMethod();

  nsIXPCComponents_utils_Sandbox getSandbox();

  void evalInSandbox(String source);

  void _import(String registryLocation);

  xpcIJSWeakReference getWeakReference();

  void forceGC();

}