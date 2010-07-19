/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/layout/printing/nsIPrintStatusFeedback.idl
 */

package org.mozilla.interfaces;

public interface nsIPrintStatusFeedback extends nsISupports {

  String NS_IPRINTSTATUSFEEDBACK_IID =
    "{19855dff-3248-4902-b196-93ee4c477880}";

  void showStatusString(String status);

  void startMeteors();

  void stopMeteors();

  void showProgress(int percent);

  void closeWindow();

}