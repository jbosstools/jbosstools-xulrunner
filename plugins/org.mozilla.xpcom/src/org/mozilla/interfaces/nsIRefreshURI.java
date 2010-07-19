/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/webshell/public/nsIRefreshURI.idl
 */

package org.mozilla.interfaces;

public interface nsIRefreshURI extends nsISupports {

  String NS_IREFRESHURI_IID =
    "{cb0ad623-6b46-4c09-a473-c1d6ca63d3c7}";

  /**
      * Load a uri after waiting for aMillis milliseconds. If the docshell
      * is busy loading a page currently, the refresh request will be
      * queued and executed when the current load finishes. 
      *
      * @param aUri The uri to refresh.
      * @param aMillis The number of milliseconds to wait.
      * @param aRepeat Flag to indicate if the uri is to be 
      *                repeatedly refreshed every aMillis milliseconds.
      * @param aMetaRefresh Flag to indicate if this is a Meta refresh.
      */
  void refreshURI(nsIURI aURI, int aMillis, boolean aRepeat, boolean aMetaRefresh);

  /**
      * Loads a URI immediately as if it were a refresh.
      *
      * @param aURI The URI to refresh.
      * @param aMillis The number of milliseconds by which this refresh would
      *                be delayed if it were not being forced.
      * @param aMetaRefresh Flag to indicate if this is a meta refresh.
      */
  void forceRefreshURI(nsIURI aURI, int aMillis, boolean aMetaRefresh);

  /**
      * Checks the passed in channel to see if there is a refresh header, 
      * if there is, will setup a timer to refresh the uri found
      * in the header. If docshell is busy loading a page currently, the
      * request will be queued and executed when the current page 
      * finishes loading. 
      *
      * Returns the NS_REFRESHURI_HEADER_FOUND success code if a refresh
      * header was found and successfully setup.
      *
      * @param aChannel The channel to be parsed. 
      */
  void setupRefreshURI(nsIChannel aChannel);

  /**
      * Parses the passed in header string and sets up a refreshURI if
      * a "refresh" header is found. If docshell is busy loading a page 
      * currently, the request will be queued and executed when 
      * the current page finishes loading. 
      *
      * @param aBaseURI base URI to resolve refresh uri with.
      * @param aHeader  The meta refresh header string.
      */
  void setupRefreshURIFromHeader(nsIURI aBaseURI, String aHeader);

  /**
      * Cancels all timer loads.
      */
  void cancelRefreshURITimers();

  /**
     * True when there are pending refreshes, false otherwise.
     */
  boolean getRefreshPending();

}