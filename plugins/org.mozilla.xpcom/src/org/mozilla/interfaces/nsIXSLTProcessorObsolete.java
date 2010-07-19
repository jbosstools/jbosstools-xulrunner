/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/xslt/public/nsIXSLTProcessorObsolete.idl
 */

package org.mozilla.interfaces;

/**
 * DEPRECATED! Don't use this interface! Use nsIXSLTProcessor instead!!
 */
public interface nsIXSLTProcessorObsolete extends nsISupports {

  String NS_IXSLTPROCESSOROBSOLETE_IID =
    "{3fbff728-2d20-11d3-aef3-00108300ff91}";

  void transformDocument(nsIDOMNode aSourceDOM, nsIDOMNode aStyleDOM, nsIDOMDocument aOutputDOC, nsISupports aObserver);

}