/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/xul/document/public/nsIControllers.idl
 */

package org.mozilla.interfaces;

public interface nsIControllers extends nsISupports {

  String NS_ICONTROLLERS_IID =
    "{f36e3ec1-9197-4ad8-8d4c-d3b1927fd6df}";

  nsIController getControllerForCommand(String command);

  void insertControllerAt(long index, nsIController controller);

  nsIController removeControllerAt(long index);

  nsIController getControllerAt(long index);

  void appendController(nsIController controller);

  void removeController(nsIController controller);

  long getControllerId(nsIController controller);

  nsIController getControllerById(long controllerID);

  long getControllerCount();

}