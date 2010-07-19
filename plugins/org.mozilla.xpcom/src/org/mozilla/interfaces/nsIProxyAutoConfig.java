/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIProxyAutoConfig.idl
 */

package org.mozilla.interfaces;

/** 
 * The nsIProxyAutoConfig interface is used for setting arbitrary proxy
 * configurations based on the specified URL. 
 *
 * Note this interface wraps (at least in the implementation) the older
 * hacks of proxy auto config. 
 *
 *  - Gagan Saksena 04/23/00 
 */
public interface nsIProxyAutoConfig extends nsISupports {

  String NS_IPROXYAUTOCONFIG_IID =
    "{a42619df-0a1c-46fb-8154-0e9b8f8f1ea8}";

  /**
     * This method initializes the object.  This method may be called multiple
     * times.  If either parameter is an empty value, then the object is
     * reset to its initial state.
     *
     * @param aPACURI
     *        URI used to fetch the PAC script.  This is needed for properly
     *        constructing the JS sandbox used to evaluate the PAC script.
     * @param aPACScript
     *        Javascript program text.
     */
  void init(String aPACURI, String aPACScript);

  /**
     * Get the proxy string for the specified URI.  The proxy string is
     * given by the following:
     *   
     *   result      = proxy-spec *( proxy-sep proxy-spec )
     *   proxy-spec  = direct-type | proxy-type LWS proxy-host [":" proxy-port]
     *   direct-type = "DIRECT"
     *   proxy-type  = "PROXY" | "SOCKS" | "SOCKS4" | "SOCKS5"
     *   proxy-sep   = ";" LWS
     *   proxy-host  = hostname | ipv4-address-literal
     *   proxy-port  = <any 16-bit unsigned integer>
     *   LWS         = *( SP | HT )
     *   SP          = <US-ASCII SP, space (32)>
     *   HT          = <US-ASCII HT, horizontal-tab (9)>
     *
     * NOTE: direct-type and proxy-type are case insensitive
     * NOTE: SOCKS implies SOCKS4
     *
     * Examples:
     *   "PROXY proxy1.foo.com:8080; PROXY proxy2.foo.com:8080; DIRECT"
     *   "SOCKS socksproxy"
     *   "DIRECT"
     *
     * XXX add support for IPv6 address literals.
     * XXX quote whatever the official standard is for PAC.
     *
     * @param aTestURI
     *        The URI as an ASCII string to test.
     * @param aTestHost
     *        The ASCII hostname to test.
     *
     * @return PAC result string as defined above.
     */
  String getProxyForURI(String aTestURI, String aTestHost);

}