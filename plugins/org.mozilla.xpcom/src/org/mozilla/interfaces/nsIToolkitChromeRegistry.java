/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/chrome/public/nsIToolkitChromeRegistry.idl
 */

package org.mozilla.interfaces;

public interface nsIToolkitChromeRegistry extends nsIXULChromeRegistry {

  String NS_ITOOLKITCHROMEREGISTRY_IID =
    "{8727651c-9530-45a0-b81e-0e0690c30c50}";

  /**
   * If the OS has a "high-visibility" or "disabled-friendly" theme set,
   * we want to force mozilla into the classic theme, which (for the most part
   * obeys the system color/font settings. We cannot do this at initialization,
   * because it depends on the toolkit (GTK2) being initialized, which is
   * not the case in some embedding situations. Embedders have to manually
   * call this method during the startup process.
   */
  void checkForOSAccessibility();

  /**
   * Get a list of locales available for the specified package.
   */
  nsIUTF8StringEnumerator getLocalesForPackage(String aPackage);

}