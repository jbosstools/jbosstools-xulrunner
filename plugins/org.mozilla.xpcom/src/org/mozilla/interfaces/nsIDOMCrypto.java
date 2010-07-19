/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/base/nsIDOMCrypto.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMCrypto extends nsISupports {

  String NS_IDOMCRYPTO_IID =
    "{12b6d899-2aed-4ea9-8c02-2223ab7ab592}";

  String getVersion();

  boolean getEnableSmartCardEvents();

  void setEnableSmartCardEvents(boolean aEnableSmartCardEvents);

  nsIDOMCRMFObject generateCRMFRequest();

  String importUserCertificates(String nickname, String cmmfResponse, boolean doForcedBackup);

  String popChallengeResponse(String challenge);

  String random(int numBytes);

  String signText(String stringToSign, String caOption);

  void logout();

  void disableRightClick();

}