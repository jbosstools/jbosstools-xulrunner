/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIAssociatedContentSecurity.idl
 */

package org.mozilla.interfaces;

public interface nsIAssociatedContentSecurity extends nsISupports {

  String NS_IASSOCIATEDCONTENTSECURITY_IID =
    "{8db92dde-799f-4d33-80f7-459cac800dc9}";

  int getCountSubRequestsHighSecurity();

  void setCountSubRequestsHighSecurity(int aCountSubRequestsHighSecurity);

  int getCountSubRequestsLowSecurity();

  void setCountSubRequestsLowSecurity(int aCountSubRequestsLowSecurity);

  int getCountSubRequestsBrokenSecurity();

  void setCountSubRequestsBrokenSecurity(int aCountSubRequestsBrokenSecurity);

  int getCountSubRequestsNoSecurity();

  void setCountSubRequestsNoSecurity(int aCountSubRequestsNoSecurity);

}