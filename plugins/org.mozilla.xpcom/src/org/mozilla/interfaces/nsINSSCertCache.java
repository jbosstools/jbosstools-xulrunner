/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsINSSCertCache.idl
 */

package org.mozilla.interfaces;

public interface nsINSSCertCache extends nsISupports {

  String NS_INSSCERTCACHE_IID =
    "{1b75bdae-1757-4322-9d1e-cfcaa18cb710}";

  void cacheAllCerts();

  void cacheCertList(nsIX509CertList list);

  nsIX509CertList getX509CachedCerts();

}