/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/rdf/base/idl/nsIRDFResource.idl
 */

package org.mozilla.interfaces;

/**
 * An nsIRDFResource is an object that has unique identity in the 
 * RDF data model. The object's identity is determined by its URI.
 */
public interface nsIRDFResource extends nsIRDFNode {

  String NS_IRDFRESOURCE_IID =
    "{fb9686a7-719a-49dc-9107-10dea5739341}";

  /**
     * The single-byte string value of the resource.
     * @note THIS IS OBSOLETE. C++ should use GetValueConst and script
     *       should use .valueUTF8
     */
  String getValue();

  /**
     * The UTF-8 URI of the resource.
     */
  String getValueUTF8();

  /**
     * This method is called by the nsIRDFService after constructing
     * a resource object to initialize its URI. You would not normally
     * call this method directly
     */
  void init(String uri);

  /**
     * Determine if the resource has the given URI.
     */
  boolean equalsString(String aURI);

  /**
     * Retrieve the "delegate" object for this resource. A resource
     * may have several delegate objects, each of whose lifetimes is
     * bound to the life of the resource object.
     *
     * This method will return the delegate for the given key after
     * QueryInterface()-ing it to the requested IID.
     *
     * If no delegate exists for the specified key, this method will
     * attempt to create one using the component manager. Specifically,
     * it will combine aKey with the resource's URI scheme to produce
     * a ContractID as follows:
     *
     *   component:/rdf/delegate-factory/[key]/[scheme]
     *
     * This ContractID will be used to locate a factory using the
     * FindFactory() method of nsIComponentManager. If the nsIFactory
     * exists, it will be used to create a "delegate factory"; that
     * is, an object that supports nsIRDFDelegateFactory. The delegate
     * factory will be used to construct the delegate object.
     */
  nsISupports getDelegate(String aKey, String aIID);

  /**
     * Force a delegate to be "unbound" from the resource.
     *
     * Normally, a delegate object's lifetime will be identical to
     * that of the resource to which it is bound; this method allows a
     * delegate to unlink itself from an RDF resource prematurely.
     */
  void releaseDelegate(String aKey);

}