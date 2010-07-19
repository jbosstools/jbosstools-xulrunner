/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/rdf/base/idl/nsIRDFXMLSink.idl
 */

package org.mozilla.interfaces;

public interface nsIRDFXMLSink extends nsISupports {

  String NS_IRDFXMLSINK_IID =
    "{eb1a5d31-ab33-11d2-8ec6-00805f29f370}";

  /**
 * A "sink" that receives and processes RDF/XML. This interface is used
 * by the RDF/XML parser.
 */
/**
     * Set to <code>true</code> if the sink is read-only and cannot
     * be modified
     */
  boolean getReadOnly();

  /**
 * A "sink" that receives and processes RDF/XML. This interface is used
 * by the RDF/XML parser.
 */
/**
     * Set to <code>true</code> if the sink is read-only and cannot
     * be modified
     */
  void setReadOnly(boolean aReadOnly);

  /**
     * Initiate the RDF/XML load.
     */
  void beginLoad();

  /**
     * Suspend the RDF/XML load.
     */
  void interrupt();

  /**
     * Resume the RDF/XML load.
     */
  void resume();

  /**
     * Complete the RDF/XML load.
     */
  void endLoad();

  /**
     * Add an observer that will be notified as the RDF/XML load
     * progresses.
     * <p>
     *
     * Note that the sink will acquire a strong reference to the
     * observer, so care should be taken to avoid cyclical references
     * that cannot be released (i.e., if the observer holds a
     * reference to the sink, it should be sure that it eventually
     * clears the reference).
     *
     * @param aObserver the observer to add to the sink's set of
     * load observers.
     */
  void addXMLSinkObserver(nsIRDFXMLSinkObserver aObserver);

  /**
     * Remove an observer from the sink's set of observers.
     * @param aObserver the observer to remove.
     */
  void removeXMLSinkObserver(nsIRDFXMLSinkObserver aObserver);

}