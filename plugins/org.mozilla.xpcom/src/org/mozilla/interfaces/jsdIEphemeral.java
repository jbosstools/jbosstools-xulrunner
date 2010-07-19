/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/jsd/idl/jsdIDebuggerService.idl
 */

package org.mozilla.interfaces;

public interface jsdIEphemeral extends nsISupports {

  String JSDIEPHEMERAL_IID =
    "{46f1e23e-1dd2-11b2-9ceb-8285f2e95e69}";

  /**
 * Objects which inherit this interface may go away, with (jsdIScript) or
 * without (all others) notification.  These objects are generally wrappers
 * around JSD structures that go away when you call jsdService::Off().
 */
/**
     * |true| if this object is still valid.  If not, many or all of the methods
     * and/or properties of the inheritor may no longer be callable.
     */
  boolean getIsValid();

}