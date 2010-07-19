/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/load-save/nsIDOMLSParser.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMLSParser extends nsISupports {

  String NS_IDOMLSPARSER_IID =
    "{2a31a3a0-be68-40af-9f64-914192f0fba2}";

  nsIDOMDOMConfiguration getDomConfig();

  nsIDOMLSParserFilter getFilter();

  void setFilter(nsIDOMLSParserFilter aFilter);

  boolean getAsync();

  boolean getBusy();

  nsIDOMDocument parse(nsIDOMLSInput input);

  nsIDOMDocument parseURI(String uri);

  int ACTION_APPEND_AS_CHILDREN = 1;

  int ACTION_REPLACE_CHILDREN = 2;

  int ACTION_INSERT_BEFORE = 3;

  int ACTION_INSERT_AFTER = 4;

  int ACTION_REPLACE = 5;

  nsIDOMNode parseWithContext(nsIDOMLSInput input, nsIDOMNode contextArg, int action);

  void abort();

}