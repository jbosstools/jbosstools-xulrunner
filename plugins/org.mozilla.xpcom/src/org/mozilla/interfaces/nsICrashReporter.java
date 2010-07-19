/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/system/nsICrashReporter.idl
 */

package org.mozilla.interfaces;

/**
 * Provides access to crash reporting functionality.
 *
 * @status UNSTABLE - This interface is not frozen and will probably change in
 *                    future releases.
 */
public interface nsICrashReporter extends nsISupports {

  String NS_ICRASHREPORTER_IID =
    "{44650737-59f7-4c9b-adbe-2b6d4dfee86a}";

  /**
   * Enable or disable the crashreporter at runtime.
   */
  boolean getEnabled();

  /**
   * Enable or disable the crashreporter at runtime.
   */
  void setEnabled(boolean aEnabled);

  /**
   * Get or set the URL to which crash reports will be submitted.
   * Only https and http URLs are allowed, as the submission is handled
   * by OS-native networking libraries.
   *
   * @throw NS_ERROR_NOT_INITIALIZED if crash reporting is not initialized
   * @throw NS_ERROR_INVALID_ARG on set if a non-http(s) URL is assigned
   * @throw NS_ERROR_FAILURE on get if no URL is set
   */
  nsIURL getServerURL();

  /**
   * Get or set the URL to which crash reports will be submitted.
   * Only https and http URLs are allowed, as the submission is handled
   * by OS-native networking libraries.
   *
   * @throw NS_ERROR_NOT_INITIALIZED if crash reporting is not initialized
   * @throw NS_ERROR_INVALID_ARG on set if a non-http(s) URL is assigned
   * @throw NS_ERROR_FAILURE on get if no URL is set
   */
  void setServerURL(nsIURL aServerURL);

  /**
   * Get or set the path on the local system to which minidumps will be
   * written when a crash happens.
   *
   * @throw NS_ERROR_NOT_INITIALIZED if crash reporting is not initialized
   */
  nsILocalFile getMinidumpPath();

  /**
   * Get or set the path on the local system to which minidumps will be
   * written when a crash happens.
   *
   * @throw NS_ERROR_NOT_INITIALIZED if crash reporting is not initialized
   */
  void setMinidumpPath(nsILocalFile aMinidumpPath);

  /**
   * Add some extra data to be submitted with a crash report.
   *
   * @param key
   *        Name of the data to be added.
   * @param data
   *        Data to be added.
   *
   * @throw NS_ERROR_NOT_INITIALIZED if crash reporting not initialized
   * @throw NS_ERROR_INVALID_ARG if key or data contain invalid characters.
   *                             Invalid characters for key are '=' and
   *                             '\n'.  Invalid character for data is '\0'.
   */
  void annotateCrashReport(String key, String data);

  /**
   * Append some data to the "Notes" field, to be submitted with a crash report.
   * Unlike annotateCrashReport, this method will append to existing data.
   *
   * @param data
   *        Data to be added.
   *
   * @throw NS_ERROR_NOT_INITIALIZED if crash reporting not initialized
   * @throw NS_ERROR_INVALID_ARG if data contains invalid characters.
   *                             The only invalid character is '\0'.
   */
  void appendAppNotesToCrashReport(String data);

}