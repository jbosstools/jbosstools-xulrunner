/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/typeaheadfind/public/nsITypeAheadFind.idl
 */

package org.mozilla.interfaces;

/****************************** nsTypeAheadFind ******************************/
public interface nsITypeAheadFind extends nsISupports {

  String NS_ITYPEAHEADFIND_IID =
    "{0749a445-19d3-4eb9-9d66-78eca8c6f604}";

  /****************************** Initializer ******************************/
  void init(nsIDocShell aDocShell);

  /***************************** Core functions ****************************/
  int find(String aSearchString, boolean aLinksOnly);

  int findAgain(boolean findBackwards, boolean aLinksOnly);

  /**************************** Helper functions ***************************/
  void setDocShell(nsIDocShell aDocShell);

  void setSelectionModeAndRepaint(short toggle);

  void collapseSelection();

  /******************************* Attributes ******************************/
  String getSearchString();

  boolean getCaseSensitive();

  void setCaseSensitive(boolean aCaseSensitive);

  nsIDOMElement getFoundLink();

  nsIDOMElement getFoundEditable();

  nsIDOMWindow getCurrentWindow();

  /******************************* Constants *******************************/
  int FIND_FOUND = 0;

  int FIND_NOTFOUND = 1;

  int FIND_WRAPPED = 2;

}