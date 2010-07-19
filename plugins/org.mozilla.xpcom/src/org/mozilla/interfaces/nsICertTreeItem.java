/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsICertTree.idl
 */

package org.mozilla.interfaces;

public interface nsICertTreeItem extends nsISupports {

  String NS_ICERTTREEITEM_IID =
    "{d0180863-606e-49e6-8324-cf45ed4dd891}";

  nsIX509Cert getCert();

  String getHostPort();

}