/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/base/nsIDOMWindow.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMWindow extends nsISupports {

  String NS_IDOMWINDOW_IID =
    "{a6cf906b-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMWindow interface is the primary interface for a DOM
 * window object. It represents a single window object that may
 * contain child windows if the document in the window contains a
 * HTML frameset document or if the document contains iframe elements.
 *
 * This interface is not officially defined by any standard bodies, it
 * originates from the defacto DOM Level 0 standard.
 *
 * @status FROZEN
 */
/**
   * Accessor for the document in this window.
   */
  nsIDOMDocument getDocument();

  /**
   * Accessor for this window's parent window, or the window itself if
   * there is no parent, or if the parent is of different type
   * (i.e. this does not cross chrome-content boundaries).
   */
  nsIDOMWindow getParent();

  /**
   * Accessor for the root of this hierarchy of windows. This root may
   * be the window itself if there is no parent, or if the parent is
   * of different type (i.e. this does not cross chrome-content
   * boundaries).
   *
   * This property is "replaceable" in JavaScript */
  nsIDOMWindow getTop();

  /**
   * Accessor for the object that controls whether or not scrollbars
   * are shown in this window.
   *
   * This attribute is "replaceable" in JavaScript
   */
  nsIDOMBarProp getScrollbars();

  /**
   * Set/Get the name of this window.
   *
   * This attribute is "replaceable" in JavaScript
   */
  String getName();

  /**
   * Set/Get the name of this window.
   *
   * This attribute is "replaceable" in JavaScript
   */
  void setName(String aName);

  /**
   * Accessor for the current x scroll position in this window in
   * pixels.
   *
   * This attribute is "replaceable" in JavaScript
   */
  int getScrollX();

  /**
   * Accessor for the current y scroll position in this window in
   * pixels.
   *
   * This attribute is "replaceable" in JavaScript
   */
  int getScrollY();

  /**
   * Method for scrolling this window to an absolute pixel offset.
   */
  void scrollTo(int xScroll, int yScroll);

  /**
   * Method for scrolling this window to a pixel offset relative to
   * the current scroll position.
   */
  void scrollBy(int xScrollDif, int yScrollDif);

  /**
   * Method for accessing this window's selection object.
   */
  nsISelection getSelection();

  /**
   * Method for scrolling this window by a number of lines.
   */
  void scrollByLines(int numLines);

  /**
   * Method for scrolling this window by a number of pages.
   */
  void scrollByPages(int numPages);

  /**
   * Method for sizing this window to the content in the window.
   */
  void sizeToContent();

}