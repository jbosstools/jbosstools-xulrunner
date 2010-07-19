/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsIXMLHttpRequest.idl
 */

package org.mozilla.interfaces;

/**
 * DEPRECATED.
 */
public interface nsIJSXMLHttpRequest extends nsISupports {

  String NS_IJSXMLHTTPREQUEST_IID =
    "{423fdd3d-41c9-4149-8fe5-b14a1d3912a0}";

  /**
   * Meant to be a script-only mechanism for setting an upload progress event
   * listener.
   * This attribute should not be used from native code!!
   * This event listener may be called multiple times during the upload..
   *
   * After the initial response, all event listeners will be cleared.
   * // XXXbz what does that mean, exactly?
   *
   * This event listener must be set BEFORE calling open().
   *
   * Mozilla only.
   */
  nsIDOMEventListener getOnuploadprogress();

  /**
   * Meant to be a script-only mechanism for setting an upload progress event
   * listener.
   * This attribute should not be used from native code!!
   * This event listener may be called multiple times during the upload..
   *
   * After the initial response, all event listeners will be cleared.
   * // XXXbz what does that mean, exactly?
   *
   * This event listener must be set BEFORE calling open().
   *
   * Mozilla only.
   */
  void setOnuploadprogress(nsIDOMEventListener aOnuploadprogress);

}