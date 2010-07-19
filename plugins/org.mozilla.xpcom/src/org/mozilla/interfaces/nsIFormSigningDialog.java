/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIFormSigningDialog.idl
 */

package org.mozilla.interfaces;

/**
 * nsIFormSigningDialog
 * Provides UI for form signing.
 */
public interface nsIFormSigningDialog extends nsISupports {

  String NS_IFORMSIGNINGDIALOG_IID =
    "{4fe04d6d-4b66-4023-a0bc-b43ce68b3e15}";

  /**
   *  confirmSignText
   *    UI shown when a web site calls crypto.signText,
   *    asking the user to confirm the confirm the signing request.
   *
   *  returns true if the user confirmed, false on cancel
   */
  boolean confirmSignText(nsIInterfaceRequestor ctxt, String host, String signText, String[] certNickList, String[] certDetailsList, long count, int[] selectedIndex, String[] password);

}