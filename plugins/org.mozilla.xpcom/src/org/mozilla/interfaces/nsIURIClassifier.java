/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/base/nsIURIClassifier.idl
 */

package org.mozilla.interfaces;

/**
 * The URI classifier service checks a URI against lists of phishing
 * and malware sites.
 */
public interface nsIURIClassifier extends nsISupports {

  String NS_IURICLASSIFIER_IID =
    "{2de5c563-1203-43dd-a212-f5d56d530b6f}";

  /**
   * Classify a URI.
   *
   * @param aURI
   *        The URI that should be checked by the URI classifier.
   * @param aCallback
   *        The URI classifier will call this callback when the URI has been
   *        classified.
   *
   * @return <code>false</code> if classification is not necessary.  The
   *         callback will not be called.
   *         <code>true</code> if classification will be performed.  The
   *         callback will be called.
   */
  boolean classify(nsIURI aURI, nsIURIClassifierCallback aCallback);

}