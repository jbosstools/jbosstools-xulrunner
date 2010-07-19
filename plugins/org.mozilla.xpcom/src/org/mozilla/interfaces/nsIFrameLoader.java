/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsIFrameLoader.idl
 */

package org.mozilla.interfaces;

public interface nsIFrameLoader extends nsISupports {

  String NS_IFRAMELOADER_IID =
    "{d675c531-6bdc-417c-b176-635060105f07}";

  /**
   * Get the docshell from the frame loader.
   */
  nsIDocShell getDocShell();

  /**
   * Start loading the frame. This method figures out what to load
   * from the owner content in the frame loader.
   */
  void loadFrame();

  /**
   * Loads the specified URI in this frame. Behaves identically to loadFrame,
   * except that this method allows specifying the URI to load.
   */
  void loadURI(nsIURI aURI);

  /**
   * Destroy the frame loader and everything inside it. This will
   * clear the weak owner content reference.
   */
  void destroy();

  /**
   * Find out whether the loader's frame is at too great a depth in
   * the frame tree.  This can be used to decide what operations may
   * or may not be allowed on the loader's docshell.
   */
  boolean getDepthTooGreat();

}