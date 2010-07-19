/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/html/content/public/nsIFormSubmitObserver.idl
 */

package org.mozilla.interfaces;

public interface nsIFormSubmitObserver extends nsISupports {

  String NS_IFORMSUBMITOBSERVER_IID =
    "{0787d64a-44bf-4273-8438-61ff13ebec0c}";

  void _notify(nsIDOMHTMLFormElement formNode, nsIDOMWindowInternal window, nsIURI actionURL, boolean[] cancelSubmit);

}