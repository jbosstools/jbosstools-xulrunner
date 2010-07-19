/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsISelectionPrivate.idl
 */

package org.mozilla.interfaces;

public interface nsISelectionPrivate extends nsISupports {

  String NS_ISELECTIONPRIVATE_IID =
    "{98552206-ad7a-4d2d-8ce3-b6fa2389298b}";

  short ENDOFPRECEDINGLINE = 0;

  short STARTOFNEXTLINE = 1;

  boolean getInterlinePosition();

  void setInterlinePosition(boolean aInterlinePosition);

  void startBatchChanges();

  void endBatchChanges();

  nsIEnumerator getEnumerator();

  String toStringWithFormat(String formatType, long flags, int wrapColumn);

  void addSelectionListener(nsISelectionListener newListener);

  void removeSelectionListener(nsISelectionListener listenerToRemove);

  int TABLESELECTION_NONE = 0;

  int TABLESELECTION_CELL = 1;

  int TABLESELECTION_ROW = 2;

  int TABLESELECTION_COLUMN = 3;

  int TABLESELECTION_TABLE = 4;

  int TABLESELECTION_ALLCELLS = 5;

  /** Test if supplied range points to a single table element:
      *    Result is one of above constants. "None" means
      *    a table element isn't selected.
      */
  int getTableSelectionType(nsIDOMRange range);

}