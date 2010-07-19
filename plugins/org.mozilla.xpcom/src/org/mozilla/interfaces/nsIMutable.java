/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/base/nsIMutable.idl
 */

package org.mozilla.interfaces;

/**
 * nsIMutable defines an interface to be implemented by objects which
 * can be made immutable.
 */
public interface nsIMutable extends nsISupports {

  String NS_IMUTABLE_IID =
    "{321578d0-03c1-4d95-8821-021ac612d18d}";

  /**
     * Control whether or not this object can be modified.  If the flag is
     * false, no modification is allowed.  Once the flag has been set to false,
     * it cannot be reset back to true -- attempts to do so throw
     * NS_ERROR_INVALID_ARG.
     */
  boolean getMutable();

  /**
     * Control whether or not this object can be modified.  If the flag is
     * false, no modification is allowed.  Once the flag has been set to false,
     * it cannot be reset back to true -- attempts to do so throw
     * NS_ERROR_INVALID_ARG.
     */
  void setMutable(boolean aMutable);

}