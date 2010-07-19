/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsICRLManager.idl
 */

package org.mozilla.interfaces;

public interface nsICRLManager extends nsISupports {

  String NS_ICRLMANAGER_IID =
    "{486755db-627a-4678-a21b-f6a63bb9c56a}";

  void importCrl(byte[] data, long length, nsIURI uri, long type, boolean doSilentDownload, String crlKey);

  boolean updateCRLFromURL(String url, String key);

  nsIArray getCrls();

  void deleteCrl(long crlIndex);

  void rescheduleCRLAutoUpdate();

  long TYPE_AUTOUPDATE_TIME_BASED = 1L;

  long TYPE_AUTOUPDATE_FREQ_BASED = 2L;

  String computeNextAutoUpdateTime(nsICRLInfo info, long autoUpdateType, double noOfDays);

}