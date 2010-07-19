/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/components/commandhandler/public/nsIControllerContext.idl
 */

package org.mozilla.interfaces;

public interface nsIControllerContext extends nsISupports {

  String NS_ICONTROLLERCONTEXT_IID =
    "{47b82b60-a36f-4167-8072-6f421151ed50}";

  /**
   *  Init the controller, optionally passing a controller
   *  command table.
   *
   * @param aCommandTable  a command table, used internally
   *                       by this controller. May be null, in
   *                       which case the controller will create
   *                       a new, empty table.
   */
  void init(nsIControllerCommandTable aCommandTable);

  /** 
   *  Set a context on this controller, which is passed
   *  to commands to give them some context when they execute.
   *
   * @param aCommandContext  the context passed to commands.
   *                        Note that this is *not* addreffed by the
   *                        controller, and so needs to outlive it,
   *                        or be nulled out.
   */
  void setCommandContext(nsISupports aCommandContext);

}