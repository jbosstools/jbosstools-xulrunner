/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/libpref/public/nsIPrefBranch2.idl
 */

package org.mozilla.interfaces;

/**
 * nsIPrefBranch2 allows clients to observe changes to pref values.
 *
 * @status FROZEN
 * @see nsIPrefBranch
 */
public interface nsIPrefBranch2 extends nsIPrefBranch {

  String NS_IPREFBRANCH2_IID =
    "{74567534-eb94-4b1c-8f45-389643bfc555}";

  /**
   * Add a preference change observer. On preference changes, the following
   * arguments will be passed to the nsIObserver.observe() method:
   *   aSubject - The nsIPrefBranch object (this)
   *   aTopic   - The string defined by NS_PREFBRANCH_PREFCHANGE_TOPIC_ID
   *   aData    - The name of the preference which has changed, relative to
   *              the |root| of the aSubject branch.
   *
   * aSubject.get*Pref(aData) will get the new value of the modified
   * preference. For example, if your observer is registered with
   * addObserver("bar.", ...) on a branch with root "foo.", modifying
   * the preference "foo.bar.baz" will trigger the observer, and aData
   * parameter will be "bar.baz".
   *
   * @param aDomain   The preference on which to listen for changes. This can
   *                  be the name of an entire branch to observe.
   *                  e.g. Holding the "root" prefbranch and calling
   *                  addObserver("foo.bar.", ...) will observe changes to
   *                  foo.bar.baz and foo.bar.bzip
   * @param aObserver The object to be notified if the preference changes.
   * @param aHoldWeak true  Hold a weak reference to |aObserver|. The object
   *                        must implement the nsISupportsWeakReference
   *                        interface or this will fail.
   *                  false Hold a strong reference to |aObserver|.
   *
   * @note
   * Registering as a preference observer can open an object to potential
   * cyclical references which will cause memory leaks. These cycles generally
   * occur because an object both registers itself as an observer (causing the
   * branch to hold a reference to the observer) and holds a reference to the
   * branch object for the purpose of getting/setting preference values. There
   * are 3 approaches which have been implemented in an attempt to avoid these
   * situations.
   * 1) The nsPrefBranch object supports nsISupportsWeakReference. Any consumer
   *    may hold a weak reference to it instead of a strong one.
   * 2) The nsPrefBranch object listens for xpcom-shutdown and frees all of the
   *    objects currently in its observer list. This ensures that long lived
   *    objects (services for example) will be freed correctly.
   * 3) The observer can request to be held as a weak reference when it is
   *    registered. This insures that shorter lived objects (say one tied to an
   *    open window) will not fall into the cyclical reference trap.
   *
   * @note
   * The list of registered observers may be changed during the dispatch of
   * nsPref:changed notification. However, the observers are not guaranteed
   * to be notified in any particular order, so you can't be sure whether the
   * added/removed observer will be called during the notification when it
   * is added/removed.
   *
   * @note
   * It is possible to change preferences during the notification.
   *
   * @note
   * It is not safe to change observers during this callback in Gecko 
   * releases before 1.9. If you want a safe way to remove a pref observer,
   * please use an nsITimer.
   *
   * @see nsIObserver
   * @see removeObserver
   */
  void addObserver(String aDomain, nsIObserver aObserver, boolean aHoldWeak);

  /**
   * Remove a preference change observer.
   *
   * @param aDomain   The preference which is being observed for changes.
   * @param aObserver An observer previously registered with addObserver().
   *
   * @note
   * Note that you must call removeObserver() on the same nsIPrefBranch2
   * instance on which you called addObserver() in order to remove aObserver;
   * otherwise, the observer will not be removed.
   *
   * @see nsIObserver
   * @see addObserver
   */
  void removeObserver(String aDomain, nsIObserver aObserver);

}