/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsITokenPasswordDialogs.idl
 */

package org.mozilla.interfaces;

/**
 * nsITokenPasswordDialogs
 *  This is the interface for setting and changing password
 *  on a PKCS11 token.
 */
public interface nsITokenPasswordDialogs extends nsISupports {

  String NS_ITOKENPASSWORDDIALOGS_IID =
    "{be26b580-1dd1-11b2-9946-c598d0d07727}";

  /**
   * setPassword - sets the password/PIN on the named token.
   *   The canceled output value should be set to TRUE when
   *   the user (or implementation) cancels the operation.
   */
  void setPassword(nsIInterfaceRequestor ctx, String tokenName, boolean[] canceled);

  void getPassword(nsIInterfaceRequestor ctx, String tokenName, String[] password, boolean[] canceled);

}