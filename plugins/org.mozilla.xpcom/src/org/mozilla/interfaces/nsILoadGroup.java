/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsILoadGroup.idl
 */

package org.mozilla.interfaces;

public interface nsILoadGroup extends nsIRequest {

  String NS_ILOADGROUP_IID =
    "{3de0a31c-feaf-400f-9f1e-4ef71f8b20cc}";

  /**
 * A load group maintains a collection of nsIRequest objects. 
 *
 * @status FROZEN
 */
/**
     * The group observer is notified when requests are added to and removed
     * from this load group.  The groupObserver is weak referenced.
     */
  nsIRequestObserver getGroupObserver();

  /**
 * A load group maintains a collection of nsIRequest objects. 
 *
 * @status FROZEN
 */
/**
     * The group observer is notified when requests are added to and removed
     * from this load group.  The groupObserver is weak referenced.
     */
  void setGroupObserver(nsIRequestObserver aGroupObserver);

  /**
     * Accesses the default load request for the group.  Each time a number
     * of requests are added to a group, the defaultLoadRequest may be set
     * to indicate that all of the requests are related to a base request.
     *
     * The load group inherits its load flags from the default load request.
     * If the default load request is NULL, then the group's load flags are
     * not changed.
     */
  nsIRequest getDefaultLoadRequest();

  /**
     * Accesses the default load request for the group.  Each time a number
     * of requests are added to a group, the defaultLoadRequest may be set
     * to indicate that all of the requests are related to a base request.
     *
     * The load group inherits its load flags from the default load request.
     * If the default load request is NULL, then the group's load flags are
     * not changed.
     */
  void setDefaultLoadRequest(nsIRequest aDefaultLoadRequest);

  /**
     * Adds a new request to the group.  This will cause the default load
     * flags to be applied to the request.  If this is a foreground
     * request then the groupObserver's onStartRequest will be called.
     *
     * If the request is the default load request or if the default load
     * request is null, then the load group will inherit its load flags from
     * the request.
     */
  void addRequest(nsIRequest aRequest, nsISupports aContext);

  /**
     * Removes a request from the group.  If this is a foreground request
     * then the groupObserver's onStopRequest will be called.
     *
     * By the time this call ends, aRequest will have been removed from the
     * loadgroup, even if this function throws an exception.
     */
  void removeRequest(nsIRequest aRequest, nsISupports aContext, long aStatus);

  /**
     * Returns the requests contained directly in this group.
     * Enumerator element type: nsIRequest.
     */
  nsISimpleEnumerator getRequests();

  /**
     * Returns the count of "active" requests (ie. requests without the
     * LOAD_BACKGROUND bit set).
     */
  long getActiveCount();

  /**
     * Notification callbacks for the load group.
     */
  nsIInterfaceRequestor getNotificationCallbacks();

  /**
     * Notification callbacks for the load group.
     */
  void setNotificationCallbacks(nsIInterfaceRequestor aNotificationCallbacks);

}