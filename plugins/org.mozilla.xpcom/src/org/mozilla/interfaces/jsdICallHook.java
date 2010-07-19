/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/jsd/idl/jsdIDebuggerService.idl
 */

package org.mozilla.interfaces;

public interface jsdICallHook extends nsISupports {

  String JSDICALLHOOK_IID =
    "{191d2738-22e8-4756-b366-6c878c87d73b}";

  /**
 * Hook instances of this interface up to the
 * jsdIDebuggerService::functionHook and toplevelHook properties.
 */
/**
     * TYPE_* values must be kept in sync with the JSD_HOOK_* #defines
     * in jsdebug.h.
     */
/**
     * Toplevel script is starting.
     */
  long TYPE_TOPLEVEL_START = 0L;

  /**
     * Toplevel script has completed.
     */
  long TYPE_TOPLEVEL_END = 1L;

  /**
     * Function is being called.
     */
  long TYPE_FUNCTION_CALL = 2L;

  /**
     * Function is returning.
     */
  long TYPE_FUNCTION_RETURN = 3L;

  /**
     * Called before the JavaScript engine executes a top level script or calls
     * a function.
     */
  void onCall(jsdIStackFrame frame, long type);

}