/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/layout/xul/base/src/tree/public/nsITreeBoxObject.idl
 */

package org.mozilla.interfaces;

public interface nsITreeBoxObject extends nsISupports {

  String NS_ITREEBOXOBJECT_IID =
    "{64ba5199-c4f4-4498-bbdc-f8e4c369086c}";

  /**
   * Obtain the columns.
   */
  nsITreeColumns getColumns();

  /**
   * The view that backs the tree and that supplies it with its data.
   * It is dynamically settable, either using a view attribute on the
   * tree tag or by setting this attribute to a new value.
   */
  nsITreeView getView();

  /**
   * The view that backs the tree and that supplies it with its data.
   * It is dynamically settable, either using a view attribute on the
   * tree tag or by setting this attribute to a new value.
   */
  void setView(nsITreeView aView);

  /**
   * Whether or not we are currently focused.
   */
  boolean getFocused();

  /**
   * Whether or not we are currently focused.
   */
  void setFocused(boolean aFocused);

  /**
   * Obtain the treebody content node
   */
  nsIDOMElement getTreeBody();

  /**
   * Obtain the height of a row.
   */
  int getRowHeight();

  /**
   * Obtain the width of a row.
   */
  int getRowWidth();

  /**
   * Get the pixel position of the horizontal scrollbar. 
   */
  int getHorizontalPosition();

  /**
   * Return the region for the visible parts of the selection, in device pixels.
   */
  nsIScriptableRegion getSelectionRegion();

  /**
   * Get the index of the first visible row.
   */
  int getFirstVisibleRow();

  /**
   * Get the index of the last visible row.
   */
  int getLastVisibleRow();

  /**
   * Gets the number of possible visible rows.
   */
  int getPageLength();

  /**
   * Ensures that a row at a given index is visible.
   */
  void ensureRowIsVisible(int index);

  /**
   * Ensures that a given cell in the tree is visible.
   */
  void ensureCellIsVisible(int row, nsITreeColumn col);

  /**
   * Scrolls such that the row at index is at the top of the visible view.
   */
  void scrollToRow(int index);

  /**
   * Scroll the tree up or down by numLines lines. Positive
   * values move down in the tree. Prevents scrolling off the
   * end of the tree. 
   */
  void scrollByLines(int numLines);

  /**
   * Scroll the tree up or down by numPages pages. A page
   * is considered to be the amount displayed by the tree.
   * Positive values move down in the tree. Prevents scrolling
   * off the end of the tree.
   */
  void scrollByPages(int numPages);

  /**
   * Scrolls such that a given cell is visible (if possible) 
   * at the top left corner of the visible view. 
   */
  void scrollToCell(int row, nsITreeColumn col);

  /**
   * Scrolls horizontally so that the specified column is 
   * at the left of the view (if possible).
   */
  void scrollToColumn(nsITreeColumn col);

  /**
   * Scroll to a specific horizontal pixel position.
   */
  void scrollToHorizontalPosition(int horizontalPosition);

  /**
   * Invalidation methods for fine-grained painting control.
   */
  void invalidate();

  void invalidateColumn(nsITreeColumn col);

  void invalidateRow(int index);

  void invalidateCell(int row, nsITreeColumn col);

  void invalidateRange(int startIndex, int endIndex);

  void invalidateColumnRange(int startIndex, int endIndex, nsITreeColumn col);

  /**
   * A hit test that can tell you what row the mouse is over.
   * returns -1 for invalid mouse coordinates.
   *
   * The coordinate system is the client coordinate system for the
   * document this boxObject lives in, and the units are CSS pixels.
   */
  int getRowAt(int x, int y);

  /**
   * A hit test that can tell you what cell the mouse is over.  Row is the row index
   * hit,  returns -1 for invalid mouse coordinates.  ColID is the column hit.
   * ChildElt is the pseudoelement hit: this can have values of
   * "cell", "twisty", "image", and "text".
   *
   * The coordinate system is the client coordinate system for the
   * document this boxObject lives in, and the units are CSS pixels.
   */
  void getCellAt(int x, int y, int[] row, nsITreeColumn[] col, String[] childElt);

  /** 
   * Find the coordinates of an element within a specific cell. 
   */
  void getCoordsForCellItem(int row, nsITreeColumn col, String element, int[] x, int[] y, int[] width, int[] height);

  /** 
   * Determine if the text of a cell is being cropped or not.
   */
  boolean isCellCropped(int row, nsITreeColumn col);

  /**
   * The view is responsible for calling these notification methods when
   * rows are added or removed.  Index is the position at which the new
   * rows were added or at which rows were removed.  For
   * non-contiguous additions/removals, this method should be called multiple times.
   */
  void rowCountChanged(int index, int count);

  /**
   * Notify the tree that the view is about to perform a batch
   * update, that is, add, remove or invalidate several rows at once.
   * This must be followed by calling endUpdateBatch(), otherwise the tree
   * will get out of sync.
   */
  void beginUpdateBatch();

  /**
   * Notify the tree that the view has completed a batch update.
   */
  void endUpdateBatch();

  /**
   * Called on a theme switch to flush out the tree's style and image caches.
   */
  void clearStyleAndImageCaches();

}