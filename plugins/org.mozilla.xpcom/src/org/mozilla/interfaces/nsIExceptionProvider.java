/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/base/nsIExceptionService.idl
 */

package org.mozilla.interfaces;

public interface nsIExceptionProvider extends nsISupports {

  String NS_IEXCEPTIONPROVIDER_IID =
    "{0577744c-c1d2-47f2-8bcc-ce7a9e5a88fc}";

  /** Gets an nsIException or returns NULL if not possible. **/
  nsIException getException(long result, nsIException defaultException);

}