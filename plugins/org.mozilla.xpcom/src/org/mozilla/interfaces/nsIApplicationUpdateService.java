/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/mozapps/update/public/nsIUpdateService.idl
 */

package org.mozilla.interfaces;

/**
 * An interface describing a global application service that handles performing
 * background update checks and provides utilities for selecting and
 * downloading update patches.
 */
public interface nsIApplicationUpdateService extends nsISupports {

  String NS_IAPPLICATIONUPDATESERVICE_IID =
    "{9849c4bf-5197-4d22-baa8-e3b44a1703d2}";

  /**
   * The Update Checker used for background update checking.
   */
  nsIUpdateChecker getBackgroundChecker();

  /**
   * Selects the best update to install from a list of available updates.
   * @param   updates
   *          An array of updates that are available
   * @param   updateCount
   *          The length of the |updates| array
   */
  nsIUpdate selectUpdate(nsIUpdate[] updates, long updateCount);

  /**
   * Adds a listener that receives progress and state information about the
   * update that is currently being downloaded, e.g. to update a user
   * interface.
   * @param   listener
   *          An object implementing nsIRequestObserver and optionally
   *          nsIProgressEventSink that is to be notified of state and
   *          progress information as the update is downloaded.
   */
  void addDownloadListener(nsIRequestObserver listener);

  /**
   * Removes a listener that is receiving progress and state information
   * about the update that is currently being downloaded.
   * @param   listener
   *          The listener object to remove.
   */
  void removeDownloadListener(nsIRequestObserver listener);

  /**
   *
   */
  String downloadUpdate(nsIUpdate update, boolean background);

  /**
   * Pauses the active update download process
   */
  void pauseDownload();

  /**
   * Whether or not there is an download happening at the moment.
   */
  boolean getIsDownloading();

  /**
   * Whether or not the Update Service can download and install updates.
   * This is a function of whether or not the current user has access
   * privileges to the install directory.
   */
  boolean getCanUpdate();

}