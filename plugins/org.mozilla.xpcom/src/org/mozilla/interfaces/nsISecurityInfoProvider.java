/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsISecurityInfoProvider.idl
 */

package org.mozilla.interfaces;

public interface nsISecurityInfoProvider extends nsISupports {

  String NS_ISECURITYINFOPROVIDER_IID =
    "{b8cc9126-9319-4415-afd9-b82220d453ed}";

  /**
   * The security info for this provider, if any.
   */
  nsISupports getSecurityInfo();

  /**
   * Whether this provider has transferred data.  If it hasn't, its
   * security info should be ignored.
   */
  boolean getHasTransferredData();

}