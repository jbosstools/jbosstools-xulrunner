/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/sidebar/nsIWebContentHandlerRegistrar.idl
 */

package org.mozilla.interfaces;

/**
 * nsIWebContentHandlerRegistrar
 * 
 * Applications wishing to use web content handlers need to implement this
 * interface. Typically they will prompt the user to confirm adding an entry
 * to the local list. 
 *
 * The component must have the contract id defined below so that nsNavigator
 * can invoke it. 
 */
public interface nsIWebContentHandlerRegistrar extends nsISupports {

  String NS_IWEBCONTENTHANDLERREGISTRAR_IID =
    "{e6a75410-c93e-42bf-84ca-a5c3ec34a2f1}";

  /**
   * See documentation in nsIDOMClientInformation.idl
   * The additional contentWindow param for both methods represents the dom
   * content window from which the method has been called.
   */
  void registerContentHandler(String mimeType, String uri, String title, nsIDOMWindow contentWindow);

  void registerProtocolHandler(String protocol, String uri, String title, nsIDOMWindow contentWindow);

}