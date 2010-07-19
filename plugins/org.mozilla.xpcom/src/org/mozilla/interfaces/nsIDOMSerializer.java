/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/base/public/nsIDOMSerializer.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMSerializer interface is really a placeholder till the W3C
 * DOM Working Group defines a mechanism for serializing DOM nodes.
 * An instance of this interface can be used to serialize a DOM document
 * or any DOM subtree.
 */
public interface nsIDOMSerializer extends nsISupports {

  String NS_IDOMSERIALIZER_IID =
    "{9fd4ba15-e67c-4c98-b52c-7715f62c9196}";

  /**
   * The subtree rooted by the specified element is serialized to
   * a string.
   * 
   * @param root The root of the subtree to be serialized. This could
   *             be any node, including a Document.
   * @returns The serialized subtree in the form of a Unicode string
   */
  String serializeToString(nsIDOMNode root);

  /**
   * The subtree rooted by the specified element is serialized to
   * a byte stream using the character set specified.
   * @param root The root of the subtree to be serialized. This could
   *             be any node, including a Document.
   * @param stream The byte stream to which the subtree is serialized.
   * @param charset The name of the character set to use for the encoding
   *                to a byte stream.  If this string is empty and root is
   *                a document, the document's character set will be used.
   */
  void serializeToStream(nsIDOMNode root, nsIOutputStream stream, String charset);

}