/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/browser/webBrowser/nsIWebBrowserPrint.idl
 */

package org.mozilla.interfaces;

/**
 * nsIWebBrowserPrint corresponds to the main interface
 * for printing an embedded Gecko web browser window/document
 *
 * @status FROZEN
 */
public interface nsIWebBrowserPrint extends nsISupports {

  String NS_IWEBBROWSERPRINT_IID =
    "{9a7ca4b0-fbba-11d4-a869-00105a183419}";

  /**
   * PrintPreview Navigation Constants
   */
  short PRINTPREVIEW_GOTO_PAGENUM = 0;

  short PRINTPREVIEW_PREV_PAGE = 1;

  short PRINTPREVIEW_NEXT_PAGE = 2;

  short PRINTPREVIEW_HOME = 3;

  short PRINTPREVIEW_END = 4;

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
   * Returns a pointer to the PrintSettings object that
   * that was passed into either "print" or "print preview"
   *
   * This enables any consumers of the interface to have access
   * to the "current" PrintSetting at later points in the execution
   */
  nsIPrintSettings getCurrentPrintSettings();

  /**
   * Returns a pointer to the current child DOMWindow
   * that is being print previewed. (FrameSet Frames)
   *
   * Returns null if parent document is not a frameset or the entire FrameSet 
   * document is being print previewed
   *
   * This enables any consumers of the interface to have access
   * to the "current" child DOMWindow at later points in the execution
   */
  nsIDOMWindow getCurrentChildDOMWindow();

  /**
   * Returns whether it is in Print mode
   */
  boolean getDoingPrint();

  /**
   * Returns whether it is in Print Preview mode
   */
  boolean getDoingPrintPreview();

  /**
   * This returns whether the current document is a frameset document
   */
  boolean getIsFramesetDocument();

  /**
   * This returns whether the current document is a frameset document
   */
  boolean getIsFramesetFrameSelected();

  /**
   * This returns whether there is an IFrame selected
   */
  boolean getIsIFrameSelected();

  /**
   * This returns whether there is a "range" selection
   */
  boolean getIsRangeSelection();

  /**
   * This returns the total number of pages for the Print Preview
   */
  int getPrintPreviewNumPages();

  /**
   * Print the specified DOM window
   *
   * @param aThePrintSettings - Printer Settings for the print job, if aThePrintSettings is null
   *                            then the global PS will be used.
   * @param aWPListener - is updated during the print
   * @return void
   */
  void print(nsIPrintSettings aThePrintSettings, nsIWebProgressListener aWPListener);

  /**
   * Print Preview the specified DOM window
   *
   * @param aThePrintSettings - Printer Settings for the print preview, if aThePrintSettings is null
   *                            then the global PS will be used.
   * @param aChildDOMWin - DOM Window of the child document to be PP (FrameSet frames)
   * @param aWPListener - is updated during the printpreview
   * @return void
   */
  void printPreview(nsIPrintSettings aThePrintSettings, nsIDOMWindow aChildDOMWin, nsIWebProgressListener aWPListener);

  /**
   * Print Preview - Navigates within the window
   *
   * @param aNavType - navigation enum
   * @param aPageNum - page num to navigate to when aNavType = ePrintPreviewGoToPageNum
   * @return void
   */
  void printPreviewNavigate(short aNavType, int aPageNum);

  /**
   * Cancels the current print 
   * @return void
   */
  void cancel();

  /**
   * Returns an array of the names of all documents names (Title or URL)
   * and sub-documents. This will return a single item if the attr "isFramesetDocument" is false
   * and may return any number of items is "isFramesetDocument" is true
   *
   * @param  aCount - returns number of printers returned
   * @param  aResult - returns array of names
   * @return void
   */
  String[] enumerateDocumentNames(long[] aCount);

  /**
   * This exists PrintPreview mode and returns browser window to galley mode
   * @return void
   */
  void exitPrintPreview();

}