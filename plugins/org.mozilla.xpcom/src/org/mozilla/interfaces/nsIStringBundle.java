/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/intl/strres/public/nsIStringBundle.idl
 */

package org.mozilla.interfaces;

public interface nsIStringBundle extends nsISupports {

  String NS_ISTRINGBUNDLE_IID =
    "{d85a17c2-aa7c-11d2-9b8c-00805f8a16d9}";

  String getStringFromID(int aID);

  String getStringFromName(String aName);

  String formatStringFromID(int aID, String[] params, long length);

  String formatStringFromName(String aName, String[] params, long length);

  nsISimpleEnumerator getSimpleEnumeration();

}