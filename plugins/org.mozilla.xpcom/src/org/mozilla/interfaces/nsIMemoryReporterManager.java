/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/base/nsIMemoryReporter.idl
 */

package org.mozilla.interfaces;

public interface nsIMemoryReporterManager extends nsISupports {

  String NS_IMEMORYREPORTERMANAGER_IID =
    "{7c62de18-1edd-40f8-9da2-a8c622763074}";

  nsISimpleEnumerator enumerateReporters();

  void registerReporter(nsIMemoryReporter reporter);

  void unregisterReporter(nsIMemoryReporter reporter);

  void init();

}