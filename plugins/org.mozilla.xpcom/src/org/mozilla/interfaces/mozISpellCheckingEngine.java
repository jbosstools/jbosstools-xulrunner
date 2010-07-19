/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/extensions/spellcheck/idl/mozISpellCheckingEngine.idl
 */

package org.mozilla.interfaces;

/**
 * This interface represents a SpellChecker.
 */
public interface mozISpellCheckingEngine extends nsISupports {

  String MOZISPELLCHECKINGENGINE_IID =
    "{43987f7b-0faa-4019-811e-42becac73fc5}";

  /**
   * The name of the current dictionary
   */
  String getDictionary();

  /**
   * The name of the current dictionary
   */
  void setDictionary(String aDictionary);

  /**
   * The language this spellchecker is using when checking
   */
  String getLanguage();

  /**
   * Does the engine provide its own personal dictionary?
   */
  boolean getProvidesPersonalDictionary();

  /**
   * Does the engine provide its own word utils?
   */
  boolean getProvidesWordUtils();

  /**
   * The name of the engine
   */
  String getName();

  /** 
   * a string indicating the copyright of the engine
   */
  String getCopyright();

  /**
   * the personal dictionary
   */
  mozIPersonalDictionary getPersonalDictionary();

  /**
   * the personal dictionary
   */
  void setPersonalDictionary(mozIPersonalDictionary aPersonalDictionary);

  /**
   * Get the list of dictionaries
   */
  void getDictionaryList(String[][] dictionaries, long[] count);

  /**
   * check a word
   */
  boolean check(String word);

  /**
   * get a list of suggestions for a misspelled word
   */
  void suggest(String word, String[][] suggestions, long[] count);

}