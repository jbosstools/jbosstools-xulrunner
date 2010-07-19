/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIPrompt.idl
 */

package org.mozilla.interfaces;

public interface nsIPrompt extends nsISupports {

  String NS_IPROMPT_IID =
    "{a63f70c0-148b-11d3-9333-00104ba0fd40}";

  void alert(String dialogTitle, String text);

  void alertCheck(String dialogTitle, String text, String checkMsg, boolean[] checkValue);

  boolean confirm(String dialogTitle, String text);

  boolean confirmCheck(String dialogTitle, String text, String checkMsg, boolean[] checkValue);

  long BUTTON_POS_0 = 1L;

  long BUTTON_POS_1 = 256L;

  long BUTTON_POS_2 = 65536L;

  long BUTTON_TITLE_OK = 1L;

  long BUTTON_TITLE_CANCEL = 2L;

  long BUTTON_TITLE_YES = 3L;

  long BUTTON_TITLE_NO = 4L;

  long BUTTON_TITLE_SAVE = 5L;

  long BUTTON_TITLE_DONT_SAVE = 6L;

  long BUTTON_TITLE_REVERT = 7L;

  long BUTTON_TITLE_IS_STRING = 127L;

  long BUTTON_POS_0_DEFAULT = 0L;

  long BUTTON_POS_1_DEFAULT = 16777216L;

  long BUTTON_POS_2_DEFAULT = 33554432L;

  long BUTTON_DELAY_ENABLE = 67108864L;

  long STD_OK_CANCEL_BUTTONS = 513L;

  long STD_YES_NO_BUTTONS = 1027L;

  int confirmEx(String dialogTitle, String text, long buttonFlags, String button0Title, String button1Title, String button2Title, String checkMsg, boolean[] checkValue);

  boolean prompt(String dialogTitle, String text, String[] value, String checkMsg, boolean[] checkValue);

  boolean promptPassword(String dialogTitle, String text, String[] password, String checkMsg, boolean[] checkValue);

  boolean promptUsernameAndPassword(String dialogTitle, String text, String[] username, String[] password, String checkMsg, boolean[] checkValue);

  boolean select(String dialogTitle, String text, long count, String[] selectList, int[] outSelection);

}