/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/layout/xul/base/public/nsISliderListener.idl
 */

package org.mozilla.interfaces;

/**
 * Used for <scale> to listen to slider changes to avoid mutation listeners
 */
public interface nsISliderListener extends nsISupports {

  String NS_ISLIDERLISTENER_IID =
    "{e5b3074e-ee18-4538-83b9-2487d90a2a34}";

  /**
   * Called when the current, minimum or maximum value has been changed to
   * newValue. The which parameter will either be 'curpos', 'minpos' or 'maxpos'.
   * If userChanged is true, then the user changed ths slider, otherwise it
   * was changed via some other means.
   */
  void valueChanged(String which, int newValue, boolean userChanged);

  /**
   * Called when the user begins or ends dragging the thumb.
   */
  void dragStateChanged(boolean isDragging);

}