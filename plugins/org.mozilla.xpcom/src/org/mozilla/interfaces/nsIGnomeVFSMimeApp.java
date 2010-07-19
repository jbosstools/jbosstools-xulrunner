/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/system/nsIGnomeVFSService.idl
 */

package org.mozilla.interfaces;

public interface nsIGnomeVFSMimeApp extends nsISupports {

  String NS_IGNOMEVFSMIMEAPP_IID =
    "{66009894-9877-405b-9321-bf30420e34e6}";

  int EXPECTS_URIS = 0;

  int EXPECTS_PATHS = 1;

  int EXPECTS_URIS_FOR_NON_FILES = 2;

  String getId();

  String getName();

  String getCommand();

  boolean getCanOpenMultipleFiles();

  int getExpectsURIs();

  nsIUTF8StringEnumerator getSupportedURISchemes();

  boolean getRequiresTerminal();

  void launch(String uri);

}