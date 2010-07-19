/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/base/nsIUUIDGenerator.idl
 */

package org.mozilla.interfaces;

/**
 * nsIUUIDGenerator is implemented by a service that can generate
 * universally unique identifiers, ideally using any platform-native
 * method for generating UUIDs.
 */
public interface nsIUUIDGenerator extends nsISupports {

  String NS_IUUIDGENERATOR_IID =
    "{138ad1b2-c694-41cc-b201-333ce936d8b8}";

  /**
   * Obtains a new UUID using appropriate platform-specific methods to
   * obtain a nsID that can be considered to be globally unique.
   *
   * @returns an nsID filled in with a new UUID.
   *
   * @throws NS_ERROR_FAILURE if a UUID cannot be generated (e.g. if
   * an underlying source of randomness is not available)
   */
  String generateUUID();

}