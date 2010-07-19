/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/mozapps/update/public/nsIUpdateService.idl
 */

package org.mozilla.interfaces;

/**
 * An interface describing an object that can show various kinds of Update
 * notification UI to the user.
 */
public interface nsIUpdatePrompt extends nsISupports {

  String NS_IUPDATEPROMPT_IID =
    "{599fd3c6-ec68-4499-ada5-2997739c97a6}";

  /**
   * Shows a user interface that checks for and then displays the available
   * updates.
   */
  void checkForUpdates();

  /**
   * Show a message advising that an update is available for download and
   * install.
   * @param   update
   *          The update to be downloaded and installed
   */
  void showUpdateAvailable(nsIUpdate update);

  /**
   * Show a message advising that an update has now been downloaded and that
   * a restart is necessary to complete the update.
   * @param   update
   *          The update that was downloaded
   * @param   background
   *          Less obtrusive UI, starting with a non-modal notification alert
   */
  void showUpdateDownloaded(nsIUpdate update, boolean background);

  /**
   * Shows a message that an update was installed successfully.
   */
  void showUpdateInstalled();

  /**
   * Shows an error message UI telling the user about some kind of update
   * failure, e.g. failure to apply patch.
   * @param   update
   *          The nsIUpdate object which we could not install
   */
  void showUpdateError(nsIUpdate update);

  /**
   * Shows a list of all updates installed to date.
   * @param   parent
   *          A parent window to anchor this window to. Can be null.
   */
  void showUpdateHistory(nsIDOMWindow parent);

}