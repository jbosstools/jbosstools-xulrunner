/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/downloads/public/nsIDownloadProgressListener.idl
 */

package org.mozilla.interfaces;

public interface nsIDownloadProgressListener extends nsISupports {

  String NS_IDOWNLOADPROGRESSLISTENER_IID =
    "{7acb07ea-cac2-4c15-a3ad-23aaa789ed51}";

  /**
  * document
  * The document of the download manager frontend.
  */
  nsIDOMDocument getDocument();

  /**
  * document
  * The document of the download manager frontend.
  */
  void setDocument(nsIDOMDocument aDocument);

  /**
  * Dispatched whenever the state of the download changes.
  *
  * @param aState The previous download sate.
  * @param aDownload The download object.
  * @see nsIDownloadManager for download states.
  */
  void onDownloadStateChange(short aState, nsIDownload aDownload);

  void onStateChange(nsIWebProgress aWebProgress, nsIRequest aRequest, long aStateFlags, long aStatus, nsIDownload aDownload);

  void onProgressChange(nsIWebProgress aWebProgress, nsIRequest aRequest, long aCurSelfProgress, long aMaxSelfProgress, long aCurTotalProgress, long aMaxTotalProgress, nsIDownload aDownload);

  void onSecurityChange(nsIWebProgress aWebProgress, nsIRequest aRequest, long aState, nsIDownload aDownload);

}