/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/base/nsIContentViewer.idl
 */

package org.mozilla.interfaces;

public interface nsIContentViewer extends nsISupports {

  String NS_ICONTENTVIEWER_IID =
    "{08665a60-b398-11de-8a39-0800200c9a66}";

  nsISupports getContainer();

  void setContainer(nsISupports aContainer);

  void loadStart(nsISupports aDoc);

  void loadComplete(long aStatus);

  /**
   * Checks if the document wants to prevent unloading by firing beforeunload on
   * the document, and if it does, prompts the user. The result is returned.
   *
   * @param aCallerClosesWindow indicates that the current caller will close the
   *        window. If the method returns true, all subsequent calls will be
   *        ignored.
   */
  boolean permitUnload(boolean aCallerClosesWindow);

  /**
   * Works in tandem with permitUnload, if the caller decides not to close the
   * window it indicated it will, it is the caller's responsibility to reset
   * that with this method.
   *
   * @Note this method is only meant to be called on documents for which the
   *  caller has indicated that it will close the window. If that is not the case
   *  the behavior of this method is undefined.
   */
  void resetCloseWindow();

  void pageHide(boolean isUnload);

  /**
   * All users of a content viewer are responsible for calling both
   * close() and destroy(), in that order. 
   *
   * close() should be called when the load of a new page for the next
   * content viewer begins, and destroy() should be called when the next
   * content viewer replaces this one.
   *
   * |historyEntry| sets the session history entry for the content viewer.  If
   * this is null, then Destroy() will be called on the document by close().
   * If it is non-null, the document will not be destroyed, and the following
   * actions will happen when destroy() is called (*):
   *  - Sanitize() will be called on the viewer's document
   *  - The content viewer will set the contentViewer property on the
   *    history entry, and release its reference (ownership reversal).
   *  - hide() will be called, and no further destruction will happen.
   *
   *  (*) unless the document is currently being printed, in which case
   *      it will never be saved in session history.
   *
   */
  void close(nsISHEntry historyEntry);

  void destroy();

  void stop();

  nsIDOMDocument getDOMDocument();

  void setDOMDocument(nsIDOMDocument aDOMDocument);

  void move(int aX, int aY);

  void show();

  void hide();

  boolean getEnableRendering();

  void setEnableRendering(boolean aEnableRendering);

  boolean getSticky();

  void setSticky(boolean aSticky);

  boolean requestWindowClose();

  /**
   * Attach the content viewer to its DOM window and docshell.
   * @param aState A state object that might be useful in attaching the DOM
   *               window.
   * @param aSHEntry The history entry that the content viewer was stored in.
   *                 The entry must have the docshells for all of the child
   *                 documents stored in its child shell list.
   */
  void open(nsISupports aState, nsISHEntry aSHEntry);

  /**
   * Clears the current history entry.  This is used if we need to clear out
   * the saved presentation state.
   */
  void clearHistoryEntry();

  void setPageMode(boolean aPageMode, nsIPrintSettings aPrintSettings);

  /**
   * Get the history entry that this viewer will save itself into when
   * destroyed.  Can return null
   */
  nsISHEntry getHistoryEntry();

}