/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIPKCS11Module.idl
 */

package org.mozilla.interfaces;

public interface nsIPKCS11Module extends nsISupports {

  String NS_IPKCS11MODULE_IID =
    "{8a44bdf9-d1a5-4734-bd5a-34ed7fe564c2}";

  String getName();

  String getLibName();

  nsIPKCS11Slot findSlotByName(String name);

  nsIEnumerator listSlots();

}