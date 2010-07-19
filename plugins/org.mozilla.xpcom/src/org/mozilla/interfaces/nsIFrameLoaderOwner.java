/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsIFrameLoader.idl
 */

package org.mozilla.interfaces;

public interface nsIFrameLoaderOwner extends nsISupports {

  String NS_IFRAMELOADEROWNER_IID =
    "{641c2d90-4ada-4367-bdb1-80831614161d}";

  /**
   * The frame loader owned by this nsIFrameLoaderOwner
   */
  nsIFrameLoader getFrameLoader();

  /**
   * Swap frame loaders with the given nsIFrameLoaderOwner.  This may
   * only be posible in a very limited range of circumstances, or
   * never, depending on the object implementing this interface.
   *
   * @throws NS_ERROR_NOT_IMPLEMENTED if the swapping logic is not
   *   implemented for the two given frame loader owners.
   * @throws NS_ERROR_DOM_SECURITY_ERR if the swap is not allowed on
   *   security grounds.
   */
  void swapFrameLoaders(nsIFrameLoaderOwner aOtherOwner);

}