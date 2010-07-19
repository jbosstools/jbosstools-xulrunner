/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/jsd/idl/jsdIDebuggerService.idl
 */

package org.mozilla.interfaces;

public interface jsdIScript extends jsdIEphemeral {

  String JSDISCRIPT_IID =
    "{18e09893-f461-4b4b-94d3-776fb0069c6f}";

  /**
     * Last version set on this context.
     * Scripts typically select this with the "language" attribute.
     * See the VERSION_* consts on jsdIDebuggerService.
     */
  int getVersion();

  /**
     * Tag value guaranteed unique among jsdIScript objects.  Useful as a
     * hash key in script.
     */
  long getTag();

  /**
     * FLAG_* values need to be kept in sync with JSD_SCRIPT_* #defines in
     * jsdebug.h.
     */
/**
     * Determines whether or not to collect profile information for this
     * script.  The context flag FLAG_PROFILE_WHEN_SET decides the logic.
     */
  long FLAG_PROFILE = 1L;

  /**
     * Determines whether or not to ignore breakpoints, etc. in this script.
     * The context flag JSD_DEBUG_WHEN_SET decides the logic.
     */
  long FLAG_DEBUG = 2L;

  /**
     * FLAG_* attributes from above, OR'd together.
     */
  long getFlags();

  /**
     * FLAG_* attributes from above, OR'd together.
     */
  void setFlags(long aFlags);

  /**
     * Filename given for this script when it was compiled.
     * This data is copied from the underlying structure when the jsdIScript
     * instance is created and is therefore available even after the script is
     * invalidated.
     */
  String getFileName();

  /**
     * Function name for this script.  "anonymous" for unnamed functions (or
     * a function actually named anonymous), empty for top level scripts.
     * This data is copied from the underlying structure when the jsdIScript
     * instance is created and is therefore available even after the script is
     * invalidated.
     */
  String getFunctionName();

  /**
     * The names of the arguments for this function; empty if this is
     * not a function.
     */
  String[] getParameterNames(long[] count);

  /**
     * Fetch the function object as a jsdIValue.
     */
  jsdIValue getFunctionObject();

  /**
     * Source code for this script, without function declaration.
     */
  String getFunctionSource();

  /**
     * Line number in source file containing the first line of this script.
     * This data is copied from the underlying structure when the jsdIScript
     * instance is created and is therefore available even after the script is
     * invalidated.
     */
  long getBaseLineNumber();

  /**
     * Total number of lines in this script.
     * This data is copied from the underlying structure when the jsdIScript
     * instance is created and is therefore available even after the script is
     * invalidated.
     */
  long getLineExtent();

  /**
     * Number of times this script has been called.
     */
  long getCallCount();

  /**
     * Number of times this script called itself, directly or indirectly.
     */
  long getMaxRecurseDepth();

  /**
     * Shortest execution time recorded, in milliseconds.
     */
  double getMinExecutionTime();

  /**
     * Longest execution time recorded, in milliseconds.
     */
  double getMaxExecutionTime();

  /**
     * Total time spent in this function, in milliseconds.
     */
  double getTotalExecutionTime();

  /**
     * Shortest execution time recorded, in milliseconds, excluding time spent
     * in other called code.
     */
  double getMinOwnExecutionTime();

  /**
     * Longest execution time recorded, in milliseconds, excluding time spent
     * in other called code.
     */
  double getMaxOwnExecutionTime();

  /**
     * Total time spent in this function, in milliseconds, excluding time spent
     * in other called code.
     */
  double getTotalOwnExecutionTime();

  /**
     * Clear profile data for this script.
     */
  void clearProfileData();

  long PCMAP_SOURCETEXT = 1L;

  long PCMAP_PRETTYPRINT = 2L;

  /**
     * Get the closest line number to a given PC.
     * The |pcmap| argument specifies which pc to source line map to use.
     */
  long pcToLine(long pc, long pcmap);

  /**
     * Get the first PC associated with a line.
     * The |pcmap| argument specifies which pc to source line map to use.
     */
  long lineToPc(long line, long pcmap);

  /**
     * Determine is a particular line is executable, like checking that
     * lineToPc == pcToLine, except in one call.
     * The |pcmap| argument specifies which pc to source line map to use.
     */
  boolean isLineExecutable(long line, long pcmap);

  /**
     * Set a breakpoint at a PC in this script.
     */
  void setBreakpoint(long pc);

  /**
     * Clear a breakpoint at a PC in this script.
     */
  void clearBreakpoint(long pc);

  /**
     * Clear all breakpoints set in this script.
     */
  void clearAllBreakpoints();

}