/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/proxy/public/nsIProxyObjectManager.idl
 */

package org.mozilla.interfaces;

/**
 * An interface for the proxy object manager.
 *
 * See http://www.mozilla.org/projects/xpcom/Proxies.html
 */
public interface nsIProxyObjectManager extends nsISupports {

  String NS_IPROXYOBJECTMANAGER_IID =
    "{ee8ce1e3-0319-4bd9-8f70-7258b21c7733}";

  /**
     * Construct a proxy object that invokes methods on the real object
     * synchronously (i.e., the calling thread is blocked until the real method
     * call returns).  This flag causes methods invoked on the proxy object to
     * emmulate a real method call.
     *
     * For C++ callers, NS_PROXY_SYNC is a synonym for this flag.
     */
  int INVOKE_SYNC = 1;

  /**
     * Construct a proxy object that invokes methods on the real object
     * asynchronously (i.e., the calling thread does not wait for the real
     * method call to occur).
     * 
     * WARNING: do not pass pointers into the stack when using this flag.
     *
     * For C++ callers, NS_PROXY_ASYNC is a synonym for this flag.
     */
  int INVOKE_ASYNC = 2;

  /**
     * Always create the proxy object even if for same thread as current thread.
     *
     * For C++ callers, NS_PROXY_ALWAYS is a synonym for this flag.
     */
  int FORCE_PROXY_CREATION = 4;

  /**
     * Create a proxy for the given object.  The proxy implements the specified
     * interface, but when its methods are invoked, it causes the corresponding
     * method on the actual object to be called via the designated event
     * target.  Typically, the event target identifies a thread where the
     * method call should occur.
     *
     * @param target
     *   If target is null, then the current thread is used as the target.
     *   Otherwise, target identifies the nsIEventTarget from which proxy
     *   method calls should be executed.
     * @param iid
     *   Identifies the interface being proxied.  The given object must QI to
     *   this type.
     * @param object
     *   The object being proxied.
     * @param proxyType
     *   Specifies the type of proxy to construct.  Either INVOKE_SYNC or
     *   INVOKE_ASYNC must be specified.  FORCE_PROXY_CREATION may be bit-wise
     *   OR'd with either of those flags.
     * @param result
     *   This param holds the resulting proxy object upon successful return.
     */
  nsISupports getProxyForObject(nsIEventTarget target, String iid, nsISupports object, int proxyType);

}