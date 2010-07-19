/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/base/nsITextScroll.idl
 */

package org.mozilla.interfaces;

/**
 * The nsITextScroll is an interface that can be implemented by a control that
 * supports text scrolling. 
 */
public interface nsITextScroll extends nsISupports {

  String NS_ITEXTSCROLL_IID =
    "{067b28a0-877f-11d3-af7e-00a024ffc08c}";

  /**
   * Scroll the view up or down by aNumLines lines. positive
   * values move down in the view. Prevents scrolling off the
   * end of the view.
   * @param numLines number of lines to scroll the view by
   */
  void scrollByLines(int numLines);

  /**
   * Scroll the view up or down by numPages pages. a page
   * is considered to be the amount displayed by the clip view.
   * positive values move down in the view. Prevents scrolling
   * off the end of the view.
   * @param numPages number of pages to scroll the view by
   */
  void scrollByPages(int numPages);

}