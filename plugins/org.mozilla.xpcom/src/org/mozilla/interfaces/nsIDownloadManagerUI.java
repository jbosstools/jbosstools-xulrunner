/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/downloads/public/nsIDownloadManagerUI.idl
 */

package org.mozilla.interfaces;

public interface nsIDownloadManagerUI extends nsISupports {

  String NS_IDOWNLOADMANAGERUI_IID =
    "{ca7663d5-69e3-4c4a-b754-f462bd36b05f}";

  /**
   * The reason that should be passed when the user requests to show the
   * download manager's UI.
   */
  short REASON_USER_INTERACTED = 0;

  /**
   * The reason that should be passed to the show method when we are displaying
   * the UI because a new download is being added to it.
   */
  short REASON_NEW_DOWNLOAD = 1;

  /**
  * Shows the Download Manager's UI to the user.
  *
  * @param [optional] aWindowContext
  *        The parent window context to show the UI.
  * @param [optional] aID
  *        The id of the download to be preselected upon opening.
  * @param [optional] aReason
  *        The reason to show the download manager's UI.  This defaults to
  *        REASON_USER_INTERACTED, and should be one of the previously listed
  *        constants.
  */
  void show(nsIInterfaceRequestor aWindowContext, long aID, short aReason);

  /**
  * Indicates if the UI is visible or not.
  */
  boolean getVisible();

  /**
  * Brings attention to the UI if it is already visible
  *
  * @throws NS_ERROR_UNEXPECTED if the UI is not visible.
  */
  void getAttention();

}