/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/parser/xml/public/nsISAXXMLFilter.idl
 */

package org.mozilla.interfaces;

/**
 * Interface for an XML filter.
 *
 * An XML filter is like an XML reader, except that it obtains its
 * events from another XML reader rather than a primary source like an
 * XML document or database.  Filters can modify a stream of events as
 * they pass on to the final application.
 */
public interface nsISAXXMLFilter extends nsISAXXMLReader {

  String NS_ISAXXMLFILTER_IID =
    "{77a22cf0-6cdf-11da-be43-001422106990}";

  /**
   * The parent reader.
   *
   * Allows the application to query the parent reader (which may be
   * another filter).  It is generally a bad idea to perform any
   * operations on the parent reader directly: they should all pass
   * through this filter.
   */
  nsISAXXMLReader getParent();

  /**
   * The parent reader.
   *
   * Allows the application to query the parent reader (which may be
   * another filter).  It is generally a bad idea to perform any
   * operations on the parent reader directly: they should all pass
   * through this filter.
   */
  void setParent(nsISAXXMLReader aParent);

}