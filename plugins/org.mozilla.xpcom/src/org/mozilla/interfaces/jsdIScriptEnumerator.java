/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/jsd/idl/jsdIDebuggerService.idl
 */

package org.mozilla.interfaces;

public interface jsdIScriptEnumerator extends nsISupports {

  String JSDISCRIPTENUMERATOR_IID =
    "{5ba76b99-acb1-4ed8-a4e4-a716a7d9097e}";

  /**
 * Pass an instance of one of these to jsdIDebuggerService::enumerateScripts.
 */
/**
     * The enumerateScript method will be called once for every script the
     * debugger knows about.
     */
  void enumerateScript(jsdIScript script);

}