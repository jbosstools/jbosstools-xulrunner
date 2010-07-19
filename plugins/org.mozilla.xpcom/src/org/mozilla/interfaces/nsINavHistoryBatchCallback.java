/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsINavHistoryService.idl
 */

package org.mozilla.interfaces;

public interface nsINavHistoryBatchCallback extends nsISupports {

  String NS_INAVHISTORYBATCHCALLBACK_IID =
    "{5143f2bb-be0a-4faf-9acb-b0ed3f82952c}";

  /**
 * @see runInBatchMode of nsINavHistoryService/nsINavBookmarksService
 */
  void runBatched(nsISupports aUserData);

}