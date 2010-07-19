/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/components/windowwatcher/public/nsINonBlockingAlertService.idl
 */

package org.mozilla.interfaces;

/**
 * This is the interface to the embeddable non-blocking alert
 * service.  A non-blocking alert is a less serious informative alert
 * that does not need to block the program's execution to get the
 * user's response.
 *
 * The way to present the alert is left to the implementations.  It
 * may be a dialog separate from the parent window, or a window-modal
 * sheet (as the ones in Mac OS X) attached to the parent.
 */
public interface nsINonBlockingAlertService extends nsISupports {

  String NS_INONBLOCKINGALERTSERVICE_IID =
    "{e800ef97-ae37-46b7-a46c-31fbe79657ea}";

  /**
   * This shows a non-blocking alert with the specified title and
   * message text. This function requires a valid parent window with
   * which the alert is associated.
   *
   * @param aParent
   *        The parent window. This must not be null.
   * @param aDialogTitle
   *        Text to appear in the title of the alert.
   * @param aText
   *        Text to appear in the body of the alert.
   */
  void showNonBlockingAlert(nsIDOMWindow aParent, String aDialogTitle, String aText);

}