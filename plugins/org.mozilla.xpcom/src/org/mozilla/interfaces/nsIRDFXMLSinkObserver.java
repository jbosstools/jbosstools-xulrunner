/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/rdf/base/idl/nsIRDFXMLSink.idl
 */

package org.mozilla.interfaces;

/**
 * An observer that is notified as progress is made on the load
 * of an RDF/XML document in an <code>nsIRDFXMLSink</code>.
 */
public interface nsIRDFXMLSinkObserver extends nsISupports {

  String NS_IRDFXMLSINKOBSERVER_IID =
    "{eb1a5d30-ab33-11d2-8ec6-00805f29f370}";

  /**
     * Called when the load begins.
     * @param aSink the RDF/XML sink on which the load is beginning.
     */
  void onBeginLoad(nsIRDFXMLSink aSink);

  /**
     * Called when the load is suspended (e.g., for network quantization).
     * @param aSink the RDF/XML sink that is being interrupted.
     */
  void onInterrupt(nsIRDFXMLSink aSink);

  /**
     * Called when a suspended load is resuming.
     * @param aSink the RDF/XML sink that is resuming.
     */
  void onResume(nsIRDFXMLSink aSink);

  /**
     * Called when an RDF/XML load completes successfully.
     * @param aSink the RDF/XML sink that has finished loading.
     */
  void onEndLoad(nsIRDFXMLSink aSink);

  /**
     * Called when an error occurs during the load
     * @param aSink the RDF/XML sink in which the error occurred
     * @param aStatus the networking result code
     * @param aErrorMsg an error message, if applicable
     */
  void onError(nsIRDFXMLSink aSink, long aStatus, String aErrorMsg);

}