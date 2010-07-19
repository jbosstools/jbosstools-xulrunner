/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIApplicationCacheContainer.idl
 */

package org.mozilla.interfaces;

/**
 * Interface used by objects that can be associated with an
 * application cache.
 */
public interface nsIApplicationCacheContainer extends nsISupports {

  String NS_IAPPLICATIONCACHECONTAINER_IID =
    "{bbb80700-1f7f-4258-aff4-1743cc5a7d23}";

  nsIApplicationCache getApplicationCache();

  void setApplicationCache(nsIApplicationCache aApplicationCache);

}