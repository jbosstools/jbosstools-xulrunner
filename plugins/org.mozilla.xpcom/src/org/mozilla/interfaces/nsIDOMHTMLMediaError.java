/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLMediaError.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMHTMLMediaError extends nsISupports {

  String NS_IDOMHTMLMEDIAERROR_IID =
    "{7bd8c29f-8a76-453f-9373-79f820f2dc01}";

  int MEDIA_ERR_ABORTED = 1;

  int MEDIA_ERR_NETWORK = 2;

  int MEDIA_ERR_DECODE = 3;

  int MEDIA_ERR_SRC_NOT_SUPPORTED = 4;

  int getCode();

}