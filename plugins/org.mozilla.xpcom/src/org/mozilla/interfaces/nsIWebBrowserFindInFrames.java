/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/components/find/public/nsIWebBrowserFind.idl
 */

package org.mozilla.interfaces;

/**
 * nsIWebBrowserFindInFrames
 *
 * Controls how find behaves when multiple frames or iframes are present.
 *
 * Get by doing a QueryInterface from nsIWebBrowserFind.
 *
 * @status FROZEN
 */
public interface nsIWebBrowserFindInFrames extends nsISupports {

  String NS_IWEBBROWSERFINDINFRAMES_IID =
    "{e0f5d182-34bc-11d5-be5b-b760676c6ebc}";

  /**
     * currentSearchFrame
     *
     * Frame at which to start the search. Once the search is done, this will
     * be set to be the last frame searched, whether or not a result was found.
     * Has to be equal to or contained within the rootSearchFrame.
     */
  nsIDOMWindow getCurrentSearchFrame();

  /**
     * currentSearchFrame
     *
     * Frame at which to start the search. Once the search is done, this will
     * be set to be the last frame searched, whether or not a result was found.
     * Has to be equal to or contained within the rootSearchFrame.
     */
  void setCurrentSearchFrame(nsIDOMWindow aCurrentSearchFrame);

  /**
     * rootSearchFrame
     *
     * Frame within which to confine the search (normally the content area frame).
     * Set this to only search a subtree of the frame hierarchy.
     */
  nsIDOMWindow getRootSearchFrame();

  /**
     * rootSearchFrame
     *
     * Frame within which to confine the search (normally the content area frame).
     * Set this to only search a subtree of the frame hierarchy.
     */
  void setRootSearchFrame(nsIDOMWindow aRootSearchFrame);

  /**
     * searchSubframes
     *
     * Whether to recurse down into subframes while searching. Default is true.
     *
     * Setting nsIWebBrowserfind.searchFrames to true sets this to true.
     */
  boolean getSearchSubframes();

  /**
     * searchSubframes
     *
     * Whether to recurse down into subframes while searching. Default is true.
     *
     * Setting nsIWebBrowserfind.searchFrames to true sets this to true.
     */
  void setSearchSubframes(boolean aSearchSubframes);

  /**
     * searchParentFrames
     *
     * Whether to allow the search to propagate out of the currentSearchFrame into its
     * parent frame(s). Search is always confined within the rootSearchFrame. Default
     * is true.
     *
     * Setting nsIWebBrowserfind.searchFrames to true sets this to true.
     */
  boolean getSearchParentFrames();

  /**
     * searchParentFrames
     *
     * Whether to allow the search to propagate out of the currentSearchFrame into its
     * parent frame(s). Search is always confined within the rootSearchFrame. Default
     * is true.
     *
     * Setting nsIWebBrowserfind.searchFrames to true sets this to true.
     */
  void setSearchParentFrames(boolean aSearchParentFrames);

}