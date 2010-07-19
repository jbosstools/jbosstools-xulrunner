/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/widget/public/nsIDragService.idl
 */

package org.mozilla.interfaces;

public interface nsIDragService extends nsISupports {

  String NS_IDRAGSERVICE_IID =
    "{82b58ada-f490-4c3d-b737-1057c4f1d052}";

  int DRAGDROP_ACTION_NONE = 0;

  int DRAGDROP_ACTION_COPY = 1;

  int DRAGDROP_ACTION_MOVE = 2;

  int DRAGDROP_ACTION_LINK = 4;

  int DRAGDROP_ACTION_UNINITIALIZED = 64;

  /**
    * Starts a modal drag session with an array of transaferables 
    *
    * @param  aTransferables - an array of transferables to be dragged
    * @param  aRegion - a region containing rectangles for cursor feedback, 
    *            in window coordinates.
    * @param  aActionType - specified which of copy/move/link are allowed
    */
  void invokeDragSession(nsIDOMNode aDOMNode, nsISupportsArray aTransferables, nsIScriptableRegion aRegion, long aActionType);

  /**
   * Starts a modal drag session using an image. The first four arguments are
   * the same as invokeDragSession.
   *
   * A custom image may be specified using the aImage argument. If this is
   * supplied, the aImageX and aImageY arguments specify the offset within
   * the image where the cursor would be positioned. That is, when the image
   * is drawn, it is offset up and left the amount so that the cursor appears
   * at that location within the image.
   *
   * If aImage is null, aImageX and aImageY are not used and the image is instead
   * determined from the source node aDOMNode, and the offset calculated so that
   * the initial location for the image appears in the same screen position as
   * where the element is located. The node must be within a document.
   *
   * Currently, supported images are all DOM nodes. If this is an HTML <image> or
   * <canvas>, the drag image is taken from the image data. If the element is in
   * a document, it will be rendered at its displayed size, othewise, it will be
   * rendered at its real size. For other types of elements, the element is
   * rendered into an offscreen buffer in the same manner as it is currently
   * displayed. The document selection is hidden while drawing.
   *
   * The aDragEvent must be supplied as the current screen coordinates of the
   * event are needed to calculate the image location.
   */
  void invokeDragSessionWithImage(nsIDOMNode aDOMNode, nsISupportsArray aTransferableArray, nsIScriptableRegion aRegion, long aActionType, nsIDOMNode aImage, int aImageX, int aImageY, nsIDOMDragEvent aDragEvent, nsIDOMDataTransfer aDataTransfer);

  /**
   * Start a modal drag session using the selection as the drag image.
   * The aDragEvent must be supplied as the current screen coordinates of the
   * event are needed to calculate the image location.
   */
  void invokeDragSessionWithSelection(nsISelection aSelection, nsISupportsArray aTransferableArray, long aActionType, nsIDOMDragEvent aDragEvent, nsIDOMDataTransfer aDataTransfer);

  /**
    * Returns the current Drag Session  
    */
  nsIDragSession getCurrentSession();

  /**
    * Tells the Drag Service to start a drag session. This is called when
    * an external drag occurs
    */
  void startDragSession();

  /**
    * Tells the Drag Service to end a drag session. This is called when
    * an external drag occurs
    *
    * If aDoneDrag is true, the drag has finished, otherwise the drag has
    * just left the window.
    */
  void endDragSession(boolean aDoneDrag);

  /**
   * Fire a drag event at the source of the drag
   */
  void fireDragEventAtSource(long aMsg);

  /**
   * Increase/decrease dragging suppress level by one.
   * If level is greater than one, dragging is disabled.
   */
  void suppress();

  void unsuppress();

}