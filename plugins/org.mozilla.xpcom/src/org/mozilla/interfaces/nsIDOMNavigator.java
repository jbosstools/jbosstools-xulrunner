/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/base/nsIDOMNavigator.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMNavigator extends nsISupports {

  String NS_IDOMNAVIGATOR_IID =
    "{777bd8a1-38c1-4b12-ba8f-ff6c2eb8c56b}";

  String getAppCodeName();

  String getAppName();

  String getAppVersion();

  String getLanguage();

  nsIDOMMimeTypeArray getMimeTypes();

  String getPlatform();

  String getOscpu();

  String getVendor();

  String getVendorSub();

  String getProduct();

  String getProductSub();

  nsIDOMPluginArray getPlugins();

  String getSecurityPolicy();

  String getUserAgent();

  boolean getCookieEnabled();

  boolean getOnLine();

  String getBuildID();

  boolean javaEnabled();

  boolean taintEnabled();

}