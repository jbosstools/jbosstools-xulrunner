/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/webshell/public/nsIContentViewerContainer.idl
 */

package org.mozilla.interfaces;

public interface nsIContentViewerContainer extends nsISupports {

  String NS_ICONTENTVIEWERCONTAINER_IID =
    "{ea2ce7a0-5c3d-11d4-90c2-0050041caf44}";

  void embed(nsIContentViewer aDocViewer, String aCommand, nsISupports aExtraInfo);

  /**
   * Allows the PrintEngine to make this call on 
   * an internal interface to the DocShell
   */
  void setIsPrinting(boolean aIsPrinting);

}