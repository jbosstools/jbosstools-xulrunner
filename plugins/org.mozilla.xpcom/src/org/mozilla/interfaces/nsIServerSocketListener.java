/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIServerSocket.idl
 */

package org.mozilla.interfaces;

public interface nsIServerSocketListener extends nsISupports {

  String NS_ISERVERSOCKETLISTENER_IID =
    "{836d98ec-fee2-4bde-b609-abd5e966eabd}";

  /**
 * nsIServerSocketListener
 *
 * This interface is notified whenever a server socket accepts a new connection.
 * The transport is in the connected state, and read/write streams can be opened
 * using the normal nsITransport API.  The address of the client can be found by
 * calling the nsISocketTransport::GetAddress method or by inspecting
 * nsISocketTransport::GetHost, which returns a string representation of the
 * client's IP address (NOTE: this may be an IPv4 or IPv6 string literal).
 */
/**
     * onSocketAccepted
     *
     * This method is called when a client connection is accepted.
     *
     * @param aServ
     *        The server socket.
     * @param aTransport
     *        The connected socket transport.
     */
  void onSocketAccepted(nsIServerSocket aServ, nsISocketTransport aTransport);

  /**
     * onStopListening
     *
     * This method is called when the listening socket stops for some reason.
     * The server socket is effectively dead after this notification.
     *
     * @param aServ
     *        The server socket.
     * @param aStatus
     *        The reason why the server socket stopped listening.  If the
     *        server socket was manually closed, then this value will be
     *        NS_BINDING_ABORTED.
     */
  void onStopListening(nsIServerSocket aServ, long aStatus);

}