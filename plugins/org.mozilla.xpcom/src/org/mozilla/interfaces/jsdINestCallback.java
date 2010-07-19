/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/jsd/idl/jsdIDebuggerService.idl
 */

package org.mozilla.interfaces;

public interface jsdINestCallback extends nsISupports {

  String JSDINESTCALLBACK_IID =
    "{88bea60f-9b5d-4b39-b08b-1c3a278782c6}";

  /**
 * Pass an instance of one of these to jsdIDebuggerService::enterNestedEventLoop.
 */
/**
     * This method will be called after pre-nesting work has completed, such
     * as pushing the js context and network event queue, but before the new
     * event loop starts.
     */
  void onNest();

}