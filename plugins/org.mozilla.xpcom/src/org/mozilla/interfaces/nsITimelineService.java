/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsITimelineService.idl
 */

package org.mozilla.interfaces;

/**
 * nsITimelineService is used to construct a timeline of program
 * execution.  The timeline is output to a file, either stderr or the
 * value of the environment variable NS_TIMELINE_LOG_FILE.  On the
 * Mac, the timeline is output to the file named "timeline.txt".  The
 * reason it's different on the Mac is that the Mac environment
 * initialization code happens after timeline initialization code.
 * 
 * If NS_TIMELINE_INIT_TIME is set in the environment, that will be
 * used as the time of startup; otherwise the current time when mark()
 * is first called will be used.
 * 
 * mark() is used to put marks on the timeline.
 * 
 * indent() and outdent() are used to format the timeline a bit to
 * show nesting.  This doesn't produce perfect results in the face of
 * asychrony and multiple threads.
 * 
 * enter() and leave() are convenience functions that add marks to the
 * timeline and do indentation.
 * 
 * startTimer() and stopTimer() control named stop watches.  If
 * startTimer() is called more than once, an equal number of
 * stopTimer() calls are needed to actually stop the timer.  This
 * makes these timers slightly useful in a threaded environment.
 * 
 * markTimer() puts a mark on the timeline containing the total for
 * the named timer.
 * 
 * Don't use nsITimelineService in C++ code; use the NS_TIMELINE
 * macros instead.  nsITimelineService exists so that JavaScript code
 * can mark the timeline.
 */
public interface nsITimelineService extends nsISupports {

  String NS_ITIMELINESERVICE_IID =
    "{93276790-3daf-11d5-b67d-000064657374}";

  /**
     * mark()
     * Print "<elapsed time>: <text>\n" in the timeline log file.
     */
  void mark(String text);

  /**
     * causes subsequent marks to be indented for a more readable
     * report.
     */
  void indent();

  /**
     * Causes subsequent marks to be outdented.
     */
  void outdent();

  /**
     * enter/leave bracket code with "<text>..." and "...<text>" as
     * well as indentation.
     */
  void enter(String text);

  void leave(String text);

  void startTimer(String timerName);

  void stopTimer(String timerName);

  void markTimer(String timerName);

  void resetTimer(String timerName);

  void markTimerWithComment(String timerName, String comment);

}