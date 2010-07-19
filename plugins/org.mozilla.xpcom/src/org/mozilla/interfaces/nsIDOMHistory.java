/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/base/nsIDOMHistory.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMHistory extends nsISupports {

  String NS_IDOMHISTORY_IID =
    "{896d1d20-b4c4-11d2-bd93-00805f8ae3f4}";

  int getLength();

  String getCurrent();

  String getPrevious();

  String getNext();

  void back();

  void forward();

  void go(int aDelta);

  String item(long index);

}