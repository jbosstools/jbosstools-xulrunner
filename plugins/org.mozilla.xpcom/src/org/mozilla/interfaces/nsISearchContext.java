/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpfe/components/find/public/nsISearchContext.idl
 */

package org.mozilla.interfaces;

public interface nsISearchContext extends nsISupports {

  String NS_ISEARCHCONTEXT_IID =
    "{31aba0f0-2d93-11d3-8069-00600811a9c3}";

  String getSearchString();

  void setSearchString(String aSearchString);

  String getReplaceString();

  void setReplaceString(String aReplaceString);

  boolean getSearchBackwards();

  void setSearchBackwards(boolean aSearchBackwards);

  boolean getCaseSensitive();

  void setCaseSensitive(boolean aCaseSensitive);

  boolean getWrapSearch();

  void setWrapSearch(boolean aWrapSearch);

  nsIDOMWindowInternal getTargetWindow();

  nsIDOMWindowInternal getFindDialog();

  void setFindDialog(nsIDOMWindowInternal aFindDialog);

  nsIDOMWindowInternal getReplaceDialog();

  void setReplaceDialog(nsIDOMWindowInternal aReplaceDialog);

}