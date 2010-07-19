/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/base/nsIMemoryReporter.idl
 */

package org.mozilla.interfaces;

public interface nsIMemoryReporter extends nsISupports {

  String NS_IMEMORYREPORTER_IID =
    "{d298b942-3e66-4cd3-9ff5-46abc69147a7}";

  String getPath();

  String getDescription();

  long getMemoryUsed();

}