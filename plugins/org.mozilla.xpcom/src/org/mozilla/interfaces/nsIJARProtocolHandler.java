/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/libjar/nsIJARProtocolHandler.idl
 */

package org.mozilla.interfaces;

public interface nsIJARProtocolHandler extends nsIProtocolHandler {

  String NS_IJARPROTOCOLHANDLER_IID =
    "{92c3b42c-98c4-11d3-8cd9-0060b0fc14a3}";

  /**
     * JARCache contains the collection of open jar files.
     */
  nsIZipReaderCache getJARCache();

}