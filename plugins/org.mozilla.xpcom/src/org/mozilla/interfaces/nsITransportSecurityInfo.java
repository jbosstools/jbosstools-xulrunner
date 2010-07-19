/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/socket/base/nsITransportSecurityInfo.idl
 */

package org.mozilla.interfaces;

public interface nsITransportSecurityInfo extends nsISupports {

  String NS_ITRANSPORTSECURITYINFO_IID =
    "{0d0a6b62-d4a9-402e-a197-6bc6e358fec9}";

  long getSecurityState();

  String getShortSecurityDescription();

  String getErrorMessage();

}