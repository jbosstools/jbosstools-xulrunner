/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/places/public/nsIAnnotationService.idl
 */

package org.mozilla.interfaces;

public interface nsIAnnotationObserver extends nsISupports {

  String NS_IANNOTATIONOBSERVER_IID =
    "{63fe98e0-6889-4c2c-ac9f-703e4bc25027}";

  /**
     * Called when an annotation value is set. It could be a new annotation,
     * or it could be a new value for an existing annotation.
     */
  void onPageAnnotationSet(nsIURI aPage, String aName);

  void onItemAnnotationSet(long aItemId, String aName);

  /**
     * Called when an annotation is deleted. If aName is empty, then ALL
     * annotations for the given URI have been deleted. This is not called when
     * annotations are expired (normally happens when the app exits).
     */
  void onPageAnnotationRemoved(nsIURI aURI, String aName);

  void onItemAnnotationRemoved(long aItemId, String aName);

}