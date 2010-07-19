/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOMNodeSelector.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMNodeSelector interface is an interface for getting nodes
 * that mtch a given CSS selector.
 *
 * For more information on this interface please see 
 * http://www.w3.org/TR/selectors-api/
 */
public interface nsIDOMNodeSelector extends nsISupports {

  String NS_IDOMNODESELECTOR_IID =
    "{7cebc153-168a-416c-ba5a-56a8c2ddb2ec}";

  nsIDOMElement querySelector(String selectors);

  nsIDOMNodeList querySelectorAll(String selectors);

}