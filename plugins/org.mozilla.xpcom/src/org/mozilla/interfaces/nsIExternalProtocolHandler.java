/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIExternalProtocolHandler.idl
 */

package org.mozilla.interfaces;

public interface nsIExternalProtocolHandler extends nsIProtocolHandler {

  String NS_IEXTERNALPROTOCOLHANDLER_IID =
    "{0e61f3b2-34d7-4c79-bfdc-4860bc7341b7}";

  /**
     * This method checks if the external handler exists for a given scheme.
     *
     * @param scheme external scheme.
     * @return TRUE if the external handler exists for the input scheme, FALSE otherwise.
     */
  boolean externalAppExistsForScheme(String scheme);

}