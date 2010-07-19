/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsISSLStatus.idl
 */

package org.mozilla.interfaces;

public interface nsISSLStatus extends nsISupports {

  String NS_ISSLSTATUS_IID =
    "{cfede939-def1-49be-81ed-d401b3a07d1c}";

  nsIX509Cert getServerCert();

  String getCipherName();

  long getKeyLength();

  long getSecretKeyLength();

  boolean getIsDomainMismatch();

  boolean getIsNotValidAtThisTime();

  boolean getIsUntrusted();

}