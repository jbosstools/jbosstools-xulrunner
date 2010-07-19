/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/src/xpconnect/idl/xpcIJSWeakReference.idl
 */

package org.mozilla.interfaces;

public interface xpcIJSWeakReference extends nsISupports {

  String XPCIJSWEAKREFERENCE_IID =
    "{5b776cd4-952b-45a2-b363-84e99e8fe608}";

  /**
   * To be called from JS only.
   *
   * Returns the referenced JS object or null if the JS object has
   * been garbage collected.
   */
  void get();

}