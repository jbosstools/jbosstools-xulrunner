/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/widget/public/nsIPrintSettings.idl
 */

package org.mozilla.interfaces;

/**
 * Simplified graphics interface for JS rendering.
 *
 * @status UNDER_REVIEW
 */
public interface nsIPrintSettings extends nsISupports {

  String NS_IPRINTSETTINGS_IID =
    "{343700dd-078b-42b6-a809-b9c1d7e951d0}";

  /**
   * PrintSettings to be Saved Navigation Constants
   */
  long kInitSaveOddEvenPages = 1L;

  long kInitSaveHeaderLeft = 2L;

  long kInitSaveHeaderCenter = 4L;

  long kInitSaveHeaderRight = 8L;

  long kInitSaveFooterLeft = 16L;

  long kInitSaveFooterCenter = 32L;

  long kInitSaveFooterRight = 64L;

  long kInitSaveBGColors = 128L;

  long kInitSaveBGImages = 256L;

  long kInitSavePaperSize = 512L;

  long kInitSavePaperData = 8192L;

  long kInitSaveUnwriteableMargins = 16384L;

  long kInitSaveEdges = 32768L;

  long kInitSaveReversed = 65536L;

  long kInitSaveInColor = 131072L;

  long kInitSaveOrientation = 262144L;

  long kInitSavePrintCommand = 524288L;

  long kInitSavePrinterName = 1048576L;

  long kInitSavePrintToFile = 2097152L;

  long kInitSaveToFileName = 4194304L;

  long kInitSavePageDelay = 8388608L;

  long kInitSaveMargins = 16777216L;

  long kInitSaveNativeData = 33554432L;

  long kInitSavePlexName = 67108864L;

  long kInitSaveShrinkToFit = 134217728L;

  long kInitSaveScaling = 268435456L;

  long kInitSaveColorspace = 536870912L;

  long kInitSaveResolutionName = 1073741824L;

  long kInitSaveDownloadFonts = 2147483648L;

  long kInitSaveAll = 4294967295L;

  int kPrintOddPages = 1;

  int kPrintEvenPages = 2;

  int kEnableSelectionRB = 4;

  int kRangeAllPages = 0;

  int kRangeSpecifiedPageRange = 1;

  int kRangeSelection = 2;

  int kRangeFocusFrame = 3;

  int kJustLeft = 0;

  int kJustCenter = 1;

  int kJustRight = 2;

  /**
   * FrameSet Default Type Constants
   */
  short kUseInternalDefault = 0;

  short kUseSettingWhenPossible = 1;

  /**
   * Page Size Type Constants
   */
  short kPaperSizeNativeData = 0;

  short kPaperSizeDefined = 1;

  /**
   * Page Size Unit Constants
   */
  short kPaperSizeInches = 0;

  short kPaperSizeMillimeters = 1;

  /**
   * Orientation Constants
   */
  short kPortraitOrientation = 0;

  short kLandscapeOrientation = 1;

  /**
   * Print Frame Constants
   */
  short kNoFrames = 0;

  short kFramesAsIs = 1;

  short kSelectedFrame = 2;

  short kEachFrameSep = 3;

  /**
   * How to Enable Frame Set Printing Constants
   */
  short kFrameEnableNone = 0;

  short kFrameEnableAll = 1;

  short kFrameEnableAsIsAndEach = 2;

  /**
   * Output file format
   */
  short kOutputFormatNative = 0;

  short kOutputFormatPS = 1;

  short kOutputFormatPDF = 2;

  /**
   * Set PrintOptions 
   */
  void setPrintOptions(int aType, boolean aTurnOnOff);

  /**
   * Get PrintOptions 
   */
  boolean getPrintOptions(int aType);

  /**
   * Set PrintOptions Bit field
   */
  int getPrintOptionsBits();

  /**
   * Get the page size in twips, considering the
   * orientation (portrait or landscape).
   */
  void getEffectivePageSize(double[] aWidth, double[] aHeight);

  /**
   * Makes a new copy
   */
  nsIPrintSettings _clone();

  /**
   * Assigns the internal values from the "in" arg to the current object
   */
  void assign(nsIPrintSettings aPS);

  int getStartPageRange();

  void setStartPageRange(int aStartPageRange);

  int getEndPageRange();

  void setEndPageRange(int aEndPageRange);

  /**
   * The edge measurements define the positioning of the headers
   * and footers on the page. They're measured as an offset from
   * the "unwriteable margin" (described below).
   */
  double getEdgeTop();

  /**
   * The edge measurements define the positioning of the headers
   * and footers on the page. They're measured as an offset from
   * the "unwriteable margin" (described below).
   */
  void setEdgeTop(double aEdgeTop);

  double getEdgeLeft();

  void setEdgeLeft(double aEdgeLeft);

  double getEdgeBottom();

  void setEdgeBottom(double aEdgeBottom);

  double getEdgeRight();

  void setEdgeRight(double aEdgeRight);

  /**
   * The margins define the positioning of the content on the page.
   * They're treated as an offset from the "unwriteable margin"
   * (described below).
   */
  double getMarginTop();

  /**
   * The margins define the positioning of the content on the page.
   * They're treated as an offset from the "unwriteable margin"
   * (described below).
   */
  void setMarginTop(double aMarginTop);

  double getMarginLeft();

  void setMarginLeft(double aMarginLeft);

  double getMarginBottom();

  void setMarginBottom(double aMarginBottom);

  double getMarginRight();

  void setMarginRight(double aMarginRight);

  /**
   * The unwriteable margin defines the printable region of the paper, creating
   * an invisible border from which the edge and margin attributes are measured.
   */
  double getUnwriteableMarginTop();

  /**
   * The unwriteable margin defines the printable region of the paper, creating
   * an invisible border from which the edge and margin attributes are measured.
   */
  void setUnwriteableMarginTop(double aUnwriteableMarginTop);

  double getUnwriteableMarginLeft();

  void setUnwriteableMarginLeft(double aUnwriteableMarginLeft);

  double getUnwriteableMarginBottom();

  void setUnwriteableMarginBottom(double aUnwriteableMarginBottom);

  double getUnwriteableMarginRight();

  void setUnwriteableMarginRight(double aUnwriteableMarginRight);

  double getScaling();

  void setScaling(double aScaling);

  boolean getPrintBGColors();

  void setPrintBGColors(boolean aPrintBGColors);

  boolean getPrintBGImages();

  void setPrintBGImages(boolean aPrintBGImages);

  short getPrintRange();

  void setPrintRange(short aPrintRange);

  String getTitle();

  void setTitle(String aTitle);

  String getDocURL();

  void setDocURL(String aDocURL);

  String getHeaderStrLeft();

  void setHeaderStrLeft(String aHeaderStrLeft);

  String getHeaderStrCenter();

  void setHeaderStrCenter(String aHeaderStrCenter);

  String getHeaderStrRight();

  void setHeaderStrRight(String aHeaderStrRight);

  String getFooterStrLeft();

  void setFooterStrLeft(String aFooterStrLeft);

  String getFooterStrCenter();

  void setFooterStrCenter(String aFooterStrCenter);

  String getFooterStrRight();

  void setFooterStrRight(String aFooterStrRight);

  short getHowToEnableFrameUI();

  void setHowToEnableFrameUI(short aHowToEnableFrameUI);

  boolean getIsCancelled();

  void setIsCancelled(boolean aIsCancelled);

  short getPrintFrameTypeUsage();

  void setPrintFrameTypeUsage(short aPrintFrameTypeUsage);

  short getPrintFrameType();

  void setPrintFrameType(short aPrintFrameType);

  boolean getPrintSilent();

  void setPrintSilent(boolean aPrintSilent);

  boolean getShrinkToFit();

  void setShrinkToFit(boolean aShrinkToFit);

  boolean getShowPrintProgress();

  void setShowPrintProgress(boolean aShowPrintProgress);

  String getPaperName();

  void setPaperName(String aPaperName);

  short getPaperSizeType();

  void setPaperSizeType(short aPaperSizeType);

  short getPaperData();

  void setPaperData(short aPaperData);

  double getPaperWidth();

  void setPaperWidth(double aPaperWidth);

  double getPaperHeight();

  void setPaperHeight(double aPaperHeight);

  short getPaperSizeUnit();

  void setPaperSizeUnit(short aPaperSizeUnit);

  String getPlexName();

  void setPlexName(String aPlexName);

  String getColorspace();

  void setColorspace(String aColorspace);

  String getResolutionName();

  void setResolutionName(String aResolutionName);

  boolean getDownloadFonts();

  void setDownloadFonts(boolean aDownloadFonts);

  boolean getPrintReversed();

  void setPrintReversed(boolean aPrintReversed);

  boolean getPrintInColor();

  void setPrintInColor(boolean aPrintInColor);

  int getOrientation();

  void setOrientation(int aOrientation);

  String getPrintCommand();

  void setPrintCommand(String aPrintCommand);

  int getNumCopies();

  void setNumCopies(int aNumCopies);

  String getPrinterName();

  void setPrinterName(String aPrinterName);

  boolean getPrintToFile();

  void setPrintToFile(boolean aPrintToFile);

  String getToFileName();

  void setToFileName(String aToFileName);

  short getOutputFormat();

  void setOutputFormat(short aOutputFormat);

  int getPrintPageDelay();

  void setPrintPageDelay(int aPrintPageDelay);

  /**
   * This attribute tracks whether the PS has been initialized 
   * from a printer specified by the "printerName" attr. 
   * If a different name is set into the "printerName" 
   * attribute than the one it was initialized with the PS
   * will then get intialized from that printer.
   */
  boolean getIsInitializedFromPrinter();

  /**
   * This attribute tracks whether the PS has been initialized 
   * from a printer specified by the "printerName" attr. 
   * If a different name is set into the "printerName" 
   * attribute than the one it was initialized with the PS
   * will then get intialized from that printer.
   */
  void setIsInitializedFromPrinter(boolean aIsInitializedFromPrinter);

  /**
   * This attribute tracks whether the PS has been initialized 
   * from prefs. If a different name is set into the "printerName" 
   * attribute than the one it was initialized with the PS
   * will then get intialized from prefs again.
   */
  boolean getIsInitializedFromPrefs();

  /**
   * This attribute tracks whether the PS has been initialized 
   * from prefs. If a different name is set into the "printerName" 
   * attribute than the one it was initialized with the PS
   * will then get intialized from prefs again.
   */
  void setIsInitializedFromPrefs(boolean aIsInitializedFromPrefs);

}