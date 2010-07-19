/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/base/nsIDOMModalContentWindow.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMModalContentWindow extends nsISupports {

  String NS_IDOMMODALCONTENTWINDOW_IID =
    "{51aebd45-b979-4ec6-9d11-3a3fd3d5d59e}";

  /**
   * Readonly attribute containing an array of arguments that was
   * passed to the code that opened this modal content window.
   */
  nsIArray getDialogArguments();

  /**
   * The return value that will be returned to the function that
   * opened the modal content window.
   */
  nsIVariant getReturnValue();

  /**
   * The return value that will be returned to the function that
   * opened the modal content window.
   */
  void setReturnValue(nsIVariant aReturnValue);

}