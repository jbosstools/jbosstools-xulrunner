/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/protocol/res/public/nsIResProtocolHandler.idl
 */

package org.mozilla.interfaces;

/**
 * Protocol handler interface for the resource:// protocol
 */
public interface nsIResProtocolHandler extends nsIProtocolHandler {

  String NS_IRESPROTOCOLHANDLER_IID =
    "{067ca872-e947-4bd6-8946-a479cb6ba5dd}";

  /**
     * Sets the substitution for the root key:
     *   resource://root/path ==> baseURI.resolve(path)
     *
     * A null baseURI removes the specified substitution.
     *
     * A root key should always be lowercase; however, this may not be
     * enforced.
     */
  void setSubstitution(String root, nsIURI baseURI);

  /**
     * Gets the substitution for the root key.
     *
     * @throws NS_ERROR_NOT_AVAILABLE if none exists.
     */
  nsIURI getSubstitution(String root);

  /**
     * Returns TRUE if the substitution exists and FALSE otherwise.
     */
  boolean hasSubstitution(String root);

  /**
     * Utility function to resolve a resource URI.  A resolved URI is not 
     * guaranteed to reference a resource that exists (ie. opening a channel to
     * the resolved URI may fail).
     *
     * @throws NS_ERROR_NOT_AVAILABLE if resURI.host() is an unknown root key.
     */
  String resolveURI(nsIURI resURI);

}