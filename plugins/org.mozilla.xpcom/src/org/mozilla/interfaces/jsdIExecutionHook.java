/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/jsd/idl/jsdIDebuggerService.idl
 */

package org.mozilla.interfaces;

public interface jsdIExecutionHook extends nsISupports {

  String JSDIEXECUTIONHOOK_IID =
    "{3a722496-9d78-4f0a-a797-293d9e8cb8d2}";

  /**
 * Hook instances of this interface up to the
 * jsdIDebuggerService::breakpointHook, debuggerHook, errorHook, interruptHook,
 * and throwHook properties.
 */
/**
     * TYPE_* values must be kept in sync with JSD_HOOK_* #defines in jsdebug.h.
     */
/**
     * Execution stopped because we're in single step mode.
     */
  long TYPE_INTERRUPTED = 0L;

  /**
     * Execution stopped by a trap instruction (i.e. breakoint.)
     */
  long TYPE_BREAKPOINT = 1L;

  /**
     * Error handler returned an "invoke debugger" value.
     */
  long TYPE_DEBUG_REQUESTED = 2L;

  /**
     * Debugger keyword encountered.
     */
  long TYPE_DEBUGGER_KEYWORD = 3L;

  /**
     * Exception was thrown.
     */
  long TYPE_THROW = 4L;

  /**
     * RETURN_* values must be kept in sync with JSD_HOOK_RETURN_* #defines in
     * jsdebug.h.
     */
/**
     * Indicates unrecoverable error processing the hook.  This will cause
     * the script being executed to be aborted without raising a JavaScript
     * exception.
     */
  long RETURN_HOOK_ERROR = 0L;

  /**
     * Continue processing normally.  This is the "do nothing special" return
     * value for all hook types *except* TYPE_THROW.  Returning RETURN_CONTINUE
     * from TYPE_THROW cause the exception to be ignored.  Return
     * RETURN_CONTINUE_THROW to continue exception processing from TYPE_THROW
     * hooks.
     */
  long RETURN_CONTINUE = 1L;

  /**
     * Same effect as RETURN_HOOK_ERROR.
     */
  long RETURN_ABORT = 2L;

  /**
     * Return the value of the |val| parameter.
     */
  long RETURN_RET_WITH_VAL = 3L;

  /**
     * Throw the value of the |val| parameter.
     */
  long RETURN_THROW_WITH_VAL = 4L;

  /**
     * Continue the current throw.
     */
  long RETURN_CONTINUE_THROW = 5L;

  /**
     * @param frame A jsdIStackFrame object representing the bottom stack frame.
     * @param type  One of the jsdIExecutionHook::TYPE_ constants.
     * @param val   in  - Current exception (if any) when this method is called.
     *              out - If you return RETURN_THROW_WITH_VAL, value to be
     *                    thrown.
     *                    If you return RETURN_RET_WITH_VAL, value to return.
     *                    All other return values, not significant.
     * @retval      One of the jsdIExecutionHook::RETURN_* constants.
     */
  long onExecute(jsdIStackFrame frame, long type, jsdIValue[] val);

}