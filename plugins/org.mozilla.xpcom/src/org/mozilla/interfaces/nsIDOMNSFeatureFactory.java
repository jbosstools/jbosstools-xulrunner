/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/base/nsIDOMNSFeatureFactory.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMNSFeatureFactory extends nsISupports {

  String NS_IDOMNSFEATUREFACTORY_IID =
    "{dc5ba787-b648-4b01-a8e7-b293ffb044ef}";

  /**
   * @param object: usually either nsIDOMNode or nsIDOMDOMImplementation
   * @param feature: the name of the feature
   * @param version: the version of the feature
   */
  boolean hasFeature(nsISupports object, String feature, String version);

  /**
   * @param object: usually either nsIDOMNode or nsIDOMDOMImplementation
   * @param feature: the name of the feature
   * @param version: the version of the feature
   */
  nsISupports getFeature(nsISupports object, String feature, String version);

}