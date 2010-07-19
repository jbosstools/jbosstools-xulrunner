/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/threads/nsITimer.idl
 */

package org.mozilla.interfaces;

/**
 * The callback interface for timers.
 */
public interface nsITimer extends nsISupports {

  String NS_ITIMER_IID =
    "{193fc37a-8aa4-4d29-aa57-1acd87c26b66}";

  /**
 * nsITimer instances must be initialized by calling one of the "init" methods
 * documented below.  You may also re-initialize (using one of the init()
 * methods) an existing instance to avoid the overhead of destroying and
 * creating a timer.  It is not necessary to cancel the timer in that case.
 */
/**
   * Type of a timer that fires once only.
   */
  short TYPE_ONE_SHOT = 0;

  /**
   * After firing, a TYPE_REPEATING_SLACK timer is stopped and not restarted
   * until its callback completes.  Specified timer period will be at least
   * the time between when processing for last firing the callback completes
   * and when the next firing occurs.
   *
   * This is the preferable repeating type for most situations.
   */
  short TYPE_REPEATING_SLACK = 1;

  /**
   * An TYPE_REPEATING_PRECISE repeating timer aims to have constant period
   * between firings.  The processing time for each timer callback should not
   * influence the timer period.  However, if the processing for the last
   * timer firing could not be completed until just before the next firing
   * occurs, then you could have two timer notification routines being
   * executed in quick succession.
   */
  short TYPE_REPEATING_PRECISE = 2;

  /**
   * Initialize a timer that will fire after the said delay.
   * A user must keep a reference to this timer till it is 
   * is no longer needed or has been cancelled.
   *
   * @param aObserver   the callback object that observes the 
   *                    ``timer-callback'' topic with the subject being
   *                    the timer itself when the timer fires:
   *
   *                    observe(nsISupports aSubject, => nsITimer
   *                            string aTopic,        => ``timer-callback''
   *                            wstring data          =>  null
   *
   * @param aDelay      delay in milliseconds for timer to fire
   * @param aType       timer type per TYPE* consts defined above
   */
  void init(nsIObserver aObserver, long aDelay, long aType);

  /**
   * Initialize a timer to fire after the given millisecond interval.
   * This version takes a function to call and a closure to pass to
   * that function.
   *
   * @param aFunc      nsITimerCallback interface to call when timer expires
   * @param aDelay     The millisecond interval
   * @param aType      Timer type per TYPE* consts defined above
   */
  void initWithCallback(nsITimerCallback aCallback, long aDelay, long aType);

  /**
   * Cancel the timer.  This method works on all types, not just on repeating
   * timers -- you might want to cancel a TYPE_ONE_SHOT timer, and even reuse
   * it by re-initializing it (to avoid object destruction and creation costs
   * by conserving one timer instance).
   */
  void cancel();

  /**
   * The millisecond delay of the timeout.
   *
   * NOTE: Re-setting the delay on a one-shot timer that has already fired
   * doesn't restart the timer. Call one of the init() methods to restart
   * a one-shot timer.
   */
  long getDelay();

  /**
   * The millisecond delay of the timeout.
   *
   * NOTE: Re-setting the delay on a one-shot timer that has already fired
   * doesn't restart the timer. Call one of the init() methods to restart
   * a one-shot timer.
   */
  void setDelay(long aDelay);

  /**
   * The timer type - one of the above TYPE_* constants.
   */
  long getType();

  /**
   * The timer type - one of the above TYPE_* constants.
   */
  void setType(long aType);

  /**
   * The nsITimerCallback object passed to initWithCallback.
   */
  nsITimerCallback getCallback();

  /**
   * The nsIEventTarget where the callback will be dispatched. Note that this
   * target may only be set before the call to one of the init methods above.
   */
  nsIEventTarget getTarget();

  /**
   * The nsIEventTarget where the callback will be dispatched. Note that this
   * target may only be set before the call to one of the init methods above.
   */
  void setTarget(nsIEventTarget aTarget);

}