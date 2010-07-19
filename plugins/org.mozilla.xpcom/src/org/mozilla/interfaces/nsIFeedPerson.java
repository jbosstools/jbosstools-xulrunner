/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/feeds/public/nsIFeedPerson.idl
 */

package org.mozilla.interfaces;

/**
 *  An nsIFeedPerson represents an author or contributor of a feed.
 */
public interface nsIFeedPerson extends nsIFeedElementBase {

  String NS_IFEEDPERSON_IID =
    "{29cbd45f-f2d3-4b28-b557-3ab7a61ecde4}";

  /**
   * The name of the person.
   */
  String getName();

  /**
   * The name of the person.
   */
  void setName(String aName);

  /**
   * An email address associated with the person.
   */
  String getEmail();

  /**
   * An email address associated with the person.
   */
  void setEmail(String aEmail);

  /**
   * A URI associated with the person (e.g. a homepage).
   */
  nsIURI getUri();

  /**
   * A URI associated with the person (e.g. a homepage).
   */
  void setUri(nsIURI aUri);

}