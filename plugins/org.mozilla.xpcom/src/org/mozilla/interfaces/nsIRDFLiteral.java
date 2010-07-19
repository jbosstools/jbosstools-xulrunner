/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/rdf/base/idl/nsIRDFLiteral.idl
 */

package org.mozilla.interfaces;

/**
 * A literal node in the graph, whose value is a string.
 */
public interface nsIRDFLiteral extends nsIRDFNode {

  String NS_IRDFLITERAL_IID =
    "{e0c493d2-9542-11d2-8eb8-00805f29f370}";

  /**
     * The Unicode string value of the literal.
     */
  String getValue();

}