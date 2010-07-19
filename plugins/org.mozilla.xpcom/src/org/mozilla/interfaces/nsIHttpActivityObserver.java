/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/protocol/http/public/nsIHttpActivityObserver.idl
 */

package org.mozilla.interfaces;

/**
 * nsIHttpActivityObserver
 *
 * This interface provides a way for http activities to be reported
 * to observers.
 */
public interface nsIHttpActivityObserver extends nsISupports {

  String NS_IHTTPACTIVITYOBSERVER_IID =
    "{412880c8-6c36-48d8-bf8f-84f91f892503}";

  /**
     * observe activity from the http transport
     *
     * @param aHttpChannel
     *        nsISupports interface for the the http channel that
     *        generated this activity
     * @param aActivityType
     *        The value of this aActivityType will be one of
     *          ACTIVITY_TYPE_SOCKET_TRANSPORT or
     *          ACTIVITY_TYPE_HTTP_TRANSACTION
     * @param aActivitySubtype
     *        The value of this aActivitySubtype, will be depend
     *        on the value of aActivityType. When aActivityType
     *        is ACTIVITY_TYPE_SOCKET_TRANSPORT
     *          aActivitySubtype will be one of the
     *          nsISocketTransport::STATUS_???? values defined in
     *          nsISocketTransport.idl
     *        OR when aActivityType
     *        is ACTIVITY_TYPE_HTTP_TRANSACTION
     *          aActivitySubtype will be one of the
     *          nsIHttpActivityObserver::ACTIVITY_SUBTYPE_???? values
     *          defined below
     * @param aTimestamp
     *        microseconds past the epoch of Jan 1, 1970
     * @param aExtraSizeData
     *        Any extra size data optionally available with
     *        this activity
     * @param aExtraStringData
     *        Any extra string data optionally available with
     *        this activity
     */
  void observeActivity(nsISupports aHttpChannel, long aActivityType, long aActivitySubtype, double aTimestamp, double aExtraSizeData, String aExtraStringData);

  /**
     * This attribute is true when this interface is active and should
     * observe http activities. When false, observeActivity() should not
     * be called. It is present for compatibility reasons and should be
     * implemented only by nsHttpActivityDistributor.
     */
  boolean getIsActive();

  long ACTIVITY_TYPE_SOCKET_TRANSPORT = 1L;

  long ACTIVITY_TYPE_HTTP_TRANSACTION = 2L;

  long ACTIVITY_SUBTYPE_REQUEST_HEADER = 20481L;

  long ACTIVITY_SUBTYPE_REQUEST_BODY_SENT = 20482L;

  long ACTIVITY_SUBTYPE_RESPONSE_START = 20483L;

  long ACTIVITY_SUBTYPE_RESPONSE_HEADER = 20484L;

  long ACTIVITY_SUBTYPE_RESPONSE_COMPLETE = 20485L;

  long ACTIVITY_SUBTYPE_TRANSACTION_CLOSE = 20486L;

}