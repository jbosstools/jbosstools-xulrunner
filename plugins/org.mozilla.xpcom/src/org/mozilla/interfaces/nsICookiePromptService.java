/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/extensions/cookie/nsICookiePromptService.idl
 */

package org.mozilla.interfaces;

public interface nsICookiePromptService extends nsISupports {

  String NS_ICOOKIEPROMPTSERVICE_IID =
    "{72f8bb14-2810-4f38-8d0d-290c5401f54e}";

  long DENY_COOKIE = 0L;

  long ACCEPT_COOKIE = 1L;

  long ACCEPT_SESSION_COOKIE = 2L;

  int cookieDialog(nsIDOMWindow parent, nsICookie cookie, String hostname, int cookiesFromHost, boolean changingCookie, boolean[] rememberDecision);

}