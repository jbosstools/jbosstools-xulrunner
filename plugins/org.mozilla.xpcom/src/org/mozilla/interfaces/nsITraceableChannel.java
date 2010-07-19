/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsITraceableChannel.idl
 */

package org.mozilla.interfaces;

/**
 * A channel implementing this interface allows one to intercept its data by
 * inserting intermediate stream listeners.
 */
public interface nsITraceableChannel extends nsISupports {

  String NS_ITRACEABLECHANNEL_IID =
    "{68167b0b-ef34-4d79-a09a-8045f7c5140e}";

  nsIStreamListener setNewListener(nsIStreamListener aListener);

}