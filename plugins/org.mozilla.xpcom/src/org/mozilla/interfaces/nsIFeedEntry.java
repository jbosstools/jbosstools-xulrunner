/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/feeds/public/nsIFeedEntry.idl
 */

package org.mozilla.interfaces;

/**
 * An nsIFeedEntry represents an Atom or RSS entry/item. Summary
 * and/or full-text content may be available, but callers will have to
 * check both.
 */
public interface nsIFeedEntry extends nsIFeedContainer {

  String NS_IFEEDENTRY_IID =
    "{31bfd5b4-8ff5-4bfd-a8cb-b3dfbd4f0a5b}";

  /**
  * Uses description, subtitle, summary, content and extensions
  * to generate a summary. 
  * 
  */
  nsIFeedTextConstruct getSummary();

  /**
  * Uses description, subtitle, summary, content and extensions
  * to generate a summary. 
  * 
  */
  void setSummary(nsIFeedTextConstruct aSummary);

  /**
   * The date the entry was published, in RFC822 form. Parsable by JS
   * and mail code.
   */
  String getPublished();

  /**
   * The date the entry was published, in RFC822 form. Parsable by JS
   * and mail code.
   */
  void setPublished(String aPublished);

  /**
  * Uses atom:content and content:encoded to provide
  * a 'full text' view of an entry.
  *
  */
  nsIFeedTextConstruct getContent();

  /**
  * Uses atom:content and content:encoded to provide
  * a 'full text' view of an entry.
  *
  */
  void setContent(nsIFeedTextConstruct aContent);

  /**
  * Enclosures are podcasts, photocasts, etc.
  */
  nsIArray getEnclosures();

  /**
  * Enclosures are podcasts, photocasts, etc.
  */
  void setEnclosures(nsIArray aEnclosures);

  /**
  * Enclosures, etc. that might be displayed inline.
  */
  nsIArray getMediaContent();

  /**
  * Enclosures, etc. that might be displayed inline.
  */
  void setMediaContent(nsIArray aMediaContent);

}