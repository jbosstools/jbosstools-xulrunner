/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/xul/nsIDOMXULDocument.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMXULDocument extends nsISupports {

  String NS_IDOMXULDOCUMENT_IID =
    "{d55c39b4-b54a-4df5-9e68-09919e4538f9}";

  nsIDOMNode getPopupNode();

  void setPopupNode(nsIDOMNode aPopupNode);

  /**
   * These attributes correspond to trustedGetPopupNode().rangeOffset and
   * rangeParent. They will help you find where in the DOM the popup is
   * happening. Can be accessed from chrome only, and only during a popup
   * event. Accessing any other time will be an error.
   */
  nsIDOMNode getPopupRangeParent();

  int getPopupRangeOffset();

  nsIDOMNode getTooltipNode();

  void setTooltipNode(nsIDOMNode aTooltipNode);

  nsIDOMXULCommandDispatcher getCommandDispatcher();

  int getWidth();

  int getHeight();

  nsIDOMNodeList getElementsByAttribute(String name, String value);

  nsIDOMNodeList getElementsByAttributeNS(String namespaceURI, String name, String value);

  void addBroadcastListenerFor(nsIDOMElement broadcaster, nsIDOMElement observer, String attr);

  void removeBroadcastListenerFor(nsIDOMElement broadcaster, nsIDOMElement observer, String attr);

  void persist(String id, String attr);

  nsIBoxObject getBoxObjectFor(nsIDOMElement elt);

  /**
   * Loads a XUL overlay and merges it with the current document, notifying an
   * observer when the merge is complete. 
   * @param   url
   *          The URL of the overlay to load and merge
   * @param   observer
   *          An object implementing nsIObserver that will be notified with a
   *          message of topic "xul-overlay-merged" when the merge is complete. 
   *          The subject parameter of |observe| will QI to a nsIURI - the URI 
   *          of the merged overlay. This parameter is optional and may be null.
   *
   * NOTICE:  In the 2.0 timeframe this API will change such that the 
   *          implementation will fire a DOMXULOverlayMerged event upon merge
   *          completion rather than notifying an observer. Do not rely on this
   *          API's behavior _not_ to change because it will!
   *          - Ben Goodger (8/23/2005)
   */
  void loadOverlay(String url, nsIObserver aObserver);

}