/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/browser/webBrowser/nsIEmbeddingSiteWindow2.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIEmbeddingSiteWindow is implemented by the embedder to provide
 * Gecko with the means to call up to the host to perform basic windowing
 * operations such as resizing and showing.
 *
 * Changes from version 1 to version 2:
 * A new method: blur()
 */
public interface nsIEmbeddingSiteWindow2 extends nsIEmbeddingSiteWindow {

  String NS_IEMBEDDINGSITEWINDOW2_IID =
    "{e932bf55-0a64-4beb-923a-1f32d3661044}";

  /**
     * Blur the window. This should unfocus the window and send an onblur event.
     */
  void blur();

}