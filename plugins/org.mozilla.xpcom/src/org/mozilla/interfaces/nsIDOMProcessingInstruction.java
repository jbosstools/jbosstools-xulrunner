/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOMProcessingInstruction.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMProcessingInstruction extends nsIDOMNode {

  String NS_IDOMPROCESSINGINSTRUCTION_IID =
    "{a6cf907f-15b3-11d2-932e-00805f8add32}";

  /**
 * The nsIDOMProcessingInstruction interface represents a 
 * "processing instruction", used in XML as a way to keep processor-specific 
 * information in the text of the document.
 *
 * For more information on this interface please see 
 * http://www.w3.org/TR/DOM-Level-2-Core/
 *
 * @status FROZEN
 */
  String getTarget();

  String getData();

  void setData(String aData);

}