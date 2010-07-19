/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/shistory/public/nsIHistoryEntry.idl
 */

package org.mozilla.interfaces;

public interface nsIHistoryEntry extends nsISupports {

  String NS_IHISTORYENTRY_IID =
    "{a41661d4-1417-11d5-9882-00c04fa02f40}";

  /** 
     * A readonly property that returns the URI
     * of the current entry. The object returned is
     * of type nsIURI
     */
  nsIURI getURI();

  /** 
     * A readonly property that returns the title
     * of the current entry.  The object returned
     * is a encoded string
     */
  String getTitle();

  /** 
     * A readonly property that returns a boolean
     * flag which indicates if the entry was created as a 
     * result of a subframe navigation. This flag will be
     * 'false' when a frameset page is visited for
     * the first time. This flag will be 'true' for all
     * history entries created as a result of a subframe
     * navigation.
     */
  boolean getIsSubFrame();

}