/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIKeyModule.idl
 */

package org.mozilla.interfaces;

public interface nsIKeyObjectFactory extends nsISupports {

  String NS_IKEYOBJECTFACTORY_IID =
    "{264eb54d-e20d-49a0-890c-1a5986ea81c4}";

  nsIKeyObject lookupKeyByName(String aName);

  nsIKeyObject unwrapKey(short aAlgorithm, byte[] aWrappedKey, long aWrappedKeyLen);

  nsIKeyObject keyFromString(short aAlgorithm, String aKey);

}