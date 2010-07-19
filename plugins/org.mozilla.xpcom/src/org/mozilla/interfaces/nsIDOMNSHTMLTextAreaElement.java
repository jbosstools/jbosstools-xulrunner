/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMNSHTMLTextAreaElement.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMNSHTMLTextAreaElement extends nsISupports {

  String NS_IDOMNSHTMLTEXTAREAELEMENT_IID =
    "{ca066b44-9ddf-11d3-bccc-0060b0fc76bd}";

  nsIControllers getControllers();

  int getTextLength();

  int getSelectionStart();

  void setSelectionStart(int aSelectionStart);

  int getSelectionEnd();

  void setSelectionEnd(int aSelectionEnd);

  void setSelectionRange(int selectionStart, int selectionEnd);

}