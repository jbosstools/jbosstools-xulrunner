/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIPermission.idl
 */

package org.mozilla.interfaces;

/**
 * This interface defines a "permission" object,
 * used to specify allowed/blocked objects from
 * user-specified sites (cookies, images etc).
 */
public interface nsIPermission extends nsISupports {

  String NS_IPERMISSION_IID =
    "{28f16d80-157b-11d5-a542-0010a401eb10}";

  /**
     * The name of the host for which the permission is set
     */
  String getHost();

  /**
     * a case-sensitive ASCII string, indicating the type of permission
     * (e.g., "cookie", "image", etc).
     * This string is specified by the consumer when adding a permission 
     * via nsIPermissionManager.
     * @see nsIPermissionManager
     */
  String getType();

  /**
     * The permission (see nsIPermissionManager.idl for allowed values)
     */
  long getCapability();

}