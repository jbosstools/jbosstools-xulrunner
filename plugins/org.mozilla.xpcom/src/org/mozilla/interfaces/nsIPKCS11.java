/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIPKCS11.idl
 */

package org.mozilla.interfaces;

public interface nsIPKCS11 extends nsISupports {

  String NS_IPKCS11_IID =
    "{5743f870-958e-4f02-aef2-c0afeef67f05}";

  void deleteModule(String moduleName);

  void addModule(String moduleName, String libraryFullPath, int cryptoMechanismFlags, int cipherFlags);

}