/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/uriloader/exthandler/nsIExternalHelperAppService.idl
 */

package org.mozilla.interfaces;

/**
 * This is a private interface shared between external app handlers and the platform specific
 * external helper app service
 */
public interface nsPIExternalAppLauncher extends nsISupports {

  String NS_PIEXTERNALAPPLAUNCHER_IID =
    "{d0b5d7d3-9565-403d-9fb5-e5089c4567c6}";

  /**
   * mscott --> eventually I should move this into a new service so other
   * consumers can add temporary files they want deleted on exit.
   * @param aTemporaryFile A temporary file we should delete on exit.
   */
  void deleteTemporaryFileOnExit(nsIFile aTemporaryFile);

}