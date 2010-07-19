/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/widget/public/nsIPrintOptions.idl
 */

package org.mozilla.interfaces;

public interface nsIPrinterEnumerator extends nsISupports {

  String NS_IPRINTERENUMERATOR_IID =
    "{5e738fff-404c-4c94-9189-e8f2cce93e94}";

  /**
   * The name of the system default printer. This name should also be
   * present in printerNameList below. This is not necessarily gecko's
   * default printer; see nsIPrintSettingsService.defaultPrinterName
   * for that.
   */
  String getDefaultPrinterName();

  /**
   * Initializes certain settings from the native printer into the PrintSettings
   * These settings include, but are not limited to:
   *   Page Orientation
   *   Page Size
   *   Number of Copies
   */
  void initPrintSettingsFromPrinter(String aPrinterName, nsIPrintSettings aPrintSettings);

  /**
   * The list of printer names
   */
  nsIStringEnumerator getPrinterNameList();

  void displayPropertiesDlg(String aPrinter, nsIPrintSettings aPrintSettings);

}