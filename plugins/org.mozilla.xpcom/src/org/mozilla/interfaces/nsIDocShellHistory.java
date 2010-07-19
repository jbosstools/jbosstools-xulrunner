/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/base/nsIDocShellHistory.idl
 */

package org.mozilla.interfaces;

public interface nsIDocShellHistory extends nsISupports {

  String NS_IDOCSHELLHISTORY_IID =
    "{89caa9f0-8b1c-47fb-b0d3-f0aef0bff749}";

  /**
   * Get the SHEntry associated with a child docshell
   */
  nsISHEntry getChildSHEntry(int aChildOffset);

  /**
   * Add a Child SHEntry for a frameset page
   */
  void addChildSHEntry(nsISHEntry aCloneReference, nsISHEntry aHistoryEntry, int aChildOffset);

  boolean getUseGlobalHistory();

  void setUseGlobalHistory(boolean aUseGlobalHistory);

}