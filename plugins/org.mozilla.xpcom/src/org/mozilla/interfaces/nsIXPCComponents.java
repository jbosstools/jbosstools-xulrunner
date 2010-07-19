/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/src/xpconnect/idl/xpccomponents.idl
 */

package org.mozilla.interfaces;

/**
* interface of JavaScript's 'Components' object
*/
public interface nsIXPCComponents extends nsISupports {

  String NS_IXPCCOMPONENTS_IID =
    "{155809f1-71f1-47c5-be97-d812ba560405}";

  nsIScriptableInterfaces getInterfaces();

  nsIScriptableInterfacesByID getInterfacesByID();

  nsIXPCComponents_Classes getClasses();

  nsIXPCComponents_ClassesByID getClassesByID();

  nsIStackFrame getStack();

  nsIXPCComponents_Results getResults();

  nsIComponentManager getManager();

  nsIXPCComponents_Utils getUtils();

  nsIXPCComponents_ID getID();

  nsIXPCComponents_Exception getException();

  nsIXPCComponents_Constructor getConstructor();

  boolean isSuccessCode(long result);

  void lookupMethod();

  void reportError();

}