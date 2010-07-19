/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpinstall/public/nsIXPIInstallInfo.idl
 */

package org.mozilla.interfaces;

/**
 * Interface holding information about a triggered install that can be passed
 * to and from script.
 */
public interface nsIXPIInstallInfo extends nsISupports {

  String NS_IXPIINSTALLINFO_IID =
    "{5a4a775c-e452-4cf2-8ff8-d327ae24aec6}";

  /**
   * The original window that initiated the install.
   */
  nsIDOMWindowInternal getOriginatingWindow();

  /**
   * The original URI calling the install. This is the URI that would have been
   * checked against the whitelist if necessary.
   */
  nsIURI getOriginatingURI();

  /**
   * The chome type of the install.
   */
  long getChromeType();

}