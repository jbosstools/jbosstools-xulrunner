/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsIObjectLoadingContent.idl
 */

package org.mozilla.interfaces;

/**
 * This interface extends the nsIObjectLoadingContent for the 1.9.2 branch
 */
public interface nsIObjectLoadingContent_MOZILLA_1_9_2_BRANCH extends nsISupports {

  String NS_IOBJECTLOADINGCONTENT_MOZILLA_1_9_2_BRANCH_IID =
    "{f91247a2-fb8b-42d3-a9b6-8f1f49685c43}";

  /**
   * Tells the object to paint directly in this location ignoring any
   * positioning information that may have been provided otherwise
   */
  void setAbsoluteScreenPosition(nsIDOMElement element, nsIDOMClientRect position, nsIDOMClientRect clip);

}