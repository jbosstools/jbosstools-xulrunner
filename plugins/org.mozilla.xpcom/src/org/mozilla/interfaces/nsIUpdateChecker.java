/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/mozapps/update/public/nsIUpdateService.idl
 */

package org.mozilla.interfaces;

/**
 * An interface describing an object that knows how to check for updates.
 */
public interface nsIUpdateChecker extends nsISupports {

  String NS_IUPDATECHECKER_IID =
    "{877ace25-8bc5-452a-8586-9c1cf2871994}";

  /**
   * Checks for available updates, notifying a listener of the results.
   * @param   listener
   *          An object implementing nsIUpdateCheckListener which is notified
   *          of the results of an update check.
   * @param   force
   *          Forces the checker to check for updates, regardless of the
   *          current value of the user's update settings. This is used by
   *          any piece of UI that offers the user the imperative option to
   *          check for updates now, regardless of their update settings.
   *          force will not work if the system administrator has locked
   *          the app.update.enabled preference.
   */
  void checkForUpdates(nsIUpdateCheckListener listener, boolean force);

  /**
   * Constants for the |stopChecking| function that tell the Checker how long
   * to stop checking:
   *
   * CURRENT_CHECK:     Stops the current (active) check only
   * CURRENT_SESSION:   Stops all checking for the current session
   * ANY_CHECKS:        Stops all checking, any session from now on
   *                    (disables update checking preferences)
   */
  int CURRENT_CHECK = 1;

  int CURRENT_SESSION = 2;

  int ANY_CHECKS = 3;

  /**
   * Ends any pending update check.
   * @param   duration
   *          A value representing the set of checks to stop doing.
   */
  void stopChecking(int duration);

}