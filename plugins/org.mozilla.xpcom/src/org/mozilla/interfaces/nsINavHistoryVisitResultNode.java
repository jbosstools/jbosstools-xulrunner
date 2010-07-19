/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsINavHistoryService.idl
 */

package org.mozilla.interfaces;

/**
 * When you request RESULT_TYPE_VISIT from query options, you will get this
 * interface for each item, which includes the session ID so that we can
 * group items from the same session together.
 */
public interface nsINavHistoryVisitResultNode extends nsINavHistoryResultNode {

  String NS_INAVHISTORYVISITRESULTNODE_IID =
    "{8e2c5a86-b33d-4fa6-944b-559af7e95fcd}";

  /**
   * This indicates the session ID of the * visit. This is used for session
   * grouping when a tree view is sorted by date.
   */
  long getSessionId();

}