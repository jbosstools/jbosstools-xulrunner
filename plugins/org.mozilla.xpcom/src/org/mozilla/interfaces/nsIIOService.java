/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIIOService.idl
 */

package org.mozilla.interfaces;

/**
 * nsIIOService provides a set of network utility functions.  This interface
 * duplicates many of the nsIProtocolHandler methods in a protocol handler
 * independent way (e.g., NewURI inspects the scheme in order to delegate
 * creation of the new URI to the appropriate protocol handler).  nsIIOService
 * also provides a set of URL parsing utility functions.  These are provided
 * as a convenience to the programmer and in some cases to improve performance
 * by eliminating intermediate data structures and interfaces.
 *
 * @status FROZEN
 */
public interface nsIIOService extends nsISupports {

  String NS_IIOSERVICE_IID =
    "{bddeda3f-9020-4d12-8c70-984ee9f7935e}";

  /**
     * Returns a protocol handler for a given URI scheme.
     *
     * @param aScheme the URI scheme
     * @return reference to corresponding nsIProtocolHandler
     */
  nsIProtocolHandler getProtocolHandler(String aScheme);

  /**
     * Returns the protocol flags for a given scheme.
     *
     * @param aScheme the URI scheme
     * @return value of corresponding nsIProtocolHandler::protocolFlags
     */
  long getProtocolFlags(String aScheme);

  /**
     * This method constructs a new URI by determining the scheme of the
     * URI spec, and then delegating the construction of the URI to the
     * protocol handler for that scheme. QueryInterface can be used on
     * the resulting URI object to obtain a more specific type of URI.
     *
     * @see nsIProtocolHandler::newURI
     */
  nsIURI newURI(String aSpec, String aOriginCharset, nsIURI aBaseURI);

  /**
     * This method constructs a new URI from a nsIFile.
     *
     * @param aFile specifies the file path
     * @return reference to a new nsIURI object
     *
     * Note: in the future, for perf reasons we should allow 
     * callers to specify whether this is a file or directory by
     * splitting this  into newDirURI() and newActualFileURI().
     */
  nsIURI newFileURI(nsIFile aFile);

  /**
     * Creates a channel for a given URI.
     *
     * @param aURI nsIURI from which to make a channel
     * @return reference to the new nsIChannel object
     */
  nsIChannel newChannelFromURI(nsIURI aURI);

  /**
     * Equivalent to newChannelFromURI(newURI(...))
     */
  nsIChannel newChannel(String aSpec, String aOriginCharset, nsIURI aBaseURI);

  /**
     * Returns true if networking is in "offline" mode. When in offline mode, 
     * attempts to access the network will fail (although this does not 
     * necessarily correlate with whether there is actually a network 
     * available -- that's hard to detect without causing the dialer to 
     * come up).
     *
     * Changing this fires observer notifications ... see below.
     */
  boolean getOffline();

  /**
     * Returns true if networking is in "offline" mode. When in offline mode, 
     * attempts to access the network will fail (although this does not 
     * necessarily correlate with whether there is actually a network 
     * available -- that's hard to detect without causing the dialer to 
     * come up).
     *
     * Changing this fires observer notifications ... see below.
     */
  void setOffline(boolean aOffline);

  /**
     * Checks if a port number is banned. This involves consulting a list of
     * unsafe ports, corresponding to network services that may be easily
     * exploitable. If the given port is considered unsafe, then the protocol
     * handler (corresponding to aScheme) will be asked whether it wishes to
     * override the IO service's decision to block the port. This gives the
     * protocol handler ultimate control over its own security policy while
     * ensuring reasonable, default protection.
     *
     * @see nsIProtocolHandler::allowPort
     */
  boolean allowPort(int aPort, String aScheme);

  /**
     * Utility to extract the scheme from a URL string, consistently and
     * according to spec (see RFC 2396).
     *
     * NOTE: Most URL parsing is done via nsIURI, and in fact the scheme
     * can also be extracted from a URL string via nsIURI.  This method
     * is provided purely as an optimization.
     *
     * @param aSpec the URL string to parse
     * @return URL scheme
     *
     * @throws NS_ERROR_MALFORMED_URI if URL string is not of the right form.
     */
  String extractScheme(String urlString);

}