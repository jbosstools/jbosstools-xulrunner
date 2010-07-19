/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMDataTransfer.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMDataTransfer extends nsISupports {

  String NS_IDOMDATATRANSFER_IID =
    "{34042440-60a8-4992-ae5c-798e69148955}";

  /**
   * The actual effect that will be used, and should always be one of the
   * possible values of effectAllowed.
   *
   * For dragstart, drag and dragleave events, the dropEffect is initialized
   * to none. Any value assigned to the dropEffect will be set, but the value
   * isn't used for anything.
   *
   * For the dragenter and dragover events, the dropEffect will be initialized
   * based on what action the user is requesting. How this is determined is
   * platform specific, but typically the user can press modifier keys to
   * adjust which action is desired. Within an event handler for the dragenter
   * and dragover events, the dropEffect should be modified if the action the
   * user is requesting is not the one that is desired.
   *
   * For the drop and dragend events, the dropEffect will be initialized to
   * the action that was desired, which will be the value that the dropEffect
   * had after the last dragenter or dragover event.
   *
   * Possible values:
   *  copy - a copy of the source item is made at the new location
   *  move - an item is moved to a new location
   *  link - a link is established to the source at the new location
   *  none - the item may not be dropped
   *
   * Assigning any other value has no effect and retains the old value.
   */
  String getDropEffect();

  /**
   * The actual effect that will be used, and should always be one of the
   * possible values of effectAllowed.
   *
   * For dragstart, drag and dragleave events, the dropEffect is initialized
   * to none. Any value assigned to the dropEffect will be set, but the value
   * isn't used for anything.
   *
   * For the dragenter and dragover events, the dropEffect will be initialized
   * based on what action the user is requesting. How this is determined is
   * platform specific, but typically the user can press modifier keys to
   * adjust which action is desired. Within an event handler for the dragenter
   * and dragover events, the dropEffect should be modified if the action the
   * user is requesting is not the one that is desired.
   *
   * For the drop and dragend events, the dropEffect will be initialized to
   * the action that was desired, which will be the value that the dropEffect
   * had after the last dragenter or dragover event.
   *
   * Possible values:
   *  copy - a copy of the source item is made at the new location
   *  move - an item is moved to a new location
   *  link - a link is established to the source at the new location
   *  none - the item may not be dropped
   *
   * Assigning any other value has no effect and retains the old value.
   */
  void setDropEffect(String aDropEffect);

  String getEffectAllowed();

  void setEffectAllowed(String aEffectAllowed);

  /**
   * Holds a list of all the local files available on this data transfer.
   * A dataTransfer containing no files will return an empty list, and an
   * invalid index access on the resulting file list will return null. 
   */
  nsIDOMFileList getFiles();

  /**
   * Holds a list of the format types of the data that is stored for the first
   * item, in the same order the data was added. An empty list will be
   * returned if no data was added.
   */
  nsIDOMDOMStringList getTypes();

  /**
   * Remove the data associated with a given format. If format is empty or not
   * specified, the data associated with all formats is removed. If data for
   * the specified format does not exist, or the data transfer contains no
   * data, this method will have no effect.
   */
  void clearData(String format);

  /**
   * Set the data for a given format. If data for the format does not exist,
   * it is added at the end, such that the last item in the types list will be
   * the new format. If data for the format already exists, the existing data
   * is replaced in the same position. That is, the order of the types list is
   * not changed.
   *
   * @throws NS_ERROR_NULL_POINTER if the data is null
   */
  void setData(String format, String data);

  /**
   * Retrieves the data for a given format, or an empty string if data for
   * that format does not exist or the data transfer contains no data.
   */
  String getData(String format);

  /**
   * Set the image to be used for dragging if a custom one is desired. Most of
   * the time, this would not be set, as a default image is created from the
   * node that was dragged.
   *
   * If the node is an HTML img element, an HTML canvas element or a XUL image
   * element, the image data is used. Otherwise, image should be a visible
   * node and the drag image will be created from this. If image is null, any
   * custom drag image is cleared and the default is used instead.
   *
   * The coordinates specify the offset into the image where the mouse cursor
   * should be. To center the image for instance, use values that are half the
   * width and height.
   *
   * @param image a node to use 
   * @param x the horizontal offset
   * @param y the vertical offset
   * @throws NO_MODIFICATION_ALLOWED_ERR if the item cannot be modified
   */
  void setDragImage(nsIDOMElement image, int x, int y);

  void addElement(nsIDOMElement element);

}