/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/rdf/base/idl/nsIRDFLiteral.idl
 */

package org.mozilla.interfaces;

/**
 * A literal node in the graph, whose value is arbitrary
 * binary data.
 */
public interface nsIRDFBlob extends nsIRDFNode {

  String NS_IRDFBLOB_IID =
    "{237f85a2-1dd2-11b2-94af-8122582fc45e}";

  /**
     * The data's length.
     */
  int getLength();

}