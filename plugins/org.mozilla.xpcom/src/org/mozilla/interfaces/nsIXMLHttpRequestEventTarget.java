/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsIXMLHttpRequest.idl
 */

package org.mozilla.interfaces;

public interface nsIXMLHttpRequestEventTarget extends nsIDOMEventTarget {

  String NS_IXMLHTTPREQUESTEVENTTARGET_IID =
    "{6ce0a193-b033-4c3d-b748-f851b09261f5}";

  nsIDOMEventListener getOnabort();

  void setOnabort(nsIDOMEventListener aOnabort);

  nsIDOMEventListener getOnerror();

  void setOnerror(nsIDOMEventListener aOnerror);

  nsIDOMEventListener getOnload();

  void setOnload(nsIDOMEventListener aOnload);

  nsIDOMEventListener getOnloadstart();

  void setOnloadstart(nsIDOMEventListener aOnloadstart);

  nsIDOMEventListener getOnprogress();

  void setOnprogress(nsIDOMEventListener aOnprogress);

}