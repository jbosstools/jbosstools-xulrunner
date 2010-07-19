/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpinstall/public/nsIXPInstallManager.idl
 */

package org.mozilla.interfaces;

/**
 * Interface to XPInstallManager - manages download and install operations.
 */
public interface nsIXPInstallManager extends nsISupports {

  String NS_IXPINSTALLMANAGER_IID =
    "{83fdd52f-2d34-4e22-981d-cf3c4ae76faa}";

  /** 
     * Initiates a download and install operation of the supplied URLs
     * and sends notifications to the supplied listener.
     * @param aURLs     array of XPI urls to download and install
     * @param aURLCount number of XPI urls in aURLs
     * @param aListener a listener to receive status notifications
     */
  void initManagerFromChrome(String[] aURLs, long aURLCount, nsIXPIProgressDialog aListener);

  /**
     * Initiates a set of downloads and checks the supplied hashes after
     * download. Just like initManagerFromChrome() in all other respects
     * @param aURLs     array of XPI urls to download and install
     * @param aHashes   array of hash strings to validate. The entire array
     *                  or individual hashes can be null to indicate no
     *                  checking. If supplied looks like "type:hash", like
     *                  "md5:3232bc5624041c507db0965324188024".
     *                  Supports the types in nsICryptoHash
     * @param aURLCount number of XPI urls in aURLs and aHashes
     * @param aListener a listener to receive status notifications
     */
  void initManagerWithHashes(String[] aURLs, String[] aHashes, long aURLCount, nsIXPIProgressDialog aListener);

  /**
     * Initiates a set of downloads based on an install info object. Will
     * display confirmation dialog as if the install info had been supplied
     * by content.
     * @param aInstallInfo The install info object providing install triggers
     *                     and script context for the install.
     */
  void initManagerWithInstallInfo(nsIXPIInstallInfo aInstallInfo);

}