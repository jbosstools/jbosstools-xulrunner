/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/mozapps/extensions/public/nsIExtensionManager.idl
 */

package org.mozilla.interfaces;

public interface nsIAddonUpdateCheckListener extends nsISupports {

  String NS_IADDONUPDATECHECKLISTENER_IID =
    "{c946119f-9e7c-41aa-a794-803148045350}";

  /**
 * Interface for handling notifications during the addon update check process.
 */
/**
   * Addon update has begun
   */
  void onUpdateStarted();

  long STATUS_NONE = 0L;

  long STATUS_UPDATE = 1L;

  long STATUS_VERSIONINFO = 2L;

  long STATUS_DATA_FOUND = 3L;

  long STATUS_FAILURE = 4L;

  long STATUS_NO_UPDATE = 8L;

  long STATUS_DISABLED = 16L;

  long STATUS_APP_MANAGED = 32L;

  long STATUS_READ_ONLY = 64L;

  long STATUS_PENDING_OP = 128L;

  long STATUS_NOT_MANAGED = 256L;

  long STATUS_DISALLOWED = 496L;

  /**
   * Addon update has ended
   */
  void onUpdateEnded();

  /**
   * Update for an individual addon has begun
   * @param   addon
   *          A nsIUpdateItem object representing the addon being updated
   *
   * @throws  NS_ERROR_ILLEGAL_VALUE if the addon is invalid.
   */
  void onAddonUpdateStarted(nsIUpdateItem addon);

  /**
   * Update for an individual addon has ended
   * @param   addon
   *          A nsIUpdateItem object representing the addon being updated
   * @param   status
   *          The success or failure code of the update operation
   *
   * @throws  NS_ERROR_ILLEGAL_VALUE if the addon is invalid.
   */
  void onAddonUpdateEnded(nsIUpdateItem addon, int status);

}