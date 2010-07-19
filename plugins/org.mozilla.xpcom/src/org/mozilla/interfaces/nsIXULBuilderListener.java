/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/xul/templates/public/nsIXULBuilderListener.idl
 */

package org.mozilla.interfaces;

public interface nsIXULBuilderListener extends nsISupports {

  String NS_IXULBUILDERLISTENER_IID =
    "{ac46be8f-c863-4c23-84a2-d0fcc8dfa9f4}";

  /**
   * Called before a template builder rebuilds its content.
   * @param aBuilder the template builder that rebuilds the content.
   */
  void willRebuild(nsIXULTemplateBuilder aBuilder);

  /**
   * Called after a template builder has rebuilt its content.
   * @param aBuilder the template builder that has rebuilt the content.
   */
  void didRebuild(nsIXULTemplateBuilder aBuilder);

}