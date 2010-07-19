/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsINavHistoryService.idl
 */

package org.mozilla.interfaces;

public interface nsINavHistoryQuery extends nsISupports {

  String NS_INAVHISTORYQUERY_IID =
    "{6f5668f0-da8e-4069-a0de-6680e5cd8570}";

  /**
 * This object encapsulates all the query parameters you're likely to need
 * when building up history UI. All parameters are ANDed together.
 *
 * This is not intended to be a super-general query mechanism. This was designed
 * so that most queries can be done in only one SQL query. This is important
 * because, if the user has their profile on a networked drive, query latency
 * can be non-negligible.
 */
/**
   * Time range for results (INCLUSIVE). The *TimeReference is one of the
   * constants TIME_RELATIVE_* which indicates how to interpret the
   * corresponding time value.
   *   TIME_RELATIVE_EPOCH (default):
   *     The time is relative to Jan 1 1970 GMT, (this is a normal PRTime)
   *   TIME_RELATIVE_TODAY:
   *     The time is relative to this morning at midnight. Normally used for
   *     queries relative to today. For example, a "past week" query would be
   *     today-6 days -> today+1 day
   *   TIME_RELATIVE_NOW:
   *     The time is relative to right now.
   *
   * Note: PRTime is in MICROseconds since 1 Jan 1970. Javascript date objects
   * are expressed in MILLIseconds since 1 Jan 1970.
   *
   * As a special case, a 0 time relative to TIME_RELATIVE_EPOCH indicates that
   * the time is not part of the query. This is the default, so an empty query
   * will match any time. The has* functions return whether the corresponding
   * time is considered.
   *
   * You can read absolute*Time to get the time value that the currently loaded
   * reference points + offset resolve to.
   */
  long TIME_RELATIVE_EPOCH = 0L;

  long TIME_RELATIVE_TODAY = 1L;

  long TIME_RELATIVE_NOW = 2L;

  double getBeginTime();

  void setBeginTime(double aBeginTime);

  long getBeginTimeReference();

  void setBeginTimeReference(long aBeginTimeReference);

  boolean getHasBeginTime();

  double getAbsoluteBeginTime();

  double getEndTime();

  void setEndTime(double aEndTime);

  long getEndTimeReference();

  void setEndTimeReference(long aEndTimeReference);

  boolean getHasEndTime();

  double getAbsoluteEndTime();

  /**
   * Text search terms.
   */
  String getSearchTerms();

  /**
   * Text search terms.
   */
  void setSearchTerms(String aSearchTerms);

  boolean getHasSearchTerms();

  /**
   * Set lower or upper limits for how many times an item has been
   * visited.  The default is -1, and in that case all items are
   * matched regardless of their visit count.
   */
  int getMinVisits();

  /**
   * Set lower or upper limits for how many times an item has been
   * visited.  The default is -1, and in that case all items are
   * matched regardless of their visit count.
   */
  void setMinVisits(int aMinVisits);

  int getMaxVisits();

  void setMaxVisits(int aMaxVisits);

  /**
   * When set, returns only bookmarked items, when unset, returns anything. Setting this
   * is equivalent to listing all bookmark folders in the 'folders' parameter.
   */
  boolean getOnlyBookmarked();

  /**
   * When set, returns only bookmarked items, when unset, returns anything. Setting this
   * is equivalent to listing all bookmark folders in the 'folders' parameter.
   */
  void setOnlyBookmarked(boolean aOnlyBookmarked);

  /**
   * This controls the meaning of 'domain', and whether it is an exact match
   * 'domainIsHost' = true, or hierarchical (= false).
   */
  boolean getDomainIsHost();

  /**
   * This controls the meaning of 'domain', and whether it is an exact match
   * 'domainIsHost' = true, or hierarchical (= false).
   */
  void setDomainIsHost(boolean aDomainIsHost);

  /**
   * This is the host or domain name (controlled by domainIsHost). When
   * domainIsHost, domain only does exact matching on host names. Otherwise,
   * it will return anything whose host name ends in 'domain'.
   *
   * This one is a little different than most. Setting it to an empty string
   * is a real query and will match any URI that has no host name (local files
   * and such). Set this to NULL (in C++ use SetIsVoid) if you don't want
   * domain matching.
   */
  String getDomain();

  /**
   * This is the host or domain name (controlled by domainIsHost). When
   * domainIsHost, domain only does exact matching on host names. Otherwise,
   * it will return anything whose host name ends in 'domain'.
   *
   * This one is a little different than most. Setting it to an empty string
   * is a real query and will match any URI that has no host name (local files
   * and such). Set this to NULL (in C++ use SetIsVoid) if you don't want
   * domain matching.
   */
  void setDomain(String aDomain);

  boolean getHasDomain();

  /**
   * Controls the interpretation of 'uri'. When unset (default), the URI will
   * request an exact match of the specified URI. When set, any history entry
   * beginning in 'uri' will match. For example "http://bar.com/foo" will match
   * "http://bar.com/foo" as well as "http://bar.com/foo/baz.gif".
   */
  boolean getUriIsPrefix();

  /**
   * Controls the interpretation of 'uri'. When unset (default), the URI will
   * request an exact match of the specified URI. When set, any history entry
   * beginning in 'uri' will match. For example "http://bar.com/foo" will match
   * "http://bar.com/foo" as well as "http://bar.com/foo/baz.gif".
   */
  void setUriIsPrefix(boolean aUriIsPrefix);

  /**
   * This is a URI to match, to, for example, find out every time you visited
   * a given URI. Use uriIsPrefix to control whether this is an exact match.
   */
  nsIURI getUri();

  /**
   * This is a URI to match, to, for example, find out every time you visited
   * a given URI. Use uriIsPrefix to control whether this is an exact match.
   */
  void setUri(nsIURI aUri);

  boolean getHasUri();

  /**
   * Test for existance or non-existance of a given annotation. We don't
   * currently support >1 annotation name per query. If 'annotationIsNot' is
   * true, we test for the non-existance of the specified annotation.
   *
   * Testing for not annotation will do the same thing as a normal query and
   * remove everything that doesn't have that annotation. Asking for things
   * that DO have a given annotation is a little different. It also includes
   * things that have never been visited. This allows place queries to be
   * returned as well as anything else that may have been tagged with an
   * annotation. This will only work for RESULTS_AS_URI since there will be
   * no visits for these items.
   */
  boolean getAnnotationIsNot();

  /**
   * Test for existance or non-existance of a given annotation. We don't
   * currently support >1 annotation name per query. If 'annotationIsNot' is
   * true, we test for the non-existance of the specified annotation.
   *
   * Testing for not annotation will do the same thing as a normal query and
   * remove everything that doesn't have that annotation. Asking for things
   * that DO have a given annotation is a little different. It also includes
   * things that have never been visited. This allows place queries to be
   * returned as well as anything else that may have been tagged with an
   * annotation. This will only work for RESULTS_AS_URI since there will be
   * no visits for these items.
   */
  void setAnnotationIsNot(boolean aAnnotationIsNot);

  String getAnnotation();

  void setAnnotation(String aAnnotation);

  boolean getHasAnnotation();

  /**
   * Limit results to items that are tagged with all of the given tags.  This
   * attribute must be set to an array of strings.  When called as a getter it
   * will return an array of strings sorted ascending in lexicographical order.
   * The array may be empty in either case.  Duplicate tags may be specified
   * when setting the attribute, but the getter returns only unique tags.
   *
   * To search for items that are tagged with any given tags rather than all,
   * multiple queries may be passed to nsINavHistoryService.executeQueries().
   */
  nsIVariant getTags();

  /**
   * Limit results to items that are tagged with all of the given tags.  This
   * attribute must be set to an array of strings.  When called as a getter it
   * will return an array of strings sorted ascending in lexicographical order.
   * The array may be empty in either case.  Duplicate tags may be specified
   * when setting the attribute, but the getter returns only unique tags.
   *
   * To search for items that are tagged with any given tags rather than all,
   * multiple queries may be passed to nsINavHistoryService.executeQueries().
   */
  void setTags(nsIVariant aTags);

  /**
   * If 'tagsAreNot' is true, the results are instead limited to items that
   * are not tagged with any of the given tags.  This attribute is used in
   * conjunction with the 'tags' attribute.
   */
  boolean getTagsAreNot();

  /**
   * If 'tagsAreNot' is true, the results are instead limited to items that
   * are not tagged with any of the given tags.  This attribute is used in
   * conjunction with the 'tags' attribute.
   */
  void setTagsAreNot(boolean aTagsAreNot);

  /**
   * Limit results to items that are in all of the given folders.
   */
  long[] getFolders(long[] count);

  long getFolderCount();

  /**
   * For the special result type RESULTS_AS_TAG_CONTENTS we can define only
   * one folder that must be a tag folder. This is not recursive so results
   * will be returned from the first level of that folder.
   */
  void setFolders(long[] folders, long folderCount);

  /**
   * Creates a new query item with the same parameters of this one.
   */
  nsINavHistoryQuery _clone();

}