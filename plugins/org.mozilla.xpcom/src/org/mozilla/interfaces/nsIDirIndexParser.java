/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/streamconv/public/nsIDirIndexListener.idl
 */

package org.mozilla.interfaces;

/**
 * A parser for application/http-index-format
 */
public interface nsIDirIndexParser extends nsIStreamListener {

  String NS_IDIRINDEXPARSER_IID =
    "{38e3066c-1dd2-11b2-9b59-8be515c1ee3f}";

  /**
     * The interface to use as a callback for new entries
     */
  nsIDirIndexListener getListener();

  /**
     * The interface to use as a callback for new entries
     */
  void setListener(nsIDirIndexListener aListener);

  /**
     * The comment given, if any
     * This result is only valid _after_ OnStopRequest has occurred,
     * because it can occur anywhere in the datastream
     */
  String getComment();

  /**
     * The encoding to use
     */
  String getEncoding();

  /**
     * The encoding to use
     */
  void setEncoding(String aEncoding);

}