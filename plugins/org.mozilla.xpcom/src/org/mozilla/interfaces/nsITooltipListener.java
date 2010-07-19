/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/browser/webBrowser/nsITooltipListener.idl
 */

package org.mozilla.interfaces;

/**
 * An optional interface for embedding clients wishing to receive
 * notifications for when a tooltip should be displayed or removed.
 * The embedder implements this interface on the web browser chrome
 * object associated with the window that notifications are required
 * for.
 *
 * @see nsITooltipTextProvider
 *
 * @status FROZEN
 */
public interface nsITooltipListener extends nsISupports {

  String NS_ITOOLTIPLISTENER_IID =
    "{44b78386-1dd2-11b2-9ad2-e4eee2ca1916}";

  /**
     * Called when a tooltip should be displayed.
     *
     * @param aXCoords The tooltip left edge X coordinate.
     * @param aYCoords The tooltip top edge Y coordinate.
     * @param aTipText The text to display in the tooltip, typically obtained
     *        from the TITLE attribute of the node (or containing parent)
     *        over which the pointer has been positioned.
     *
     * @note
     * Coordinates are specified in pixels, relative to the top-left
     * corner of the browser area.
     *
     * @return <code>NS_OK</code> if the tooltip was displayed.
     */
  void onShowTooltip(int aXCoords, int aYCoords, String aTipText);

  /**
     * Called when the tooltip should be hidden, either because the pointer
     * has moved or the tooltip has timed out.
     */
  void onHideTooltip();

}