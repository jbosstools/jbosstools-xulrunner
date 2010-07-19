/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/components/commandhandler/public/nsIControllerCommand.idl
 */

package org.mozilla.interfaces;

/**
 * nsIControllerCommand
 *
 * A generic command interface. You can register an nsIControllerCommand
 * with the nsIControllerCommandTable.
 */
public interface nsIControllerCommand extends nsISupports {

  String NS_ICONTROLLERCOMMAND_IID =
    "{0eae9a46-1dd2-11b2-aca0-9176f05fe9db}";

  /**
   * Returns true if the command is currently enabled. An nsIControllerCommand
   * can implement more than one commands; say, a group of related commands
   * (e.g. delete left/delete right). Because of this, the command name is
   * passed to each method.
   *
   * @param aCommandName  the name of the command for which we want the enabled
   *                      state.
   * @param aCommandContext    a cookie held by the nsIControllerCommandTable,
   *                  allowing the command to get some context information.
   *                  The contents of this cookie are implementation-defined.
   */
  boolean isCommandEnabled(String aCommandName, nsISupports aCommandContext);

  void getCommandStateParams(String aCommandName, nsICommandParams aParams, nsISupports aCommandContext);

  /**
   * Execute the name command.
   *
   * @param aCommandName  the name of the command to execute.
   * 
   * @param aCommandContext    a cookie held by the nsIControllerCommandTable,
   *                  allowing the command to get some context information.
   *                  The contents of this cookie are implementation-defined.
   */
  void doCommand(String aCommandName, nsISupports aCommandContext);

  void doCommandParams(String aCommandName, nsICommandParams aParams, nsISupports aCommandContext);

}