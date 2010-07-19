/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpfe/components/find/public/nsIFindService.idl
 */

package org.mozilla.interfaces;

public interface nsIFindService extends nsISupports {

  String NS_IFINDSERVICE_IID =
    "{5060b801-340e-11d5-be5b-b3e063ec6a3c}";

  String getSearchString();

  void setSearchString(String aSearchString);

  String getReplaceString();

  void setReplaceString(String aReplaceString);

  boolean getFindBackwards();

  void setFindBackwards(boolean aFindBackwards);

  boolean getWrapFind();

  void setWrapFind(boolean aWrapFind);

  boolean getEntireWord();

  void setEntireWord(boolean aEntireWord);

  boolean getMatchCase();

  void setMatchCase(boolean aMatchCase);

}