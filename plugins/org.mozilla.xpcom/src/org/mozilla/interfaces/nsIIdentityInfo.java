/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIIdentityInfo.idl
 */

package org.mozilla.interfaces;

public interface nsIIdentityInfo extends nsISupports {

  String NS_IIDENTITYINFO_IID =
    "{e9da87b8-b87c-4bd1-a6bc-5a9a2c7f6d8d}";

  /**
   * A "true" value means:
   *   The object that implements this interface uses a certificate that
   *   was successfully verified as an Extended Validation (EV) cert.
   *   The test is bound to SSL Server Cert Usage.
   */
  boolean getIsExtendedValidation();

  /**
   * This function uses the same test as attribute
   *   isExtendedValidation
   *
   * If isExtendedValidation is true, this function will return
   * a policy identifier in dotted notation (like 1.2.3.4.5).
   *
   * If isExtendedValidation is false, this function will return
   * an empty (length string) value.
   */
  String getValidEVPolicyOid();

}