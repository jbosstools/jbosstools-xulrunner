/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/layout/inspector/public/inIDOMView.idl
 */

package org.mozilla.interfaces;

public interface inIDOMView extends nsISupports {

  String INIDOMVIEW_IID =
    "{fbb67442-27a3-483c-8eb2-29c3eed7514c}";

  nsIDOMNode getRootNode();

  void setRootNode(nsIDOMNode aRootNode);

  boolean getShowAnonymousContent();

  void setShowAnonymousContent(boolean aShowAnonymousContent);

  boolean getShowSubDocuments();

  void setShowSubDocuments(boolean aShowSubDocuments);

  boolean getShowWhitespaceNodes();

  void setShowWhitespaceNodes(boolean aShowWhitespaceNodes);

  boolean getShowAccessibleNodes();

  void setShowAccessibleNodes(boolean aShowAccessibleNodes);

  long getWhatToShow();

  void setWhatToShow(long aWhatToShow);

  nsIDOMNode getNodeFromRowIndex(int rowIndex);

  int getRowIndexFromNode(nsIDOMNode node);

  void rebuild();

}