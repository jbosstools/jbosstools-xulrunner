/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsIObserver.idl
 */

package org.mozilla.interfaces;

/**
 * This interface is implemented by an object that wants
 * to observe an event corresponding to a topic.
 *
 * @status FROZEN
 */
public interface nsIObserver extends nsISupports {

  String NS_IOBSERVER_IID =
    "{db242e01-e4d9-11d2-9dde-000064657374}";

  /**
    * Observe will be called when there is a notification for the
    * topic |aTopic|.  This assumes that the object implementing
    * this interface has been registered with an observer service
    * such as the nsIObserverService. 
    *
    * If you expect multiple topics/subjects, the impl is 
    * responsible for filtering.
    *
    * You should not modify, add, remove, or enumerate 
    * notifications in the implemention of observe. 
    *
    * @param aSubject : Notification specific interface pointer.
    * @param aTopic   : The notification topic or subject.
    * @param aData    : Notification specific wide string.
    *                    subject event.
    */
  void observe(nsISupports aSubject, String aTopic, String aData);

}