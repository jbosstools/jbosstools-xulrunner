/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/rdf/base/idl/nsIRDFService.idl
 */

package org.mozilla.interfaces;

/**
 * The RDF service interface. This is a singleton object which should be
 * obtained from the <code>nsServiceManager</code>.
 */
public interface nsIRDFService extends nsISupports {

  String NS_IRDFSERVICE_IID =
    "{bfd05261-834c-11d2-8eac-00805f29f370}";

  /**
     * Construct an RDF resource from a single-byte URI. <code>nsIRDFService</code>
     * caches resources that are in-use, so multiple calls to <code>GetResource()</code>
     * for the same <code>uri</code> will return identical pointers. FindResource
     * is used to find out whether there already exists a resource corresponding to that url.
     */
  nsIRDFResource getResource(String aURI);

  /**
     * Construct an RDF resource from a Unicode URI. This is provided
     * as a convenience method, allowing automatic, in-line C++
     * conversion from <code>nsString</code> objects. The <code>uri</code> will
     * be converted to a single-byte representation internally.
     */
  nsIRDFResource getUnicodeResource(String aURI);

  nsIRDFResource getAnonymousResource();

  /**
     * Construct an RDF literal from a Unicode string.
     */
  nsIRDFLiteral getLiteral(String aValue);

  /**
     * Construct an RDF literal from a PRTime.
     */
  nsIRDFDate getDateLiteral(long aValue);

  /**
     * Construct an RDF literal from an int.
     */
  nsIRDFInt getIntLiteral(int aValue);

  boolean isAnonymousResource(nsIRDFResource aResource);

  /**
     * Registers a resource with the RDF system, making it unique w.r.t.
     * GetResource.
     *
     * An implementation of nsIRDFResource should call this in its
     * Init() method if it wishes the resource to be globally unique
     * (which is usually the case).
     *
     * @note that the resource will <i>not</i> be ref-counted by the
     * RDF service: the assumption is that the resource implementation
     * will call nsIRDFService::UnregisterResource() when the last
     * reference to the resource is released.
     *
     * @note that the nsIRDFService implementation may choose to
     * maintain a reference to the resource's URI; therefore, the
     * resource implementation should ensure that the resource's URI
     * (accessible via nsIRDFResource::GetValue(const char* *aURI)) is
     * valid before calling RegisterResource(). Furthermore, the
     * resource implementation should ensure that this pointer
     * <i>remains</i> valid for the lifetime of the resource. (The
     * implementation of the resource cache in nsIRDFService uses the
     * URI maintained "internally" in the resource as a key into the
     * cache rather than copying the resource URI itself.)
     */
  void registerResource(nsIRDFResource aResource, boolean aReplace);

  /**
     * Called to notify the resource manager that a resource is no
     * longer in use. This method should only be called from the
     * destructor of a "custom" resource implementation to notify the
     * RDF service that the last reference to the resource has been
     * released, so the resource is no longer valid.
     *
     * @note As mentioned in nsIRDFResourceFactory::CreateResource(),
     * the RDF service will use the result of
     * nsIRDFResource::GetValue() as a key into its cache. For this
     * reason, you must always un-cache the resource <b>before</b>
     * releasing the storage for the <code>const char*</code> URI.
     */
  void unregisterResource(nsIRDFResource aResource);

  /**
     * Register a <i>named data source</i>. The RDF service will call
     * <code>nsIRDFDataSource::GetURI()</code> to determine the URI under
     * which to register the data source.
     *
     * @note that the data source will <i>not</i> be refcounted by the
     * RDF service! The assumption is that an RDF data source
     * registers with the service once it is initialized (via
     * <code>nsIRDFDataSource::Init()</code>), and unregisters when the
     * last reference to the data source is released.
     */
  void registerDataSource(nsIRDFDataSource aDataSource, boolean aReplace);

  /**
     * Unregister a <i>named data source</i>. The RDF service will call
     * <code>nsIRDFDataSource::GetURI()</code> to determine the URI under which the
     * data source was registered.
     */
  void unregisterDataSource(nsIRDFDataSource aDataSource);

  /**
     * Get the <i>named data source</i> corresponding to the URI. If a data
     * source has been registered via <code>RegisterDataSource()</code>, that
     * data source will be returned.
     *
     * If no data source is currently
     * registered for the specified URI, and a data source <i>constructor</i>
     * function has been registered via <code>RegisterDatasourceConstructor()</code>,
     * the RDF service will call the constructor to attempt to construct a
     * new data source. If construction is successful, the data source will
     * be initialized via <code>nsIRDFDataSource::Init()</code>.
     */
  nsIRDFDataSource getDataSource(String aURI);

  /**
     * Same as GetDataSource, but if a remote/XML data source needs to be
     * constructed, then this method will issue a <b>blocking</b> Refresh
     * call on that data source.
     */
  nsIRDFDataSource getDataSourceBlocking(String aURI);

}