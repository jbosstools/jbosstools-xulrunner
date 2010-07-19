/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIPKCS11ModuleDB.idl
 */

package org.mozilla.interfaces;

public interface nsIPKCS11ModuleDB extends nsISupports {

  String NS_IPKCS11MODULEDB_IID =
    "{ff9fbcd7-9517-4334-b97a-ceed78909974}";

  nsIPKCS11Module getInternal();

  nsIPKCS11Module getInternalFIPS();

  nsIPKCS11Module findModuleByName(String name);

  nsIPKCS11Slot findSlotByName(String name);

  nsIEnumerator listModules();

  boolean getCanToggleFIPS();

  void toggleFIPSMode();

  boolean getIsFIPSEnabled();

}