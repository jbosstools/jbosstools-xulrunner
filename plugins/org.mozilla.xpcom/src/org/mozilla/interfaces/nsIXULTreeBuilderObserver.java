/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/xul/templates/public/nsIXULTemplateBuilder.idl
 */

package org.mozilla.interfaces;

/**
 * nsIXULTreeBuilderObserver
 *  This interface allows clients of the XULTreeBuilder to define domain 
 *  specific handling of specific nsITreeView methods that 
 *  XULTreeBuilder does not implement.
 */
public interface nsIXULTreeBuilderObserver extends nsISupports {

  String NS_IXULTREEBUILDEROBSERVER_IID =
    "{57ced9a7-ec0b-4a0e-8aeb-5da32ebe951c}";

  int DROP_BEFORE = -1;

  int DROP_ON = 0;

  int DROP_AFTER = 1;

  /**
     * Methods used by the drag feedback code to determine if a drag is allowable at
     * the current location. To get the behavior where drops are only allowed on
     * items, such as the mailNews folder pane, always return false whe
     * the orientation is not DROP_ON.
     */
  boolean canDrop(int index, int orientation, nsIDOMDataTransfer dataTransfer);

  /**
     * Called when the user drops something on this view. The |orientation| param
     * specifies before/on/after the given |row|.
     */
  void onDrop(int row, int orientation, nsIDOMDataTransfer dataTransfer);

  /** 
     * Called when an item is opened or closed. 
     */
  void onToggleOpenState(int index);

  /** 
	 * Called when a header is clicked.
     */
  void onCycleHeader(String colID, nsIDOMElement elt);

  /**
     * Called when a cell in a non-selectable cycling column (e.g. 
     * unread/flag/etc.) is clicked.
     */
  void onCycleCell(int row, String colID);

  /** 
     * Called when selection in the tree changes
     */
  void onSelectionChanged();

  /**
     * A command API that can be used to invoke commands on the selection.  
     * The tree will automatically invoke this method when certain keys 
     * are pressed.  For example, when the DEL key is pressed, performAction 
     * will be called with the "delete" string. 
     */
  void onPerformAction(String action);

  /**
     * A command API that can be used to invoke commands on a specific row.
     */
  void onPerformActionOnRow(String action, int row);

  /**
     * A command API that can be used to invoke commands on a specific cell.
     */
  void onPerformActionOnCell(String action, int row, String colID);

}