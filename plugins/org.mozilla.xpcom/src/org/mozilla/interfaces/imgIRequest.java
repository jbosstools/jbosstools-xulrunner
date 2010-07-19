/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/libpr0n/public/imgIRequest.idl
 */

package org.mozilla.interfaces;

/**
 * imgIRequest interface
 *
 * @author Stuart Parmenter <stuart@mozilla.com>
 * @version 0.1
 * @see imagelib2
 */
public interface imgIRequest extends nsIRequest {

  String IMGIREQUEST_IID =
    "{a297d3fa-5e0c-4e59-9f30-a01c9d4f3f8b}";

  /**
   * the image container...
   * @return the image object associated with the request.
   * @attention NEED DOCS
   */
  imgIContainer getImage();

  /**
   * Bits set in the return value from imageStatus
   * @name statusflags
   *
   * Meanings:
   *
   * STATUS_NONE: Nothing to report.
   *
   * STATUS_SIZE_AVAILABLE: We received enough image data
   * from the network or filesystem that we know the width
   * and height of the image, and have thus called SetSize()
   * on the container.
   *
   * STATUS_LOAD_PARTIAL: Used internally by imgRequest to
   * flag that a request is being cancelled as a result of
   * a failure of a proxy holder and not an internal failure.
   * At least I think that's what it does. Regardless, there's
   * no reason for this flag to be public, and it should either
   * go away or become a private state flag within imgRequest.
   * Don't rely on it.
   *
   * STATUS_LOAD_COMPLETE: The data has been fully loaded
   * to memory, but not necessarily fully decoded.
   *
   * STATUS_ERROR: An error occured loading the image.
   *
   * STATUS_FRAME_COMPLETE: The first frame has been
   * completely decoded.
   */
  int STATUS_NONE = 0;

  int STATUS_SIZE_AVAILABLE = 1;

  int STATUS_LOAD_PARTIAL = 2;

  int STATUS_LOAD_COMPLETE = 4;

  int STATUS_ERROR = 8;

  int STATUS_FRAME_COMPLETE = 16;

  /**
   * something
   * @attention NEED DOCS
   */
  long getImageStatus();

  /**
   * The URI the image load was started with.  Note that this might not be the
   * actual URI for the image (e.g. if HTTP redirects happened during the
   * load).
   */
  nsIURI getURI();

  imgIDecoderObserver getDecoderObserver();

  String getMimeType();

  /**
   * Clone this request; the returned request will have aObserver as the
   * observer.  aObserver will be notified synchronously (before the clone()
   * call returns) with all the notifications that have already been dispatched
   * for this image load.
   */
  imgIRequest _clone(imgIDecoderObserver aObserver);

  /**
   * The principal gotten from the channel the image was loaded from.
   */
  nsIPrincipal getImagePrincipal();

  /**
   * Cancels this request as in nsIRequest::Cancel(); further, also nulls out
   * decoderObserver so it gets no further notifications from us.
   *
   * NOTE: You should not use this in any new code; instead, use cancel(). Note
   * that cancel() is asynchronous, which means that some time after you call
   * it, the listener/observer will get an OnStopRequest(). This means that, if
   * you're the observer, you can't call cancel() from your destructor.
   */
  void cancelAndForgetObserver(long aStatus);

}