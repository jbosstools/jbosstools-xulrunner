/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/js/src/xpconnect/idl/xpcjsid.idl
 */

package org.mozilla.interfaces;

public interface nsIJSID extends nsISupports {

  String NS_IJSID_IID =
    "{baedc96a-9cee-4b6b-9160-90d257b3c8ef}";

  String getName();

  String getNumber();

  boolean getValid();

  boolean _equals(nsIJSID other);

  void initialize(String idString);

  String toString();

}