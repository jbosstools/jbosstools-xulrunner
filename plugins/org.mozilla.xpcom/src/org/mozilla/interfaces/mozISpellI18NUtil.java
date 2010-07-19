/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/extensions/spellcheck/idl/mozISpellI18NUtil.idl
 */

package org.mozilla.interfaces;

/**
 * This interface contains various I18N related code used in various places by the spell checker.
 */
public interface mozISpellI18NUtil extends nsISupports {

  String MOZISPELLI18NUTIL_IID =
    "{b075d5dc-1df1-441a-bebf-680d8caaa19c}";

  long kCheck = 0L;

  long kSuggest = 1L;

  /**
    * The language being used to check spelling
    */
  String getLanguage();

  /**
    * Given a word return a list of possible root forms of that word
    */
  void getRootForm(String word, long type, String[][] words, long[] count);

  /**
    * Given a word return a list of possible root forms of that word
    */
  void fromRootForm(String word, String[] iwords, long icount, String[][] owords, long[] ocount);

  /**
     * Given a unicode string and an offset, find the beginning and end of the
     * next word. begin and end are -1 if there are no words remaining in the 
     * string. This should really be folded into the Line/WordBreaker.
     */
  void findNextWord(String word, long length, long offset, int[] begin, int[] end);

}