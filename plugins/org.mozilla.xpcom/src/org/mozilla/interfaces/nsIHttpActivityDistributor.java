/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/protocol/http/public/nsIHttpActivityObserver.idl
 */

package org.mozilla.interfaces;

/**
     *  When aActivityType is ACTIVITY_TYPE_SOCKET_TRANSPORT
     *  and aActivitySubtype is STATUS_SENDING_TO
     *  aExtraSizeData will contain the count of bytes sent 
     *  There may be more than one of these activities reported
     *  for a single http transaction, each aExtraSizeData 
     *  represents only that portion of the total bytes sent
     *
     *  When aActivityType is ACTIVITY_TYPE_HTTP_TRANSACTION
     *  and aActivitySubtype is ACTIVITY_SUBTYPE_REQUEST_HEADER
     *  aExtraStringData will contain the text of the header
     *
     *  When aActivityType is ACTIVITY_TYPE_HTTP_TRANSACTION
     *  and aActivitySubtype is ACTIVITY_SUBTYPE_RESPONSE_HEADER
     *  aExtraStringData will contain the text of the header
     *
     *  When aActivityType is ACTIVITY_TYPE_HTTP_TRANSACTION
     *  and aActivitySubtype is ACTIVITY_SUBTYPE_RESPONSE_COMPLETE
     *  aExtraSizeData will contain the count of total bytes received
     */
/**
 * nsIHttpActivityDistributor
 *
 * This interface provides a way to register and unregister observers to the
 * http activities.
 */
public interface nsIHttpActivityDistributor extends nsIHttpActivityObserver {

  String NS_IHTTPACTIVITYDISTRIBUTOR_IID =
    "{7c512cb8-582a-4625-b5b6-8639755271b5}";

  void addObserver(nsIHttpActivityObserver aObserver);

  void removeObserver(nsIHttpActivityObserver aObserver);

}