/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/protocol/http/public/nsIHttpChannelInternal.idl
 */

package org.mozilla.interfaces;

/** 
 * Dumping ground for http.  This interface will never be frozen.  If you are 
 * using any feature exposed by this interface, be aware that this interface 
 * will change and you will be broken.  You have been warned.
 */
public interface nsIHttpChannelInternal extends nsISupports {

  String NS_IHTTPCHANNELINTERNAL_IID =
    "{0eb66361-faaa-4e52-8c7e-6c25f11f8e3c}";

  /**
     * An http channel can own a reference to the document URI
     */
  nsIURI getDocumentURI();

  /**
     * An http channel can own a reference to the document URI
     */
  void setDocumentURI(nsIURI aDocumentURI);

  /**
     * Get the major/minor version numbers for the request
     */
  void getRequestVersion(long[] major, long[] minor);

  /**
     * Get the major/minor version numbers for the response
     */
  void getResponseVersion(long[] major, long[] minor);

  /**
     * Helper method to set a cookie with a consumer-provided
     * cookie header, _but_ using the channel's other information
     * (URI's, prompters, date headers etc).
     *
     * @param aCookieHeader
     *        The cookie header to be parsed.
     */
  void setCookie(String aCookieHeader);

  /**
     * Setup this channel as an application cache fallback channel.
     */
  void setupFallbackChannel(String aFallbackKey);

  /**
     * Force relevant cookies to be sent with this load even if normally they
     * wouldn't be.
     */
  boolean getForceAllowThirdPartyCookie();

  /**
     * Force relevant cookies to be sent with this load even if normally they
     * wouldn't be.
     */
  void setForceAllowThirdPartyCookie(boolean aForceAllowThirdPartyCookie);

}