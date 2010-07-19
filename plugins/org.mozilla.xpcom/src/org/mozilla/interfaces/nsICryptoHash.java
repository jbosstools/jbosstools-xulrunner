/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsICryptoHash.idl
 */

package org.mozilla.interfaces;

/**
 * nsICryptoHash
 * This interface provides crytographic hashing algorithms.
 */
public interface nsICryptoHash extends nsISupports {

  String NS_ICRYPTOHASH_IID =
    "{1e5b7c43-4688-45ce-92e1-77ed931e3bbe}";

  /**
     * Hashing Algorithms.  These values are to be used by the
     * |init| method to indicate which hashing function to
     * use.  These values map directly onto the values defined
     * in mozilla/security/nss/lib/cryptohi/hasht.h.
     */
  short MD2 = 1;

  short MD5 = 2;

  short SHA1 = 3;

  short SHA256 = 4;

  short SHA384 = 5;

  short SHA512 = 6;

  /**
     * Initialize the hashing object. This method may be
     * called multiple times with different algorithm types.
     *
     * @param aAlgorithm the algorithm type to be used.
     *        This value must be one of the above valid
     *        algorithm types.
     *
     * @throws NS_ERROR_INVALID_ARG if an unsupported algorithm
     *         type is passed.
     *
     * NOTE: This method or initWithString must be called
     *       before any other method on this interface is called.
     */
  void init(long aAlgorithm);

  /**
     * Initialize the hashing object. This method may be
     * called multiple times with different algorithm types.
     *
     * @param aAlgorithm the algorithm type to be used.
     *
     * @throws NS_ERROR_INVALID_ARG if an unsupported algorithm
     *         type is passed.
     *
     * NOTE: This method or init must be called before any
     *       other method on this interface is called.
     */
  void initWithString(String aAlgorithm);

  /**
     * @param aData a buffer to calculate the hash over
     *
     * @param aLen the length of the buffer |aData|
     *
     * @throws NS_ERROR_NOT_INITIALIZED if |init| has not been 
     *         called.
     */
  void update(byte[] aData, long aLen);

  /**
     * Calculates and updates a new hash based on a given data stream.
     *
     * @param aStream an input stream to read from.
     *
     * @param aLen how much to read from the given |aStream|.  Passing
     *        PR_UINT32_MAX indicates that all data available will be used 
     *        to update the hash. 
     *
     * @throws NS_ERROR_NOT_INITIALIZED if |init| has not been 
     *         called.
     *
     * @throws NS_ERROR_NOT_AVAILABLE if the requested amount of 
     *         data to be calculated into the hash is not available.
     *
     */
  void updateFromStream(nsIInputStream aStream, long aLen);

  /**
     * Completes this hash object and produces the actual hash data.
     *
     * @param aASCII if true then the returned value is a base-64 
     *        encoded string.  if false, then the returned value is
     *        binary data.  
     *
     * @return a hash of the data that was read by this object.  This can
     *         be either binary data or base 64 encoded.
     *
     * @throws NS_ERROR_NOT_INITIALIZED if |init| has not been 
     *         called.
     *
     * NOTE: This method may be called any time after |init|
     *       is called.  This call resets the object to its
     *       pre-init state.
     */
  String finish(boolean aASCII);

}