/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/mozapps/extensions/public/nsIAddonRepository.idl
 */

package org.mozilla.interfaces;

public interface nsIAddonSearchResultsCallback extends nsISupports {

  String NS_IADDONSEARCHRESULTSCALLBACK_IID =
    "{a6f70917-dd30-4eb6-8b3d-453204f96f33}";

  /**
   * Called when a search has suceeded.
   *
   * @param  aAddons        an array of the add-on results. In the case of
   *                        searching for specific terms the ordering of results
   *                        may be determined by the search provider.
   * @param  aAddonCount    The length of aAddons
   * @param  aTotalResults  The total results actually available in the
   *                        repository
   */
  void searchSucceeded(nsIAddonSearchResult[] aAddons, long aAddonCount, long aTotalResults);

  /**
   * Called when an error occured when performing a search.
   */
  void searchFailed();

}