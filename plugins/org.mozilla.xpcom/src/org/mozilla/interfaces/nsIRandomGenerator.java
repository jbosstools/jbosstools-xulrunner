/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIRandomGenerator.idl
 */

package org.mozilla.interfaces;

public interface nsIRandomGenerator extends nsISupports {

  String NS_IRANDOMGENERATOR_IID =
    "{2362d97a-747a-4576-8863-697667309209}";

  /**
   * Generates the specified amount of random bytes.
   *
   * @param aLength
   *        The length of the data to generate.
   * @param aBuffer
   *        A buffer that contains random bytes of size aLength.
   */
  byte[] generateRandomBytes(long aLength);

}