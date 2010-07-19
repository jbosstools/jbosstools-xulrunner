/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsISSLErrorListener.idl
 */

package org.mozilla.interfaces;

/**
 * A mechanism to report a broken SSL connection. The recipient should NOT block.
 */
public interface nsISSLErrorListener extends nsISupports {

  String NS_ISSLERRORLISTENER_IID =
    "{99f8d972-bae4-414c-b39b-47587d3ded68}";

  /**
   *  @param socketInfo A network communication context that can be used to obtain more information
   *                    about the active connection.
   *  @param error The code associated with the error.
   *  @param targetSite The Site name that was used to open the current connection.
   *
   *  @return The consumer shall return true if it wants to suppress the error message
   *          related to the error (the connection will still get canceled).
   */
  boolean notifySSLError(nsIInterfaceRequestor socketInfo, int error, String targetSite);

}