/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/threads/nsIEnvironment.idl
 */

package org.mozilla.interfaces;

/**
 * Scriptable access to the current process environment.
 *
 */
public interface nsIEnvironment extends nsISupports {

  String NS_IENVIRONMENT_IID =
    "{101d5941-d820-4e85-a266-9a3469940807}";

  /**
     * Set the value of an environment variable.
     *
     * @param aName   the variable name to set.
     * @param aValue  the value to set.
     */
  void set(String aName, String aValue);

  /**
     * Get the value of an environment variable.
     *
     * @param aName   the variable name to retrieve.
     * @return        returns the value of the env variable. An empty string
     *                will be returned when the env variable does not exist or
     *                when the value itself is an empty string - please use
     *                |exists()| to probe whether the env variable exists
     *                or not.
     */
  String get(String aName);

  /**
     * Check the existence of an environment variable.
     * This method checks whether an environment variable is present in
     * the environment or not.
     *
     * - For Unix/Linux platforms we follow the Unix definition:
     * An environment variable exists when |getenv()| returns a non-NULL value.
     * An environment variable does not exist when |getenv()| returns NULL.
     * - For non-Unix/Linux platforms we have to fall back to a 
     * "portable" definition (which is incorrect for Unix/Linux!!!!)
     * which simply checks whether the string returned by |Get()| is empty
     * or not.
     *
     * @param aName   the variable name to probe.
     * @return        if the variable has been set, the value returned is
     *                PR_TRUE. If the variable was not defined in the
     *                environment PR_FALSE will be returned.
     */
  boolean exists(String aName);

}