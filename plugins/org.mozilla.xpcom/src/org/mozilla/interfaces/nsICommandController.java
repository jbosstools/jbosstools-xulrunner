/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/xul/document/public/nsIController.idl
 */

package org.mozilla.interfaces;

public interface nsICommandController extends nsISupports {

  String NS_ICOMMANDCONTROLLER_IID =
    "{ebe55080-c8a9-11d5-a73c-dd620d6e04bc}";

  void getCommandStateWithParams(String command, nsICommandParams aCommandParams);

  void doCommandWithParams(String command, nsICommandParams aCommandParams);

}