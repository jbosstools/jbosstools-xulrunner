/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/events/nsIDOMDataTransfer.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMNSDataTransfer extends nsISupports {

  String NS_IDOMNSDATATRANSFER_IID =
    "{990758e9-fd38-4444-a1e8-395195802bda}";

  /**
   * The number of items being dragged.
   */
  long getMozItemCount();

  /**
   * Sets the drag cursor state. Primarily used to control the cursor during
   * tab drags, but could be expanded to other uses. XXX Currently implemented
   * on Win32 only.
   *
   * Possible values:
   *  auto - use default system behavior.
   *  default - set the cursor to an arrow during the drag operation.
   *
   * Values other than 'default' are indentical to setting mozCursor to
   * 'auto'.
   */
  String getMozCursor();

  /**
   * Sets the drag cursor state. Primarily used to control the cursor during
   * tab drags, but could be expanded to other uses. XXX Currently implemented
   * on Win32 only.
   *
   * Possible values:
   *  auto - use default system behavior.
   *  default - set the cursor to an arrow during the drag operation.
   *
   * Values other than 'default' are indentical to setting mozCursor to
   * 'auto'.
   */
  void setMozCursor(String aMozCursor);

  /**
   * Holds a list of the format types of the data that is stored for an item
   * at the specified index. If the index is not in the range from 0 to
   * itemCount - 1, an empty string list is returned.
   */
  nsIDOMDOMStringList mozTypesAt(long index);

  /**
   * Remove the data associated with the given format for an item at the
   * specified index. The index is in the range from zero to itemCount - 1.
   *
   * If the last format for the item is removed, the entire item is removed,
   * reducing the itemCount by one.
   *
   * If format is empty, then the data associated with all formats is removed.
   * If the format is not found, then this method has no effect.
   *
   * @param format the format to remove
   * @throws NS_ERROR_DOM_INDEX_SIZE_ERR if index is greater or equal than itemCount
   * @throws NO_MODIFICATION_ALLOWED_ERR if the item cannot be modified
   */
  void mozClearDataAt(String format, long index);

  void mozSetDataAt(String format, nsIVariant data, long index);

  /**
   * Retrieve the data associated with the given format for an item at the
   * specified index, or null if it does not exist. The index should be in the
   * range from zero to itemCount - 1.
   *
   * @param format the format of the data to look up
   * @returns the data of the given format, or null if it doesn't exist.
   * @throws NS_ERROR_DOM_INDEX_SIZE_ERR if index is greater or equal than itemCount
   */
  nsIVariant mozGetDataAt(String format, long index);

  /**
   * Will be true when the user has cancelled the drag (typically by pressing
   * Escape) and when the drag has been cancelled unexpectedly.  This will be
   * false otherwise, including when the drop has been rejected by its target.
   * This property is only relevant for the dragend event.
   */
  boolean getMozUserCancelled();

}