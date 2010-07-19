/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/system/nsIXULAppInfo.idl
 */

package org.mozilla.interfaces;

/**
 * A scriptable interface to the nsXULAppAPI structure. See nsXULAppAPI.h for
 * a detailed description of each attribute.
 *
 * @status FROZEN - This interface is frozen for use by embedders and will
 *                  not change in the future.
 */
public interface nsIXULAppInfo extends nsISupports {

  String NS_IXULAPPINFO_IID =
    "{a61ede2a-ef09-11d9-a5ce-001124787b2e}";

  /**
   * @see nsXREAppData.vendor
   * @returns an empty string if nsXREAppData.vendor is not set.
   */
  String getVendor();

  /**
   * @see nsXREAppData.name
   */
  String getName();

  /**
   * @see nsXREAppData.ID
   * @returns an empty string if nsXREAppData.ID is not set.
   */
  String getID();

  /**
   * The version of the XUL application. It is different than the
   * version of the XULRunner platform. Be careful about which one you want.
   *
   * @see nsXREAppData.version
   * @returns an empty string if nsXREAppData.version is not set.
   */
  String getVersion();

  /**
   * The build ID/date of the application. For xulrunner applications,
   * this will be different than the build ID of the platform. Be careful
   * about which one you want.
   */
  String getAppBuildID();

  /**
   * The version of the XULRunner platform.
   */
  String getPlatformVersion();

  /**
   * The build ID/date of gecko and the XULRunner platform.
   */
  String getPlatformBuildID();

}