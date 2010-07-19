/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/base/nsIDOMPkcs11.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMPkcs11 extends nsISupports {

  String NS_IDOMPKCS11_IID =
    "{9fd42950-25e7-11d4-8a7d-006008c844c3}";

  int deletemodule(String moduleName);

  int addmodule(String moduleName, String libraryFullPath, int cryptoMechanismFlags, int cipherFlags);

}