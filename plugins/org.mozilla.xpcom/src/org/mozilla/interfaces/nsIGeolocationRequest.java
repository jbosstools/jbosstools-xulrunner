/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/geolocation/nsIGeolocationProvider.idl
 */

package org.mozilla.interfaces;

/**
 * Interface allows access to a geolocation and is passed to
 * the nsIGeolocationPrompt so that the application can approve
 * or deny the request.
 */
public interface nsIGeolocationRequest extends nsISupports {

  String NS_IGEOLOCATIONREQUEST_IID =
    "{f2aefde1-8e38-48b3-bbb8-bd6c4ae1ac8a}";

  nsIURI getRequestingURI();

  nsIDOMWindow getRequestingWindow();

  void cancel();

  void allow();

}