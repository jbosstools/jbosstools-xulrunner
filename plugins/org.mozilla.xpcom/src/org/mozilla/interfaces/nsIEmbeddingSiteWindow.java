/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/browser/webBrowser/nsIEmbeddingSiteWindow.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIEmbeddingSiteWindow is implemented by the embedder to provide
 * Gecko with the means to call up to the host to resize the window,
 * hide or show it and set/get its title.
 *
 * @status FROZEN
 */
public interface nsIEmbeddingSiteWindow extends nsISupports {

  String NS_IEMBEDDINGSITEWINDOW_IID =
    "{3e5432cd-9568-4bd1-8cbe-d50aba110743}";

  /**
     * Flag indicates that position of the top left corner of the outer area
     * is required/specified.
     *
     * @see setDimensions
     * @see getDimensions
     */
  long DIM_FLAGS_POSITION = 1L;

  /**
     * Flag indicates that the size of the inner area is required/specified.
     *
     * @note The inner and outer flags are mutually exclusive and it is
     *       invalid to combine them.
     *
     * @see setDimensions
     * @see getDimensions
     * @see DIM_FLAGS_SIZE_OUTER
     */
  long DIM_FLAGS_SIZE_INNER = 2L;

  /**
     * Flag indicates that the size of the outer area is required/specified.
     *
     * @see setDimensions
     * @see getDimensions
     * @see DIM_FLAGS_SIZE_INNER
     */
  long DIM_FLAGS_SIZE_OUTER = 4L;

  /**
     * Sets the dimensions for the window; the position & size. The
     * flags to indicate what the caller wants to set and whether the size
     * refers to the inner or outer area. The inner area refers to just
     * the embedded area, wheras the outer area can also include any 
     * surrounding chrome, window frame, title bar, and so on.
     *
     * @param flags  Combination of position, inner and outer size flags.
     * @param x      Left hand corner of the outer area.
     * @param y      Top corner of the outer area.
     * @param cx     Width of the inner or outer area.
     * @param cy     Height of the inner or outer area.
     *
     * @return <code>NS_OK</code> if operation was performed correctly;
     *         <code>NS_ERROR_UNEXPECTED</code> if window could not be
     *           destroyed;
     *         <code>NS_ERROR_INVALID_ARG</code> for bad flag combination
     *           or illegal dimensions.
     *
     * @see getDimensions
     * @see DIM_FLAGS_POSITION
     * @see DIM_FLAGS_SIZE_OUTER
     * @see DIM_FLAGS_SIZE_INNER
     */
  void setDimensions(long flags, int x, int y, int cx, int cy);

  /**
     * Gets the dimensions of the window. The caller may pass
     * <CODE>nsnull</CODE> for any value it is uninterested in receiving.
     *
     * @param flags  Combination of position, inner and outer size flag .
     * @param x      Left hand corner of the outer area; or <CODE>nsnull</CODE>.
     * @param y      Top corner of the outer area; or <CODE>nsnull</CODE>.
     * @param cx     Width of the inner or outer area; or <CODE>nsnull</CODE>.
     * @param cy     Height of the inner or outer area; or <CODE>nsnull</CODE>.
     *
     * @see setDimensions
     * @see DIM_FLAGS_POSITION
     * @see DIM_FLAGS_SIZE_OUTER
     * @see DIM_FLAGS_SIZE_INNER
     */
  void getDimensions(long flags, int[] x, int[] y, int[] cx, int[] cy);

  /**
     * Give the window focus.
     */
  void setFocus();

  /**
     * Visibility of the window.
     */
  boolean getVisibility();

  /**
     * Visibility of the window.
     */
  void setVisibility(boolean aVisibility);

  /**
     * Title of the window.
     */
  String getTitle();

  /**
     * Title of the window.
     */
  void setTitle(String aTitle);

  /**
     * Native window for the site's window. The implementor should copy the
     * native window object into the address supplied by the caller. The
     * type of the native window that the address refers to is  platform
     * and OS specific as follows:
     *
     * <ul>
     *   <li>On Win32 it is an <CODE>HWND</CODE>.</li>
     *   <li>On MacOS this is a <CODE>WindowPtr</CODE>.</li>
     *   <li>On GTK this is a <CODE>GtkWidget*</CODE>.</li>
     * </ul>
     */
  long getSiteWindow();

}