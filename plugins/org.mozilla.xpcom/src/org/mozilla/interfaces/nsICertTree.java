/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsICertTree.idl
 */

package org.mozilla.interfaces;

public interface nsICertTree extends nsITreeView {

  String NS_ICERTTREE_IID =
    "{a8cd1c89-a901-4735-831b-7198b7b8b6b1}";

  void loadCerts(long type);

  void loadCertsFromCache(nsINSSCertCache cache, long type);

  nsIX509Cert getCert(long index);

  nsICertTreeItem getTreeItem(long index);

  boolean isHostPortOverride(long index);

  void deleteEntryObject(long index);

}