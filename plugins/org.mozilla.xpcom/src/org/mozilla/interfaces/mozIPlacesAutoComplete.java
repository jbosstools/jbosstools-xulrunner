/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/mozIPlacesAutoComplete.idl
 */

package org.mozilla.interfaces;

/**
 * This interface provides some constants used by the Places AutoComplete
 * search provider.
 */
public interface mozIPlacesAutoComplete extends nsISupports {

  String MOZIPLACESAUTOCOMPLETE_IID =
    "{a5ae8332-333c-412a-bb02-a35df8247714}";

  /**
   * Match anywhere in each searchable term.
   */
  int MATCH_ANYWHERE = 0;

  /**
   * Match first on word boundaries, and if we do not get enough results, then
   * match anywhere in each searchable term.
   */
  int MATCH_BOUNDARY_ANYWHERE = 1;

  /**
   * Match on word boundaries in each searchable term.
   */
  int MATCH_BOUNDARY = 2;

  /**
   * Match only the beginning of each search term.
   */
  int MATCH_BEGINNING = 3;

  /**
   * Search through history.
   */
  int BEHAVIOR_HISTORY = 1;

  /**
   * Search though bookmarks.
   */
  int BEHAVIOR_BOOKMARK = 2;

  /**
   * Search through tags.
   */
  int BEHAVIOR_TAG = 4;

  /**
   * Search the title of pages.
   */
  int BEHAVIOR_TITLE = 8;

  /**
   * Search the URL of pages.
   */
  int BEHAVIOR_URL = 16;

  /**
   * Search for typed pages.
   */
  int BEHAVIOR_TYPED = 32;

  /**
   * Search javascript: URLs.
   */
  int BEHAVIOR_JAVASCRIPT = 64;

}