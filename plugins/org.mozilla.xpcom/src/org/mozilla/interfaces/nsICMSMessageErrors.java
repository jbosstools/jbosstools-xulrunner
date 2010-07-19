/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsICMSMessageErrors.idl
 */

package org.mozilla.interfaces;

/**
 * nsICMSMessageErrors
 *  Scriptable error constants for nsICMSMessage
 */
public interface nsICMSMessageErrors extends nsISupports {

  String NS_ICMSMESSAGEERRORS_IID =
    "{f2aec680-60a0-49f0-afe5-6cf1d3f15e0d}";

  int SUCCESS = 0;

  int GENERAL_ERROR = 1;

  int VERIFY_NOT_SIGNED = 1024;

  int VERIFY_NO_CONTENT_INFO = 1025;

  int VERIFY_BAD_DIGEST = 1026;

  int VERIFY_NOCERT = 1028;

  int VERIFY_UNTRUSTED = 1029;

  int VERIFY_ERROR_UNVERIFIED = 1031;

  int VERIFY_ERROR_PROCESSING = 1032;

  int VERIFY_BAD_SIGNATURE = 1033;

  int VERIFY_DIGEST_MISMATCH = 1034;

  int VERIFY_UNKNOWN_ALGO = 1035;

  int VERIFY_UNSUPPORTED_ALGO = 1036;

  int VERIFY_MALFORMED_SIGNATURE = 1037;

  int VERIFY_HEADER_MISMATCH = 1038;

  int VERIFY_NOT_YET_ATTEMPTED = 1039;

  int VERIFY_CERT_WITHOUT_ADDRESS = 1040;

  int ENCRYPT_NO_BULK_ALG = 1056;

  int ENCRYPT_INCOMPLETE = 1057;

}