/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsITransport.idl
 */

package org.mozilla.interfaces;

public interface nsITransportEventSink extends nsISupports {

  String NS_ITRANSPORTEVENTSINK_IID =
    "{eda4f520-67f7-484b-a691-8c3226a5b0a6}";

  /**
     * Transport status notification.
     *
     * @param aTransport
     *        the transport sending this status notification.
     * @param aStatus
     *        the transport status (resolvable to a string using
     *        nsIErrorService). See nsISocketTransport for socket specific
     *        status codes and more comments.
     * @param aProgress
     *        the amount of data either read or written depending on the value
     *        of the status code.  this value is relative to aProgressMax.
     * @param aProgressMax
     *        the maximum amount of data that will be read or written.  if
     *        unknown, 0xFFFFFFFF will be passed.
     */
  void onTransportStatus(nsITransport aTransport, long aStatus, double aProgress, double aProgressMax);

}