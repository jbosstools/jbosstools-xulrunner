/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/rdf/base/idl/nsIRDFDelegateFactory.idl
 */

package org.mozilla.interfaces;

/**
 * This interface should be implemented by an XPCOM factory that
 * is registered to handle "@mozilla.org/rdf/delegate-factory/[key]/[scheme];1"
 * ContractIDs.
 *
 * The factory will be invoked to create delegate objects from
 * nsIRDFResource::GetDelegate().
 */
public interface nsIRDFDelegateFactory extends nsISupports {

  String NS_IRDFDELEGATEFACTORY_IID =
    "{a1b89470-a124-11d3-be59-0020a6361667}";

  /**
     * Create a delegate for the specified RDF resource.
     *
     * The created delegate should forward AddRef() and Release()
     * calls to the aOuter object.
     */
  nsISupports createDelegate(nsIRDFResource aOuter, String aKey, String aIID);

}