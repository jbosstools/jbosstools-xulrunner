/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsICertPickDialogs.idl
 */

package org.mozilla.interfaces;

/**
 * nsICertPickDialogs
 * Provides generic UI for choosing a certificate
 */
public interface nsICertPickDialogs extends nsISupports {

  String NS_ICERTPICKDIALOGS_IID =
    "{51d59b08-1dd2-11b2-ad4a-a51b92f8a184}";

  /**
   * PickCertificate
   *   General purpose certificate prompter
   */
  void pickCertificate(nsIInterfaceRequestor ctx, String[] certNickList, String[] certDetailsList, long count, int[] selectedIndex, boolean[] canceled);

}