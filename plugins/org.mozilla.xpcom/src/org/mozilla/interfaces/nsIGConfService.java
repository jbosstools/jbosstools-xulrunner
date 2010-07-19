/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/system/nsIGConfService.idl
 */

package org.mozilla.interfaces;

public interface nsIGConfService extends nsISupports {

  String NS_IGCONFSERVICE_IID =
    "{5009acae-6973-48c3-b6d6-52c692cc5d9d}";

  boolean getBool(String key);

  String getString(String key);

  int getInt(String key);

  float getFloat(String key);

  nsIArray getStringList(String key);

  void setBool(String key, boolean value);

  void setString(String key, String value);

  void setInt(String key, int value);

  void setFloat(String key, float value);

  String getAppForProtocol(String scheme, boolean[] enabled);

  boolean handlerRequiresTerminal(String scheme);

  void setAppForProtocol(String scheme, String command);

}