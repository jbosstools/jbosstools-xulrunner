/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/extensions/spellcheck/idl/mozIPersonalDictionary.idl
 */

package org.mozilla.interfaces;

/**
 * This interface represents a Personal Dictionary.
 */
public interface mozIPersonalDictionary extends nsISupports {

  String MOZIPERSONALDICTIONARY_IID =
    "{7ef52eaf-b7e1-462b-87e2-5d1dbaca9048}";

  /**
   * Load the dictionary
   */
  void load();

  /**
   * Save the dictionary
   */
  void save();

  /**
   * Get the (lexicographically sorted) list of words
   */
  nsIStringEnumerator getWordList();

  /**
   * Check a unicode string
   */
  boolean check(String word, String lang);

  /**
   * Add a word to the personal dictionary
   */
  void addWord(String word, String lang);

  /**
   * Remove a word from the personal dictionary
   */
  void removeWord(String word, String lang);

  /**
   * Add a word to the ignore all list
   */
  void ignoreWord(String word);

  /**
   * Clear the ignore list
   */
  void endSession();

  /** 
   * These three functions are here in case we want to store previous 
   * misspellings and return them at the head of the misspell list.
   */
/**
   * Add a misspelling to the list of corrections
   */
  void addCorrection(String word, String correction, String lang);

  /**
   * Remove a misspelling from the list of corrections
   */
  void removeCorrection(String word, String correction, String lang);

  /**
   * Get a list of previous corrections for the word
   */
  void getCorrection(String word, String[][] words, long[] count);

}