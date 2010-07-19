/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpfe/appshell/public/nsIPopupWindowManager.idl
 */

package org.mozilla.interfaces;

public interface nsIPopupWindowManager extends nsISupports {

  String NS_IPOPUPWINDOWMANAGER_IID =
    "{3210a6aa-b464-4f57-9335-b22815567cf1}";

  /**
   * These values are returned by the testPermission method
   */
  long ALLOW_POPUP = 1L;

  long DENY_POPUP = 2L;

  long ALLOW_POPUP_WITH_PREJUDICE = 3L;

  /**
   * Test whether a website has permission to show a popup window.
   * @param   uri is the URI to be tested
   * @return  one of the enumerated permission actions defined above
   */
  long testPermission(nsIURI uri);

}