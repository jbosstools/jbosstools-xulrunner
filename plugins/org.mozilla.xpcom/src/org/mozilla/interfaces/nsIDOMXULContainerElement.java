/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/xul/nsIDOMXULContainerElement.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMXULContainerElement extends nsIDOMXULContainerItemElement {

  String NS_IDOMXULCONTAINERELEMENT_IID =
    "{bc07c626-4294-43ae-9b0a-e726de0adcad}";

  /**
   * Creates an item for the given label and value and appends it to the
   * container.
   *
   * @param aLabel - the label for the new item
   * @param aValue - the value of the new item
   */
  nsIDOMXULElement appendItem(String aLabel, String aValue);

  /**
   * Creates an item for the given label and value and inserts it into the
   * container at the specified position.
   *
   * @param aIndex - the index where the new item will be inserted
   * @param aLabel - the label for the new item
   * @param aValue - the value of the new item
   */
  nsIDOMXULElement insertItemAt(int aIndex, String aLabel, String aValue);

  /**
   * Removes an item from the container.
   *
   * @param aIndex - index of the item to remove
   */
  nsIDOMXULElement removeItemAt(int aIndex);

  /**
   * Returns a count of items in the container.
   */
  long getItemCount();

  /**
   * Returns the index of an item or -1 if the item is not in the container.
   *
   * @param aItem - the item to determine the index of
   */
  int getIndexOfItem(nsIDOMXULElement aItem);

  /**
   * Returns the item at a given index or null if the item is not is the
   * container.
   *
   * @param aIndex - the index of the item to return
   */
  nsIDOMXULElement getItemAtIndex(int aIndex);

}