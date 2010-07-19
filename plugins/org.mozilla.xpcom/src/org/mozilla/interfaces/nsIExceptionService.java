/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/base/nsIExceptionService.idl
 */

package org.mozilla.interfaces;

public interface nsIExceptionService extends nsIExceptionManager {

  String NS_IEXCEPTIONSERVICE_IID =
    "{35a88f54-f267-4414-92a7-191f6454ab52}";

  /** Obtains an exception manager for the current thread. */
  nsIExceptionManager getCurrentExceptionManager();

  /** Installs an "exception provider" which is capable of
        translating an nsresult into an exception.  This enables
        error providers to return simple nsresults and only provide
        rich errors when specifically requested. It also has the
        advantage of allowing code like the DOM to handle all errors
        in a single function rather than at each XPCOM entry point.
        NOTE: This interface must be thread-safe - it will be called
        on whatever thread needs the error translation performed.*/
  void registerExceptionProvider(nsIExceptionProvider provider, long moduleCode);

  void unregisterExceptionProvider(nsIExceptionProvider provider, long moduleCode);

}