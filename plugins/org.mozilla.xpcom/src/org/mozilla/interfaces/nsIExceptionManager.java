/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/base/nsIExceptionService.idl
 */

package org.mozilla.interfaces;

public interface nsIExceptionManager extends nsISupports {

  String NS_IEXCEPTIONMANAGER_IID =
    "{efc9d00b-231c-4feb-852c-ac017266a415}";

  /** Sets (or clears with nsnull) the current error on the this thread. */
  void setCurrentException(nsIException error);

  /** Gets the current error for the current thread, or NULL if no error */
  nsIException getCurrentException();

  /** Gets an exception from a registered exception provider..
        This has no effect on the "current exception" */
  nsIException getExceptionFromProvider(long rc, nsIException defaultException);

}