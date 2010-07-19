/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/mime/public/nsIMIMEInfo.idl
 */

package org.mozilla.interfaces;

/**
 * nsILocalHandlerApp is a local OS-level executable
 */
public interface nsILocalHandlerApp extends nsIHandlerApp {

  String NS_ILOCALHANDLERAPP_IID =
    "{9812be73-273c-478c-8170-c3e0db08ae7c}";

  /**
     * Pointer to the executable file used to handle content
     */
  nsIFile getExecutable();

  /**
     * Pointer to the executable file used to handle content
     */
  void setExecutable(nsIFile aExecutable);

}