/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/base/nsIWeakReference.idl
 */

package org.mozilla.interfaces;

/**
 * An instance of |nsIWeakReference| is a proxy object that cooperates with
 * its referent to give clients a non-owning, non-dangling reference.  Clients
 * own the proxy, and should generally manage it with an |nsCOMPtr| (see the
 * type |nsWeakPtr| for a |typedef| name that stands out) as they would any
 * other XPCOM object.  The |QueryReferent| member function provides a
 * (hopefully short-lived) owning reference on demand, through which clients
 * can get useful access to the referent, while it still exists.
 *
 * @status FROZEN
 * @version 1.0
 * @see nsISupportsWeakReference
 * @see nsWeakReference
 * @see nsWeakPtr
 */
public interface nsIWeakReference extends nsISupports {

  String NS_IWEAKREFERENCE_IID =
    "{9188bc85-f92e-11d2-81ef-0060083a0bcf}";

  /**
     * |QueryReferent| queries the referent, if it exists, and like |QueryInterface|, produces
     * an owning reference to the desired interface.  It is designed to look and act exactly
     * like (a proxied) |QueryInterface|.  Don't hold on to the produced interface permanently;
     * that would defeat the purpose of using a non-owning |nsIWeakReference| in the first place.
     */
  nsISupports queryReferent(String uuid);

}