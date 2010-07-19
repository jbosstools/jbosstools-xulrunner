/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/base/nsIContentViewerEdit.idl
 */

package org.mozilla.interfaces;

public interface nsIContentViewerEdit extends nsISupports {

  String NS_ICONTENTVIEWEREDIT_IID =
    "{1691a02f-53b2-4cb8-8769-48e7efc908b8}";

  void search();

  boolean getSearchable();

  void clearSelection();

  void selectAll();

  void copySelection();

  boolean getCopyable();

  void copyLinkLocation();

  boolean getInLink();

  int COPY_IMAGE_TEXT = 1;

  int COPY_IMAGE_HTML = 2;

  int COPY_IMAGE_DATA = 4;

  int COPY_IMAGE_ALL = -1;

  void copyImage(int aCopyFlags);

  boolean getInImage();

  void cutSelection();

  boolean getCutable();

  void paste();

  boolean getPasteable();

  String getContents(String aMimeType, boolean aSelectionOnly);

  boolean getCanGetContents();

}