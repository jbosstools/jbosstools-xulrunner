/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/mozapps/update/public/nsIUpdateService.idl
 */

package org.mozilla.interfaces;

/**
 * An interface describing an object that listens to the progress of an update
 * check operation. This object is notified as the check continues, finishes
 * and if it has an error.
 */
public interface nsIUpdateCheckListener extends nsISupports {

  String NS_IUPDATECHECKLISTENER_IID =
    "{8cbceb6e-8e27-46f2-8808-444c6499f836}";

  /**
   * Called every time there is a progress notification loading the Update
   * Service file.
   * @param   request
   *          The nsIXMLHttpRequest handling the update check.
   * @param   position
   *          The current byte downloaded
   * @param   totalSize
   *          The total number of bytes that have to be downloaded
   */
  void onProgress(nsIXMLHttpRequest request, long position, long totalSize);

  /**
   * The update check was completed.
   * @param   request
   *          The nsIXMLHttpRequest handling the update check.
   * @param   updates
   *          An array of nsIUpdate objects listing available updates.
   * @param   updateCount
   *          The size of the |updates| array.
   */
  void onCheckComplete(nsIXMLHttpRequest request, nsIUpdate[] updates, long updateCount);

  /**
   * An error occurred while loading the remote update service file.
   * @param   request
   *          The nsIXMLHttpRequest handling the update check.
   * @param   update
   *          A nsIUpdate object that contains details about the
   *          error in its |statusText| property.
   */
  void onError(nsIXMLHttpRequest request, nsIUpdate update);

}