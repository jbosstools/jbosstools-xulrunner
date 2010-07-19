/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/base/nsIVersionComparator.idl
 */

package org.mozilla.interfaces;

/**
 * Version strings are dot-separated sequences of version-parts.
 *
 * A version-part consists of up to four parts, all of which are optional:
 *
 * <number-a><string-b><number-c><string-d (everything else)>
 *
 * A version-part may also consist of a single asterisk "*" which indicates
 * "infinity".
 *
 * Numbers are base-10, and are zero if left out.
 * Strings are compared bytewise.
 *
 * For additional backwards compatibility, if "string-b" is "+" then
 * "number-a" is incremented by 1 and "string-b" becomes "pre".
 *
 * 1.0pre1
 * < 1.0pre2  
 *   < 1.0 == 1.0.0 == 1.0.0.0
 *     < 1.1pre == 1.1pre0 == 1.0+
 *       < 1.1pre1a
 *         < 1.1pre1
 *           < 1.1pre10a
 *             < 1.1pre10
 *
 * Although not required by this interface, it is recommended that
 * numbers remain within the limits of a signed char, i.e. -127 to 128.
 */
public interface nsIVersionComparator extends nsISupports {

  String NS_IVERSIONCOMPARATOR_IID =
    "{e6cd620a-edbb-41d2-9e42-9a2ffc8107f3}";

  /**
   * Compare two version strings
   * @param   A   The first version
   * @param   B   The second version
   * @returns < 0 if A < B
   *          = 0 if A == B
   *          > 0 if A > B
   */
  int compare(String A, String B);

}