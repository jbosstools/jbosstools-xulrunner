/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/system/nsIGnomeVFSService.idl
 */

package org.mozilla.interfaces;

public interface nsIGnomeVFSService extends nsISupports {

  String NS_IGNOMEVFSSERVICE_IID =
    "{dea20bf0-4e4d-48c5-b932-dc3e116dc64b}";

  /*** Application registry methods ***/
  int APP_KEY_COMMAND = 0;

  int APP_KEY_NAME = 1;

  int APP_KEY_SUPPORTED_URI_SCHEMES = 2;

  int APP_KEY_EXPECTS_URIS = 3;

  void setAppStringKey(String id, int key, String value);

  int APP_KEY_CAN_OPEN_MULTIPLE = 4;

  int APP_KEY_REQUIRES_TERMINAL = 5;

  void setAppBoolKey(String id, int key, boolean value);

  void addMimeType(String id, String mimeType);

  void syncAppRegistry();

  /*** MIME registry methods ***/
  String getMimeTypeFromExtension(String extension);

  nsIGnomeVFSMimeApp getAppForMimeType(String mimeType);

  void setAppForMimeType(String mimeType, String id);

  String getDescriptionForMimeType(String mimeType);

  void setIconForMimeType(String mimeType, String iconPath);

  void setMimeExtensions(String mimeType, String extensionsList);

  /*** Misc. methods ***/
  void showURI(nsIURI uri);

}