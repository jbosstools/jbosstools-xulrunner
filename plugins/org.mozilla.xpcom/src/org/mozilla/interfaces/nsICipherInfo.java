/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsICipherInfo.idl
 */

package org.mozilla.interfaces;

public interface nsICipherInfo extends nsISupports {

  String NS_ICIPHERINFO_IID =
    "{028e2b2a-1f0b-43a4-a1a7-365d2d7f35d0}";

  String getLongName();

  boolean getIsSSL2();

  boolean getIsFIPS();

  boolean getIsExportable();

  boolean getNonStandard();

  String getSymCipherName();

  String getAuthAlgorithmName();

  String getKeaTypeName();

  String getMacAlgorithmName();

  int getEffectiveKeyBits();

}