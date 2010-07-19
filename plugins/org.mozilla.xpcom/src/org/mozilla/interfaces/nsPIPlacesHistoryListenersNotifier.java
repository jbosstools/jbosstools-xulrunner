/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsPIPlacesHistoryListenersNotifier.idl
 */

package org.mozilla.interfaces;

/**
 * This is a private interface used by Places components to notify history
 * listeners about important notifications.  These should not be used by any
 * code that is not part of core.
 *
 * @note See also: nsINavHistoryObserver
 */
public interface nsPIPlacesHistoryListenersNotifier extends nsISupports {

  String NS_PIPLACESHISTORYLISTENERSNOTIFIER_IID =
    "{b96adaff-e02c-48da-a379-8af5d10e09af}";

  /**
   * Calls onPageExpired on registered listeners with the history service.
   *
   * @param aURI
   *        The nsIURI object representing the URI of the page being expired.
   * @param aVisitTime
   *        The time, in microseconds, that the page being expired was visited.
   * @param aWholeEntry
   *        Indicates if this is the last visit for this URI.
   */
  void notifyOnPageExpired(nsIURI aURI, double aVisitTime, boolean aWholeEntry);

}