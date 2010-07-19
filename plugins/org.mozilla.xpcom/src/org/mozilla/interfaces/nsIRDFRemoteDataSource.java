/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/rdf/base/idl/nsIRDFRemoteDataSource.idl
 */

package org.mozilla.interfaces;

/**
 * A datasource that may load asynchronously
 */
public interface nsIRDFRemoteDataSource extends nsISupports {

  String NS_IRDFREMOTEDATASOURCE_IID =
    "{1d297320-27f7-11d3-be01-000064657374}";

  /**
     * This value is <code>true</code> when the datasource has
     * fully loaded itself.
     */
  boolean getLoaded();

  /**
     * Specify the URI for the data source: this is the prefix
     * that will be used to register the data source in the
     * data source registry.
     * @param aURI the URI to load
     */
  void init(String aURI);

  /**
     * Refresh the remote datasource, re-loading its contents
     * from the URI.
     *
     * @param aBlocking If <code>true</code>, the call will block
     * until the datasource has completely reloaded.
     */
  void refresh(boolean aBlocking);

  /**
     * Request that a data source write its contents out to 
     * permanent storage, if applicable.
     */
  void flush();

  void flushTo(String aURI);

}