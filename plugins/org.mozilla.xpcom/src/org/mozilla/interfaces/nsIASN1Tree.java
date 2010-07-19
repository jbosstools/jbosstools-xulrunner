/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/pki/public/nsIASN1Tree.idl
 */

package org.mozilla.interfaces;

public interface nsIASN1Tree extends nsITreeView {

  String NS_IASN1TREE_IID =
    "{c727b2f2-1dd1-11b2-95df-f63c15b4cd35}";

  void loadASN1Structure(nsIASN1Object asn1Object);

  String getDisplayData(long index);

}