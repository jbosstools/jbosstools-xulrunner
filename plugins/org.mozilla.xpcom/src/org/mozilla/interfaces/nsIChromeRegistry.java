/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsIChromeRegistry.idl
 */

package org.mozilla.interfaces;

public interface nsIChromeRegistry extends nsISupports {

  String NS_ICHROMEREGISTRY_IID =
    "{249fb5ad-ae29-4e2c-a728-ba5cf464d188}";

  int NONE = 0;

  int PARTIAL = 1;

  int FULL = 2;

  /**
   * Resolve a chrome URL to an loadable URI using the information in the
   * registry. Does not modify aChromeURL.
   *
   * Chrome URLs are allowed to be specified in "shorthand", leaving the
   * "file" portion off. In that case, the URL is expanded to:
   *
   *   chrome://package/provider/package.ext
   *
   * where "ext" is:
   *
   *   "xul" for a "content" package,
   *   "css" for a "skin" package, and
   *   "dtd" for a "locale" package.
   *
   * @param aChromeURL the URL that is to be converted.
   */
  nsIURI convertChromeURL(nsIURI aChromeURL);

  /**
   * refresh the chrome list at runtime, looking for new packages/etc
   */
  void checkForNewChrome();

}