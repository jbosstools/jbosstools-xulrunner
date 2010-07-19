/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/layout/xul/base/src/tree/public/nsITreeSelection.idl
 */

package org.mozilla.interfaces;

public interface nsITreeSelection extends nsISupports {

  String NS_ITREESELECTION_IID =
    "{ab6fe746-300b-4ab4-abb9-1c0e3977874c}";

  /**
   * The tree widget for this selection.
   */
  nsITreeBoxObject getTree();

  /**
   * The tree widget for this selection.
   */
  void setTree(nsITreeBoxObject aTree);

  /**
   * This attribute is a boolean indicating single selection.
   */
  boolean getSingle();

  /**
   * The number of rows currently selected in this tree.
   */
  int getCount();

  /**
   * Indicates whether or not the row at the specified index is
   * part of the selection.
   */
  boolean isSelected(int index);

  /**
   * Deselect all rows and select the row at the specified index. 
   */
  void select(int index);

  /**
   * Perform a timed select.
   */
  void timedSelect(int index, int delay);

  /**
   * Toggle the selection state of the row at the specified index.
   */
  void toggleSelect(int index);

  /**
   * Select the range specified by the indices.  If augment is true,
   * then we add the range to the selection without clearing out anything
   * else.  If augment is false, everything is cleared except for the specified range.
   */
  void rangedSelect(int startIndex, int endIndex, boolean augment);

  /**
   * Clears the range.
   */
  void clearRange(int startIndex, int endIndex);

  /**
   * Clears the selection.
   */
  void clearSelection();

  /**
   * Inverts the selection.
   */
  void invertSelection();

  /**
   * Selects all rows.
   */
  void selectAll();

  /**
   * Iterate the selection using these methods.
   */
  int getRangeCount();

  void getRangeAt(int i, int[] min, int[] max);

  /**
   * Can be used to invalidate the selection.
   */
  void invalidateSelection();

  /**
   * Called when the row count changes to adjust selection indices.
   */
  void adjustSelection(int index, int count);

  /**
   * This attribute is a boolean indicating whether or not the
   * "select" event should fire when the selection is changed using
   * one of our methods.  A view can use this to temporarily suppress
   * the selection while manipulating all of the indices, e.g., on 
   * a sort.
   * Note: setting this attribute to false will fire a select event.
   */
  boolean getSelectEventsSuppressed();

  /**
   * This attribute is a boolean indicating whether or not the
   * "select" event should fire when the selection is changed using
   * one of our methods.  A view can use this to temporarily suppress
   * the selection while manipulating all of the indices, e.g., on 
   * a sort.
   * Note: setting this attribute to false will fire a select event.
   */
  void setSelectEventsSuppressed(boolean aSelectEventsSuppressed);

  /**
   * The current item (the one that gets a focus rect in addition to being
   * selected).
   */
  int getCurrentIndex();

  /**
   * The current item (the one that gets a focus rect in addition to being
   * selected).
   */
  void setCurrentIndex(int aCurrentIndex);

  /**
   * The current column.
   */
  nsITreeColumn getCurrentColumn();

  /**
   * The current column.
   */
  void setCurrentColumn(nsITreeColumn aCurrentColumn);

  /**
   * The selection "pivot".  This is the first item the user selected as
   * part of a ranged select.
   */
  int getShiftSelectPivot();

}