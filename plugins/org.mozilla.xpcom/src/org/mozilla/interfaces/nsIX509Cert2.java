/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIX509Cert2.idl
 */

package org.mozilla.interfaces;

/**
 * This represents additional interfaces to X.509 certificates
 */
public interface nsIX509Cert2 extends nsIX509Cert {

  String NS_IX509CERT2_IID =
    "{5b62c61c-f898-4dab-8ace-51109bb459b4}";

  /**
   *  Additional constants to classify the type of a certificate.
   */
  long ANY_CERT = 65535L;

  long getCertType();

  void markForPermDeletion();

}