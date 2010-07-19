/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/base/nsIWindowCreator.idl
 */

package org.mozilla.interfaces;

public interface nsIWindowCreator extends nsISupports {

  String NS_IWINDOWCREATOR_IID =
    "{30465632-a777-44cc-90f9-8145475ef999}";

  /** Create a new window. Gecko will/may call this method, if made
      available to it, to create new windows.
      @param parent parent window, if any. null if not. the newly created
                    window should be made a child/dependent window of
                    the parent, if any (and if the concept applies
                    to the underlying OS).
      @param chromeFlags chrome features from nsIWebBrowserChrome
      @return the new window
  */
  nsIWebBrowserChrome createChromeWindow(nsIWebBrowserChrome parent, long chromeFlags);

}