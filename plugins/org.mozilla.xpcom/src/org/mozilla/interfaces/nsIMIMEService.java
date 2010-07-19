/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/mime/public/nsIMIMEService.idl
 */

package org.mozilla.interfaces;

/**
 * The MIME service is responsible for mapping file extensions to MIME-types
 * (see RFC 2045). It also provides access to nsIMIMEInfo interfaces and
 * acts as a general convenience wrapper of nsIMIMEInfo interfaces.
 *
 * The MIME service maintains a database with a <b>one</b> MIME type <b>to many</b>
 * file extensions rule. Adding the same file extension to multiple MIME types
 * is illegal and behavior is undefined.
 *
 * @see nsIMIMEInfo
 */
public interface nsIMIMEService extends nsISupports {

  String NS_IMIMESERVICE_IID =
    "{5b3675a1-02db-4f8f-a560-b34736635f47}";

  /**
     * Retrieves an nsIMIMEInfo using both the extension
     * and the type of a file. The type is given preference
     * during the lookup. One of aMIMEType and aFileExt
     * can be an empty string. At least one of aMIMEType and aFileExt
     * must be nonempty.
     */
  nsIMIMEInfo getFromTypeAndExtension(String aMIMEType, String aFileExt);

  /**
     * Retrieves a ACString representation of the MIME type
     * associated with this file extension.
     *
     * @param  A file extension (excluding the dot ('.')).
     * @return The MIME type, if any.
     */
  String getTypeFromExtension(String aFileExt);

  /**
     * Retrieves a ACString representation of the MIME type
     * associated with this URI. The association is purely
     * file extension to MIME type based. No attempt to determine
     * the type via server headers or byte scanning is made.
     *
     * @param  The URI the user wants MIME info on.
     * @return The MIME type, if any.
     */
  String getTypeFromURI(nsIURI aURI);

  String getTypeFromFile(nsIFile aFile);

  /**
     * Given a Type/Extension combination, returns the default extension
     * for this type. This may be identical to the passed-in extension.
     *
     * @param aMIMEType The Type to get information on. Must not be empty.
     * @param aFileExt  File Extension. Can be empty.
     */
  String getPrimaryExtension(String aMIMEType, String aFileExt);

}