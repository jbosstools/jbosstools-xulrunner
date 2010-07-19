/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/components/find/public/nsIFind.idl
 */

package org.mozilla.interfaces;

public interface nsIFind extends nsISupports {

  String NS_IFIND_IID =
    "{75125d55-37ee-4575-b9b5-f33bfa68c2a1}";

  boolean getFindBackwards();

  void setFindBackwards(boolean aFindBackwards);

  boolean getCaseSensitive();

  void setCaseSensitive(boolean aCaseSensitive);

  /**
   * Find some text in the current context. The implementation is
   * responsible for performing the find and highlighting the text.
   *
   * @param aPatText     The text to search for.
   * @param aSearchRange A Range specifying domain of search.
   * @param aStartPoint  A Range specifying search start point.
   *                     If not collapsed, we'll start from
   *                     end (forward) or start (backward).
   * @param aEndPoint    A Range specifying search end point.
   *                     If not collapsed, we'll end at
   *                     end (forward) or start (backward).
   * @retval             A range spanning the match that was found (or null).
   */
  nsIDOMRange find(String aPatText, nsIDOMRange aSearchRange, nsIDOMRange aStartPoint, nsIDOMRange aEndPoint);

}