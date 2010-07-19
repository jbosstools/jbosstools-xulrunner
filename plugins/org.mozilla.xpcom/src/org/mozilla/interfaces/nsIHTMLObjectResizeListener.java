/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/idl/nsIHTMLObjectResizeListener.idl
 */

package org.mozilla.interfaces;

public interface nsIHTMLObjectResizeListener extends nsISupports {

  String NS_IHTMLOBJECTRESIZELISTENER_IID =
    "{27b00295-349c-429f-ad0c-87b859e77130}";

  /**
   * Listener's callback called by the editor when the user
   * starts resizing an element
   * @param aElement [IN] the element
   */
  void onStartResizing(nsIDOMElement aElement);

  /**
   * Listener's callback called by the editor when the user
   * has finalized the resizing of an element
   * @param aElement [IN] the element that was resized
   * @param aOldWidth  [IN] the width of the element before resizing
   * @param aOldHeight [IN] the height of the element before resizing
   * @param aNewWidth  [IN] the width of the element after resizing
   * @param aNewHeight [IN] the height of the element after resizing
   */
  void onEndResizing(nsIDOMElement aElement, int aOldWidth, int aOldHeight, int aNewWidth, int aNewHeight);

}