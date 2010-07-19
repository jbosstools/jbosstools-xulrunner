/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/webshell/public/nsIClipboardCommands.idl
 */

package org.mozilla.interfaces;

/**
 * An interface for embedding clients who wish to interact with
 * the system-wide OS clipboard. Mozilla does not use a private
 * clipboard, instead it places its data directly onto the system 
 * clipboard. The webshell implements this interface.
 *
 * @status FROZEN
 */
public interface nsIClipboardCommands extends nsISupports {

  String NS_ICLIPBOARDCOMMANDS_IID =
    "{b8100c90-73be-11d2-92a5-00105a1b0d64}";

  /**
   * Returns whether there is a selection and it is not read-only.
   *
   * @return <code>true</code> if the current selection can be cut,
   *          <code>false</code> otherwise.
   */
  boolean canCutSelection();

  /**
   * Returns whether there is a selection and it is copyable.
   *
   * @return <code>true</code> if there is a selection,
   *          <code>false</code> otherwise.
   */
  boolean canCopySelection();

  /**
   * Returns whether we can copy a link location.
   *
   * @return <code>true</code> if a link is selected,
   *           <code>false</code> otherwise.
   */
  boolean canCopyLinkLocation();

  /**
   * Returns whether we can copy an image location.
   *
   * @return <code>true</code> if an image is selected,
              <code>false</code> otherwise.
   */
  boolean canCopyImageLocation();

  /**
   * Returns whether we can copy an image's contents.
   *
   * @return <code>true</code> if an image is selected,
   *          <code>false</code> otherwise
   */
  boolean canCopyImageContents();

  /**
   * Returns whether the current contents of the clipboard can be
   * pasted and if the current selection is not read-only.
   *
   * @return <code>true</code> there is data to paste on the clipboard
   *          and the current selection is not read-only,
   *          <code>false</code> otherwise
   */
  boolean canPaste();

  /**
   * Cut the current selection onto the clipboard.
   */
  void cutSelection();

  /**
   * Copy the current selection onto the clipboard.
   */
  void copySelection();

  /**
   * Copy the link location of the current selection (e.g.,
   * the |href| attribute of a selected |a| tag).
   */
  void copyLinkLocation();

  /**
   * Copy the location of the selected image.
   */
  void copyImageLocation();

  /**
   * Copy the contents of the selected image.
   */
  void copyImageContents();

  /**
   * Paste the contents of the clipboard into the current selection.
   */
  void paste();

  /**
   * Select the entire contents.
   */
  void selectAll();

  /**
   * Clear the current selection (if any). Insertion point ends up
   * at beginning of current selection.
   */
  void selectNone();

}