/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/intl/strres/public/nsIStringBundleOverride.idl
 */

package org.mozilla.interfaces;

public interface nsIStringBundleOverride extends nsISupports {

  String NS_ISTRINGBUNDLEOVERRIDE_IID =
    "{965eb278-5678-456b-82a7-20a0c86a803c}";

  /**
   * get the override value for a particular key in a particular
   * string bundle
   */
  String getStringFromName(String url, String key);

  /**
   * get all override keys for a given string bundle
   */
  nsISimpleEnumerator enumerateKeysInBundle(String url);

}