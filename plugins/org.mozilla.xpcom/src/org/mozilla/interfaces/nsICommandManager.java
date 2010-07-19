/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/components/commandhandler/public/nsICommandManager.idl
 */

package org.mozilla.interfaces;

public interface nsICommandManager extends nsISupports {

  String NS_ICOMMANDMANAGER_IID =
    "{080d2001-f91e-11d4-a73c-f9242928207c}";

  void addCommandObserver(nsIObserver aCommandObserver, String aCommandToObserve);

  void removeCommandObserver(nsIObserver aCommandObserver, String aCommandObserved);

  boolean isCommandSupported(String aCommandName, nsIDOMWindow aTargetWindow);

  boolean isCommandEnabled(String aCommandName, nsIDOMWindow aTargetWindow);

  void getCommandState(String aCommandName, nsIDOMWindow aTargetWindow, nsICommandParams aCommandParams);

  void doCommand(String aCommandName, nsICommandParams aCommandParams, nsIDOMWindow aTargetWindow);

}