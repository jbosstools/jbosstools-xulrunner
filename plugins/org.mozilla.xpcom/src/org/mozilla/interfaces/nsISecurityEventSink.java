/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsISecurityEventSink.idl
 */

package org.mozilla.interfaces;

public interface nsISecurityEventSink extends nsISupports {

  String NS_ISECURITYEVENTSINK_IID =
    "{a71aee68-dd38-4736-bd79-035fea1a1ec6}";

  /**
      * Fired when a security change occurs due to page transitions,
      * or end document load. This interface should be called by
      * a security package (eg Netscape Personal Security Manager)
      * to notify nsIWebProgressListeners that security state has
      * changed. State flags are in nsIWebProgressListener.idl
      */
  void onSecurityChange(nsISupports i_Context, long state);

}