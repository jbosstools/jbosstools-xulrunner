/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/downloads/public/nsIDownload.idl
 */

package org.mozilla.interfaces;

/**
 * Represents a download object.
 *
 * @note This object is no longer updated once it enters a completed state.
 *       Completed states are the following:  
 *       nsIDownloadManager::DOWNLOAD_FINISHED  
 *       nsIDownloadManager::DOWNLOAD_FAILED  
 *       nsIDownloadManager::DOWNLOAD_CANCELED 
 *       nsIDownloadManager::DOWNLOAD_BLOCKED_PARENTAL 
 *       nsIDownloadManager::DOWNLOAD_DIRTY 
 *       nsIDownloadManager::DOWNLOAD_BLOCKED_POLICY 
 */
public interface nsIDownload extends nsITransfer {

  String NS_IDOWNLOAD_IID =
    "{c891111e-92a6-47b8-bc46-874ebb61ac9d}";

  /**
     * The target of a download is always a file on the local file system.
     */
  nsILocalFile getTargetFile();

  /**
     * The percentage of transfer completed.
     * If the file size is unknown it'll be -1 here.
     */
  int getPercentComplete();

  /**
     * The amount of bytes downloaded so far.
     */
  long getAmountTransferred();

  /**
     * The size of file in bytes.
     * Unknown size is represented by -1.
     */
  long getSize();

  /**
     * The source of the transfer.
     */
  nsIURI getSource();

  /**
     * The target of the transfer.
     */
  nsIURI getTarget();

  /**
     * Object that can be used to cancel the download.
     * Will be null after the download is finished.
     */
  nsICancelable getCancelable();

  /**
     * The user-readable description of the transfer.
     */
  String getDisplayName();

  /**
     * The time a transfer was started.
     */
  long getStartTime();

  /**
     * The speed of the transfer in bytes/sec.
     */
  double getSpeed();

  /**
     * Optional. If set, it will contain the target's relevant MIME information.
     * This includes its MIME Type, helper app, and whether that helper should be
     * executed.
     */
  nsIMIMEInfo getMIMEInfo();

  /**
     * The id of the download that is stored in the database.
     */
  long getId();

  /**
     * The state of the download.
     * @see nsIDownloadManager and nsIXPInstallManagerUI
     */
  short getState();

  /**
     * The referrer uri of the download.  This is only valid for HTTP downloads,
     * and can be null.
     */
  nsIURI getReferrer();

  /**
     * Indicates if the download can be resumed after being paused or not.  This
     * is only the case if the download is over HTTP/1.1 or FTP and if the
     * server supports it.
     */
  boolean getResumable();

}