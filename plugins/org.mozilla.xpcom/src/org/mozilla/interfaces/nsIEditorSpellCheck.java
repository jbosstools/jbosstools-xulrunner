/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/idl/nsIEditorSpellCheck.idl
 */

package org.mozilla.interfaces;

public interface nsIEditorSpellCheck extends nsISupports {

  String NS_IEDITORSPELLCHECK_IID =
    "{90c93610-c116-44ab-9793-62dccb9f43ce}";

  /**
   * Returns true if we can enable spellchecking. If there are no available
   * dictionaries, this will return false.
   */
  boolean canSpellCheck();

  /**
   * Turns on the spell checker for the given editor. enableSelectionChecking
   * set means that we only want to check the current selection in the editor,
   * (this controls the behavior of GetNextMisspelledWord). For spellchecking
   * clients with no modal UI (such as inline spellcheckers), this flag doesn't
   * matter
   */
  void initSpellChecker(nsIEditor editor, boolean enableSelectionChecking);

  /**
   * When interactively spell checking the document, this will return the
   * value of the next word that is misspelled. This also computes the
   * suggestions which you can get by calling GetSuggestedWord.
   *
   * @see nsISpellChecker::GetNextMisspelledWord
   */
  String getNextMisspelledWord();

  /**
   * Used to get suggestions for the last word that was checked and found to
   * be misspelled. The first call will give you the first (best) suggestion.
   * Subsequent calls will iterate through all the suggestions, allowing you
   * to build a list. When there are no more suggestions, an empty string
   * (not a null pointer) will be returned.
   *
   * @see nsISpellChecker::GetSuggestedWord
   */
  String getSuggestedWord();

  /**
   * Check a given word. In spite of the name, this function checks the word
   * you give it, returning true if the word is misspelled. If the word is
   * misspelled, it will compute the suggestions which you can get from
   * GetSuggestedWord().
   *
   * @see nsISpellChecker::CheckCurrentWord
   */
  boolean checkCurrentWord(String suggestedWord);

  /**
   * Use when modally checking the document to replace a word.
   *
   * @see nsISpellChecker::CheckCurrentWord
   */
  void replaceWord(String misspelledWord, String replaceWord, boolean allOccurrences);

  /**
   * @see nsISpellChecker::IgnoreAll
   */
  void ignoreWordAllOccurrences(String word);

  /**
   * Fills an internal list of words added to the personal dictionary. These
   * words can be retrieved using GetPersonalDictionaryWord()
   *
   * @see nsISpellChecker::GetPersonalDictionary
   * @see GetPersonalDictionaryWord
   */
  void getPersonalDictionary();

  /**
   * Used after you call GetPersonalDictionary() to iterate through all the
   * words added to the personal dictionary. Will return the empty string when
   * there are no more words.
   */
  String getPersonalDictionaryWord();

  /**
   * Adds a word to the current personal dictionary.
   *
   * @see nsISpellChecker::AddWordToDictionary
   */
  void addWordToDictionary(String word);

  /**
   * Removes a word from the current personal dictionary.
   *
   * @see nsISpellChecker::RemoveWordFromPersonalDictionary
   */
  void removeWordFromDictionary(String word);

  /**
   * Retrieves a list of the currently available dictionaries. The strings will
   * typically be language IDs, like "en-US".
   *
   * @see mozISpellCheckingEngine::GetDictionaryList
   */
  void getDictionaryList(String[][] dictionaryList, long[] count);

  /**
   * @see nsISpellChecker::GetCurrentDictionary
   */
  String getCurrentDictionary();

  /**
   * @see nsISpellChecker::SetCurrentDictionary
   */
  void setCurrentDictionary(String dictionary);

  /**
   * Call to save the currently selected dictionary as the default. The
   * function UninitSpellChecker will also do this, but that function may not
   * be called in some situations. This function allows the caller to force the
   * default right now.
   */
  void saveDefaultDictionary();

  /**
   * Call this to free up the spell checking object. It will also save the
   * current selected language as the default for future use.
   *
   * If you have called CanSpellCheck but not InitSpellChecker, you can still
   * call this function to clear the cached spell check object, and no
   * preference saving will happen.
   */
  void uninitSpellChecker();

  /**
   * Used to filter the content (for example, to skip blockquotes in email from
   * spellchecking. Call this before calling InitSpellChecker; calling it
   * after initialization will have no effect.
   *
   * @see nsITextServicesDocument::setFilter
   */
  void setFilter(nsITextServicesFilter filter);

  /**
   * Like CheckCurrentWord, checks the word you give it, returning true if it's
   * misspelled. This is faster than CheckCurrentWord because it does not
   * compute any suggestions.
   *
   * Watch out: this does not clear any suggestions left over from previous
   * calls to CheckCurrentWord, so there may be suggestions, but they will be
   * invalid.
   */
  boolean checkCurrentWordNoSuggest(String suggestedWord);

}