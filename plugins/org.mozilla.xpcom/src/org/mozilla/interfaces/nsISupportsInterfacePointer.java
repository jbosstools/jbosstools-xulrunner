/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsISupportsPrimitives.idl
 */

package org.mozilla.interfaces;

/**
 * Scriptable storage for other XPCOM objects
 * 
 * @status FROZEN
 */
public interface nsISupportsInterfacePointer extends nsISupportsPrimitive {

  String NS_ISUPPORTSINTERFACEPOINTER_IID =
    "{995ea724-1dd1-11b2-9211-c21bdd3e7ed0}";

  nsISupports getData();

  void setData(nsISupports aData);

  String getDataIID();

  void setDataIID(String aDataIID);

  String toString();

}