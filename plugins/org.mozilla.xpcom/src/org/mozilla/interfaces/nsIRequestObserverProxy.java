/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIRequestObserverProxy.idl
 */

package org.mozilla.interfaces;

/**
 * A request observer proxy is used to ship data over to another thread
 * specified by the thread's dispatch target. The "true" request observer's
 * methods are invoked on the other thread.
 *
 * This interface only provides the initialization needed after construction.
 * Otherwise, these objects are used simply as nsIRequestObserver's.
 */
public interface nsIRequestObserverProxy extends nsIRequestObserver {

  String NS_IREQUESTOBSERVERPROXY_IID =
    "{7df8845f-938a-4437-9ea4-b11b850048f1}";

  /**
     * Initializes an nsIRequestObserverProxy.
     *
     * @param observer - receives observer notifications on the other thread
     * @param target - may be NULL indicating the calling thread's event target
     */
  void init(nsIRequestObserver observer, nsIEventTarget target);

}