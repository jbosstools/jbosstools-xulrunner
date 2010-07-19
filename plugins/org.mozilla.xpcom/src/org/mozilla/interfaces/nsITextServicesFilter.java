/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/txtsvc/public/nsITextServicesFilter.idl
 */

package org.mozilla.interfaces;

public interface nsITextServicesFilter extends nsISupports {

  String NS_ITEXTSERVICESFILTER_IID =
    "{5bec321f-59ac-413a-a4ad-8a8d7c50a0d0}";

  /**
   * Indicates whether the content node should be skipped by the iterator
   *  @param aNode - node to skip
   */
  boolean skip(nsIDOMNode aNode);

}