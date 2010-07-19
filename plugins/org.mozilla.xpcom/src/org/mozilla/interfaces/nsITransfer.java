/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/uriloader/base/nsITransfer.idl
 */

package org.mozilla.interfaces;

public interface nsITransfer extends nsIWebProgressListener2 {

  String NS_ITRANSFER_IID =
    "{23c51569-e9a1-4a92-adeb-3723db82ef7c}";

  /**
     * Initializes the transfer with certain properties.  This function must
     * be called prior to accessing any properties on this interface.
     *
     * @param aSource The source URI of the transfer. Must not be null.
     *
     * @param aTarget The target URI of the transfer. Must not be null.
     *
     * @param aDisplayName The user-readable description of the transfer.
     *                     Can be empty.
     *
     * @param aMIMEInfo The MIME info associated with the target,
     *                  including MIME type and helper app when appropriate.
     *                  This parameter is optional.
     *
     * @param startTime Time when the download started (ie, when the first
     *                  response from the server was received)
     *                  XXX presumably wbp and exthandler do this differently
     *
     * @param aTempFile The location of a temporary file; i.e. a file in which
     *                  the received data will be stored, but which is not
     *                  equal to the target file. (will be moved to the real
     *                  target by the caller, when the download is finished)
     *                  May be null.
     *
     * @param aCancelable An object that can be used to abort the download.
     *                    Must not be null.
     *                    Implementations are expected to hold a strong
     *                    reference to this object until the download is
     *                    finished, at which point they should release the
     *                    reference.
     */
  void init(nsIURI aSource, nsIURI aTarget, String aDisplayName, nsIMIMEInfo aMIMEInfo, double startTime, nsILocalFile aTempFile, nsICancelable aCancelable);

}