/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/libpr0n/decoders/icon/nsIIconURI.idl
 */

package org.mozilla.interfaces;

/**
   * nsIIconURI
   *
   * This interface derives from nsIURI, to provide additional information
   * about moz-icon URIs.
   *
   * What *is* a moz-icon URI you ask?  Well, it has the following syntax:
   *
   * moz-icon://[<file-uri> | <file-with-extension> | <stock-image>]? ['?'[<parameter-value-pairs>]]
   *
   * <file-uri> is a legal file: URI spec.  You only need to specify a file: URI inside the icon
   * if the file you want the icon for actually exists.
   *
   * <file-with-extension> is any filename with an extension, e.g. "dummy.html".
   * If the file you want an icon for isn't known to exist, you can omit the file URI, and just
   * place a dummy file name with the extension or content type you want: moz-icon://dummy.html.
   *
   * <stock-image> is of the format:   stock/<icon-name>
   *
   * <icon-name> is a valid icon name, such as 'ok', 'cancel', 'yes', 'no'.
   * XXXcaa Should these considered platform dependent or can we share and document them?
   *
   * Legal parameter value pairs are listed below:
   *
   *   Parameter:   size
   *   Values:      [<integer> | button | toolbar | toolbarsmall | menu | dialog]
   *   Description: If integer, this is the desired size in square pixels of the icon
   *                Else, use the OS default for the specified keyword context.
   *
   *   Parameter:   state
   *   Values:      [normal | disabled]
   *   Description: The state of the icon.
   *
   *   Parameter:   contentType
   *   Values:      <mime-type>
   *   Description: The mime type we want an icon for. This is ignored by stock images.
   */
public interface nsIMozIconURI extends nsIURI {

  String NS_IMOZICONURI_IID =
    "{1fb33f44-f522-4880-a225-4b75d09b04c6}";

  /**
   * iconFile
   *
   * the file URL contained within this moz-icon url, or null.
   */
  nsIURI getIconFile();

  /**
   * iconFile
   *
   * the file URL contained within this moz-icon url, or null.
   */
  void setIconFile(nsIURI aIconFile);

  /**
   * imageSize
   *
   * The image area in square pixels, defaulting to 16 if unspecified.
   */
  long getImageSize();

  /**
   * imageSize
   *
   * The image area in square pixels, defaulting to 16 if unspecified.
   */
  void setImageSize(long aImageSize);

  /**
   * stockIcon
   *
   * The stock icon name requested from the OS.
   */
  String getStockIcon();

  /**
   * iconSize
   *
   * The stock icon size requested from the OS.
   */
  String getIconSize();

  /**
   * iconState
   *
   * The stock icon state requested from the OS.
   */
  String getIconState();

  /**
   * contentType
   *
   * A valid mime type, or the empty string.
   */
  String getContentType();

  /**
   * contentType
   *
   * A valid mime type, or the empty string.
   */
  void setContentType(String aContentType);

  /**
   * fileExtension
   *
   * The file extension of the file which we are looking up.
   */
  String getFileExtension();

}