/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/dns/public/nsIDNSService.idl
 */

package org.mozilla.interfaces;

/**
 * nsIDNSService
 */
public interface nsIDNSService extends nsISupports {

  String NS_IDNSSERVICE_IID =
    "{c1a56a45-8fa3-44e6-9f01-38c91c858cf9}";

  /**
     * kicks off an asynchronous host lookup.
     *
     * @param aHostName
     *        the hostname or IP-address-literal to resolve.
     * @param aFlags
     *        a bitwise OR of the RESOLVE_ prefixed constants defined below.
     * @param aListener
     *        the listener to be notified when the result is available.
     * @param aListenerTarget
     *        optional parameter (may be null).  if non-null, this parameter
     *        specifies the nsIEventTarget of the thread on which the
     *        listener's onLookupComplete should be called.  however, if this
     *        parameter is null, then onLookupComplete will be called on an
     *        unspecified thread (possibly recursively).
     *
     * @return An object that can be used to cancel the host lookup.
     */
  nsICancelable asyncResolve(String aHostName, long aFlags, nsIDNSListener aListener, nsIEventTarget aListenerTarget);

  /**
     * called to synchronously resolve a hostname.  warning this method may
     * block the calling thread for a long period of time.  it is extremely
     * unwise to call this function on the UI thread of an application.
     *
     * @param aHostName
     *        the hostname or IP-address-literal to resolve.
     * @param aFlags
     *        a bitwise OR of the RESOLVE_ prefixed constants defined below.
     *
     * @return DNS record corresponding to the given hostname.
     * @throws NS_ERROR_UNKNOWN_HOST if host could not be resolved.
     */
  nsIDNSRecord resolve(String aHostName, long aFlags);

  /**
     * @return the hostname of the operating system.
     */
  String getMyHostName();

  /*************************************************************************
     * Listed below are the various flags that may be OR'd together to form
     * the aFlags parameter passed to asyncResolve() and resolve().
     */
/**
     * if set, this flag suppresses the internal DNS lookup cache.
     */
  long RESOLVE_BYPASS_CACHE = 1L;

  /**
     * if set, the canonical name of the specified host will be queried.
     */
  long RESOLVE_CANONICAL_NAME = 2L;

  /**
     * if set, the query is given lower priority. Medium takes precedence
     * if both are used.
     */
  long RESOLVE_PRIORITY_MEDIUM = 4L;

  long RESOLVE_PRIORITY_LOW = 8L;

  /**
     * if set, indicates request is speculative. Speculative requests 
     * return errors if prefetching is disabled by configuration.
     */
  long RESOLVE_SPECULATE = 16L;

}