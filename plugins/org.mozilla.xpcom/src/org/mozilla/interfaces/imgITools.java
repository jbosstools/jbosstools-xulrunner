/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/libpr0n/public/imgITools.idl
 */

package org.mozilla.interfaces;

public interface imgITools extends nsISupports {

  String IMGITOOLS_IID =
    "{c395d8f1-c616-4a1b-adfd-747b4b1b2cbe}";

  /**
     * decodeImageData
     * Caller provides an input stream and mimetype. We read from the stream
     * and decompress it (according to the specified mime type) and return
     * the resulting imgIContainer. (If the caller already has a container,
     * it can be provided as input to be reused).
     *
     * @param aStream
     *        An input stream for an encoded image file.
     * @param aMimeType
     *        Type of image in the stream.
     * @param aContainer
     *        An imgIContainer holding the decoded image. Specify |null| when
     *        calling to have one created, otherwise specify a container to
     *        be reused.
     */
  void decodeImageData(nsIInputStream aStream, String aMimeType, imgIContainer[] aContainer);

  /**
     * encodeImage
     * Caller provides an image container, and the mime type it should be
     * encoded to. We return an input stream for the encoded image data.
     *
     * @param aContainer
     *        An image container.
     * @param aMimeType
     *        Type of encoded image desired (eg "image/png").
     */
  nsIInputStream encodeImage(imgIContainer aContainer, String aMimeType);

  /**
     * encodeScaledImage
     * Caller provides an image container, and the mime type it should be
     * encoded to. We return an input stream for the encoded image data.
     * The encoded image is scaled to the specified dimensions.
     *
     * @param aContainer
     *        An image container.
     * @param aMimeType
     *        Type of encoded image desired (eg "image/png").
     * @param aWidth, aHeight
     *        The size (in pixels) desired for the resulting image.
     */
  nsIInputStream encodeScaledImage(imgIContainer aContainer, String aMimeType, int aWidth, int aHeight);

}