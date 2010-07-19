/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/base/nsIDocShellTreeItem.idl
 */

package org.mozilla.interfaces;

public interface nsIDocShellTreeItem extends nsIDocShellTreeNode {

  String NS_IDOCSHELLTREEITEM_IID =
    "{09b54ec1-d98a-49a9-bc95-3219e8b55089}";

  /**
 * The nsIDocShellTreeItem supplies the methods that are required of any item
 * that wishes to be able to live within the docshell tree either as a middle
 * node or a leaf. 
 */
  String getName();

  /**
 * The nsIDocShellTreeItem supplies the methods that are required of any item
 * that wishes to be able to live within the docshell tree either as a middle
 * node or a leaf. 
 */
  void setName(String aName);

  /**
         * Compares the provided name against the item's name and
         * returns the appropriate result.
         *
         * @return <CODE>PR_TRUE</CODE> if names match;
         *         <CODE>PR_FALSE</CODE> otherwise.
         */
  boolean nameEquals(String name);

  int typeChrome = 0;

  int typeContent = 1;

  int typeContentWrapper = 2;

  int typeChromeWrapper = 3;

  int typeAll = 2147483647;

  int getItemType();

  void setItemType(int aItemType);

  nsIDocShellTreeItem getParent();

  nsIDocShellTreeItem getSameTypeParent();

  nsIDocShellTreeItem getRootTreeItem();

  nsIDocShellTreeItem getSameTypeRootTreeItem();

  nsIDocShellTreeItem findItemWithName(String name, nsISupports aRequestor, nsIDocShellTreeItem aOriginalRequestor);

  nsIDocShellTreeOwner getTreeOwner();

}