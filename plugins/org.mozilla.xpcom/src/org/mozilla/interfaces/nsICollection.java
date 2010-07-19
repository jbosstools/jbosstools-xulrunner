/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsICollection.idl
 */

package org.mozilla.interfaces;

public interface nsICollection extends nsISerializable {

  String NS_ICOLLECTION_IID =
    "{83b6019c-cbc4-11d2-8cca-0060b0fc14a3}";

  long count();

  nsISupports getElementAt(long index);

  nsISupports queryElementAt(long index, String uuid);

  void setElementAt(long index, nsISupports item);

  void appendElement(nsISupports item);

  void removeElement(nsISupports item);

  nsIEnumerator enumerate();

  void clear();

}