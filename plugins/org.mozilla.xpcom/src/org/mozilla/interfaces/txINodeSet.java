/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/xslt/public/txINodeSet.idl
 */

package org.mozilla.interfaces;

public interface txINodeSet extends nsISupports {

  String TXINODESET_IID =
    "{15d424c0-6b47-11d9-9791-000a95dc234c}";

  nsIDOMNode item(long index);

  double itemAsNumber(long index);

  String itemAsString(long index);

  long getLength();

  void add(nsIDOMNode node);

}