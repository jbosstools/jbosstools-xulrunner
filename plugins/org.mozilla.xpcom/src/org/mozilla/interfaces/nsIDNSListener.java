/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/dns/public/nsIDNSListener.idl
 */

package org.mozilla.interfaces;

/**
 * nsIDNSListener
 */
public interface nsIDNSListener extends nsISupports {

  String NS_IDNSLISTENER_IID =
    "{41466a9f-f027-487d-a96c-af39e629b8d2}";

  /**
     * called when an asynchronous host lookup completes.
     *
     * @param aRequest
     *        the value returned from asyncResolve.
     * @param aRecord
     *        the DNS record corresponding to the hostname that was resolved.
     *        this parameter is null if there was an error.
     * @param aStatus
     *        if the lookup failed, this parameter gives the reason.
     */
  void onLookupComplete(nsICancelable aRequest, nsIDNSRecord aRecord, long aStatus);

}