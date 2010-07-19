/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/widget/public/nsIClipboardOwner.idl
 */

package org.mozilla.interfaces;

public interface nsIClipboardOwner extends nsISupports {

  String NS_ICLIPBOARDOWNER_IID =
    "{5a31c7a1-e122-11d2-9a57-000064657374}";

  /**
    * Notifies the owner of the clipboard transferable that the
    * transferable is being removed from the clipboard
    *
    * @param  aTransferable The transferable
    * @result NS_Ok if no errors
    */
  void losingOwnership(nsITransferable aTransferable);

}