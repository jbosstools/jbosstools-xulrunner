/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIFastLoadFileControl.idl
 */

package org.mozilla.interfaces;

public interface nsIFastLoadWriteControl extends nsIFastLoadFileControl {

  String NS_IFASTLOADWRITECONTROL_IID =
    "{2ad6e9e6-1379-4e45-a899-a54b27ff915c}";

  /**
     * Add a file dependency of the FastLoad file (e.g., a .jar file) to the
     * set of dependencies that trigger regeneration if any dependency has a
     * last-modified-time greater than the FastLoad file's mtime.
     */
  void addDependency(nsIFile aFile);

}