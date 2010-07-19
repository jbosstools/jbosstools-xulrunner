/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/uriloader/exthandler/nsIExternalHelperAppService.idl
 */

package org.mozilla.interfaces;

/**
 * A helper app launcher is a small object created to handle the launching
 * of an external application.
 *
 * Note that cancelling the load via the nsICancelable interface will release
 * the reference to the launcher dialog.
 */
public interface nsIHelperAppLauncher extends nsICancelable {

  String NS_IHELPERAPPLAUNCHER_IID =
    "{d9a19faf-497b-408c-b995-777d956b72c0}";

  /**
   * The mime info object associated with the content type this helper app
   * launcher is currently attempting to load
   */
  nsIMIMEInfo getMIMEInfo();

  /**
   * The source uri
   */
  nsIURI getSource();

  /**
   * The suggested name for this file
   */
  String getSuggestedFileName();

  /**
   * Called when we want to just save the content to a particular file.
   * NOTE: This will release the reference to the nsIHelperAppLauncherDialog.
   * @param aNewFileLocation Location where the content should be saved
   */
  void saveToDisk(nsIFile aNewFileLocation, boolean aRememberThisPreference);

  /**
   * Use aApplication to launch with this content.
   * NOTE: This will release the reference to the nsIHelperAppLauncherDialog.
   * @param aApplication nsIFile corresponding to the location of the application to use.
   * @param aRememberThisPreference TRUE if we should remember this choice.
   */
  void launchWithApplication(nsIFile aApplication, boolean aRememberThisPreference);

  /**
   * The following methods are used by the progress dialog to get or set
   * information on the current helper app launcher download.
   * This reference will be released when the download is finished (after the
   * listener receives the STATE_STOP notification).
   */
  void setWebProgressListener(nsIWebProgressListener2 aWebProgressListener);

  /**
   * when the stand alone progress window actually closes, it calls this method
   * so we can release any local state...
   */
  void closeProgressWindow();

  /**
   * The file we are saving to
   */
  nsIFile getTargetFile();

  /**
   * The executable-ness of the target file
   */
  boolean getTargetFileIsExecutable();

  /**
   * Time when the download started
   */
  double getTimeDownloadStarted();

  /**
   * The download content length, or -1 if the length is not available.
   */
  long getContentLength();

}