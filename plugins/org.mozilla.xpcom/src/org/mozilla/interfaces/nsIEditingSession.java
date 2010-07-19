/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/composer/public/nsIEditingSession.idl
 */

package org.mozilla.interfaces;

public interface nsIEditingSession extends nsISupports {

  String NS_IEDITINGSESSION_IID =
    "{274cd32e-3675-47e1-9d8a-fc6504ded9ce}";

  /**
   *  Error codes when we fail to create an editor
   *  is placed in attribute editorStatus
   */
  int eEditorOK = 0;

  int eEditorCreationInProgress = 1;

  int eEditorErrorCantEditMimeType = 2;

  int eEditorErrorFileNotFound = 3;

  int eEditorErrorCantEditFramesets = 8;

  int eEditorErrorUnknown = 9;

  /**
   *  Status after editor creation and document loading
   *  Value is one of the above error codes
   */
  long getEditorStatus();

  /**
   *  Make this window editable
   *  @param aWindow nsIDOMWindow, the window the embedder needs to make editable
   *  @param aEditorType string, "html" "htmlsimple" "text" "textsimple"
   *  @param aMakeWholeDocumentEditable if PR_TRUE make the whole document in
   *                                    aWindow editable, otherwise it's the
   *                                    embedder who should make the document
   *                                    (or part of it) editable.
   *  @param aInteractive if PR_FALSE turn off scripting and plugins
   */
  void makeWindowEditable(nsIDOMWindow window, String aEditorType, boolean doAfterUriLoad, boolean aMakeWholeDocumentEditable, boolean aInteractive);

  /**
   *  Test whether a specific window has had its editable flag set; it may have an editor
   *  now, or will get one after the uri load.
   *  
   *  Use this, passing the content root window, to test if we've set up editing
   *  for this content.
   */
  boolean windowIsEditable(nsIDOMWindow window);

  /**
   *  Get the editor for this window. May return null
   */
  nsIEditor getEditorForWindow(nsIDOMWindow window);

  /** 
   *  Setup editor and related support objects
   */
  void setupEditorOnWindow(nsIDOMWindow window);

  /** 
   *   Destroy editor and related support objects
   */
  void tearDownEditorOnWindow(nsIDOMWindow window);

  void setEditorOnControllers(nsIDOMWindow aWindow, nsIEditor aEditor);

  /**
   * Disable scripts and plugins in aWindow.
   */
  void disableJSAndPlugins(nsIDOMWindow aWindow);

  /**
   * Restore JS and plugins (enable/disable them) according to the state they
   * were before the last call to disableJSAndPlugins.
   */
  void restoreJSAndPlugins(nsIDOMWindow aWindow);

  /**
   * Removes all the editor's controllers/listeners etc and makes the window
   * uneditable.
   */
  void detachFromWindow(nsIDOMWindow aWindow);

  /**
   * Undos detachFromWindow(), reattaches this editing session/editor
   * to the window.
   */
  void reattachToWindow(nsIDOMWindow aWindow);

}