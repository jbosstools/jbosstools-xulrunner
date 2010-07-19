/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/satchel/public/nsIFormFillController.idl
 */

package org.mozilla.interfaces;

public interface nsIFormFillController extends nsISupports {

  String NS_IFORMFILLCONTROLLER_IID =
    "{07f0a0dc-f6e9-4cdd-a55f-56d770523a4c}";

  void attachToBrowser(nsIDocShell docShell, nsIAutoCompletePopup popup);

  void detachFromBrowser(nsIDocShell docShell);

  void markAsLoginManagerField(nsIDOMHTMLInputElement aInput);

}