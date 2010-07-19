/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsISocketTransportService.idl
 */

package org.mozilla.interfaces;

public interface nsISocketTransportService extends nsISupports {

  String NS_ISOCKETTRANSPORTSERVICE_IID =
    "{185b3a5d-8729-436d-9693-7bdccb9c2216}";

  /**
     * Creates a transport for a specified host and port.
     *
     * @param aSocketTypes
     *        array of socket type strings.  null if using default socket type.
     * @param aTypeCount
     *        specifies length of aSocketTypes.
     * @param aHost
     *        specifies the target hostname or IP address literal of the peer
     *        for this socket.
     * @param aPort
     *        specifies the target port of the peer for this socket.
     * @param aProxyInfo
     *        specifies the transport-layer proxy type to use.  null if no
     *        proxy.  used for communicating information about proxies like
     *        SOCKS (which are transparent to upper protocols).
     * 
     * @see nsIProxiedProtocolHandler
     * @see nsIProtocolProxyService::GetProxyInfo
     *
     * NOTE: this function can be called from any thread
     */
  nsISocketTransport createTransport(String[] aSocketTypes, long aTypeCount, String aHost, int aPort, nsIProxyInfo aProxyInfo);

}