/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIX509CertValidity.idl
 */

package org.mozilla.interfaces;

/**
 * Information on the validity period of a X.509 certificate.
 *
 * @status FROZEN
 */
public interface nsIX509CertValidity extends nsISupports {

  String NS_IX509CERTVALIDITY_IID =
    "{e701dfd8-1dd1-11b2-a172-ffa6cc6156ad}";

  /**
   *  The earliest point in time where
   *  a certificate is valid.
   */
  double getNotBefore();

  /**
   *  "notBefore" attribute formatted as a time string
   *  according to the environment locale,
   *  according to the environment time zone.
   */
  String getNotBeforeLocalTime();

  /**
   *  The day portion of "notBefore" 
   *  formatted as a time string
   *  according to the environment locale,
   *  according to the environment time zone.
   */
  String getNotBeforeLocalDay();

  /**
   *  "notBefore" attribute formatted as a string
   *  according to the environment locale,
   *  displayed as GMT / UTC.
   */
  String getNotBeforeGMT();

  /**
   *  The latest point in time where
   *  a certificate is valid.
   */
  double getNotAfter();

  /**
   *  "notAfter" attribute formatted as a time string
   *  according to the environment locale,
   *  according to the environment time zone.
   */
  String getNotAfterLocalTime();

  /**
   *  The day portion of "notAfter" 
   *  formatted as a time string
   *  according to the environment locale,
   *  according to the environment time zone.
   */
  String getNotAfterLocalDay();

  /**
   *  "notAfter" attribute formatted as a time string
   *  according to the environment locale,
   *  displayed as GMT / UTC.
   */
  String getNotAfterGMT();

}