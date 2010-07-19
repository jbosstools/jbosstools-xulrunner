/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/base/nsILoadContext.idl
 */

package org.mozilla.interfaces;

/**
 * An nsILoadContext represents the context of a load.  This interface
 * can be queried for various information about where the load is
 * happening.
 */
public interface nsILoadContext extends nsISupports {

  String NS_ILOADCONTEXT_IID =
    "{314d8a54-1caf-4721-94d7-f6c82d9b82ed}";

  /**
   * associatedWindow is the window with which the load is associated, if any.
   * Note that the load may be triggered by a document which is different from
   * the document in associatedWindow, and in fact the source of the load need
   * not be same-origin with the document in associatedWindow.  This attribute
   * may be null if there is no associated window.
   */
  nsIDOMWindow getAssociatedWindow();

  /**
   * topWindow is the top window which is of same type as associatedWindow.
   * This is equivalent to associatedWindow.top, but is provided here as a
   * convenience.  All the same caveats as associatedWindow of apply, of
   * course.  This attribute may be null if there is no associated window.
   */
  nsIDOMWindow getTopWindow();

  /**
   * Check whether the load is happening in a particular type of application.
   *
   * @param an application type.  For now, the constants to be passed here are
   *        the nsIDocShell APP_TYPE_* constants.
   *
   * @return whether there is some ancestor of the associatedWindow that is of
   *         the given app type.
   */
  boolean isAppOfType(long appType);

  /**
   * True if the load context is content (as opposed to chrome).  This is
   * determined based on the type of window the load is performed in, NOT based
   * on any URIs that might be around.
   */
  boolean getIsContent();

}