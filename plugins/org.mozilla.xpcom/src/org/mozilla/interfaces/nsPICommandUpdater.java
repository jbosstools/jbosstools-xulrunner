/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/components/commandhandler/public/nsPICommandUpdater.idl
 */

package org.mozilla.interfaces;

public interface nsPICommandUpdater extends nsISupports {

  String NS_PICOMMANDUPDATER_IID =
    "{b135f602-0bfe-11d5-a73c-f0e420e8293c}";

  void init(nsIDOMWindow aWindow);

  void commandStatusChanged(String aCommandName);

}