/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOMDOMConfiguration.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMDOMConfiguration interface represents the configuration
 * of a document and maintains a table of recognized parameters.
 *
 * For more information on this interface, please see
 * http://www.w3.org/TR/DOM-Level-3-Core/
 */
public interface nsIDOMDOMConfiguration extends nsISupports {

  String NS_IDOMDOMCONFIGURATION_IID =
    "{cfb5b821-9016-4a79-9d98-87b57c3ea0c7}";

  void setParameter(String name, nsIVariant value);

  nsIVariant getParameter(String name);

  boolean canSetParameter(String name, nsIVariant value);

}