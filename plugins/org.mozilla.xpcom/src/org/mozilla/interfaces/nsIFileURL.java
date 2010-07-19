/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIFileURL.idl
 */

package org.mozilla.interfaces;

/**
 * nsIFileURL provides access to the underlying nsIFile object corresponding to
 * an URL.  The URL scheme need not be file:, since other local protocols may
 * map URLs to files (e.g., resource:).
 *
 * @status FROZEN
 */
public interface nsIFileURL extends nsIURL {

  String NS_IFILEURL_IID =
    "{d26b2e2e-1dd1-11b2-88f3-8545a7ba7949}";

  /**
     * Get/Set nsIFile corresponding to this URL.
     *
     *  - Getter returns a reference to an immutable object.  Callers must clone
     *    before attempting to modify the returned nsIFile object.  NOTE: this
     *    constraint might not be enforced at runtime, so beware!!
     *
     *  - Setter clones the nsIFile object (allowing the caller to safely modify
     *    the nsIFile object after setting it on this interface).
     */
  nsIFile getFile();

  /**
     * Get/Set nsIFile corresponding to this URL.
     *
     *  - Getter returns a reference to an immutable object.  Callers must clone
     *    before attempting to modify the returned nsIFile object.  NOTE: this
     *    constraint might not be enforced at runtime, so beware!!
     *
     *  - Setter clones the nsIFile object (allowing the caller to safely modify
     *    the nsIFile object after setting it on this interface).
     */
  void setFile(nsIFile aFile);

}