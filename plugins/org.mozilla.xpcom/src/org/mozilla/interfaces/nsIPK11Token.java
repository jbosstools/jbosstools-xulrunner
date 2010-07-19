/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIPK11Token.idl
 */

package org.mozilla.interfaces;

public interface nsIPK11Token extends nsISupports {

  String NS_IPK11TOKEN_IID =
    "{51191434-1dd2-11b2-a17c-e49c4e99a4e3}";

  int ASK_EVERY_TIME = -1;

  int ASK_FIRST_TIME = 0;

  int ASK_EXPIRE_TIME = 1;

  String getTokenName();

  String getTokenLabel();

  String getTokenManID();

  String getTokenHWVersion();

  String getTokenFWVersion();

  String getTokenSerialNumber();

  boolean isLoggedIn();

  void login(boolean force);

  void logoutSimple();

  void logoutAndDropAuthenticatedResources();

  void reset();

  int getMinimumPasswordLength();

  boolean getNeedsUserInit();

  boolean checkPassword(String password);

  void initPassword(String initialPassword);

  void changePassword(String oldPassword, String newPassword);

  int getAskPasswordTimes();

  int getAskPasswordTimeout();

  void setAskPasswordDefaults(int askTimes, int timeout);

  boolean isHardwareToken();

  boolean needsLogin();

  boolean isFriendly();

}