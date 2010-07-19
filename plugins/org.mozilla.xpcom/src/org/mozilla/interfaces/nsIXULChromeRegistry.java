/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsIChromeRegistry.idl
 */

package org.mozilla.interfaces;

public interface nsIXULChromeRegistry extends nsIChromeRegistry {

  String NS_IXULCHROMEREGISTRY_IID =
    "{2860e205-490e-4b06-90b6-87160d35a5a7}";

  void reloadChrome();

  String getSelectedLocale(String packageName);

  void refreshSkins();

  /**
   * Installable skin XBL is not always granted the same privileges as other
   * chrome. This asks the chrome registry whether scripts are allowed to be
   * run for a particular chrome URI. Do not pass non-chrome URIs to this
   * method.
   */
  boolean allowScriptsForPackage(nsIURI url);

  /**
   * Content should only be allowed to load chrome JS from certain packages.
   * This method reflects the contentaccessible flag on packages.
   * Do not pass non-chrome URIs to this method.
   */
  boolean allowContentToAccess(nsIURI url);

}