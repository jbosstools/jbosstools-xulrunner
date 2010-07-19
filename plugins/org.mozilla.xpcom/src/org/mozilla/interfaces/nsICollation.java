/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/intl/locale/idl/nsICollation.idl
 */

package org.mozilla.interfaces;

public interface nsICollation extends nsISupports {

  String NS_ICOLLATION_IID =
    "{b0132cc0-3786-4557-9874-910d7def5f93}";

  int kCollationStrengthDefault = 0;

  int kCollationCaseInsensitiveAscii = 1;

  int kCollationAccentInsenstive = 2;

  int kCollationCaseSensitive = 0;

  int kCollationCaseInSensitive = 3;

  void initialize(nsILocale locale);

  int compareString(int strength, String string1, String string2);

}