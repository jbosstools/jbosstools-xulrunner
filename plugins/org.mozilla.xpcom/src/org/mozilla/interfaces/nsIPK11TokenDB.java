/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIPK11TokenDB.idl
 */

package org.mozilla.interfaces;

/**
 * The PK11 Token Database provides access to the PK11 modules
 * that are installed, and the tokens that are available.
 * Interfaces: nsIPK11TokenDB
 * Threading: ??
 */
/**
 * nsIPK11TokenDB - Manages PK11 Tokens
 */
public interface nsIPK11TokenDB extends nsISupports {

  String NS_IPK11TOKENDB_IID =
    "{4ee28c82-1dd2-11b2-aabf-bb4017abe395}";

  nsIPK11Token getInternalKeyToken();

  nsIPK11Token findTokenByName(String tokenName);

  nsIEnumerator listTokens();

}