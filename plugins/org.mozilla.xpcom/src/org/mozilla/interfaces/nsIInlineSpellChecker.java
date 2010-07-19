/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/editor/txtsvc/public/nsIInlineSpellChecker.idl
 */

package org.mozilla.interfaces;

public interface nsIInlineSpellChecker extends nsISupports {

  String NS_IINLINESPELLCHECKER_IID =
    "{07be036a-2355-4a92-b150-5c9b7e9fdf2f}";

  nsIEditorSpellCheck getSpellChecker();

  boolean getEnableRealTimeSpell();

  void setEnableRealTimeSpell(boolean aEnableRealTimeSpell);

  void spellCheckAfterEditorChange(int aAction, nsISelection aSelection, nsIDOMNode aPreviousSelectedNode, int aPreviousSelectedOffset, nsIDOMNode aStartNode, int aStartOffset, nsIDOMNode aEndNode, int aEndOffset);

  void spellCheckRange(nsIDOMRange aSelection);

  nsIDOMRange getMisspelledWord(nsIDOMNode aNode, int aOffset);

  void replaceWord(nsIDOMNode aNode, int aOffset, String aNewword);

  void addWordToDictionary(String aWord);

  void ignoreWord(String aWord);

  void ignoreWords(String[] aWordsToIgnore, long aCount);

}