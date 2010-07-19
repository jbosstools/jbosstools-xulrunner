/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIPermissionManager.idl
 */

package org.mozilla.interfaces;

public interface nsIPermissionManager extends nsISupports {

  String NS_IPERMISSIONMANAGER_IID =
    "{00708302-684c-42d6-a5a3-995d51b1d17c}";

  /**
   * Predefined return values for the testPermission method and for
   * the permission param of the add method
   * NOTE: UNKNOWN_ACTION (0) is reserved to represent the
   * default permission when no entry is found for a host, and
   * should not be used by consumers to indicate otherwise.
   */
  long UNKNOWN_ACTION = 0L;

  long ALLOW_ACTION = 1L;

  long DENY_ACTION = 2L;

  /**
   * Add permission information for a given URI and permission type. This
   * operation will cause the type string to be registered if it does not
   * currently exist. If a permission already exists for a given type, it
   * will be modified.
   *
   * @param uri         the uri to add the permission for
   * @param type        a case-sensitive ASCII string, identifying the consumer.
   *                    Consumers should choose this string to be unique, with
   *                    respect to other consumers.
   * @param permission  an integer representing the desired action (e.g. allow
   *                    or deny). The interpretation of this number is up to the
   *                    consumer, and may represent different actions for different
   *                    types. Consumers may use one of the enumerated permission
   *                    actions defined above, for convenience.
   *                    NOTE: UNKNOWN_ACTION (0) is reserved to represent the
   *                    default permission when no entry is found for a host, and
   *                    should not be used by consumers to indicate otherwise.
   */
  void add(nsIURI uri, String type, long permission);

  /**
   * Remove permission information for a given host string and permission type.
   * The host string represents the exact entry in the permission list (such as
   * obtained from the enumerator), not a URI which that permission might apply
   * to.
   *
   * @param host   the host to remove the permission for
   * @param type   a case-sensitive ASCII string, identifying the consumer. 
   *               The type must have been previously registered using the
   *               add() method.
   */
  void remove(String host, String type);

  /**
   * Clear permission information for all websites.
   */
  void removeAll();

  /**
   * Test whether a website has permission to perform the given action.
   * @param uri     the uri to be tested
   * @param type    a case-sensitive ASCII string, identifying the consumer
   * @param return  see add(), param permission. returns UNKNOWN_ACTION when
   *                there is no stored permission for this uri and / or type.
   */
  long testPermission(nsIURI uri, String type);

  /**
   * Test whether a website has permission to perform the given action.
   * This requires an exact hostname match, subdomains are not a match.
   * @param uri     the uri to be tested
   * @param type    a case-sensitive ASCII string, identifying the consumer
   * @param return  see add(), param permission. returns UNKNOWN_ACTION when
   *                there is no stored permission for this uri and / or type.
   */
  long testExactPermission(nsIURI uri, String type);

  /**
   * Allows enumeration of all stored permissions
   * @return an nsISimpleEnumerator interface that allows access to
   *         nsIPermission objects
   */
  nsISimpleEnumerator getEnumerator();

}