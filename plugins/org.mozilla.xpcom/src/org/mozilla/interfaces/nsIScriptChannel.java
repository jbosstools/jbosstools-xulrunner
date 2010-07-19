/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/base/nsIScriptChannel.idl
 */

package org.mozilla.interfaces;

/**
 * An interface representing a channel which will have to execute some sort of
 * program provided via its URI to compute the data it should return.
 *
 * If a channel implements this interface, the execution of the program in
 * question will be restricted in the following ways:
 *
 * - If the channel does not have an owner principal, the program will not be
 *   executed at all, no matter what.  This is necessary because in this
 *   circumstance we have no way to tell whether script execution is allowed at
 *   all for the originating security context of this channel. 
 * - If the channel has an owner principal, how it is executed is controlled by
 *   this interface.  However if the owner principal does not subsume the
 *   principal of the environment in which the program is to be executed the
 *   execution will be forced to happen in a sandbox.
 */
public interface nsIScriptChannel extends nsISupports {

  String NS_ISCRIPTCHANNEL_IID =
    "{33234b99-9588-4c7d-9da6-86b8b7cba565}";

  /**
   * Possible ways of executing the program.
   */
/**
   * Don't execute at all.
   */
  long NO_EXECUTION = 0L;

  /**
   * Execute in a sandbox, no matter how the various principals involved are
   * related to each other.
   */
  long EXECUTE_IN_SANDBOX = 1L;

  /**
   * Execute against the target environment if the principals allow it.
   */
  long EXECUTE_NORMAL = 2L;

  /**
   * Whether and how the program represented by this channel is to be executed.
   * The default value if this property has never been set on this channel MUST
   * be either EXECUTE_IN_SANDBOX or NO_EXECUTION.
   *
   * @throws NS_ERROR_INVALID_ARG when set to an unrecognized value.
   */
  long getExecutionPolicy();

  /**
   * Whether and how the program represented by this channel is to be executed.
   * The default value if this property has never been set on this channel MUST
   * be either EXECUTE_IN_SANDBOX or NO_EXECUTION.
   *
   * @throws NS_ERROR_INVALID_ARG when set to an unrecognized value.
   */
  void setExecutionPolicy(long aExecutionPolicy);

  /**
   * Control whether the program should be executed synchronosly when
   * the channel's AsyncOpen method is called or whether it should be
   * executed asynchronously.  In both cases, any data that the
   * channel returns will be returned asynchronously; the only thing
   * this property affects is when the program executes.
   *
   * The default value of this property is TRUE.
   *
   * Setting this property after asyncOpen has been called on the
   * channel has no effect.
   */
  boolean getExecuteAsync();

  /**
   * Control whether the program should be executed synchronosly when
   * the channel's AsyncOpen method is called or whether it should be
   * executed asynchronously.  In both cases, any data that the
   * channel returns will be returned asynchronously; the only thing
   * this property affects is when the program executes.
   *
   * The default value of this property is TRUE.
   *
   * Setting this property after asyncOpen has been called on the
   * channel has no effect.
   */
  void setExecuteAsync(boolean aExecuteAsync);

}