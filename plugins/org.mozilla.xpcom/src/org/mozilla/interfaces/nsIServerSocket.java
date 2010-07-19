/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIServerSocket.idl
 */

package org.mozilla.interfaces;

/**
 * nsIServerSocket
 *
 * An interface to a server socket that can accept incoming connections.
 */
public interface nsIServerSocket extends nsISupports {

  String NS_ISERVERSOCKET_IID =
    "{a5b64be0-d563-46bb-ae95-132e46fcd42f}";

  /**
     * init
     *
     * This method initializes a server socket.
     *
     * @param aPort
     *        The port of the server socket.  Pass -1 to indicate no preference,
     *        and a port will be selected automatically.
     * @param aLoopbackOnly
     *        If true, the server socket will only respond to connections on the
     *        local loopback interface.  Otherwise, it will accept connections
     *        from any interface.  To specify a particular network interface,
     *        use initWithAddress.
     * @param aBackLog
     *        The maximum length the queue of pending connections may grow to.
     *        This parameter may be silently limited by the operating system.
     *        Pass -1 to use the default value.
     */
  void init(int aPort, boolean aLoopbackOnly, int aBackLog);

  /**
     * close
     *
     * This method closes a server socket.  This does not affect already
     * connected client sockets (i.e., the nsISocketTransport instances
     * created from this server socket).  This will cause the onStopListening
     * event to asynchronously fire with a status of NS_BINDING_ABORTED.
     */
  void close();

  /**
     * asyncListen
     *
     * This method puts the server socket in the listening state.  It will
     * asynchronously listen for and accept client connections.  The listener
     * will be notified once for each client connection that is accepted.  The
     * listener's onSocketAccepted method will be called on the same thread
     * that called asyncListen (the calling thread must have a nsIEventTarget).
     *
     * The listener will be passed a reference to an already connected socket
     * transport (nsISocketTransport).  See below for more details.
     *
     * @param aListener
     *        The listener to be notified when client connections are accepted.
     */
  void asyncListen(nsIServerSocketListener aListener);

  /**
     * Returns the port of this server socket.
     */
  int getPort();

}