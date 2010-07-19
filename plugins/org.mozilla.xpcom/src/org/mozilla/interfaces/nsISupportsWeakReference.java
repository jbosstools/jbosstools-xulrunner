/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/base/nsIWeakReference.idl
 */

package org.mozilla.interfaces;

/**
 * |nsISupportsWeakReference| is a factory interface which produces appropriate
 * instances of |nsIWeakReference|.  Weak references in this scheme can only be
 * produced for objects that implement this interface.
 *
 * @status FROZEN
 * @version 1.0
 * @see nsIWeakReference
 * @see nsSupportsWeakReference
 */
public interface nsISupportsWeakReference extends nsISupports {

  String NS_ISUPPORTSWEAKREFERENCE_IID =
    "{9188bc86-f92e-11d2-81ef-0060083a0bcf}";

  /**
     * |GetWeakReference| produces an appropriate instance of |nsIWeakReference|.
     * As with all good XPCOM `getters', you own the resulting interface and should
     * manage it with an |nsCOMPtr|.
     *
     * @see nsIWeakReference
     * @see nsWeakPtr
     * @see nsCOMPtr
     */
  nsISupports getWeakReference();

}