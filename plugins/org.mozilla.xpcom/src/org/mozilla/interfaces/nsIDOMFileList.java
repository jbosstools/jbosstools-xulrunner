/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsIDOMFileList.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMFileList extends nsISupports {

  String NS_IDOMFILELIST_IID =
    "{3bfef9fa-8ad3-4e49-bd62-d6cd75b29298}";

  long getLength();

  nsIDOMFile item(long index);

}