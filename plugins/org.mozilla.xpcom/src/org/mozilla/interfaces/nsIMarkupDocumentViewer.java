/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/docshell/base/nsIMarkupDocumentViewer.idl
 */

package org.mozilla.interfaces;

public interface nsIMarkupDocumentViewer extends nsISupports {

  String NS_IMARKUPDOCUMENTVIEWER_IID =
    "{40b2282a-a882-4483-a634-dec468d88377}";

  void scrollToNode(nsIDOMNode node);

  /** The amount by which to scale all text. Default is 1.0. */
  float getTextZoom();

  /** The amount by which to scale all text. Default is 1.0. */
  void setTextZoom(float aTextZoom);

  /** The amount by which to scale all lengths. Default is 1.0. */
  float getFullZoom();

  /** The amount by which to scale all lengths. Default is 1.0. */
  void setFullZoom(float aFullZoom);

  /** Disable entire author style level (including HTML presentation hints) */
  boolean getAuthorStyleDisabled();

  /** Disable entire author style level (including HTML presentation hints) */
  void setAuthorStyleDisabled(boolean aAuthorStyleDisabled);

  String getDefaultCharacterSet();

  void setDefaultCharacterSet(String aDefaultCharacterSet);

  String getForceCharacterSet();

  void setForceCharacterSet(String aForceCharacterSet);

  String getHintCharacterSet();

  void setHintCharacterSet(String aHintCharacterSet);

  int getHintCharacterSetSource();

  void setHintCharacterSetSource(int aHintCharacterSetSource);

  String getPrevDocCharacterSet();

  void setPrevDocCharacterSet(String aPrevDocCharacterSet);

  /**
	* Tell the container to shrink-to-fit or grow-to-fit its contents
	*/
  void sizeToContent();

  /**
   * Options for Bidi presentation.
   *
   * Use these attributes to access the individual Bidi options.
   */
/**
   * bidiTextDirection: the default direction for the layout of bidirectional text.
   *                    1 - left to right
   *                    2 - right to left
   */
  short getBidiTextDirection();

  /**
   * Options for Bidi presentation.
   *
   * Use these attributes to access the individual Bidi options.
   */
/**
   * bidiTextDirection: the default direction for the layout of bidirectional text.
   *                    1 - left to right
   *                    2 - right to left
   */
  void setBidiTextDirection(short aBidiTextDirection);

  /**
   * bidiTextType: the ordering of bidirectional text. This may be either "logical"
   * or "visual". Logical text will be reordered for presentation using the Unicode
   * Bidi Algorithm. Visual text will be displayed without reordering. 
   *               1 - the default order for the charset
   *               2 - logical order
   *               3 - visual order
   */
  short getBidiTextType();

  /**
   * bidiTextType: the ordering of bidirectional text. This may be either "logical"
   * or "visual". Logical text will be reordered for presentation using the Unicode
   * Bidi Algorithm. Visual text will be displayed without reordering. 
   *               1 - the default order for the charset
   *               2 - logical order
   *               3 - visual order
   */
  void setBidiTextType(short aBidiTextType);

  /**
   * bidiControlsTextMode: the order of bidirectional text in form controls.
   *                       1 - logical
   *                       2 - visual
   *                       3 - like the containing document
   */
  short getBidiControlsTextMode();

  /**
   * bidiControlsTextMode: the order of bidirectional text in form controls.
   *                       1 - logical
   *                       2 - visual
   *                       3 - like the containing document
   */
  void setBidiControlsTextMode(short aBidiControlsTextMode);

  /**
   * bidiNumeral: the type of numerals to display. 
   *              1 - depending on context, default is Arabic numerals
   *              2 - depending on context, default is Hindi numerals
   *              3 - Arabic numerals
   *              4 - Hindi numerals
   */
  short getBidiNumeral();

  /**
   * bidiNumeral: the type of numerals to display. 
   *              1 - depending on context, default is Arabic numerals
   *              2 - depending on context, default is Hindi numerals
   *              3 - Arabic numerals
   *              4 - Hindi numerals
   */
  void setBidiNumeral(short aBidiNumeral);

  /**
   * bidiSupport: whether to use platform bidi support or Mozilla's bidi support
   *              1 - Use Mozilla's bidi support
   *              2 - Use the platform bidi support
   *              3 - Disable bidi support
   */
  short getBidiSupport();

  /**
   * bidiSupport: whether to use platform bidi support or Mozilla's bidi support
   *              1 - Use Mozilla's bidi support
   *              2 - Use the platform bidi support
   *              3 - Disable bidi support
   */
  void setBidiSupport(short aBidiSupport);

  /**
   * bidiCharacterSet: whether to force the user's character set
   *                   1 - use the document character set
   *                   2 - use the character set chosen by the user
   */
  short getBidiCharacterSet();

  /**
   * bidiCharacterSet: whether to force the user's character set
   *                   1 - use the document character set
   *                   2 - use the character set chosen by the user
   */
  void setBidiCharacterSet(short aBidiCharacterSet);

  /**
   * Use this attribute to access all the Bidi options in one operation
   */
  long getBidiOptions();

  /**
   * Use this attribute to access all the Bidi options in one operation
   */
  void setBidiOptions(long aBidiOptions);

}