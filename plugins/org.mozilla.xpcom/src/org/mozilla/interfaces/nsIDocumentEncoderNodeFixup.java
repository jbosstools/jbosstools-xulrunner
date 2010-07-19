/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsIDocumentEncoder.idl
 */

package org.mozilla.interfaces;

public interface nsIDocumentEncoderNodeFixup extends nsISupports {

  String NS_IDOCUMENTENCODERNODEFIXUP_IID =
    "{c0da5b87-0ba7-4d7c-8cb3-fcb02af4253d}";

  /**
   * Create a fixed up version of a node. This method is called before
   * each node in a document is about to be persisted. The implementor
   * may return a new node with fixed up attributes or null. If null is
   * returned the node should be used as-is.
   * @param aNode Node to fixup.
   * @param [OUT] aSerializeCloneKids True if the document encoder should
   * apply recursive serialization to the children of the fixed up node
   * instead of the children of the original node.
   * @return The resulting fixed up node.
   */
  nsIDOMNode fixupNode(nsIDOMNode aNode, boolean[] aSerializeCloneKids);

}