/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/xul/nsIDOMXULCommandDispatcher.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMXULCommandDispatcher extends nsISupports {

  String NS_IDOMXULCOMMANDDISPATCHER_IID =
    "{f3c50361-14fe-11d3-bf87-00105a1b0627}";

  nsIDOMElement getFocusedElement();

  void setFocusedElement(nsIDOMElement aFocusedElement);

  nsIDOMWindow getFocusedWindow();

  void setFocusedWindow(nsIDOMWindow aFocusedWindow);

  void addCommandUpdater(nsIDOMElement updater, String events, String targets);

  void removeCommandUpdater(nsIDOMElement updater);

  void updateCommands(String eventName);

  nsIController getControllerForCommand(String command);

  nsIControllers getControllers();

  void advanceFocus();

  void rewindFocus();

  void advanceFocusIntoSubtree(nsIDOMElement elt);

  boolean getSuppressFocusScroll();

  void setSuppressFocusScroll(boolean aSuppressFocusScroll);

}