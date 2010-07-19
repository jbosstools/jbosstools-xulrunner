/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/mozapps/update/public/nsIUpdateService.idl
 */

package org.mozilla.interfaces;

/**
 * A temporary interface to allow adding new methods without changing existing
 * interfaces for Gecko 1.9.2. After the 1.9.2 release this interface will be
 * removed.
 */
public interface nsIApplicationUpdateService2 extends nsIApplicationUpdateService {

  String NS_IAPPLICATIONUPDATESERVICE2_IID =
    "{e22e4bf1-b18c-40cd-a2be-2d565723d056}";

  /**
   * Whether or not the Update Service can check for updates. This is a function
   * of whether or not application update is disabled by the application and the
   * platform the application is running on.
   */
  boolean getCanCheckForUpdates();

  /**
   * Whether or not the Update Service can download and install updates.
   * This is a function of whether or not the current user has access
   * privileges to the install directory.
   */
  boolean getCanApplyUpdates();

}