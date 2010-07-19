/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/browser/webBrowser/nsIContextMenuListener2.idl
 */

package org.mozilla.interfaces;

/**
 * nsIContextMenuListener2
 *
 * This is an extended version of nsIContextMenuListener
 * It provides a helper class, nsIContextMenuInfo, to allow access to
 * background images as well as various utilities.
 *
 * @see nsIContextMenuListener
 * @see nsIContextMenuInfo
 *
 * @status UNDER_REVIEW
 */
public interface nsIContextMenuListener2 extends nsISupports {

  String NS_ICONTEXTMENULISTENER2_IID =
    "{7fb719b3-d804-4964-9596-77cf924ee314}";

  /** Flag. No context. */
  long CONTEXT_NONE = 0L;

  /** Flag. Context is a link element. */
  long CONTEXT_LINK = 1L;

  /** Flag. Context is an image element. */
  long CONTEXT_IMAGE = 2L;

  /** Flag. Context is the whole document. */
  long CONTEXT_DOCUMENT = 4L;

  /** Flag. Context is a text area element. */
  long CONTEXT_TEXT = 8L;

  /** Flag. Context is an input element. */
  long CONTEXT_INPUT = 16L;

  /** Flag. Context is a background image. */
  long CONTEXT_BACKGROUND_IMAGE = 32L;

  /**
   * Called when the browser receives a context menu event (e.g. user is right-mouse
   * clicking somewhere on the document). The combination of flags, along with the
   * attributes of <CODE>aUtils</CODE>, indicate where and what was clicked on.
   *
   * The following table describes what context flags and node combinations are
   * possible.
   *
   * aContextFlags                  aUtils.targetNode
   *
   * CONTEXT_LINK                   <A>
   * CONTEXT_IMAGE                  <IMG>
   * CONTEXT_IMAGE | CONTEXT_LINK   <IMG> with <A> as an ancestor
   * CONTEXT_INPUT                  <INPUT>
   * CONTEXT_INPUT | CONTEXT_IMAGE  <INPUT> with type=image
   * CONTEXT_TEXT                   <TEXTAREA>
   * CONTEXT_DOCUMENT               <HTML>
   * CONTEXT_BACKGROUND_IMAGE       <HTML> with background image
   *
   * @param aContextFlags           Flags indicating the kind of context.
   * @param aUtils                  Context information and helper utilities.
   *
   * @see nsIContextMenuInfo
   */
  void onShowContextMenu(long aContextFlags, nsIContextMenuInfo aUtils);

}