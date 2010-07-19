/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIProxyInfo.idl
 */

package org.mozilla.interfaces;

/**
 * This interface identifies a proxy server.
 *
 * @status UNDER_REVIEW
 */
public interface nsIProxyInfo extends nsISupports {

  String NS_IPROXYINFO_IID =
    "{3fe9308b-1608-4fa0-933c-c5ec2c6175fd}";

  /**
   * This attribute specifies the hostname of the proxy server.
   */
  String getHost();

  /**
   * This attribute specifies the port number of the proxy server.
   */
  int getPort();

  /**
   * This attribute specifies the type of the proxy server as an ASCII string.
   *
   * Some special values for this attribute include (but are not limited to)
   * the following:
   *   "http"     HTTP proxy (or SSL CONNECT for HTTPS)
   *   "socks"    SOCKS v5 proxy
   *   "socks4"   SOCKS v4 proxy
   *   "direct"   no proxy
   *   "unknown"  unknown proxy (see nsIProtocolProxyService::resolve)
   *
   * A future version of this interface may define additional types.
   */
  String getType();

  /**
   * This attribute specifies flags that modify the proxy type.  The value of
   * this attribute is the bit-wise combination of the Proxy Flags defined
   * below.  Any undefined bits are reserved for future use.
   */
  long getFlags();

  /**
   * This attribute specifies the failover timeout in seconds for this proxy.
   * If a nsIProxyInfo is reported as failed via nsIProtocolProxyService::
   * getFailoverForProxy, then the failed proxy will not be used again for this
   * many seconds.
   */
  long getFailoverTimeout();

  /**
   * This attribute specifies the proxy to failover to when this proxy fails.
   */
  nsIProxyInfo getFailoverProxy();

  /**
   * This attribute specifies the proxy to failover to when this proxy fails.
   */
  void setFailoverProxy(nsIProxyInfo aFailoverProxy);

  /****************************************************************************
   * The following "Proxy Flags" may be bit-wise combined to construct the
   * flags attribute defined on this interface.  All unspecified bits are
   * reserved for future use.
   */
/**
   * This flag is set if the proxy is to perform name resolution itself.  If
   * this is the case, the hostname is used in some fashion, and we shouldn't
   * do any form of DNS lookup ourselves.
   */
  int TRANSPARENT_PROXY_RESOLVES_HOST = 1;

}