/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/base/nsIDownloadHistory.idl
 */

package org.mozilla.interfaces;

/**
 * This interface can be used to add a download to history.  There is a separate
 * interface specifically for downloads in case embedders choose to track
 * downloads differently from other types of history.
 */
public interface nsIDownloadHistory extends nsISupports {

  String NS_IDOWNLOADHISTORY_IID =
    "{202533cd-a8f1-4ee4-8d20-3a6a0d2c6c51}";

  /**
   * Adds a download to history.  This will also notify observers that the
   * URI aSource is visited with the topic NS_LINK_VISITED_EVENT_TOPIC if
   * aSource has not yet been visited.
   *
   * @param aSource
   *        The source of the download we are adding to history.  This cannot be
   *        null.
   * @param aReferrer
   *        [optional] The referrer of source URI.
   * @param aStartTime
   *        [optional] The time the download was started.  If the start time
   *        is not given, the current time is used.
   * @throws NS_ERROR_NOT_AVAILABLE
   *         In a situation where a history implementation is not available,
   *         where 'history implementation' refers to something like
   *         nsIGlobalHistory and friends.
   */
  void addDownload(nsIURI aSource, nsIURI aReferrer, double aStartTime);

}