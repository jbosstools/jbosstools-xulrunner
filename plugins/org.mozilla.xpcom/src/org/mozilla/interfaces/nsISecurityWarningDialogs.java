/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/security/manager/boot/public/nsISecurityWarningDialogs.idl
 */

package org.mozilla.interfaces;

/**
 * Functions that display warnings for transitions between secure
 * and insecure pages, posts to insecure servers etc.
 *
 * @status FROZEN
 */
public interface nsISecurityWarningDialogs extends nsISupports {

  String NS_ISECURITYWARNINGDIALOGS_IID =
    "{1c399d06-1dd2-11b2-bc58-c87cbcacdb78}";

  /**
   *  Inform the user that a transition 
   *    from an insecure page 
   *    to a secure page
   *  is happening.
   *
   *  @param ctx A user interface context.
   *
   *  @return true if the user confirms to continue
   */
  boolean confirmEnteringSecure(nsIInterfaceRequestor ctx);

  /**
   *  Inform the user that a transition 
   *    from an insecure page 
   *    or from a secure page
   *    to a weak security page
   *  is happening.
   *
   *  @param ctx A user interface context.
   *
   *  @return true if the user confirms to continue
   */
  boolean confirmEnteringWeak(nsIInterfaceRequestor ctx);

  /**
   *  Inform the user that a transition 
   *    from a secure page 
   *    to an insecure page
   *  is happening.
   *
   *  @param ctx A user interface context.
   *
   *  @return true if the user confirms to continue
   */
  boolean confirmLeavingSecure(nsIInterfaceRequestor ctx);

  /**
   *  Inform the user the currently displayed page
   *  contains some secure and some insecure page components.
   *
   *  @param ctx A user interface context.
   *
   *  @return true if the user decides to show insecure objects.
   */
  boolean confirmMixedMode(nsIInterfaceRequestor ctx);

  /**
   *  Inform the user that information is being submitted
   *  to an insecure page.
   *
   *  @param ctx A user interface context.
   *
   *  @return true if the user confirms to submit.
   */
  boolean confirmPostToInsecure(nsIInterfaceRequestor ctx);

  /**
   *  Inform the user: Although the currently displayed
   *  page was loaded using a secure connection, and the UI probably
   *  currently indicates a secure page, 
   *  that information is being submitted to an insecure page.
   *
   *  @param ctx A user interface context.
   *
   *  @return true if the user confirms to submit.
   */
  boolean confirmPostToInsecureFromSecure(nsIInterfaceRequestor ctx);

}