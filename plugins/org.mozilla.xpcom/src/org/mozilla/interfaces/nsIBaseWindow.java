/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/widget/public/nsIBaseWindow.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIBaseWindow describes a generic window and basic operations that 
 * can be performed on it.  This is not to be a complete windowing interface
 * but rather a common set that nearly all windowed objects support.    
 */
public interface nsIBaseWindow extends nsISupports {

  String NS_IBASEWINDOW_IID =
    "{046bc8a0-8015-11d3-af70-00a024ffc08c}";

  void initWindow(long parentNativeWindow, long parentWidget, int x, int y, int cx, int cy);

  void create();

  void destroy();

  void setPosition(int x, int y);

  void getPosition(int[] x, int[] y);

  void setSize(int cx, int cy, boolean fRepaint);

  void getSize(int[] cx, int[] cy);

  void setPositionAndSize(int x, int y, int cx, int cy, boolean fRepaint);

  void getPositionAndSize(int[] x, int[] y, int[] cx, int[] cy);

  /** 
	 * Tell the window to repaint itself
	 * @param aForce - if true, repaint immediately
	 *                 if false, the window may defer repainting as it sees fit.
	 */
  void repaint(boolean force);

  long getParentWidget();

  void setParentWidget(long aParentWidget);

  long getParentNativeWindow();

  void setParentNativeWindow(long aParentNativeWindow);

  boolean getVisibility();

  void setVisibility(boolean aVisibility);

  boolean getEnabled();

  void setEnabled(boolean aEnabled);

  /** set blurSuppression to true to suppress handling of blur events.
     *  set it false to re-enable them. query it to determine whether
     *  blur events are suppressed. The implementation should allow
     *  for blur events to be suppressed multiple times.
     */
  boolean getBlurSuppression();

  /** set blurSuppression to true to suppress handling of blur events.
     *  set it false to re-enable them. query it to determine whether
     *  blur events are suppressed. The implementation should allow
     *  for blur events to be suppressed multiple times.
     */
  void setBlurSuppression(boolean aBlurSuppression);

  long getMainWidget();

  /**
	* Give the window focus.
	*/
  void setFocus();

  String getTitle();

  void setTitle(String aTitle);

}