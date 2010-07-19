/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/storage/nsIDOMToString.idl
 */

package org.mozilla.interfaces;

/**
 * The sole purpose of this interface is to make it easy for XPCOM
 * object's to hook into JS' toString() when interacting with
 * XPConnect. If you implement this interface and advertize it in the
 * object's classinfo, you'll get automatic mapping from JS'
 * toString() to the toString() method in this interface.
 *
 * XXXjst: This doesn't really belong in dom/public/idl/storage, but
 * it gets to live here until I find a more suitable place.
 */
public interface nsIDOMToString extends nsISupports {

  String NS_IDOMTOSTRING_IID =
    "{2a72e20f-e337-4822-8994-2e35b5550d03}";

  String toString();

}