/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/mozapps/extensions/public/nsIAddonRepository.idl
 */

package org.mozilla.interfaces;

/**
 * The add-on repository is a source of add-ons that can be installed. It can
 * be searched in two ways. One returns a list of add-ons that come highly
 * recommended, this list should change frequently. The other way is to
 * search for specific search terms entered by the user. Searches are
 * asynchronous and results should be passed to the provided callback object
 * when complete. The results passed to the callback should only include add-ons
 * that are compatible with the current application and are not already
 * installed. Searches are always asynchronous and should be passed to the
 * callback object provided.
 */
public interface nsIAddonRepository extends nsISupports {

  String NS_IADDONREPOSITORY_IID =
    "{c4d2ac29-6edc-43cd-8dc8-e4cf213aa1be}";

  /**
   * The homepage for visiting this repository. This may be null or an empty
   * string.
   */
  String getHomepageURL();

  /**
   * Returns whether this instance is currently performing a search. New
   * searches will not be performed while this is the case.
   */
  boolean getIsSearching();

  /**
   * The url that can be visited to see recommended add-ons in this repository.
   */
  String getRecommendedURL();

  /**
   * Retrieves the url that can be visited to see search results for the given
   * terms.
   *
   * @param  aSearchTerms  search terms used to search the repository
   */
  String getSearchURL(String aSearchTerms);

  /**
   * Begins a search for recommended add-ons in this repository. Results will
   * be passed to the given callback.
   *
   * @param  aMaxResults  the maximum number of results to return
   * @param  aCallback    the callback to pass results to
   */
  void retrieveRecommendedAddons(long aMaxResults, nsIAddonSearchResultsCallback aCallback);

  /**
   * Begins a search for add-ons in this repository. Results will be passed to
   * the given callback.
   *
   * @param  aSearchTerms  the terms to search for
   * @param  aMaxResults   the maximum number of results to return
   * @param  aCallback     the callback to pass results to
   */
  void searchAddons(String aSearchTerms, long aMaxResults, nsIAddonSearchResultsCallback aCallback);

  /**
   * Cancels the search in progress. If there is no search in progress this
   * does nothing.
   */
  void cancelSearch();

}