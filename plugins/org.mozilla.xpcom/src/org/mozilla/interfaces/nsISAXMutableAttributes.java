/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/parser/xml/public/nsISAXMutableAttributes.idl
 */

package org.mozilla.interfaces;

/**
 * This interface extends the nsISAXAttributes interface with
 * manipulators so that the list can be modified or reused.
 */
public interface nsISAXMutableAttributes extends nsISAXAttributes {

  String NS_ISAXMUTABLEATTRIBUTES_IID =
    "{8b1de83d-cebb-49fa-8245-c0fe319eb7b6}";

  /**
   * Add an attribute to the end of the list.
   *
   * For the sake of speed, this method does no checking
   * to see if the attribute is already in the list: that is
   * the responsibility of the application.
   *
   * @param uri The Namespace URI, or the empty string if
   *        none is available or Namespace processing is not
   *        being performed.
   * @param localName The local name, or the empty string if
   *        Namespace processing is not being performed.
   * @param qName The qualified (prefixed) name, or the empty string
   *        if qualified names are not available.
   * @param type The attribute type as a string.
   * @param value The attribute value.
   */
  void addAttribute(String uri, String localName, String qName, String type, String value);

  /**
   * Clear the attribute list for reuse.
   */
  void clear();

  /**
   * Remove an attribute from the list.
   *
   * @param index The index of the attribute (zero-based).
   */
  void removeAttribute(long index);

  /**
   * Set the attributes list. This method will clear any attributes in
   * the list before adding the attributes from the argument.
   *
   * @param attributes The attributes object to replace populate the
   *                   list with.
   */
  void setAttributes(nsISAXAttributes attributes);

  /**
   * Set an attribute in the list.
   *
   * For the sake of speed, this method does no checking for name
   * conflicts or well-formedness: such checks are the responsibility
   * of the application.
   *
   * @param index The index of the attribute (zero-based).
   * @param uri The Namespace URI, or the empty string if
   *        none is available or Namespace processing is not
   *        being performed.
   * @param localName The local name, or the empty string if
   *        Namespace processing is not being performed.
   * @param qName The qualified name, or the empty string
   *        if qualified names are not available.
   * @param type The attribute type as a string.
   * @param value The attribute value.
   */
  void setAttribute(long index, String uri, String localName, String qName, String type, String value);

  /**
   * Set the local name of a specific attribute.
   *
   * @param index The index of the attribute (zero-based).
   * @param localName The attribute's local name, or the empty
   *        string for none.
   */
  void setLocalName(long index, String localName);

  /**
   * Set the qualified name of a specific attribute.
   *
   * @param index The index of the attribute (zero-based).
   * @param qName The attribute's qualified name, or the empty
   *        string for none.
   */
  void setQName(long index, String qName);

  /**
   * Set the type of a specific attribute.
   *
   * @param index The index of the attribute (zero-based).
   * @param type The attribute's type.
   */
  void setType(long index, String type);

  /**
   * Set the Namespace URI of a specific attribute.
   *
   * @param index The index of the attribute (zero-based).
   * @param uri The attribute's Namespace URI, or the empty
   *        string for none.
   */
  void setURI(long index, String uri);

  /**
   * Set the value of a specific attribute.
   *
   * @param index The index of the attribute (zero-based).
   * @param value The attribute's value.
   */
  void setValue(long index, String value);

}