/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/jsd/idl/jsdIDebuggerService.idl
 */

package org.mozilla.interfaces;

public interface jsdIScriptHook extends nsISupports {

  String JSDISCRIPTHOOK_IID =
    "{cf7ecc3f-361b-44af-84a7-4b0d6cdca204}";

  /**
 * Set jsdIDebuggerService::scriptHook to an instance of one of these.
 */
/**
     * Called when scripts are created.
     */
  void onScriptCreated(jsdIScript script);

  /**
     * Called when the JavaScript engine destroys a script.  The jsdIScript
     * object passed in will already be invalidated.
     */
  void onScriptDestroyed(jsdIScript script);

}