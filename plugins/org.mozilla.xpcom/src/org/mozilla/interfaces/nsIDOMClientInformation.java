/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/base/nsIDOMClientInformation.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMClientInformation extends nsISupports {

  String NS_IDOMCLIENTINFORMATION_IID =
    "{f8bbf8c3-c47b-465a-a221-22824449f689}";

  /**
   * Web Applications 1.0 Browser State: registerContentHandler
   * Allows web services to register themselves as handlers for certain content
   * types.
   * http://whatwg.org/specs/web-apps/current-work/
   */
  void registerContentHandler(String mimeType, String uri, String title);

  void registerProtocolHandler(String protocol, String uri, String title);

  boolean mozIsLocallyAvailable(String uri, boolean whenOffline);

}