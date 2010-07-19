/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/jsd/idl/jsdIDebuggerService.idl
 */

package org.mozilla.interfaces;

public interface jsdIContextEnumerator extends nsISupports {

  String JSDICONTEXTENUMERATOR_IID =
    "{d96af02e-3379-4db5-885d-fee28d178701}";

  /**
 * Pass an instance of one of these to jsdIDebuggerService::enumerateContexts.
 */
/**
     * The enumerateContext method will be called once for every context
     * currently in use.
     */
  void enumerateContext(jsdIContext executionContext);

}