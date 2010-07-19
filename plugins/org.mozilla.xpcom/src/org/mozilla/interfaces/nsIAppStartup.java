/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/startup/public/nsIAppStartup.idl
 */

package org.mozilla.interfaces;

public interface nsIAppStartup extends nsISupports {

  String NS_IAPPSTARTUP_IID =
    "{6799abed-4721-4f51-9304-d1a2ea1df5d5}";

  /**
     * Create the hidden window.
     */
  void createHiddenWindow();

  /**
     * Destroys the hidden window. This will have no effect if the hidden window
     * has not yet been created.
     */
  void destroyHiddenWindow();

  /**
     * Runs an application event loop: normally the main event pump which
     * defines the lifetime of the application. If there are no windows open
     * and no outstanding calls to enterLastWindowClosingSurvivalArea this
     * method will exit immediately.
     *
     * @returnCode NS_SUCCESS_RESTART_APP
     *             This return code indicates that the application should be
     *             restarted because quit was called with the eRestart flag.
     */
  void run();

  /**
     * There are situations where all application windows will be
     * closed but we don't want to take this as a signal to quit the
     * app. Bracket the code where the last window could close with
     * these.
     */
  void enterLastWindowClosingSurvivalArea();

  void exitLastWindowClosingSurvivalArea();

  /**
     * The following flags may be passed as the aMode parameter to the quit
     * method.  One and only one of the "Quit" flags must be specified.  The
     * eRestart flag may be bit-wise combined with one of the "Quit" flags to
     * cause the application to restart after it quits.
     */
/**
     * Attempt to quit if all windows are closed.
     */
  long eConsiderQuit = 1L;

  /**
     * Try to close all windows, then quit if successful.
     */
  long eAttemptQuit = 2L;

  /**
     * Quit, damnit!
     */
  long eForceQuit = 3L;

  /**
     * Restart the application after quitting.  The application will be
     * restarted with the same profile and an empty command line.
     */
  long eRestart = 16L;

  /**
     * Exit the event loop, and shut down the app.
     *
     * @param aMode
     *        This parameter modifies how the app is shutdown, and it is
     *        constructed from the constants defined above.
     */
  void quit(long aMode);

}