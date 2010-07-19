/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/jsd/idl/jsdIDebuggerService.idl
 */

package org.mozilla.interfaces;

public interface jsdIStackFrame extends jsdIEphemeral {

  String JSDISTACKFRAME_IID =
    "{0633ca73-105e-4e8e-bcc5-13405d61754a}";

  /**
     * True if stack frame represents a native frame.
     */
  boolean getIsNative();

  /**
     * True if stack frame represents a frame created as a result of a debugger
     * evaluation.
     */
  boolean getIsDebugger();

  /**
     * True if stack frame is constructing a new object.
     */
  boolean getIsConstructing();

  /**
     * Link to the caller's stack frame.
     */
  jsdIStackFrame getCallingFrame();

  /**
     * Executon context.
     */
  jsdIContext getExecutionContext();

  /**
     * Function name executing in this stack frame.
     */
  String getFunctionName();

  /**
     * Script running in this stack frame, null for native frames.
     */
  jsdIScript getScript();

  /**
     * Current program counter in this stack frame.
     */
  long getPc();

  /**
     * Current line number (using the script's pc to line map.)
     */
  long getLine();

  /**
     * Function object running in this stack frame.
     */
  jsdIValue getCallee();

  /**
     * Top object in the scope chain.
     */
  jsdIValue getScope();

  /**
     * |this| object for this stack frame.
     */
  jsdIValue getThisValue();

  /**
     * Evaluate arbitrary JavaScript in this stack frame.
     * @param bytes    Script to be evaluated.
     * @param fileName Filename to compile this script under.  This is the
     *                 filename you'll see in error messages, etc.
     * @param line     Starting line number for this script.  One based.
     * @retval         Result of evaluating the script.
     */
  boolean eval(String bytes, String fileName, long line, jsdIValue[] result);

}