/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/xslt/public/nsIXSLTProcessorPrivate.idl
 */

package org.mozilla.interfaces;

public interface nsIXSLTProcessorPrivate extends nsISupports {

  String NS_IXSLTPROCESSORPRIVATE_IID =
    "{b8d727f7-67f4-4dc1-a318-ec0c87280816}";

  /**
   * Disables all loading of external documents, such as from
   * <xsl:import> and document()
   * Defaults to off and is *not* reset by calls to reset()
   */
  long DISABLE_ALL_LOADS = 1L;

  /**
   * Flags for this processor. Defaults to 0. See individual flags above
   * for documentation for effect of reset()
   */
  long getFlags();

  /**
   * Flags for this processor. Defaults to 0. See individual flags above
   * for documentation for effect of reset()
   */
  void setFlags(long aFlags);

}