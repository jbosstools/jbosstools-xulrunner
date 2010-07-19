/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/protocol/ftp/public/nsIFTPChannel.idl
 */

package org.mozilla.interfaces;

/**
 * This interface may be defined as a notification callback on the FTP
 * channel.  It allows a consumer to receive a log of the FTP control
 * connection conversation.
 */
public interface nsIFTPEventSink extends nsISupports {

  String NS_IFTPEVENTSINK_IID =
    "{455d4234-0330-43d2-bbfb-99afbecbfeb0}";

  /**
     * XXX document this method!  (see bug 328915)
     */
  void onFTPControlLog(boolean server, String msg);

}