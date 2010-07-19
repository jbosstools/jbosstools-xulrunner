/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsISyncStreamListener.idl
 */

package org.mozilla.interfaces;

public interface nsISyncStreamListener extends nsIStreamListener {

  String NS_ISYNCSTREAMLISTENER_IID =
    "{7e1aa658-6e3f-4521-9946-9685a169f764}";

  /**
     * Returns an input stream that when read will fetch data delivered to the
     * sync stream listener.  The nsIInputStream implementation will wait for
     * OnDataAvailable events before returning from Read.
     *
     * NOTE: Reading from the returned nsIInputStream may spin the current
     * thread's event queue, which could result in any event being processed.
     */
  nsIInputStream getInputStream();

}