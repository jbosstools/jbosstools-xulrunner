/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/shistory/public/nsISHContainer.idl
 */

package org.mozilla.interfaces;

/**
 * The nsISHEntryContainer. The interface to access child entries
 * of an nsISHEntry.
 * 
 */
public interface nsISHContainer extends nsISupports {

  String NS_ISHCONTAINER_IID =
    "{65281ba2-988a-11d3-bdc7-0050040a9b44}";

  /**
     * The current number of nsISHEntries which are immediate children of the 
	 * current SHEntry
     */
  int getChildCount();

  /**
	 * Add a new child SHEntry.  Adds to the end of the list.
	 */
  void addChild(nsISHEntry child, int offset);

  /**
	 * Removes a child SHEntry
	 */
  void removeChild(nsISHEntry child);

  /**
	 * Get child at an index
	 */
  nsISHEntry getChildAt(int index);

}