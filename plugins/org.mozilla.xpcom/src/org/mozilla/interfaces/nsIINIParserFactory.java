/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsIINIParser.idl
 */

package org.mozilla.interfaces;

public interface nsIINIParserFactory extends nsISupports {

  String NS_IINIPARSERFACTORY_IID =
    "{ccae7ea5-1218-4b51-aecb-c2d8ecd46af9}";

  /**
   * Create an iniparser instance from a local file.
   */
  nsIINIParser createINIParser(nsILocalFile aINIFile);

}