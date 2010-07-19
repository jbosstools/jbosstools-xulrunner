/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xulrunner/setup/nsIXULAppInstall.idl
 */

package org.mozilla.interfaces;

/**
 * Installation and management of XUL applications.
 *
 * @status IN_FLUX   This interface is not stable and will change in the
 *                   future.
 */
public interface nsIXULAppInstall extends nsISupports {

  String NS_IXULAPPINSTALL_IID =
    "{800ace15-6b38-48c4-b057-7928378f6cd2}";

  /**
   * Install a XUL application into a form that can be run by the native
   * operating system.
   *
   * @param aAppFile   Directory or a zip file containing a 
   *                   XULRunner package (with the required application.ini
   *                   file in the root).
   * @param aDirectory Path specifying the location to install the
   *                   application. If null, an appropriate default install
   *                   location will be used. e.g. "C:\Program Files\<Vendor>"
   *                   on Windows.
   * @param aLeafName  The leaf name of the application directory. If empty
   *                   an appropriate default will be chosen. e.g. "Simple.app"
   *                   on Mac.
   */
  void installApplication(nsIFile aAppFile, nsIFile aDirectory, String aLeafName);

}