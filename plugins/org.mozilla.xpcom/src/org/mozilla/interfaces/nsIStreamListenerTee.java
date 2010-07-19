/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIStreamListenerTee.idl
 */

package org.mozilla.interfaces;

/**
 * As data "flows" into a stream listener tee, it is copied to the output stream
 * and then forwarded to the real listener.
 */
public interface nsIStreamListenerTee extends nsIStreamListener {

  String NS_ISTREAMLISTENERTEE_IID =
    "{fb683e76-d42b-41a4-8ae6-65a6c2b146e5}";

  void init(nsIStreamListener listener, nsIOutputStream sink);

}