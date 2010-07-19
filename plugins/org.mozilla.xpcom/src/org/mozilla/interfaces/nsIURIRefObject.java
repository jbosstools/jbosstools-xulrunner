/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/idl/nsIURIRefObject.idl
 */

package org.mozilla.interfaces;

/** A class which can represent any node which points to an
  * external URI, e.g. <a>, <img>, <script> etc,
  * and has the capability to rewrite URLs to be
  * relative or absolute.
  * Used by the editor but not dependant on it.
  */
public interface nsIURIRefObject extends nsISupports {

  String NS_IURIREFOBJECT_IID =
    "{2226927e-1dd2-11b2-b57f-faab47288563}";

  nsIDOMNode getNode();

  void setNode(nsIDOMNode aNode);

  /**
   * Go back to the beginning of the attribute list.
   */
  void reset();

  /**
   * Return the next rewritable URI.
   */
  String getNextURI();

  /**
   * Go back to the beginning of the attribute list
   *
   * @param aOldPat  Old pattern to be replaced, e.g. file:///a/b/
   * @param aNewPat  New pattern to be replaced, e.g. http://mypage.aol.com/
   * @param aMakeRel Rewrite links as relative vs. absolute
   */
  void rewriteAllURIs(String aOldPat, String aNewPat, boolean aMakeRel);

}