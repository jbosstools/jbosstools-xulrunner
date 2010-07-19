/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/ds/nsISupportsArray.idl
 */

package org.mozilla.interfaces;

public interface nsISupportsArray extends nsICollection {

  String NS_ISUPPORTSARRAY_IID =
    "{791eafa0-b9e6-11d1-8031-006008159b5a}";

  int getIndexOf(nsISupports aPossibleElement);

  int getIndexOfStartingAt(nsISupports aPossibleElement, long aStartIndex);

  int getLastIndexOf(nsISupports aPossibleElement);

  void deleteLastElement(nsISupports aElement);

  void deleteElementAt(long aIndex);

  void compact();

  nsISupportsArray _clone();

}