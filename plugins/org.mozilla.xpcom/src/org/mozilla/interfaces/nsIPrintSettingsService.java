/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/widget/public/nsIPrintSettingsService.idl
 */

package org.mozilla.interfaces;

public interface nsIPrintSettingsService extends nsISupports {

  String NS_IPRINTSETTINGSSERVICE_IID =
    "{841387c8-72e6-484b-9296-bf6eea80d58a}";

  /**
   * Returns a "global" PrintSettings object 
   * Creates a new the first time, if one doesn't exist.
   *
   * Then returns the same object each time after that.
   *
   * Initializes the globalPrintSettings from the default printer
   */
  nsIPrintSettings getGlobalPrintSettings();

  /**
   * Returns a new, unique PrintSettings object each time.
   *
   * For example, if each browser was to have its own unique
   * PrintSettings, then each browser window would call this to
   * create its own unique PrintSettings object.
   *
   * If each browse window was to use the same PrintSettings object
   * then it should use "globalPrintSettings"
   *
   * Initializes the newPrintSettings from the default printer
   *
   */
  nsIPrintSettings getNewPrintSettings();

  /**
   * The name of the last printer used, or else the system default printer.
   */
  String getDefaultPrinterName();

  /**
   * Initializes certain settings from the native printer into the PrintSettings
   * if aPrinterName is null then it uses the default printer name if it can
   * These settings include, but are not limited to:
   *   Page Orientation
   *   Page Size
   *   Number of Copies
   */
  void initPrintSettingsFromPrinter(String aPrinterName, nsIPrintSettings aPrintSettings);

  /**
   * Reads PrintSettings values from Prefs,
   * the values to be read are indicated by the "flags" arg.
   *
   * aPrintSettings should be initialized with the name of a printer. First
   * it reads in the PrintSettings from the last print job. Then it uses the
   * PrinterName in the PrinterSettings to read any settings that were saved
   * just for that printer.
   *
   * aPS - PrintSettings to have its settings read
   * aUsePrinterNamePrefix - indicates whether to use the printer name as a prefix
   * aFlags - indicates which prefs to read, see nsIPrintSettings.idl for the
   *          const values.
   *
   * Items not read:
   *   startPageRange, endPageRange, scaling, printRange, title
   *   docURL, howToEnableFrameUI, isCancelled, printFrameTypeUsage
   *   printFrameType, printSilent, shrinkToFit, numCopies,
   *   printerName
   *
   */
  void initPrintSettingsFromPrefs(nsIPrintSettings aPrintSettings, boolean aUsePrinterNamePrefix, long aFlags);

  /**
   * Writes PrintSettings values to Prefs, 
   * the values to be written are indicated by the "flags" arg.
   *
   * If there is no PrinterName in the PrinterSettings 
   * the values are saved as the "generic" values not associated with any printer.
   * If a PrinterName is there, then it saves the items qualified for that Printer
   *
   * aPS - PrintSettings to have its settings saved
   * aUsePrinterNamePrefix - indicates whether to use the printer name as a prefix
   * aFlags - indicates which prefs to save, see nsIPrintSettings.idl for the const values.
   *
   * Items not written:
   *   startPageRange, endPageRange, scaling, printRange, title
   *   docURL, howToEnableFrameUI, isCancelled, printFrameTypeUsage
   *   printFrameType, printSilent, shrinkToFit, numCopies
   *
   */
  void savePrintSettingsToPrefs(nsIPrintSettings aPrintSettings, boolean aUsePrinterNamePrefix, long aFlags);

}