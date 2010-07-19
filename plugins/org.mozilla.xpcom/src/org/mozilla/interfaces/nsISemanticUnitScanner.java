/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/intl/lwbrk/idl/nsISemanticUnitScanner.idl
 */

package org.mozilla.interfaces;

/**
 * Provides a language independent way to break UNICODE
 * text into meaningful semantic units (e.g. words).
 */
public interface nsISemanticUnitScanner extends nsISupports {

  String NS_ISEMANTICUNITSCANNER_IID =
    "{9f620be4-e535-11d6-b254-00039310a47a}";

  /**
     * start()
     *
     * Starts up the semantic unit scanner with an optional
     * character set, which acts as a hint to optimize the heuristics
     * used to determine the language(s) of the processed text.
     *
     * @param characterSet the character set the text was originally
     *                     encoded in (can be NULL)
     */
  void start(String characterSet);

  /**
     * next()
     * Get the begin / end offset of the next unit in the current text
     *
     * @param text the text to be scanned
     * @param length the number of characters in the text to be processed
     * @param pos the current position
     * @param isLastBuffer, the buffer is the last one
     * @param begin the begin offset of the next unit 
     * @param begin the end offset of the next unit 
     * @return has more unit in the current text
     */
  boolean next(String text, int length, int pos, boolean isLastBuffer, int[] begin, int[] end);

}