/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/base/nsIWindowCreator2.idl
 */

package org.mozilla.interfaces;

public interface nsIWindowCreator2 extends nsIWindowCreator {

  String NS_IWINDOWCREATOR2_IID =
    "{f673ec81-a4b0-11d6-964b-eb5a2bf216fc}";

  /**
   * Definitions for contextFlags
   */
  long PARENT_IS_LOADING_OR_RUNNING_TIMEOUT = 1L;

  /** Create a new window. Gecko will/may call this method, if made
      available to it, to create new windows.
      @param parent Parent window, if any. Null if not. The newly created
                    window should be made a child/dependent window of
                    the parent, if any (and if the concept applies
                    to the underlying OS).
      @param chromeFlags Chrome features from nsIWebBrowserChrome
      @param contextFlags Flags about the context of the window being created.
      @param uri The URL for which this window is intended. It can be null
                 or zero-length. The implementation of this interface
                 may use the URL to help determine what sort of window
                 to open or whether to cancel window creation. It will not
                 load the URL.
      @param cancel Return |true| to reject window creation. If true the
                    implementation has determined the window should not
                    be created at all. The caller should not default
                    to any possible backup scheme for creating the window.
      @return the new window. Will be null if canceled or an error occurred.
  */
  nsIWebBrowserChrome createChromeWindow2(nsIWebBrowserChrome parent, long chromeFlags, long contextFlags, nsIURI uri, boolean[] cancel);

}