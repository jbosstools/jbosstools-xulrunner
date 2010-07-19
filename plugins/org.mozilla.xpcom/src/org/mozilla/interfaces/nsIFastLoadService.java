/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIFastLoadService.idl
 */

package org.mozilla.interfaces;

public interface nsIFastLoadService extends nsISupports {

  String NS_IFASTLOADSERVICE_IID =
    "{759e475e-0c23-4dbf-b1b8-78c9369e3072}";

  nsIFile newFastLoadFile(String aBaseName);

  nsIObjectInputStream newInputStream(nsIInputStream aSrcStream);

  nsIObjectOutputStream newOutputStream(nsIOutputStream aDestStream);

  int NS_FASTLOAD_READ = 1;

  int NS_FASTLOAD_WRITE = 2;

  nsIObjectInputStream getInputStream();

  void setInputStream(nsIObjectInputStream aInputStream);

  nsIObjectOutputStream getOutputStream();

  void setOutputStream(nsIObjectOutputStream aOutputStream);

  nsIFastLoadFileIO getFileIO();

  void setFileIO(nsIFastLoadFileIO aFileIO);

  int getDirection();

  /**
     * These methods associate a URI object with its spec, for faster select
     * using the object pointer as a key, rather than the spec string.  The
     * selectMuxedDocument method returns the previously selected URI object,
     * in case a caller needs to reselect the previous after muxing data for
     * a given URI synchronously.  For the non-blocking or "asynchronous" i/o
     * case, the caller must select the source URI from the FastLoad multiplex
     * before writing a new burst of data parsed from the slow-loaded source.
     *
     * Clients of inputStream and outputStream should try to demultiplex data
     * from the input stream only if fastLoadService->StartMuxedDocument(uri,
     * urispec, NS_FASTLOAD_READ) succeeds.  If StartMuxedDocument fails with
     * NS_ERROR_NOT_AVAILABLE, callers should slow-load the documents, muxing
     * their data to the current output stream.
     */
  void startMuxedDocument(nsISupports aURI, String aURISpec, int aDirectionFlags);

  nsISupports selectMuxedDocument(nsISupports aURI);

  void endMuxedDocument(nsISupports aURI);

  void addDependency(nsIFile aFile);

  long computeChecksum(nsIFile aFile, nsIFastLoadReadControl aControl);

  void cacheChecksum(nsIFile aFile, nsIObjectOutputStream aStream);

  /**
     * Return true if aURISpec identifies a muxed document in the FastLoad
     * file, false otherwise.
     */
  boolean hasMuxedDocument(String aURISpec);

}