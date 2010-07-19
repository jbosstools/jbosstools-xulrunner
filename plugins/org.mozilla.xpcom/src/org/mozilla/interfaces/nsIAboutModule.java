/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/protocol/about/public/nsIAboutModule.idl
 */

package org.mozilla.interfaces;

public interface nsIAboutModule extends nsISupports {

  String NS_IABOUTMODULE_IID =
    "{9575693c-60d9-4332-b6b8-6c29289339cb}";

  /**
     * Constructs a new channel for the about protocol module. 
     *
     * @param aURI the uri of the new channel
     */
  nsIChannel newChannel(nsIURI aURI);

  /**
     * A flag that indicates whether a URI is safe for untrusted
     * content.  If it is, web pages and so forth will be allowed to
     * link to this about: URI.  Otherwise, only chrome will be able
     * to link to it.
     */
  long URI_SAFE_FOR_UNTRUSTED_CONTENT = 1L;

  /**
     * A flag that indicates whether script should be enabled for the
     * given about: URI even if it's disabled in general.
     */
  long ALLOW_SCRIPT = 2L;

  /**
     * A method to get the flags that apply to a given about: URI.  The URI
     * passed in is guaranteed to be one of the URIs that this module
     * registered to deal with.
     */
  long getURIFlags(nsIURI aURI);

}