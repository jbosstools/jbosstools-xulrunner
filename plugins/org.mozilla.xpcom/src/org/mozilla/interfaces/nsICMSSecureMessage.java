/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsICMSSecureMessage.idl
 */

package org.mozilla.interfaces;

/**
 * nsICMSManager (service)
 *  Interface to access users certificate store
 */
public interface nsICMSSecureMessage extends nsISupports {

  String NS_ICMSSECUREMESSAGE_IID =
    "{14b4394a-1dd2-11b2-b4fd-ba4a194fe97e}";

  /**
   * getCertByPrefID - a BASE64 string representing a user's
   *   certificate (or NULL if there isn't one)
   */
  String getCertByPrefID(String certID);

  /**
   * decodeCert - decode a BASE64 string into an X509Certificate object
   */
  nsIX509Cert decodeCert(String value);

  /**
   * sendMessage - send a text message to the recipient indicated
   *   by the base64-encoded cert.
   */
  String sendMessage(String msg, String cert);

  /**
   * receiveMessage - receive an encrypted (enveloped) message
   */
  String receiveMessage(String msg);

}