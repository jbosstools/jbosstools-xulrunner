/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/traversal/nsIDOMNodeFilter.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMNodeFilter extends nsISupports {

  String NS_IDOMNODEFILTER_IID =
    "{e4723748-1dd1-11b2-8ee6-866a532a6237}";

  short FILTER_ACCEPT = 1;

  short FILTER_REJECT = 2;

  short FILTER_SKIP = 3;

  long SHOW_ALL = 4294967295L;

  long SHOW_ELEMENT = 1L;

  long SHOW_ATTRIBUTE = 2L;

  long SHOW_TEXT = 4L;

  long SHOW_CDATA_SECTION = 8L;

  long SHOW_ENTITY_REFERENCE = 16L;

  long SHOW_ENTITY = 32L;

  long SHOW_PROCESSING_INSTRUCTION = 64L;

  long SHOW_COMMENT = 128L;

  long SHOW_DOCUMENT = 256L;

  long SHOW_DOCUMENT_TYPE = 512L;

  long SHOW_DOCUMENT_FRAGMENT = 1024L;

  long SHOW_NOTATION = 2048L;

  short acceptNode(nsIDOMNode n);

}