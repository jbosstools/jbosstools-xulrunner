/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsIObserverService.idl
 */

package org.mozilla.interfaces;

/**
 * nsIObserverService
 * 
 * Service allows a client listener (nsIObserver) to register and unregister for 
 * notifications of specific string referenced topic. Service also provides a 
 * way to notify registered listeners and a way to enumerate registered client 
 * listeners.
 * 
 * @status FROZEN
 */
public interface nsIObserverService extends nsISupports {

  String NS_IOBSERVERSERVICE_IID =
    "{d07f5192-e3d1-11d2-8acd-00105a1b8860}";

  /**
     * AddObserver
     *
     * Registers a given listener for a notifications regarding the specified
     * topic.
     *
     * @param anObserve : The interface pointer which will receive notifications.
     * @param aTopic    : The notification topic or subject.
     * @param ownsWeak  : If set to false, the nsIObserverService will hold a 
     *                    strong reference to |anObserver|.  If set to true and 
     *                    |anObserver| supports the nsIWeakReference interface,
     *                    a weak reference will be held.  Otherwise an error will be
     *                    returned.
     */
  void addObserver(nsIObserver anObserver, String aTopic, boolean ownsWeak);

  /**
     * removeObserver
     *
     * Unregisters a given listener from notifications regarding the specified
     * topic.
     *
     * @param anObserver : The interface pointer which will stop recieving
     *                     notifications.
     * @param aTopic     : The notification topic or subject.
     */
  void removeObserver(nsIObserver anObserver, String aTopic);

  /**
     * notifyObservers
     *
     * Notifies all registered listeners of the given topic.
     *
     * @param aSubject : Notification specific interface pointer.
     * @param aTopic   : The notification topic or subject.
     * @param someData : Notification specific wide string.
     */
  void notifyObservers(nsISupports aSubject, String aTopic, String someData);

  /**
     * enumerateObservers
     *
     * Returns an enumeration of all registered listeners.
     *
     * @param aTopic   : The notification topic or subject.
     */
  nsISimpleEnumerator enumerateObservers(String aTopic);

}