/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/html/document/public/nsIWyciwygChannel.idl
 */

package org.mozilla.interfaces;

/**
 * A channel to  manage all cache-related interactions for layout
 * when it is dealing with dynamic pages created through 
 * document.write(). This interface provides methods that will
 * help layout save dynamic pages in cache for future retrievals.
 */
public interface nsIWyciwygChannel extends nsIChannel {

  String NS_IWYCIWYGCHANNEL_IID =
    "{89b0674a-9e2f-4124-9b59-481444be841d}";

  /**
   * Append data to the cache entry; opens the cache entry if necessary.
   */
  void writeToCacheEntry(String aData);

  /**
   * Close the cache entry; subsequent writes have undefined behavior.
   */
  void closeCacheEntry(long reason);

  /**
   * Set the wyciwyg channels security info
   */
  void setSecurityInfo(nsISupports aSecurityInfo);

  /**
   * Store and read a charset and charset source on the wyciwyg channel.  These
   * are opaque values to the channel; consumers who set them should know what
   * they mean.
   */
  void setCharsetAndSource(int aSource, String aCharset);

  /**
   * The return value is the charset.  Throws if either the charset or the
   * source cannot be retrieved.  This is guaranteed to return a nonzero source
   * and a nonempty charset if it does not throw.
   */
  String getCharsetAndSource(int[] aSource);

}