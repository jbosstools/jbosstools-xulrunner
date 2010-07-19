/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/libjar/nsIJAR.idl
 */

package org.mozilla.interfaces;

public interface nsIJAR extends nsISupports {

  String NS_IJAR_IID =
    "{04501db2-0409-11d3-bcf8-00805f0e1353}";

  /**
     * Returns an object describing the entity which signed 
     * an entry. parseManifest must be called first. If aEntryName is an
     * entry in the jar, getInputStream must be called after parseManifest.
     * If aEntryName is an external file which has meta-information 
     * stored in the jar, verifyExternalFile (not yet implemented) must 
     * be called before getPrincipal.
     */
  nsIPrincipal getCertificatePrincipal(String aEntryName);

  long getManifestEntriesCount();

}