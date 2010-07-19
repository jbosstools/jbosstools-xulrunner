/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/intl/locale/idl/nsICollation.idl
 */

package org.mozilla.interfaces;

public interface nsICollationFactory extends nsISupports {

  String NS_ICOLLATIONFACTORY_IID =
    "{04971e14-d6b3-4ada-8cbb-c3a13842b349}";

  /**
     * Create the collation for a given locale.
     *
     * Use NULL as the locale parameter to use the user's locale preference
     * from the operating system.
     *
     * @param locale
     *        The locale for which to create the collation or null to use
     *        user preference.
     * @return A collation for the given locale.
     */
  nsICollation createCollation(nsILocale locale);

}