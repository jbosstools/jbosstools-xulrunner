/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/browser/webBrowser/nsIWebBrowserChromeFocus.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIWebBrowserChromeFocus is implemented by the same object as the
 * nsIEmbeddingSiteWindow. It represents the focus up-calls from mozilla
 * to the embedding chrome. See mozilla bug #70224 for gratuitous info.
 *
 * @status FROZEN
 */
public interface nsIWebBrowserChromeFocus extends nsISupports {

  String NS_IWEBBROWSERCHROMEFOCUS_IID =
    "{d2206418-1dd1-11b2-8e55-acddcd2bcfb8}";

  /**
     * Set the focus at the next focusable element in the chrome.
     */
  void focusNextElement();

  /**
     * Set the focus at the previous focusable element in the chrome.
     */
  void focusPrevElement();

}