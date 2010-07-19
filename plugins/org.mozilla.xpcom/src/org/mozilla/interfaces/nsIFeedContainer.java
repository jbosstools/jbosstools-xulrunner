/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/feeds/public/nsIFeedContainer.idl
 */

package org.mozilla.interfaces;

/**
 * A shared base for feeds and items, which are pretty similar,
 * but they have some divergent attributes and require
 * different convenience methods.
 */
public interface nsIFeedContainer extends nsIFeedElementBase {

  String NS_IFEEDCONTAINER_IID =
    "{577a1b4c-b3d4-4c76-9cf8-753e6606114f}";

  /**
  * Many feeds contain an ID distinct from their URI, and
  * entries have standard fields for this in all major formats.
  */
  String getId();

  /**
  * Many feeds contain an ID distinct from their URI, and
  * entries have standard fields for this in all major formats.
  */
  void setId(String aId);

  /**
  * The fields found in the document. Common Atom
  * and RSS fields are normalized. This includes some namespaced
  * extensions such as dc:subject and content:encoded. 
  * Consumers can avoid normalization by checking the feed type
  * and accessing specific fields.
  *
  * Common namespaces are accessed using prefixes, like get("dc:subject");.
  * See nsIFeedResult::registerExtensionPrefix.
  */
  nsIWritablePropertyBag2 getFields();

  /**
  * The fields found in the document. Common Atom
  * and RSS fields are normalized. This includes some namespaced
  * extensions such as dc:subject and content:encoded. 
  * Consumers can avoid normalization by checking the feed type
  * and accessing specific fields.
  *
  * Common namespaces are accessed using prefixes, like get("dc:subject");.
  * See nsIFeedResult::registerExtensionPrefix.
  */
  void setFields(nsIWritablePropertyBag2 aFields);

  /**
   * Sometimes there's no title, or the title contains markup, so take
   * care in decoding the attribute.
   */
  nsIFeedTextConstruct getTitle();

  /**
   * Sometimes there's no title, or the title contains markup, so take
   * care in decoding the attribute.
   */
  void setTitle(nsIFeedTextConstruct aTitle);

  /**
  * Returns the primary link for the feed or entry.
  */
  nsIURI getLink();

  /**
  * Returns the primary link for the feed or entry.
  */
  void setLink(nsIURI aLink);

  /**
  * Returns all links for a feed or entry.
  */
  nsIArray getLinks();

  /**
  * Returns all links for a feed or entry.
  */
  void setLinks(nsIArray aLinks);

  /**
  * Returns the categories found in a feed or entry.
  */
  nsIArray getCategories();

  /**
  * Returns the categories found in a feed or entry.
  */
  void setCategories(nsIArray aCategories);

  /**
   * The rights or license associated with a feed or entry.
   */
  nsIFeedTextConstruct getRights();

  /**
   * The rights or license associated with a feed or entry.
   */
  void setRights(nsIFeedTextConstruct aRights);

  /**
   * A list of nsIFeedPersons that authored the feed.
   */
  nsIArray getAuthors();

  /**
   * A list of nsIFeedPersons that authored the feed.
   */
  void setAuthors(nsIArray aAuthors);

  /**
   * A list of nsIFeedPersons that contributed to the feed.
   */
  nsIArray getContributors();

  /**
   * A list of nsIFeedPersons that contributed to the feed.
   */
  void setContributors(nsIArray aContributors);

  /**
   * The date the feed was updated, in RFC822 form. Parsable by JS
   * and mail code.
   */
  String getUpdated();

  /**
   * The date the feed was updated, in RFC822 form. Parsable by JS
   * and mail code.
   */
  void setUpdated(String aUpdated);

  /**
  * Syncs a container's fields with its convenience attributes.
  */
  void normalize();

}