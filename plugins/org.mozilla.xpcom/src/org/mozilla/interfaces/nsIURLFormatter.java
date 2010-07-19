/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/urlformatter/public/nsIURLFormatter.idl
 */

package org.mozilla.interfaces;

public interface nsIURLFormatter extends nsISupports {

  String NS_IURLFORMATTER_IID =
    "{4ab31d30-372d-11db-a98b-0800200c9a66}";

  /** 
   * formatURL - Formats a string URL
   *
   * @param aFormat string 
   */
  String formatURL(String aFormat);

  /** 
   * formatURLPref - Formats a string URL stored in a pref
   *
   * @param aFormat string 
   */
  String formatURLPref(String aPref);

}