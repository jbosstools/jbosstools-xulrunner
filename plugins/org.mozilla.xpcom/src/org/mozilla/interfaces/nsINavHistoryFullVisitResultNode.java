/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsINavHistoryService.idl
 */

package org.mozilla.interfaces;

/**
 * This structure will be returned when you request RESULT_TYPE_FULL_VISIT in
 * the query options. This includes uncommonly used information about each
 * visit.
 */
public interface nsINavHistoryFullVisitResultNode extends nsINavHistoryVisitResultNode {

  String NS_INAVHISTORYFULLVISITRESULTNODE_IID =
    "{c49fd9d5-56e2-43eb-932c-f933f28cba85}";

  /**
   * This indicates the visit ID of the visit.
   */
  long getVisitId();

  /**
   * This indicates the referring visit ID of the visit. The referrer should
   * have the same sessionId.
   */
  long getReferringVisitId();

  /**
   * Indicates the transition type of the visit.
   * One of nsINavHistoryService.TRANSITION_*
   */
  int getTransitionType();

}