/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsISecretDecoderRing.idl
 */

package org.mozilla.interfaces;

public interface nsISecretDecoderRing extends nsISupports {

  String NS_ISECRETDECODERRING_IID =
    "{0ec80360-075c-11d4-9fd4-00c04f1b83d8}";

  /**
   * Encrypt nul-terminated string to BASE64 output.
   */
  String encryptString(String text);

  /**
   * Decrypt BASE64 input to nul-terminated string output.  There is
   * no check for embedded nul values in the decrypted output.
   */
  String decryptString(String crypt);

  /**
   * Prompt the user to change the password on the SDR key.
   */
  void changePassword();

  /**
   * Logout of the security device that protects the SDR key.
   */
  void logout();

  /**
   * Logout of the security device that protects the SDR key and tear
   * down authenticated objects.
   */
  void logoutAndTeardown();

}