/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/widget/public/nsIPrintOptions.idl
 */

package org.mozilla.interfaces;

/**
 * Print options interface
 *
 * Do not attempt to freeze this API - it still needs lots of work. Consult
 * John Keiser <jkeiser@netscape.com> and Roland Mainz
 * <roland.mainz@informatik.med.uni-giessen.de> for futher details.
 */
public interface nsIPrintOptions extends nsISupports {

  String NS_IPRINTOPTIONS_IID =
    "{92597c2b-109b-40bb-8f93-9b9acfa31de8}";

  /**
   * Show Native Print Options dialog, this may not be supported on all platforms
   */
  void showPrintSetupDialog(nsIPrintSettings aThePrintSettings);

  /**
   * Creates a new PrintSettnigs Object
   * and initializes it from prefs
   */
  nsIPrintSettings createPrintSettings();

  /**
   * Get a prefixed integer pref 
   */
  int getPrinterPrefInt(nsIPrintSettings aPrintSettings, String aPrefName);

  /**
   * display Printer Job Properties dialog
   */
  void displayJobProperties(String aPrinter, nsIPrintSettings aPrintSettings, boolean[] aDisplayed);

  /**
   * Native data constants
   */
  short kNativeDataPrintRecord = 0;

}