/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIUserCertPicker.idl
 */

package org.mozilla.interfaces;

public interface nsIUserCertPicker extends nsISupports {

  String NS_IUSERCERTPICKER_IID =
    "{06d018e0-d41b-4629-a4fc-daaa6029888e}";

  nsIX509Cert pickByUsage(nsIInterfaceRequestor ctx, String selectedNickname, int certUsage, boolean allowInvalid, boolean allowDuplicateNicknames, boolean[] canceled);

}