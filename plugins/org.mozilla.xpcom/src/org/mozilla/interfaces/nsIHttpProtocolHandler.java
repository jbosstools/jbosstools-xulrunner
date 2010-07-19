/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/protocol/http/public/nsIHttpProtocolHandler.idl
 */

package org.mozilla.interfaces;

public interface nsIHttpProtocolHandler extends nsIProxiedProtocolHandler {

  String NS_IHTTPPROTOCOLHANDLER_IID =
    "{415d4087-79d3-40fe-b194-0ada8471f895}";

  /**
     * Get the HTTP advertised user agent string.
     */
  String getUserAgent();

  /**
     * Get the application name.
	 *
     * @return The name of this application (eg. "Mozilla").
     */
  String getAppName();

  /**
     * Get the application version string.
     *
     * @return The complete version (major and minor) string. (eg. "5.0")
     */
  String getAppVersion();

  /**
     * @return The vendor name.
     */
  String getVendor();

  /**
     * @return The vendor name.
     */
  void setVendor(String aVendor);

  /**
     * @return The vendor sub string.
     */
  String getVendorSub();

  /**
     * @return The vendor sub string.
     */
  void setVendorSub(String aVendorSub);

  /**
     * @return The vendor comment.
     */
  String getVendorComment();

  /**
     * @return The vendor comment.
     */
  void setVendorComment(String aVendorComment);

  /**
     * @return The product name.
     */
  String getProduct();

  /**
     * @return The product name.
     */
  void setProduct(String aProduct);

  /**
     * @return A product sub string.
     */
  String getProductSub();

  /**
     * @return A product sub string.
     */
  void setProductSub(String aProductSub);

  /**
     * @return A product comment.
     */
  String getProductComment();

  /**
     * @return A product comment.
     */
  void setProductComment(String aProductComment);

  /**
     * Get the current platform.
     *
     * @return The platform this application is running on
     *		   (eg. "Windows", "Macintosh", "X11")
     */
  String getPlatform();

  /**
     * Get the current oscpu.
     *
     * @return The oscpu this application is running on
     */
  String getOscpu();

  /**
     * Get the translation of the application. The value for language
     * is usually a 2-letter code such as "en" and occasionally a 
     * five-character code to indicate a language subtype, such as "zh_CN". 
     */
  String getLanguage();

  /**
     * Get the translation of the application. The value for language
     * is usually a 2-letter code such as "en" and occasionally a 
     * five-character code to indicate a language subtype, such as "zh_CN". 
     */
  void setLanguage(String aLanguage);

  /**
     * Get/Set the application comment misc portion.
     */
  String getMisc();

  /**
     * Get/Set the application comment misc portion.
     */
  void setMisc(String aMisc);

  /**
     * Get the current device type.
     *
     * @return The device type this application is running on.  Maybe
     * be null.
     */
  String getDeviceType();

}