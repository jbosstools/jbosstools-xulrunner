/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/uriloader/prefetch/nsIPrefetchService.idl
 */

package org.mozilla.interfaces;

public interface nsIPrefetchService extends nsISupports {

  String NS_IPREFETCHSERVICE_IID =
    "{cba513eb-c457-4b93-832c-1a979e66edd1}";

  /**
     * Enqueue a request to prefetch the specified URI.
     *
     * @param aURI the URI of the document to prefetch
     * @param aReferrerURI the URI of the referring page
     * @param aSource the DOM node (such as a <link> tag) that requested this
     *        fetch, or null if the prefetch was not requested by a DOM node.
     * @param aExplicit the link element has an explicit prefetch link type
     */
  void prefetchURI(nsIURI aURI, nsIURI aReferrerURI, nsIDOMNode aSource, boolean aExplicit);

  /**
     * @status DEPRECATED This method is no longer used, and will throw
     * NS_ERROR_NOT_IMPLEMENTED.
     */
  void prefetchURIForOfflineUse(nsIURI aURI, nsIURI aReferrerURI, nsIDOMNode aSource, boolean aExplicit);

  /**
     * Enumerate the items in the prefetch queue.  Each element in the
     * enumeration is an nsIDOMLoadStatus.
     *
     * @param aIncludeNormalItems include normal prefetch items in the
     *        list.  This parameter is deprecated and must be TRUE,
     *        or NS_ERROR_INT_IMPLEMENTED will be thrown.
     * @param aIncludeOfflineItems include items being fetched for offline
     *        use.  This parameter is deprecated and must be FALSE,
     *        or NS_ERROR_NOT_IMPLEMENTED will be thrown.
     */
  nsISimpleEnumerator enumerateQueue(boolean aIncludeNormalItems, boolean aIncludeOfflineItems);

}