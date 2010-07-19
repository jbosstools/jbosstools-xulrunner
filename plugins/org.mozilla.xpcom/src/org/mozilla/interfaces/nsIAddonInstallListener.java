/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/mozapps/extensions/public/nsIExtensionManager.idl
 */

package org.mozilla.interfaces;

public interface nsIAddonInstallListener extends nsISupports {

  String NS_IADDONINSTALLLISTENER_IID =
    "{2333b04c-f371-4dea-a2f1-d8fdb0c82866}";

  /**
 * Interface for handling download and install progress notifications for
 * add-ons.
 */
/**
   * Called when an add-on download starts. This will be called for every add-on
   * downloaded including those started by an add-on update.
   * @param   addon
   *          The add-on that is being downloaded
   */
  void onDownloadStarted(nsIUpdateItem addon);

  /**
   * Progress occurred in the download operation. This will be called multiple
   * times during the download of an add-on.
   * @param   addon
   *          The add-on that progress occurred for
   * @param   value
   *          The value of the current progress
   * @param   maxValue
   *          The maximum value |value| can reach
   */
  void onDownloadProgress(nsIUpdateItem addon, long value, long maxValue);

  /**
   * Called when an add-on download is complete. This will be called for every
   * add-on downloaded.
   * @param   addon
   *          The add-on that finished downloading
   */
  void onDownloadEnded(nsIUpdateItem addon);

  /**
   * Called when the extension manager starts to install an add-on either
   * through a call to installItemFromFile or from a webpage triggered install.
   * @param   addon
   *          The add-on being installed
   */
  void onInstallStarted(nsIUpdateItem addon);

  /**
   * Called when an add-on compatibility check starts. This will be called 
   * during an install if an add-on is incompatible according to its
   * install.rdf.
   * @param   addon
   *          The add-on that the compatibility check will be for
   */
  void onCompatibilityCheckStarted(nsIUpdateItem addon);

  /**
   * Called at the end of an add-on compatibility check. The status will be one
   * of the results from nsIAddonUpdateCheckListener to indicate whether new
   * information was found or not.
   * @param   addon
   *          The add-on that is having its compatibility checked
   * @param   status
   *          The status code from nsIAddonUpdateCheckListener for the update
   *          operation
   */
  void onCompatibilityCheckEnded(nsIUpdateItem addon, int status);

  /**
   * Called when an add-on install completes. The status will be 0 on success.
   * any other value constitutes a failed install.
   * @param   addon
   *          The add-on that finished installing
   * @param   status
   *          The status of the installation from nsInstall.h
   */
  void onInstallEnded(nsIUpdateItem addon, int status);

  /**
   * Called when there are no more add-on downloads or installs in progress.
   */
  void onInstallsCompleted();

}