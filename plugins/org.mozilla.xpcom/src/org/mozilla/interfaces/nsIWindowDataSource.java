/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpfe/components/windowds/nsIWindowDataSource.idl
 */

package org.mozilla.interfaces;

public interface nsIWindowDataSource extends nsISupports {

  String NS_IWINDOWDATASOURCE_IID =
    "{3722a5b9-5323-4ed0-bb1a-8299f27a4e89}";

  /**
     * for the given resource name, return the window
     */
  nsIDOMWindowInternal getWindowForResource(String inResource);

}