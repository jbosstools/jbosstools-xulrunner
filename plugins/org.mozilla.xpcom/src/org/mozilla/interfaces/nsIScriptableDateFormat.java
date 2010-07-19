/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/intl/locale/idl/nsIScriptableDateFormat.idl
 */

package org.mozilla.interfaces;

/**
 * Format date and time in a human readable format.
 */
public interface nsIScriptableDateFormat extends nsISupports {

  String NS_ISCRIPTABLEDATEFORMAT_IID =
    "{0c89efb0-1aae-11d3-9141-006008a6edf6}";

  /**
     * Do not include the date in the format string.
     */
  int dateFormatNone = 0;

  /**
     * Provide the long date format.
     *
     * NOTE:
     * The original definitions of dateFormatLong and dateFormatShort are from
     * the Windows platform. 
     * In US English dateFormatLong output will be like:
     *     Wednesday, January 29, 2003 4:02:14 PM
     * In US English dateFormatShort output will be like:
     *     1/29/03 4:02:14 PM
     * On platforms like Linux and OS2, it is rather difficult to achieve exact
     * same output, and since we are aiming at human readers, it does not make
     * sense to achieve exact same result. We will do just enough as the
     * platform allow us to do. 
     */
  int dateFormatLong = 1;

  /**
     * Provide the short date format. See also dateFormatLong.
     */
  int dateFormatShort = 2;

  /**
     * Format using only the year and month.
     */
  int dateFormatYearMonth = 3;

  /**
     * Provide the Week day (e.g. Mo, Mon, Monday or similar).
     */
  int dateFormatWeekday = 4;

  /**
     * Don't include the time in the format string.
     */
  int timeFormatNone = 0;

  /**
     * Provide the time format with seconds.
     */
  int timeFormatSeconds = 1;

  /**
     * Provide the time format without seconds.
     */
  int timeFormatNoSeconds = 2;

  /**
     * Provide the time format with seconds, and force the time format to use
     * 24-hour clock, regardless of the locale conventions.
     */
  int timeFormatSecondsForce24Hour = 3;

  /**
     * Provide the time format without seconds, and force the time format to use
     * 24-hour clock, regardless of the locale conventions.
     */
  int timeFormatNoSecondsForce24Hour = 4;

  /**
     * Format the given date and time in a human readable format.
     *
     * The underlying operating system is used to format the date and time.
     *
     * Pass an empty string as the locale parameter to use the OS settings with
     * the preferred date and time formatting given by the user.
     *
     * Pass a locale code as described in nsILocale as the locale parameter
     * (e.g. en-US) to use a specific locale. If the given locale is not
     * available, a fallback will be used.
     *
     * NOTE: The output of this method depends on the operating system and user
     * settings. Even if you pass a locale code as the first parameter, there
     * are no guarantees about which locale and exact format the returned value
     * uses. Even if you know the locale, the format might be customized by the
     * user. Therefore you should not use the returned values in contexts where
     * you depend on any specific format or language.
     *
     * @param locale
     *        Locale code of locale used to format the date or an empty string
     *        to follow user preference.
     * @param dateFormatSelector
     *        Indicate which format should preferably be used for the date.
     *        Use one of the dateFormat* constants.
     * @param timeFormatSelector
     *        Indicate which format should preferably be used for the time.
     *        Use one of the timeFormat* constants.
     * @param year, month, day, hour, minute and second
     *        The date and time to be formatted, given in the computer's local
     *        time zone.
     * @return The date and time formatted as human readable text according to
     *         user preferences or the given locale.
     */
  String formatDateTime(String locale, int dateFormatSelector, int timeFormatSelector, int year, int month, int day, int hour, int minute, int second);

  /**
     * Format the given date in a human readable format.
     *
     * See FormatDateTime for details.
     */
  String formatDate(String locale, int dateFormatSelector, int year, int month, int day);

  /**
     * Format the given time in a human readable format.
     *
     * See FormatDateTime for details.
     */
  String formatTime(String locale, int timeFormatSelector, int hour, int minute, int second);

}