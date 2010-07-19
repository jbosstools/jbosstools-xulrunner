/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/components/find/public/nsIWebBrowserFind.idl
 */

package org.mozilla.interfaces;

/**
 * nsIWebBrowserFind
 *
 * Searches for text in a web browser.
 *
 * Get one by doing a GetInterface on an nsIWebBrowser.
 *
 * By default, the implementation will search the focussed frame, or
 * if there is no focussed frame, the web browser content area. It
 * does not by default search subframes or iframes. To change this
 * behaviour, and to explicitly set the frame to search, 
 * QueryInterface to nsIWebBrowserFindInFrames.
 *
 * @status FROZEN
 */
public interface nsIWebBrowserFind extends nsISupports {

  String NS_IWEBBROWSERFIND_IID =
    "{2f977d44-5485-11d4-87e2-0010a4e75ef2}";

  /**
     * findNext
     *
     * Finds, highlights, and scrolls into view the next occurrence of the
     * search string, using the current search settings. Fails if the
     * search string is empty.
     *
     * @return  Whether an occurrence was found
     */
  boolean findNext();

  /**
     * searchString
     *
     * The string to search for. This must be non-empty to search.
     */
  String getSearchString();

  /**
     * searchString
     *
     * The string to search for. This must be non-empty to search.
     */
  void setSearchString(String aSearchString);

  /**
     * findBackwards
     *
     * Whether to find backwards (towards the beginning of the document).
     * Default is false (search forward).
     */
  boolean getFindBackwards();

  /**
     * findBackwards
     *
     * Whether to find backwards (towards the beginning of the document).
     * Default is false (search forward).
     */
  void setFindBackwards(boolean aFindBackwards);

  /**
     * wrapFind
     *
     * Whether the search wraps around to the start (or end) of the document
     * if no match was found between the current position and the end (or
     * beginning). Works correctly when searching backwards. Default is
     * false.
     */
  boolean getWrapFind();

  /**
     * wrapFind
     *
     * Whether the search wraps around to the start (or end) of the document
     * if no match was found between the current position and the end (or
     * beginning). Works correctly when searching backwards. Default is
     * false.
     */
  void setWrapFind(boolean aWrapFind);

  /**
     * entireWord
     *
     * Whether to match entire words only. Default is false.
     */
  boolean getEntireWord();

  /**
     * entireWord
     *
     * Whether to match entire words only. Default is false.
     */
  void setEntireWord(boolean aEntireWord);

  /**
     * matchCase
     *
     * Whether to match case (case sensitive) when searching. Default is false.
     */
  boolean getMatchCase();

  /**
     * matchCase
     *
     * Whether to match case (case sensitive) when searching. Default is false.
     */
  void setMatchCase(boolean aMatchCase);

  /**
     * searchFrames
     *
     * Whether to search through all frames in the content area. Default is true.
     * 
     * Note that you can control whether the search propagates into child or
     * parent frames explicitly using nsIWebBrowserFindInFrames, but if one,
     * but not both, of searchSubframes and searchParentFrames are set, this
     * returns false.
     */
  boolean getSearchFrames();

  /**
     * searchFrames
     *
     * Whether to search through all frames in the content area. Default is true.
     * 
     * Note that you can control whether the search propagates into child or
     * parent frames explicitly using nsIWebBrowserFindInFrames, but if one,
     * but not both, of searchSubframes and searchParentFrames are set, this
     * returns false.
     */
  void setSearchFrames(boolean aSearchFrames);

}