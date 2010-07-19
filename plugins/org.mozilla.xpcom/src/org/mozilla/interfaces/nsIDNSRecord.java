/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/dns/public/nsIDNSRecord.idl
 */

package org.mozilla.interfaces;

/**
 * nsIDNSRecord
 *
 * this interface represents the result of a DNS lookup.  since a DNS
 * query may return more than one resolved IP address, the record acts
 * like an enumerator, allowing the caller to easily step through the
 * list of IP addresses.
 */
public interface nsIDNSRecord extends nsISupports {

  String NS_IDNSRECORD_IID =
    "{31c9c52e-1100-457d-abac-d2729e43f506}";

  /**
     * @return the canonical hostname for this record.  this value is empty if
     * the record was not fetched with the RESOLVE_CANONICAL_NAME flag.
     *
     * e.g., www.mozilla.org --> rheet.mozilla.org
     */
  String getCanonicalName();

  /**
     * this function returns the value of the next IP address as a
     * string and increments the internal address iterator.
     *
     * @throws NS_ERROR_NOT_AVAILABLE if there is not another IP address in
     * the record.
     */
  String getNextAddrAsString();

  /**
     * this function returns true if there is another address in the record.
     */
  boolean hasMore();

  /**
     * this function resets the internal address iterator to the first
     * address in the record.
     */
  void rewind();

}