/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/libjar/nsIJARChannel.idl
 */

package org.mozilla.interfaces;

public interface nsIJARChannel extends nsIChannel {

  String NS_IJARCHANNEL_IID =
    "{6e6cc56d-51eb-4299-a795-dcfd1229ab3d}";

  /**
     * Returns TRUE if the JAR file is not safe (if the content type reported
     * by the server for a remote JAR is not of an expected type).  Scripting,
     * redirects, and plugins should be disabled when loading from this
     * channel.
     */
  boolean getIsUnsafe();

}