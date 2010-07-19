/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/cookie/public/nsICookieService.idl
 */

package org.mozilla.interfaces;

/**
 * nsICookieService
 *
 * Provides methods for setting and getting cookies in the context of a
 * page load.  See nsICookieManager for methods to manipulate the cookie
 * database directly.  This separation of interface is mainly historical.
 *
 * This service broadcasts the following notifications when the cookie
 * list is changed, or a cookie is rejected:
 *
 * topic  : "cookie-changed"
 *          broadcast whenever the cookie list changes in some way. there
 *          are four possible data strings for this notification; one
 *          notification will be broadcast for each change, and will involve
 *          a single cookie.
 * subject: an nsICookie2 interface pointer representing the cookie object
 *          that changed.
 * data   : "deleted"
 *          a cookie was deleted. the subject is the deleted cookie.
 *          "added"
 *          a cookie was added. the subject is the added cookie.
 *          "changed"
 *          a cookie was changed. the subject is the new cookie.
 *          "cleared"
 *          the entire cookie list was cleared. the subject is null.
 *          "reload"
 *          the entire cookie list should be reloaded.  the subject is null.
 *
 * topic  : "cookie-rejected"
 *          broadcast whenever a cookie was rejected from being set as a
 *          result of user prefs.
 * subject: an nsIURI interface pointer representing the URI that attempted
 *          to set the cookie.
 * data   : none.
 */
public interface nsICookieService extends nsISupports {

  String NS_ICOOKIESERVICE_IID =
    "{2aaa897a-293c-4d2b-a657-8c9b7136996d}";

  String getCookieString(nsIURI aURI, nsIChannel aChannel);

  String getCookieStringFromHttp(nsIURI aURI, nsIURI aFirstURI, nsIChannel aChannel);

  void setCookieString(nsIURI aURI, nsIPrompt aPrompt, String aCookie, nsIChannel aChannel);

  void setCookieStringFromHttp(nsIURI aURI, nsIURI aFirstURI, nsIPrompt aPrompt, String aCookie, String aServerTime, nsIChannel aChannel);

}