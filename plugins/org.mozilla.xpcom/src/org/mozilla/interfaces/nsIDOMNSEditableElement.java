/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOMNSEditableElement.idl
 */

package org.mozilla.interfaces;

/**
 * This interface is implemented by elements which have inner editable content,
 * such as HTML input and textarea. 
*/
public interface nsIDOMNSEditableElement extends nsISupports {

  String NS_IDOMNSEDITABLEELEMENT_IID =
    "{b33eb56c-3120-418c-892b-774b00c7dde8}";

  nsIEditor getEditor();

  void setUserInput(String input);

}