/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/ssl/public/nsIStreamCipher.idl
 */

package org.mozilla.interfaces;

/**
 * Stream cipher interface.  We're basically copying the interface from
 * nsICryptoHash interface.
 */
public interface nsIStreamCipher extends nsISupports {

  String NS_ISTREAMCIPHER_IID =
    "{1d507cd6-1630-4710-af1b-4012dbcc514c}";

  /**
     * Initialize a stream cipher.
     * @param aKey nsIKeyObject
     */
  void init(nsIKeyObject aKey);

  /**
     * Initialize a stream cipher with an initialization vector.
     * @param aKey nsIKeyObject
     * @param aIV the initialization vector
     * @param aIVLen the length of the initialization vector
     */
  void initWithIV(nsIKeyObject aKey, byte[] aIV, long aIVLen);

  /**
     * Update from an array of bytes.
     */
  void update(byte[] aData, long aLen);

  /**
     * Update from a stream.
     */
  void updateFromStream(nsIInputStream aStream, int aLen);

  /**
     * A more script friendly method (not in nsICryptoHash interface).
     */
  void updateFromString(String aInput);

  /**
     * @param aASCII if true then the returned value is a base-64
     *        encoded string.  if false, then the returned value is
     *        binary data.
     */
  String finish(boolean aASCII);

  /**
     * Discard aLen bytes of the keystream.
     * These days 1536 is considered a decent amount to drop to get
     * the key state warmed-up enough for secure usage.
     */
  void discard(int aLen);

}