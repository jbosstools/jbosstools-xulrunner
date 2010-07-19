/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/base/nsIDocShellTreeOwner.idl
 */

package org.mozilla.interfaces;

public interface nsIDocShellTreeOwner extends nsISupports {

  String NS_IDOCSHELLTREEOWNER_IID =
    "{bc0eb30e-656e-491e-a7ae-7f460b660c8d}";

  nsIDocShellTreeItem findItemWithName(String name, nsIDocShellTreeItem aRequestor, nsIDocShellTreeItem aOriginalRequestor);

  /**
	 * Called when a content shell is added to the docshell tree.  This is
	 * _only_ called for "root" content shells (that is, ones whose parent is a
	 * chrome shell).
	 *
	 * @param aContentShell the shell being added.
	 * @param aPrimary whether the shell is primary.
	 * @param aTargetable whether the shell can be a target for named window
	 *					targeting.
	 * @param aID the "id" of the shell.  What this actually means is
	 *			undefined. Don't rely on this for anything.
	 */
  void contentShellAdded(nsIDocShellTreeItem aContentShell, boolean aPrimary, boolean aTargetable, String aID);

  /**
	 * Called when a content shell is removed from the docshell tree.  This is
	 * _only_ called for "root" content shells (that is, ones whose parent is a
	 * chrome shell).  Note that if aContentShell was never added,
	 * contentShellRemoved should just do nothing.
	 *
	 * @param aContentShell the shell being removed.
	 */
  void contentShellRemoved(nsIDocShellTreeItem aContentShell);

  nsIDocShellTreeItem getPrimaryContentShell();

  void sizeShellTo(nsIDocShellTreeItem shell, int cx, int cy);

  void setPersistence(boolean aPersistPosition, boolean aPersistSize, boolean aPersistSizeMode);

  void getPersistence(boolean[] aPersistPosition, boolean[] aPersistSize, boolean[] aPersistSizeMode);

}