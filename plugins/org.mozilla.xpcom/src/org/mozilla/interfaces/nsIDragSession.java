/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/widget/public/nsIDragSession.idl
 */

package org.mozilla.interfaces;

public interface nsIDragSession extends nsISupports {

  String NS_IDRAGSESSION_IID =
    "{15860d52-fe2c-4ddd-ac50-9c23e24916c4}";

  /**
    * Set the current state of the drag, whether it can be dropped or not.
    * usually the target "frame" sets this so the native system can render the correct feedback
    */
  boolean getCanDrop();

  /**
    * Set the current state of the drag, whether it can be dropped or not.
    * usually the target "frame" sets this so the native system can render the correct feedback
    */
  void setCanDrop(boolean aCanDrop);

  /**
    * Sets the action (copy, move, link, et.c) for the current drag 
    */
  long getDragAction();

  /**
    * Sets the action (copy, move, link, et.c) for the current drag 
    */
  void setDragAction(long aDragAction);

  /**
    * Get the number of items that were dropped
    */
  long getNumDropItems();

  /**
    * The document where the drag was started, which will be null if the
    * drag originated outside the application. Useful for determining if a drop
    * originated in the same document.
    */
  nsIDOMDocument getSourceDocument();

  /**
    * The dom node that was originally dragged to start the session, which will be null if the
    * drag originated outside the application.
    */
  nsIDOMNode getSourceNode();

  /**
   * The data transfer object for the current drag.
   */
  nsIDOMDataTransfer getDataTransfer();

  /**
   * The data transfer object for the current drag.
   */
  void setDataTransfer(nsIDOMDataTransfer aDataTransfer);

  /**
    * Get data from a Drag&Drop. Can be called while the drag is in process
    * or after the drop has completed.  
    *
    * @param  aTransferable the transferable for the data to be put into
    * @param  aItemIndex which of multiple drag items, zero-based
    */
  void getData(nsITransferable aTransferable, long aItemIndex);

  /**
    * Check to set if any of the native data on the clipboard matches this data flavor
    */
  boolean isDataFlavorSupported(String aDataFlavor);

}