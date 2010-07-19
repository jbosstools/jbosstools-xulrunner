/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/feeds/public/nsIFeedGenerator.idl
 */

package org.mozilla.interfaces;

/**
 *  An nsIFeedGenerator represents the software used to create a feed.
 */
public interface nsIFeedGenerator extends nsIFeedElementBase {

  String NS_IFEEDGENERATOR_IID =
    "{0fecd56b-bd92-481b-a486-b8d489cdd385}";

  /**
   * The name of the software.
   */
  String getAgent();

  /**
   * The name of the software.
   */
  void setAgent(String aAgent);

  /**
   * The version of the software.
   */
  String getVersion();

  /**
   * The version of the software.
   */
  void setVersion(String aVersion);

  /**
   * A URI associated with the software.
   */
  nsIURI getUri();

  /**
   * A URI associated with the software.
   */
  void setUri(nsIURI aUri);

}