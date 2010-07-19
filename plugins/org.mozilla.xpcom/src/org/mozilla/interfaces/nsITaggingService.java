/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsITaggingService.idl
 */

package org.mozilla.interfaces;

public interface nsITaggingService extends nsISupports {

  String NS_ITAGGINGSERVICE_IID =
    "{e39cea60-7e6d-4c8b-80a3-997af1c2cbcb}";

  /**
   * Tags a URL with the given set of tags. Current tags set for the URL
   * persist. Tags in aTags which are already set for the given URL are
   * ignored.
   *
   * @param aURI
   *        the URL to tag.
   * @param aTags
   *        Array of tags to set for the given URL. Each element within the
   *        array can be either a tag name or a concrete itemId of a tag
   *        container.
   */
  void tagURI(nsIURI aURI, nsIVariant aTags);

  /**
   * Removes tags from a URL. Tags from aTags which are not set for the
   * given URL are ignored.
   *
   * @param aURI
   *        the URL to un-tag.
   * @param aTags
   *        Array of tags to unset. pass null to remove all tags from the given
   *        url. Each element within the array can be either a tag name or a
   *        concrete itemId of a tag container.
   */
  void untagURI(nsIURI aURI, nsIVariant aTags);

  /**
   * Retrieves all URLs tagged with the given tag.
   *
   * @param aTag
   *        tag name
   * @returns Array of uris tagged with aTag.
   */
  nsIVariant getURIsForTag(String aTag);

  /**
   * Retrieves all tags set for the given URL.
   *
   * @param aURI
   *        a URL.
   * @returns array of tags (sorted by name).
   */
  String[] getTagsForURI(nsIURI aURI, long[] length);

  /**
   * Retrieves all tags used to tag URIs in the data-base (sorted by name).
   */
  nsIVariant getAllTags();

}