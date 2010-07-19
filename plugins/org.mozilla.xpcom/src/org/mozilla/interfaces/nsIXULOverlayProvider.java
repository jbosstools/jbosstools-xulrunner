/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/xul/document/public/nsIXULOverlayProvider.idl
 */

package org.mozilla.interfaces;

/**
 * The chrome registry implements this interface to give overlays
 * to the gecko XUL engine.
 */
public interface nsIXULOverlayProvider extends nsISupports {

  String NS_IXULOVERLAYPROVIDER_IID =
    "{1d5b5b94-dc47-4050-93b7-ac092e383cad}";

  /**
     * Get the XUL overlays for a particular chrome URI.
     *
     * @param aURI  The URI being loaded
     * @return      An enumerator of nsIURI for the overlays of this URI 
     */
  nsISimpleEnumerator getXULOverlays(nsIURI aURI);

  /**
     * Get the style overlays for a particular chrome URI.
     *
     * @param aURI  The URI being loaded
     * @return      An enumerator of nsIURI for the overlays of this URI 
     */
  nsISimpleEnumerator getStyleOverlays(nsIURI aURI);

}