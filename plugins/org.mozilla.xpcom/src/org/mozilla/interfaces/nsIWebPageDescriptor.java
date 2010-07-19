/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/base/nsIWebPageDescriptor.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIWebPageDescriptor interface allows content being displayed in one
 * window to be loaded into another window without refetching it from the
 * network.
 *
 * @status UNDER_REVIEW
 */
public interface nsIWebPageDescriptor extends nsISupports {

  String NS_IWEBPAGEDESCRIPTOR_IID =
    "{6f30b676-3710-4c2c-80b1-0395fb26516e}";

  long DISPLAY_AS_SOURCE = 1L;

  long DISPLAY_NORMAL = 2L;

  /**
  * Tells the object to load the page specified by the page descriptor
  *
  * @return NS_OK            - 
  *         NS_ERROR_FAILURE - 
  */
  void loadPage(nsISupports aPageDescriptor, long aDisplayType);

  /**
  * Retrieves the page descriptor for the curent document.
  */
  nsISupports getCurrentDescriptor();

}