/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsISecureBrowserUI.idl
 */

package org.mozilla.interfaces;

public interface nsISecureBrowserUI extends nsISupports {

  String NS_ISECUREBROWSERUI_IID =
    "{081e31e0-a144-11d3-8c7c-00609792278c}";

  void init(nsIDOMWindow window);

  long getState();

  String getTooltipText();

}