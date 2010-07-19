/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIX509Cert3.idl
 */

package org.mozilla.interfaces;

public interface nsICertVerificationListener extends nsISupports {

  String NS_ICERTVERIFICATIONLISTENER_IID =
    "{6684bce9-50db-48e1-81b7-98102bf81357}";

  /**
   *  Notify that results are ready, that have been requested
   *  using nsIX509Cert3::requestUsagesArrayAsync()
   */
  void _notify(nsIX509Cert3 verifiedCert, nsICertVerificationResult result);

}