/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/layout/xul/base/src/tree/public/nsITreeView.idl
 */

package org.mozilla.interfaces;

public interface nsITreeView extends nsISupports {

  String NS_ITREEVIEW_IID =
    "{c06dc4d3-63a2-4422-a0a3-5f2eddeca8c1}";

  /**
   * The total number of rows in the tree (including the offscreen rows).
   */
  int getRowCount();

  /**
   * The selection for this view.
   */
  nsITreeSelection getSelection();

  /**
   * The selection for this view.
   */
  void setSelection(nsITreeSelection aSelection);

  /** 
   * An atomized list of properties for a given row.  Each property, x, that
   * the view gives back will cause the pseudoclass :moz-tree-row-x
   * to be matched on the pseudoelement ::moz-tree-row.
   */
  void getRowProperties(int index, nsISupportsArray properties);

  /**
   * An atomized list of properties for a given cell.  Each property, x, that
   * the view gives back will cause the pseudoclass :moz-tree-cell-x
   * to be matched on the ::moz-tree-cell pseudoelement.
   */
  void getCellProperties(int row, nsITreeColumn col, nsISupportsArray properties);

  /**
   * Called to get properties to paint a column background.  For shading the sort
   * column, etc.
   */
  void getColumnProperties(nsITreeColumn col, nsISupportsArray properties);

  /**
   * Methods that can be used to test whether or not a twisty should be drawn,
   * and if so, whether an open or closed twisty should be used.
   */
  boolean isContainer(int index);

  boolean isContainerOpen(int index);

  boolean isContainerEmpty(int index);

  /**
   * isSeparator is used to determine if the row at index is a separator.
   * A value of true will result in the tree drawing a horizontal separator.
   * The tree uses the ::moz-tree-separator pseudoclass to draw the separator.
   */
  boolean isSeparator(int index);

  /**
   * Specifies if there is currently a sort on any column. Used mostly by dragdrop
   * to affect drop feedback.
   */
  boolean isSorted();

  short DROP_BEFORE = -1;

  short DROP_ON = 0;

  short DROP_AFTER = 1;

  /**
   * Methods used by the drag feedback code to determine if a drag is allowable at
   * the current location. To get the behavior where drops are only allowed on
   * items, such as the mailNews folder pane, always return false when
   * the orientation is not DROP_ON.
   */
  boolean canDrop(int index, int orientation, nsIDOMDataTransfer dataTransfer);

  /**
   * Called when the user drops something on this view. The |orientation| param
   * specifies before/on/after the given |row|.
   */
  void drop(int row, int orientation, nsIDOMDataTransfer dataTransfer);

  /**
   * Methods used by the tree to draw thread lines in the tree.
   * getParentIndex is used to obtain the index of a parent row.
   * If there is no parent row, getParentIndex returns -1.
   */
  int getParentIndex(int rowIndex);

  /**
   * hasNextSibling is used to determine if the row at rowIndex has a nextSibling
   * that occurs *after* the index specified by afterIndex.  Code that is forced
   * to march down the view looking at levels can optimize the march by starting
   * at afterIndex+1.
   */
  boolean hasNextSibling(int rowIndex, int afterIndex);

  /**
   * The level is an integer value that represents
   * the level of indentation.  It is multiplied by the width specified in the 
   * :moz-tree-indentation pseudoelement to compute the exact indendation.
   */
  int getLevel(int index);

  /**
   * The image path for a given cell. For defining an icon for a cell.
   * If the empty string is returned, the :moz-tree-image pseudoelement
   * will be used.
   */
  String getImageSrc(int row, nsITreeColumn col);

  /**
   * The progress mode for a given cell. This method is only called for
   * columns of type |progressmeter|.
   */
  short PROGRESS_NORMAL = 1;

  short PROGRESS_UNDETERMINED = 2;

  short PROGRESS_NONE = 3;

  int getProgressMode(int row, nsITreeColumn col);

  /**
   * The value for a given cell. This method is only called for columns
   * of type other than |text|.
   */
  String getCellValue(int row, nsITreeColumn col);

  /**
   * The text for a given cell.  If a column consists only of an image, then
   * the empty string is returned.  
   */
  String getCellText(int row, nsITreeColumn col);

  /**
   * Called during initialization to link the view to the front end box object.
   */
  void setTree(nsITreeBoxObject tree);

  /**
   * Called on the view when an item is opened or closed.
   */
  void toggleOpenState(int index);

  /**
   * Called on the view when a header is clicked.
   */
  void cycleHeader(nsITreeColumn col);

  /**
   * Should be called from a XUL onselect handler whenever the selection changes.
   */
  void selectionChanged();

  /**
   * Called on the view when a cell in a non-selectable cycling column (e.g., unread/flag/etc.) is clicked.
   */
  void cycleCell(int row, nsITreeColumn col);

  /**
   * isEditable is called to ask the view if the cell contents are editable.
   * A value of true will result in the tree popping up a text field when 
   * the user tries to inline edit the cell.
   */
  boolean isEditable(int row, nsITreeColumn col);

  /**
   * isSelectable is called to ask the view if the cell is selectable.
   * This method is only called if the selection style is |cell| or |text|.
   * XXXvarga shouldn't this be called isCellSelectable?
   */
  boolean isSelectable(int row, nsITreeColumn col);

  /**
   * setCellValue is called when the value of the cell has been set by the user.
   * This method is only called for columns of type other than |text|.
   */
  void setCellValue(int row, nsITreeColumn col, String value);

  /**
   * setCellText is called when the contents of the cell have been edited by the user.
   */
  void setCellText(int row, nsITreeColumn col, String value);

  /**
   * A command API that can be used to invoke commands on the selection.  The tree
   * will automatically invoke this method when certain keys are pressed.  For example,
   * when the DEL key is pressed, performAction will be called with the "delete" string.
   */
  void performAction(String action);

  /**
   * A command API that can be used to invoke commands on a specific row.
   */
  void performActionOnRow(String action, int row);

  /**
   * A command API that can be used to invoke commands on a specific cell.
   */
  void performActionOnCell(String action, int row, nsITreeColumn col);

}