/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/libjar/nsIJARURI.idl
 */

package org.mozilla.interfaces;

/**
 * JAR URLs have the following syntax
 *
 * jar:<jar-file-uri>!/<jar-entry>
 *
 * EXAMPLE: jar:http://www.big.com/blue.jar!/ocean.html
 *
 * The nsIURL methods operate on the <jar-entry> part of the spec.
 */
public interface nsIJARURI extends nsIURL {

  String NS_IJARURI_IID =
    "{b0922a89-f87b-4cb5-8612-305a285fcca7}";

  /**
     * Returns the root URI (the one for the actual JAR file) for this JAR
     * (e.g., http://www.big.com/blue.jar).
     */
  nsIURI getJARFile();

  /**
     * Returns the entry specified for this JAR URI (e.g., "ocean.html").  This
     * value may contain %-escaped byte sequences.
     */
  String getJAREntry();

  /**
     * Returns the entry specified for this JAR URI (e.g., "ocean.html").  This
     * value may contain %-escaped byte sequences.
     */
  void setJAREntry(String aJAREntry);

  /**
     * Create a clone of the JAR URI with a new root URI (the URI for the
     * actual JAR file).
     */
  nsIJARURI cloneWithJARFile(nsIURI jarFile);

}