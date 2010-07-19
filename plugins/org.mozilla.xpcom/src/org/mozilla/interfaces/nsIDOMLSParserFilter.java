/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/load-save/nsIDOMLSParserFilter.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMLSParserFilter extends nsISupports {

  String NS_IDOMLSPARSERFILTER_IID =
    "{10e8893d-ddf5-45d1-8872-615d72065fb4}";

  short FILTER_ACCEPT = 1;

  short FILTER_REJECT = 2;

  short FILTER_SKIP = 3;

  short FILTER_INTERRUPT = 4;

  int startElement(nsIDOMElement elementArg);

  int acceptNode(nsIDOMNode nodeArg);

  long getWhatToShow();

}