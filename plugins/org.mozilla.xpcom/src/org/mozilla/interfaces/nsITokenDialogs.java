/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsITokenDialogs.idl
 */

package org.mozilla.interfaces;

public interface nsITokenDialogs extends nsISupports {

  String NS_ITOKENDIALOGS_IID =
    "{a1cbc159-468c-495d-8068-61dd538cbcca}";

  void chooseToken(nsIInterfaceRequestor ctx, String[] tokenNameList, long count, String[] tokenName, boolean[] canceled);

  /**
    * displayProtectedAuth - displays notification dialog to the user 
    * that he is expected to authenticate to the token using its
    * "protected authentication path" feature
    */
  void displayProtectedAuth(nsIInterfaceRequestor ctx, nsIProtectedAuthThread runnable);

}