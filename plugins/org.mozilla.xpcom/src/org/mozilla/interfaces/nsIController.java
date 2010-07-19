/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/xul/document/public/nsIController.idl
 */

package org.mozilla.interfaces;

public interface nsIController extends nsISupports {

  String NS_ICONTROLLER_IID =
    "{d5b61b82-1da4-11d3-bf87-00105a1b0627}";

  boolean isCommandEnabled(String command);

  boolean supportsCommand(String command);

  void doCommand(String command);

  void onEvent(String eventName);

}