/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/feeds/public/nsIScriptableUnescapeHTML.idl
 */

package org.mozilla.interfaces;

/**
 * A utility class that unescapes HTML strings.
 */
public interface nsIScriptableUnescapeHTML extends nsISupports {

  String NS_ISCRIPTABLEUNESCAPEHTML_IID =
    "{3ab244a9-f09d-44da-9e3f-ee4d67367f2d}";

  /** 
   * Converts all entities to Unicode.
   *
   * @param src The HTML string to escape.
   */
  String unescape(String src);

  /**
   * Appends the text to the element.
   */
  nsIDOMDocumentFragment parseFragment(String fragment, boolean isXML, nsIURI baseURI, nsIDOMElement element);

}