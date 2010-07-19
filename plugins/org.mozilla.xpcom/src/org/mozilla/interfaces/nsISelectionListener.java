/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsISelectionListener.idl
 */

package org.mozilla.interfaces;

public interface nsISelectionListener extends nsISupports {

  String NS_ISELECTIONLISTENER_IID =
    "{a6cf90e2-15b3-11d2-932e-00805f8add32}";

  short NO_REASON = 0;

  short DRAG_REASON = 1;

  short MOUSEDOWN_REASON = 2;

  short MOUSEUP_REASON = 4;

  short KEYPRESS_REASON = 8;

  short SELECTALL_REASON = 16;

  void notifySelectionChanged(nsIDOMDocument doc, nsISelection sel, short reason);

}