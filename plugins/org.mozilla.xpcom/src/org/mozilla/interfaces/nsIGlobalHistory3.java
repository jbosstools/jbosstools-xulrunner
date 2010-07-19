/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/base/nsIGlobalHistory3.idl
 */

package org.mozilla.interfaces;

/**
 * Provides information about global history to gecko, extending GlobalHistory2
 */
public interface nsIGlobalHistory3 extends nsIGlobalHistory2 {

  String NS_IGLOBALHISTORY3_IID =
    "{24306852-c60e-49c3-a455-90f6747118ba}";

  /**
   * Notifies the history system that the page loading via aOldChannel
   * redirected to aNewChannel. Implementations should generally add the URI for
   * aOldChannel to history for link coloring, but are advised not to expose it
   * in the history user interface. This function is preferred if
   * nsIGlobalHistory3 is available. Otherwise, nsIGlobalHistory2.addURI should
   * be called with redirect=true.
   *
   * This function is preferred to nsIGlobalHistory2.addURI because it provides
   * more information (including the redirect destination, channels involved,
   * and redirect flags) to the history implementation.
   *
   * For implementors of nsIGlobalHistory3: The history implementation is
   * responsible for sending NS_LINK_VISITED_EVENT_TOPIC to observers for
   * redirect pages. This notification must be sent for history consumers for
   * all non-redirect pages.
   *
   * @param aToplevel whether the URI is loaded in a top-level window.  If
   *        false, the load is in a subframe.
   *
   * The other params to this function are the same as those for
   * nsIChannelEventSink::OnChannelRedirect.
   *
   * Note: Implementors who wish to implement this interface but rely on
   * nsIGlobalHistory2.addURI for redirect processing may throw
   * NS_ERROR_NOT_IMPLEMENTED from this method.  If they do so, then callers
   * must call nsIGlobalHistory2.addURI upon getting the
   * NS_ERROR_NOT_IMPLEMENTED result.
   */
  void addDocumentRedirect(nsIChannel aOldChannel, nsIChannel aNewChannel, int aFlags, boolean aTopLevel);

  /**
   * Get the Gecko flags for this URI. These flags are used by Gecko as hints
   * to optimize page loading. Not all histories have them; this need not be
   * supported (just return NS_ERROR_NOT_IMPLEMENTED. These flags are opaque
   * and should not be interpreted by the history engine.
   */
  long getURIGeckoFlags(nsIURI aURI);

  /**
   * Set the Gecko flags for this URI. May fail if the history entry
   * doesn't have any flags or if there is no entry for the URI.
   */
  void setURIGeckoFlags(nsIURI aURI, long aFlags);

}