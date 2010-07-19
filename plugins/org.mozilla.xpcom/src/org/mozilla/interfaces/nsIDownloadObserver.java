/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIDownloader.idl
 */

package org.mozilla.interfaces;

public interface nsIDownloadObserver extends nsISupports {

  String NS_IDOWNLOADOBSERVER_IID =
    "{44b3153e-a54e-4077-a527-b0325e40924e}";

  /**
     * Called to signal a download that has completed.
     */
  void onDownloadComplete(nsIDownloader downloader, nsIRequest request, nsISupports ctxt, long status, nsIFile result);

}