/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/feeds/public/nsIFeedListener.idl
 */

package org.mozilla.interfaces;

/**
 * nsIFeedResultListener defines a callback used when feed processing
 * completes.
 */
public interface nsIFeedResultListener extends nsISupports {

  String NS_IFEEDRESULTLISTENER_IID =
    "{4d2ebe88-36eb-4e20-bcd1-997b3c1f24ce}";

  /** 
   * Always called, even after an error. There could be new feed-level
   * data available at this point, if it followed or was interspersed
   * with the items. Fire-and-Forget implementations only need this.
   * 
   * @param result
   *        An object implementing nsIFeedResult representing the feed 
   *        and its metadata. 
   */
  void handleResult(nsIFeedResult result);

}