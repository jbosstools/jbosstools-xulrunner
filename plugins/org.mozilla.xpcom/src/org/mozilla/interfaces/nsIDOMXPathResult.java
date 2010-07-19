/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/xpath/nsIDOMXPathResult.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMXPathResult extends nsISupports {

  String NS_IDOMXPATHRESULT_IID =
    "{75506f84-b504-11d5-a7f2-ca108ab8b6fc}";

  int ANY_TYPE = 0;

  int NUMBER_TYPE = 1;

  int STRING_TYPE = 2;

  int BOOLEAN_TYPE = 3;

  int UNORDERED_NODE_ITERATOR_TYPE = 4;

  int ORDERED_NODE_ITERATOR_TYPE = 5;

  int UNORDERED_NODE_SNAPSHOT_TYPE = 6;

  int ORDERED_NODE_SNAPSHOT_TYPE = 7;

  int ANY_UNORDERED_NODE_TYPE = 8;

  int FIRST_ORDERED_NODE_TYPE = 9;

  int getResultType();

  double getNumberValue();

  String getStringValue();

  boolean getBooleanValue();

  nsIDOMNode getSingleNodeValue();

  boolean getInvalidIteratorState();

  long getSnapshotLength();

  nsIDOMNode iterateNext();

  nsIDOMNode snapshotItem(long index);

}