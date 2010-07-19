/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/widget/public/nsIDragSession.idl
 */

package org.mozilla.interfaces;

public interface nsIDragSession_1_9_2 extends nsISupports {

  String NS_IDRAGSESSION_1_9_2_IID =
    "{fde41f6a-c710-46f8-a0a8-1ff76ca4ff57}";

  /**
   * Indicates if the drop event should be dispatched only to chrome.
   */
  boolean getOnlyChromeDrop();

  /**
   * Indicates if the drop event should be dispatched only to chrome.
   */
  void setOnlyChromeDrop(boolean aOnlyChromeDrop);

}