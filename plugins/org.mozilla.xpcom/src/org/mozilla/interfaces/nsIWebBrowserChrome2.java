/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/browser/webBrowser/nsIWebBrowserChrome2.idl
 */

package org.mozilla.interfaces;

/**
 * nsIWebBrowserChrome2 is an extension to nsIWebBrowserChrome.
 */
public interface nsIWebBrowserChrome2 extends nsIWebBrowserChrome {

  String NS_IWEBBROWSERCHROME2_IID =
    "{2585a7b1-7b47-43c4-bf17-c6bf84e09b7b}";

  /**
   * Called when the status text in the chrome needs to be updated.  This
   * method may be called instead of nsIWebBrowserChrome::SetStatus.  An
   * implementor of this method, should still implement SetStatus.
   *
   * @param statusType
   *        Indicates what is setting the text.
   * @param status
   *        Status string.  Null is an acceptable value meaning no status.
   * @param contextNode 
   *        An object that provides context pertaining to the status type.
   *        If statusType is STATUS_LINK, then statusContext may be a DOM
   *        node corresponding to the source of the link.  This value can
   *        be null if there is no context.
   */
  void setStatusWithContext(long statusType, String statusText, nsISupports statusContext);

}