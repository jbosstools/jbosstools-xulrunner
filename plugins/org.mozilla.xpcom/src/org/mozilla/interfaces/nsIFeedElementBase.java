/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/feeds/public/nsIFeedElementBase.idl
 */

package org.mozilla.interfaces;

/**
 *  An nsIFeedGenerator represents the software used to create a feed.
 */
public interface nsIFeedElementBase extends nsISupports {

  String NS_IFEEDELEMENTBASE_IID =
    "{5215291e-fa0a-40c2-8ce7-e86cd1a1d3fa}";

  /**
   * The attributes found on the element. Most interfaces provide convenience
   * accessors for their standard fields, so this useful only when looking for
   * an extension.
   */
  nsISAXAttributes getAttributes();

  /**
   * The attributes found on the element. Most interfaces provide convenience
   * accessors for their standard fields, so this useful only when looking for
   * an extension.
   */
  void setAttributes(nsISAXAttributes aAttributes);

  /**
   * The baseURI for the Entry or Feed.
   */
  nsIURI getBaseURI();

  /**
   * The baseURI for the Entry or Feed.
   */
  void setBaseURI(nsIURI aBaseURI);

}