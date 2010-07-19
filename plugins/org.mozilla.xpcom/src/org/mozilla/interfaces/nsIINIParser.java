/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsIINIParser.idl
 */

package org.mozilla.interfaces;

public interface nsIINIParser extends nsISupports {

  String NS_IINIPARSER_IID =
    "{7eb955f6-3e78-4d39-b72f-c1bf12a94bce}";

  /**
   * Enumerates the [section]s available in the INI file.
   */
  nsIUTF8StringEnumerator getSections();

  /**
   * Enumerates the keys available within a section.
   */
  nsIUTF8StringEnumerator getKeys(String aSection);

  /**
   * Get the value of a string for a particular section and key.
   */
  String getString(String aSection, String aKey);

}