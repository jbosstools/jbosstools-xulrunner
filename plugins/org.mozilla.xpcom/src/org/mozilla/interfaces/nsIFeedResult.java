/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/feeds/public/nsIFeedResult.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIFeedResult interface provides access to HTTP and parsing
 * metadata for a feed or entry.
 */
public interface nsIFeedResult extends nsISupports {

  String NS_IFEEDRESULT_IID =
    "{7a180b78-0f46-4569-8c22-f3d720ea1c57}";

  /** 
  * The Feed parser will set the bozo bit when a feed triggers a fatal
  * error during XML parsing. There may be entries and feed metadata
  * that were parsed before the error.  Thanks to Tim Bray for
  * suggesting this terminology.
  * <http://www.tbray.org/ongoing/When/200x/2004/01/11/PostelPilgrim>
  */
  boolean getBozo();

  /** 
  * The Feed parser will set the bozo bit when a feed triggers a fatal
  * error during XML parsing. There may be entries and feed metadata
  * that were parsed before the error.  Thanks to Tim Bray for
  * suggesting this terminology.
  * <http://www.tbray.org/ongoing/When/200x/2004/01/11/PostelPilgrim>
  */
  void setBozo(boolean aBozo);

  /**
  * The parsed feed or entry. 
  *
  * Will be null if a non-feed is processed.
  */
  nsIFeedContainer getDoc();

  /**
  * The parsed feed or entry. 
  *
  * Will be null if a non-feed is processed.
  */
  void setDoc(nsIFeedContainer aDoc);

  /** 
  * The address from which the feed was fetched. 
  */
  nsIURI getUri();

  /** 
  * The address from which the feed was fetched. 
  */
  void setUri(nsIURI aUri);

  /** 
  * Feed Version: 
  * atom, rss2, rss09, rss091, rss091userland, rss092, rss1, atom03, 
  * atomEntry, rssItem
  *
  * Will be null if a non-feed is processed.
  */
  String getVersion();

  /** 
  * Feed Version: 
  * atom, rss2, rss09, rss091, rss091userland, rss092, rss1, atom03, 
  * atomEntry, rssItem
  *
  * Will be null if a non-feed is processed.
  */
  void setVersion(String aVersion);

  /**
  * An XSLT stylesheet available to transform the source of the
  * feed. Some feeds include this information in a processing
  * instruction. It's generally intended for clients with specific
  * feed capabilities.
  */
  nsIURI getStylesheet();

  /**
  * An XSLT stylesheet available to transform the source of the
  * feed. Some feeds include this information in a processing
  * instruction. It's generally intended for clients with specific
  * feed capabilities.
  */
  void setStylesheet(nsIURI aStylesheet);

  /**
  * HTTP response headers that accompanied the feed. 
  */
  nsIProperties getHeaders();

  /**
  * HTTP response headers that accompanied the feed. 
  */
  void setHeaders(nsIProperties aHeaders);

  /**
  * Registers a prefix used to access an extension in the feed/entry 
  */
  void registerExtensionPrefix(String aNamespace, String aPrefix);

}