/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/jsd/idl/jsdIDebuggerService.idl
 */

package org.mozilla.interfaces;

public interface jsdIDebuggerService extends nsISupports {

  String JSDIDEBUGGERSERVICE_IID =
    "{dc0a24db-f8ac-4889-80d0-6016545a2dda}";

  /**
     * Called when an error or warning occurs.
     */
  jsdIErrorHook getErrorHook();

  /**
     * Called when an error or warning occurs.
     */
  void setErrorHook(jsdIErrorHook aErrorHook);

  /**
     * Called when a jsdIScript is created or destroyed.
     */
  jsdIScriptHook getScriptHook();

  /**
     * Called when a jsdIScript is created or destroyed.
     */
  void setScriptHook(jsdIScriptHook aScriptHook);

  /**
     * Called when the engine encounters a breakpoint.
     */
  jsdIExecutionHook getBreakpointHook();

  /**
     * Called when the engine encounters a breakpoint.
     */
  void setBreakpointHook(jsdIExecutionHook aBreakpointHook);

  /**
     * Called when the engine encounters the debugger keyword.
     */
  jsdIExecutionHook getDebuggerHook();

  /**
     * Called when the engine encounters the debugger keyword.
     */
  void setDebuggerHook(jsdIExecutionHook aDebuggerHook);

  /**
     * Called when the errorHook returns false.
     */
  jsdIExecutionHook getDebugHook();

  /**
     * Called when the errorHook returns false.
     */
  void setDebugHook(jsdIExecutionHook aDebugHook);

  /**
     * Called before the next PC is executed.
     */
  jsdIExecutionHook getInterruptHook();

  /**
     * Called before the next PC is executed.
     */
  void setInterruptHook(jsdIExecutionHook aInterruptHook);

  /**
     * Called when an exception is thrown (even if it will be caught.)
     */
  jsdIExecutionHook getThrowHook();

  /**
     * Called when an exception is thrown (even if it will be caught.)
     */
  void setThrowHook(jsdIExecutionHook aThrowHook);

  /**
     * Called before and after a toplevel script is evaluated.
     */
  jsdICallHook getTopLevelHook();

  /**
     * Called before and after a toplevel script is evaluated.
     */
  void setTopLevelHook(jsdICallHook aTopLevelHook);

  /**
     * Called before and after a function is called.
     */
  jsdICallHook getFunctionHook();

  /**
     * Called before and after a function is called.
     */
  void setFunctionHook(jsdICallHook aFunctionHook);

  /**
     * VERSION_* values must be kept in sync with the JSVersion enumeration in
     * jspubtd.h.
     */
/**
     * Possible values for jsdIScript::version and jsdIContext::version.
     */
  int VERSION_1_0 = 100;

  int VERSION_1_1 = 110;

  int VERSION_1_2 = 120;

  int VERSION_1_3 = 130;

  int VERSION_1_4 = 140;

  int VERSION_1_5 = 150;

  int VERSION_DEFAULT = 0;

  int VERSION_UNKNOWN = -1;

  /**
     * These flags need to be kept in sync with the context flags defined in
     * jsdebug.h
     */
/**
     * Link native frames in call stacks.
     */
  long ENABLE_NATIVE_FRAMES = 1L;

  /**
     * Normally, if a script has a 0 in JSD_SCRIPT_PROFILE_BIT it is included in
     * profile data, otherwise it is not profiled.  Setting the
     * PROFILE_WHEN_SET flag reverses this convention.
     */
  long PROFILE_WHEN_SET = 2L;

  /**
     * Normally, when the script in the top frame of a thread state has a 1 in
     * JSD_SCRIPT_DEBUG_BIT, the execution hook is ignored.  Setting the
     * DEBUG_WHEN_SET flag reverses this convention.
     */
  long DEBUG_WHEN_SET = 4L;

  /**
     * When this flag is set the internal call hook will collect profile data.
     */
  long COLLECT_PROFILE_DATA = 8L;

  /**
     * When this flag is set, stack frames that are disabled for debugging
     * will not appear in the call stack chain.
     */
  long HIDE_DISABLED_FRAMES = 16L;

  /**
     * When this flag is set, the debugger will only check the
     * JSD_SCRIPT_DEBUG_BIT on the top (most recent) stack frame.  This
     * makes it possible to stop in an enabled frame which was called from
     * a stack that contains a disabled frame.
     *
     * When this flag is *not* set, any stack that contains a disabled frame
     * will not be debugged (the execution hook will not be invoked.)
     *
     * This only applies when the reason for calling the hook would have
     * been TYPE_INTERRUPTED or TYPE_THROW.  TYPE_BREAKPOINT,
     * TYPE_DEBUG_REQUESTED, and TYPE_DEBUGGER_KEYWORD always stop, regardless
     * of this setting, as long as the top frame is not disabled.
     *
     * If HIDE_DISABLED_FRAMES is set, this is effectively set as well.
     */
  long MASK_TOP_FRAME_ONLY = 32L;

  /**
     * When this flag is set, object creation will not be tracked.  This will
     * reduce the performance price you pay by enabling the debugger.
     */
  long DISABLE_OBJECT_TRACE = 64L;

  /**
     * Debugger service flags.
     */
  long getFlags();

  /**
     * Debugger service flags.
     */
  void setFlags(long aFlags);

  /**
     * Major version number of implementation.
     */
  long getImplementationMajor();

  /**
     * Minor version number of implementation.
     */
  long getImplementationMinor();

  /**
     * Free form AUTF8String identifier for implementation.
     */
  String getImplementationString();

  /**
     * |true| if the debugger should register an app-start observer in order
     * to begin collecting debug information when mozilla is launched.
     */
  boolean getInitAtStartup();

  /**
     * |true| if the debugger should register an app-start observer in order
     * to begin collecting debug information when mozilla is launched.
     */
  void setInitAtStartup(boolean aInitAtStartup);

  /**
     * |true| if the debugger service has been turned on.  This does not
     * necessarily mean another app is actively using the service, as the 
     * autostart pref may have turned the service on.
     */
  boolean getIsOn();

  /**
     * Turn on the debugger.  This function should only be called from JavaScript
     * code.  The debugger will be enabled on the runtime the call is made on,
     * as determined by nsIXPCNativeCallContext.
     */
  void on();

  /**
     * Turn the debugger off.  This will invalidate all of your jsdIEphemeral
     * derived objects, and clear all of your breakpoints.  In theory you
     * should be able to turn the debugger back on at some later time without
     * any problems.
     */
  void off();

  /**
     * Peek at the current pause depth of the debugger.
     *
     * @return depth Number of pause() calls still waiting to be unPause()d.
     */
  long getPauseDepth();

  /**
     * Temporarily disable the debugger.  Hooks will not be called while the
     * debugger is paused.  Multiple calls to pause will increase the "pause
     * depth", and equal number of unPause calles must be made to resume
     * normal debugging.
     *
     * @return depth Number of times pause has been called since the debugger
     *               has been unpaused.
     */
  long pause();

  /**
     * Undo a pause.
     *
     * @return depth The number of remaining pending pause calls.
     */
  long unPause();

  /**
     * Force the engine to perform garbage collection.
     */
  void gC();

  /**
     * Clear profile data for all scripts.
     */
  void clearProfileData();

  /**
     * Adds an execution hook filter.  These filters are consulted each time one
     * of the jsdIExecutionHooks is about to be called.  Filters are matched in
     * a first in, first compared fashion.  The first filter to match determines
     * whether or not the hook is called.  Use swapFilter to reorder existing
     * filters, and removeFilter to remove them.
     *
     * If |filter| is already present this method throws NS_ERROR_INVALID_ARG.
     *
     * @param filter Object representing the filter to add.
     * @param after  Insert |filter| after this one.  Pass null to insert at
     *               the beginning.
     */
  void insertFilter(jsdIFilter filter, jsdIFilter after);

  /**
     * Same as insertFilter, except always add to the end of the list.
     */
  void appendFilter(jsdIFilter filter);

  /**
     * Remove a filter.
     *
     * If |filter| is not present this method throws NS_ERROR_INVALID_ARG.
     *
     * @param filter Object representing the filter to remove.  Must be the exact
     * object passed to addFilter, not just a new object with the same
     * properties.
     */
  void removeFilter(jsdIFilter filter);

  /**
     * Swap position of two filters.
     * 
     * If |filter_a| is not present, this method throws NS_ERROR_INVALID_ARG.
     * If |filter_b| is not present, filter_a is replaced by filter_b.
     * If |filter_a| == |filter_b|, then filter is refreshed.
     */
  void swapFilters(jsdIFilter filter_a, jsdIFilter filter_b);

  /**
     * Enumerate registered filters.  This routine refreshes each filter before
     * passing them on to the enumeration function.  Calling this with a null
     * |enumerator| is equivalent to jsdIService::refreshFilters.
     *
     * @param enumerator jsdIFilterEnumerator instance to be called back for the
     *                   enumeration.
     */
  void enumerateFilters(jsdIFilterEnumerator enumerator);

  /**
     * Force the debugger to resync its internal filter cache with the
     * actual values in the jsdIFilter objects.  To refresh a single filter
     * use jsdIService::swapFilters.  This method is equivalent to
     * jsdIService::enumerateFilters with a null enumerator.
     */
  void refreshFilters();

  /**
     * Clear the list of filters.
     */
  void clearFilters();

  /**
     * Enumerate all known contexts.
     */
  void enumerateContexts(jsdIContextEnumerator enumerator);

  /**
     * Enumerate all scripts the debugger knows about.  Any scripts created
     * before you turned the debugger on, or after turning the debugger off
     * will not be available unless the autostart perf is set.
     *
     * @param enumerator jsdIScriptEnumerator instance to be called back for
     *                   the enumeration.
     */
  void enumerateScripts(jsdIScriptEnumerator enumerator);

  /**
     * Clear all breakpoints in all scripts.
     */
  void clearAllBreakpoints();

  /**
     * When called from JavaScript, this method returns the jsdIValue wrapper
     * for the given value.  If a wrapper does not exist one will be created.
     * When called from another language this method returns an xpconnect
     * defined error code.
     */
  jsdIValue wrapValue();

  /**
     * Push a new network queue, and enter a new UI event loop.
     * @param callback jsdINestCallback instance to be called back after the
     *                 network queue has been pushed, but before the
     *                 UI loop starts.
     * @return depth returns the current number of times the event loop has been
     *               nested.  your code can use it for sanity checks.
     */
  long enterNestedEventLoop(jsdINestCallback callback);

  /**
     * Exit the current nested event loop after the current iteration completes,
     * and pop the network event queue.
     *
     * @return depth returns the current number of times the event loop has been
     *               nested.  your code can use it for sanity checks.
     */
  long exitNestedEventLoop();

  /**
     * Output dump of JS heap.
     *
     * @param fileName Filename to dump the heap into.
     */
  void dumpHeap(String fileName);

}