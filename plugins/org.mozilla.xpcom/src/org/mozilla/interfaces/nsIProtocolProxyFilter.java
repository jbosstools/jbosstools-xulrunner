/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIProtocolProxyFilter.idl
 */

package org.mozilla.interfaces;

/**
 * This interface is used to apply filters to the proxies selected for a given
 * URI.  Use nsIProtocolProxyService::registerFilter to hook up instances of
 * this interface.
 *
 * @status UNDER_REVIEW
 */
public interface nsIProtocolProxyFilter extends nsISupports {

  String NS_IPROTOCOLPROXYFILTER_IID =
    "{f424abd3-32b4-456c-9f45-b7e3376cb0d1}";

  /**
   * This method is called to apply proxy filter rules for the given URI
   * and proxy object (or list of proxy objects).
   *
   * @param aProxyService
   *        A reference to the Protocol Proxy Service.  This is passed so that
   *        implementations may easily access methods such as newProxyInfo.
   * @param aURI
   *        The URI for which these proxy settings apply.
   * @param aProxy
   *        The proxy (or list of proxies) that would be used by default for
   *        the given URI.  This may be null.
   *
   * @return The proxy (or list of proxies) that should be used in place of
   *         aProxy.  This can be just be aProxy if the filter chooses not to
   *         modify the proxy.  It can also be null to indicate that a direct
   *         connection should be used.  Use aProxyService.newProxyInfo to
   *         construct nsIProxyInfo objects.
   */
  nsIProxyInfo applyFilter(nsIProtocolProxyService aProxyService, nsIURI aURI, nsIProxyInfo aProxy);

}