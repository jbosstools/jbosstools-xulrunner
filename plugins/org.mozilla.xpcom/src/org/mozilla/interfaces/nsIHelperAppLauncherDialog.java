/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/uriloader/exthandler/nsIHelperAppLauncherDialog.idl
 */

package org.mozilla.interfaces;

/**
 * This interface is used to display a confirmation dialog before
 * launching a "helper app" to handle content not handled by
 * Mozilla.
 *
 * Usage:  Clients (of which there is one: the nsIExternalHelperAppService
 * implementation in mozilla/uriloader/exthandler) create an instance of
 * this interface (using the contract ID) and then call the show() method.
 *
 * The dialog is shown non-modally.  The implementation of the dialog
 * will access methods of the nsIHelperAppLauncher passed in to show()
 * in order to cause a "save to disk" or "open using" action.
 */
public interface nsIHelperAppLauncherDialog extends nsISupports {

  String NS_IHELPERAPPLAUNCHERDIALOG_IID =
    "{f3704fdc-8ae6-4eba-a3c3-f02958ac0649}";

  /**
   * This request is passed to the helper app dialog because Gecko can not
   * handle content of this type.
   */
  long REASON_CANTHANDLE = 0L;

  /**
   * The server requested external handling.
   */
  long REASON_SERVERREQUEST = 1L;

  /**
   * Gecko detected that the type sent by the server (e.g. text/plain) does
   * not match the actual type.
   */
  long REASON_TYPESNIFFED = 2L;

  /**
   * Show confirmation dialog for launching application (or "save to
   * disk") for content specified by aLauncher.
   *
   * @param aLauncher
   *        A nsIHelperAppLauncher to be invoked when a file is selected.
   * @param aWindowContext
   *        Window associated with action.
   * @param aReason
   *        One of the constants from above. It indicates why the dialog is
   *        shown. Implementors should treat unknown reasons like
   *        REASON_CANTHANDLE.
   */
  void show(nsIHelperAppLauncher aLauncher, nsISupports aWindowContext, long aReason);

  /**
   * Invoke a save-to-file dialog instead of the full fledged helper app dialog.
   * Returns the a nsILocalFile for the file name/location selected.
   *
   * @param aLauncher
   *        A nsIHelperAppLauncher to be invoked when a file is selected.
   * @param aWindowContext
   *        Window associated with action.
   * @param aDefaultFileName
   *        Default file name to provide (can be null)
   * @param aSuggestedFileExtension
   *        Sugested file extension
   * @param aForcePrompt
   *        Set to true to force prompting the user for thet file
   *        name/location, otherwise perferences may control if the user is
   *        prompted.
   */
  nsILocalFile promptForSaveToFile(nsIHelperAppLauncher aLauncher, nsISupports aWindowContext, String aDefaultFileName, String aSuggestedFileExtension, boolean aForcePrompt);

}