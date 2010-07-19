/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/base/nsIDocShellTreeNode.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDocShellTreeNode supplies the methods for interacting with children
 * of a docshell.  These are essentially the methods that turn a single docshell
 * into a docshell tree. 
 */
public interface nsIDocShellTreeNode extends nsISupports {

  String NS_IDOCSHELLTREENODE_IID =
    "{37f1ab73-f224-44b1-82f0-d2834ab1cec0}";

  int getChildCount();

  void addChild(nsIDocShellTreeItem child);

  void removeChild(nsIDocShellTreeItem child);

  /**
	 * Return the child at the index requested.  This is 0-based.
	 *
	 * @throws NS_ERROR_UNEXPECTED if the index is out of range
	 */
  nsIDocShellTreeItem getChildAt(int index);

  nsIDocShellTreeItem findChildWithName(String aName, boolean aRecurse, boolean aSameType, nsIDocShellTreeItem aRequestor, nsIDocShellTreeItem aOriginalRequestor);

}