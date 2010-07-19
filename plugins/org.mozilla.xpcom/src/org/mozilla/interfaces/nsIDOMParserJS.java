/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsIDOMParser.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMParserJS interface provides a scriptable way of calling init().
 * Do NOT use this interface from languages other than JavaScript.
 */
public interface nsIDOMParserJS extends nsISupports {

  String NS_IDOMPARSERJS_IID =
    "{ba6bcd6c-63d8-49b3-bc8a-1e5e895645bc}";

  /**
   * Just like nsIDOMParser.init, but callable from JS.
   */
  void init(nsIPrincipal principal, nsIURI documentURI, nsIURI baseURI);

}