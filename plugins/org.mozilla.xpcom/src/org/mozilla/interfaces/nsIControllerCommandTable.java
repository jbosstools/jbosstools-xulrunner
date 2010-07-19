/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/components/commandhandler/public/nsIControllerCommandTable.idl
 */

package org.mozilla.interfaces;

/**
 * nsIControllerCommandTable
 * 
 * An interface via which a controller can maintain a series of commands,
 * and efficiently dispatch commands to their respective handlers.
 *
 * Controllers that use an nsIControllerCommandTable should support
 * nsIInterfaceRequestor, and be able to return an interface to their
 * controller command table via getInterface().
 * 
 */
public interface nsIControllerCommandTable extends nsISupports {

  String NS_ICONTROLLERCOMMANDTABLE_IID =
    "{d1a47834-6ad4-11d7-bfad-000393636592}";

  /**
   * Make this command table immutable, so that commands cannot
   * be registered or unregistered. Some command tables are made
   * mutable after command registration so that they can be 
   * used as singletons.
   */
  void makeImmutable();

  /**
   * Register and unregister commands with the command table.
   *
   * @param aCommandName  the name of the command under which to register or
   *                      unregister the given command handler.
   *
   * @param aCommand      the handler for this command.
   */
  void registerCommand(String aCommandName, nsIControllerCommand aCommand);

  void unregisterCommand(String aCommandName, nsIControllerCommand aCommand);

  /**
   * Find the command handler which has been registered to handle the named command.
   *
   * @param aCommandName  the name of the command to find the handler for.
   */
  nsIControllerCommand findCommandHandler(String aCommandName);

  /**
   * Get whether the named command is enabled.
   *
   * @param aCommandName    the name of the command to test
   * @param aCommandRefCon  the command context data
   */
  boolean isCommandEnabled(String aCommandName, nsISupports aCommandRefCon);

  /**
   * Tell the command to update its state (if it is a state updating command)
   *
   * @param aCommandName    the name of the command to update
   * @param aCommandRefCon  the command context data
   */
  void updateCommandState(String aCommandName, nsISupports aCommandRefCon);

  /**
   * Get whether the named command is supported.
   *
   * @param aCommandName    the name of the command to test
   * @param aCommandRefCon  the command context data
   */
  boolean supportsCommand(String aCommandName, nsISupports aCommandRefCon);

  /**
   * Execute the named command.
   *
   * @param aCommandName    the name of the command to execute
   * @param aCommandRefCon  the command context data
   */
  void doCommand(String aCommandName, nsISupports aCommandRefCon);

  void doCommandParams(String aCommandName, nsICommandParams aParam, nsISupports aCommandRefCon);

  void getCommandState(String aCommandName, nsICommandParams aParam, nsISupports aCommandRefCon);

}