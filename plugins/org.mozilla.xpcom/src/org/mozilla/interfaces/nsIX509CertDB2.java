/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIX509CertDB2.idl
 */

package org.mozilla.interfaces;

/**
 * This represents a service to access and manipulate 
 * X.509 certificates stored in a database through methods
 * not in nsIX509CertDB, which is frozen
 *
 */
public interface nsIX509CertDB2 extends nsISupports {

  String NS_IX509CERTDB2_IID =
    "{e0df4784-6560-45bf-b1b7-86076a0e8381}";

  void addCertFromBase64(String base64, String aTrust, String aName);

  nsIX509CertList getCerts();

}