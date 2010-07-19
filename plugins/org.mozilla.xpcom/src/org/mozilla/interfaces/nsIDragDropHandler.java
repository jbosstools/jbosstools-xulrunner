/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsIDragDropHandler.idl
 */

package org.mozilla.interfaces;

/**
 * @status UNDER_REVIEW
 */
/**
 * Interface for communicating with the built-in drag and drop
 * implementation in the content area. Use this to register where
 * the listeners should attach (something that implements
 * |nsPIDOMEventTarget| which is what we end up using under the hood).
 */
public interface nsIDragDropHandler extends nsISupports {

  String NS_IDRAGDROPHANDLER_IID =
    "{4f418f58-f834-4736-a755-e0395bedca9d}";

  /**
   * Attach drag handlers to receiver specified by |attachPoint| and
   * specify callbacks to allow overriding of the built-in behaviors.
   *
   * @param attachPoint hookup listeners to this location
   * @param navigator loads dropped urls via this interface. If NULL, 
   *                   the client must handle the drop itself, either
   *                   through the method provided via |overrideDrop| or
   *                   by letting the event bubble up through the DOM.
   */
  void hookupTo(nsIDOMEventTarget attachPoint, nsIWebNavigation navigator);

  /**
   * Unregister all handlers related to drag&drop
   */
  void detach();

}