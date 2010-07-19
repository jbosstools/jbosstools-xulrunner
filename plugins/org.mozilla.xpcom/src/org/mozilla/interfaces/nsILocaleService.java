/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/intl/locale/idl/nsILocaleService.idl
 */

package org.mozilla.interfaces;

/**
 * The Locale service interface. This is a singleton object, and should be
 * obtained from the <tt>nsServiceManager</tt>.
 */
public interface nsILocaleService extends nsISupports {

  String NS_ILOCALESERVICE_IID =
    "{c2edc848-4219-4440-abbf-98119882c83f}";

  /**
     * Create a new nsILocale from a locale string.
     *
     * @param aLocale
     *        A locale code as described in nsILocale.
     * @return A nsILocale representing the given locale.
     */
  nsILocale newLocale(String aLocale);

  /**
     * Get the user preference for locale from the operating system.
     *
     * @return User's OS setting for preferred locale.
     */
  nsILocale getSystemLocale();

  /**
     * Get the user preference for locale from the operating system.
     * 
     * NOTE: This has nothing to do with the locale used for localization of
     * the application (UI text strings etc.). This method returns something
     * similar to getSystemLocale.
     *
     * @return User's OS setting for preferred locale.
     */
  nsILocale getApplicationLocale();

  /**
     * Get the most preferred locale from a list of locale preferences.
     *
     * @param acceptLanguage
     *        Locale preference in the same format as the Accept-Language HTTP
     *        header.
     * @return The most preferred locale according to the acceptLanguage
     *         parameter.
     */
  nsILocale getLocaleFromAcceptLanguage(String acceptLanguage);

  /**
     * Get the user preference for locale from the operating system.
     *
     * NOTE: This has nothing to do with any HTTP User-Agent. This method
     * returns the same as getSystemLocale, but as a string.
     *
     * @return User's OS setting for preferred locale in the format described
     *         in nsILocale.
     */
  String getLocaleComponentForUserAgent();

}