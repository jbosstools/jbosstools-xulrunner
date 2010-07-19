/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIX509CertList.idl
 */

package org.mozilla.interfaces;

public interface nsIX509CertList extends nsISupports {

  String NS_IX509CERTLIST_IID =
    "{a539759b-e22d-462f-94ea-2915b11b33e8}";

  void addCert(nsIX509Cert cert);

  void deleteCert(nsIX509Cert cert);

  nsISimpleEnumerator getEnumerator();

}