/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/browser/webBrowser/nsIContextMenuListener2.idl
 */

package org.mozilla.interfaces;

public interface nsIContextMenuInfo extends nsISupports {

  String NS_ICONTEXTMENUINFO_IID =
    "{2f977d56-5485-11d4-87e2-0010a4e75ef2}";

  /**
 * nsIContextMenuInfo
 *
 * A helper object for implementors of nsIContextMenuListener2.
 *
 * @status UNDER_REVIEW
 */
/**
   * The DOM context menu event.
   */
  nsIDOMEvent getMouseEvent();

  /**
   * The DOM node most relevant to the context.
   */
  nsIDOMNode getTargetNode();

  /**
   * Given the <CODE>CONTEXT_LINK</CODE> flag, <CODE>targetNode</CODE> may not
   * nescesarily be a link. This returns the anchor from <CODE>targetNode</CODE>
   * if it has one or that of its nearest ancestor if it does not.
   */
  String getAssociatedLink();

  /**
   * Given the <CODE>CONTEXT_IMAGE</CODE> flag, these methods can be
   * used in order to get the image for viewing, saving, or for the clipboard.
   *
   * @return <CODE>NS_OK</CODE> if successful, otherwise <CODE>NS_ERROR_FAILURE</CODE> if no
   * image was found, or NS_ERROR_NULL_POINTER if an internal error occurs where we think there 
   * is an image, but for some reason it cannot be returned.
   */
  imgIContainer getImageContainer();

  nsIURI getImageSrc();

  /**
   * Given the <CODE>CONTEXT_BACKGROUND_IMAGE</CODE> flag, these methods can be
   * used in order to get the image for viewing, saving, or for the clipboard.
   *
   * @return <CODE>NS_OK</CODE> if successful, otherwise <CODE>NS_ERROR_FAILURE</CODE> if no background
   * image was found, or NS_ERROR_NULL_POINTER if an internal error occurs where we think there is a 
   * background image, but for some reason it cannot be returned.
   */
  imgIContainer getBackgroundImageContainer();

  nsIURI getBackgroundImageSrc();

}