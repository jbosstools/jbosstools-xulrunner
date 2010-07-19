/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/intl/strres/public/nsIStringBundle.idl
 */

package org.mozilla.interfaces;

public interface nsIStringBundleService extends nsISupports {

  String NS_ISTRINGBUNDLESERVICE_IID =
    "{d85a17c0-aa7c-11d2-9b8c-00805f8a16d9}";

  nsIStringBundle createBundle(String aURLSpec);

  nsIStringBundle createExtensibleBundle(String aRegistryKey);

  /**
   * Formats a message string from a status code and status arguments.
   * @param aStatus - The status code. This is mapped into a string ID and
   *            and used in the string lookup process (see nsIErrorService).
   * @param aStatusArg - The status message argument(s). Multiple arguments
   *            can be separated by newline ('\n') characters.
   * @return the formatted message
   */
  String formatStatusMessage(long aStatus, String aStatusArg);

  /**
   * flushes the string bundle cache - useful when the locale changes or
   * when we need to get some extra memory back
   * 
   * at some point, we might want to make this flush all the bundles,
   * because any bundles that are floating around when the locale changes
   * will suddenly contain bad data
   *
   */
  void flushBundles();

}