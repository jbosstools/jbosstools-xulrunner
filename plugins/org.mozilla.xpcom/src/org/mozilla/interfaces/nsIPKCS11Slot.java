/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIPKCS11Slot.idl
 */

package org.mozilla.interfaces;

public interface nsIPKCS11Slot extends nsISupports {

  String NS_IPKCS11SLOT_IID =
    "{c2d4f296-ee60-11d4-998b-00b0d02354a0}";

  String getName();

  String getDesc();

  String getManID();

  String getHWVersion();

  String getFWVersion();

  long SLOT_DISABLED = 0L;

  long SLOT_NOT_PRESENT = 1L;

  long SLOT_UNINITIALIZED = 2L;

  long SLOT_NOT_LOGGED_IN = 3L;

  long SLOT_LOGGED_IN = 4L;

  long SLOT_READY = 5L;

  long getStatus();

  nsIPK11Token getToken();

  String getTokenName();

}