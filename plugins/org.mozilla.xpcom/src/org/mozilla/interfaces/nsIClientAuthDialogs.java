/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIClientAuthDialogs.idl
 */

package org.mozilla.interfaces;

/**
 * nsIClientAuthDialog
 * Provides UI for SSL client-auth dialogs.
 */
public interface nsIClientAuthDialogs extends nsISupports {

  String NS_ICLIENTAUTHDIALOGS_IID =
    "{fa4c7520-1433-11d5-ba24-00108303b117}";

  /**
   * display
   *   UI shown when a user is asked to do SSL client auth.
   */
  void chooseCertificate(nsIInterfaceRequestor ctx, String cn, String organization, String issuer, String[] certNickList, String[] certDetailsList, long count, int[] selectedIndex, boolean[] canceled);

}