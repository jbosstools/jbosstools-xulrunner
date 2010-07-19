/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/base/nsIEditorDocShell.idl
 */

package org.mozilla.interfaces;

/**
 * nsIEditorDocShell provides a way to get an editor from
 * a specific frame in a docShell hierarchy. It is intended
 * to be only used internally. Use nsIEditingShell.getEditorForFrame
 * from out side.
 */
public interface nsIEditorDocShell extends nsISupports {

  String NS_IEDITORDOCSHELL_IID =
    "{3bdb8f01-f141-11d4-a73c-fba4aba8a3fc}";

  nsIEditor getEditor();

  void setEditor(nsIEditor aEditor);

  boolean getEditable();

  boolean getHasEditingSession();

  /**
     * Make this docShell editable, setting a flag that causes
     * an editor to get created, either immediately, or after
     * a url has been loaded.
     *      @param  inWaitForUriLoad    true to wait for a URI before
     *                                  creating the editor.
     */
  void makeEditable(boolean inWaitForUriLoad);

}