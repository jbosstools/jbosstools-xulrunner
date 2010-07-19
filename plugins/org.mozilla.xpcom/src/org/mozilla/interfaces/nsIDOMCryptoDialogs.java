/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIDOMCryptoDialogs.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMCryptoDialogs extends nsISupports {

  String NS_IDOMCRYPTODIALOGS_IID =
    "{1f8fe77e-1dd2-11b2-8dd2-e55f8d3465b8}";

  /**
   * This method is used to warn the user the web site is
   * trying to escrow the generated private key.  This 
   * method should return true if the user wants to proceed
   * and false if the user cancels the action.
   */
  boolean confirmKeyEscrow(nsIX509Cert escrowAuthority);

}