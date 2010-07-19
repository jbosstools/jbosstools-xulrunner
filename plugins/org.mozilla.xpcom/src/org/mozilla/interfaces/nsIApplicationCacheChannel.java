/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIApplicationCacheChannel.idl
 */

package org.mozilla.interfaces;

/**
 * Interface implemented by channels that support application caches.
 */
public interface nsIApplicationCacheChannel extends nsIApplicationCacheContainer {

  String NS_IAPPLICATIONCACHECHANNEL_IID =
    "{9acfd21c-9c07-459f-8dae-ed2ffba23ddc}";

  /**
     * TRUE when the resource came from the application cache. This
     * might be false even there is assigned an application cache
     * e.g. in case of fallback of load of an entry matching bypass
     * namespace.
     */
  boolean getLoadedFromApplicationCache();

  /**
     * When true, the channel will ask its notification callbacks for
     * an application cache if one is not explicitly provided.  Default
     * value is true.
     *
     * NS_ERROR_ALREADY_OPENED will be thrown if set after AsyncOpen()
     * is called.
     */
  boolean getInheritApplicationCache();

  /**
     * When true, the channel will ask its notification callbacks for
     * an application cache if one is not explicitly provided.  Default
     * value is true.
     *
     * NS_ERROR_ALREADY_OPENED will be thrown if set after AsyncOpen()
     * is called.
     */
  void setInheritApplicationCache(boolean aInheritApplicationCache);

  /**
     * When true, the channel will choose an application cache if one
     * was not explicitly provided and none is available from the
     * notification callbacks.  Default value is false.
     *
     * This attribute will not be transferred through a redirect.
     *
     * NS_ERROR_ALREADY_OPENED will be thrown if set after AsyncOpen()
     * is called.
     */
  boolean getChooseApplicationCache();

  /**
     * When true, the channel will choose an application cache if one
     * was not explicitly provided and none is available from the
     * notification callbacks.  Default value is false.
     *
     * This attribute will not be transferred through a redirect.
     *
     * NS_ERROR_ALREADY_OPENED will be thrown if set after AsyncOpen()
     * is called.
     */
  void setChooseApplicationCache(boolean aChooseApplicationCache);

}