/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/libpr0n/public/imgIDecoderObserver.idl
 */

package org.mozilla.interfaces;

/**
 * imgIDecoderObserver interface
 *
 * This interface is used both for observing imgIDecoder objects and for
 * observing imgIRequest objects.  In the former case, aRequest is
 * always null.
 * XXXldb The two functions should probably be split.
 *
 * @author Stuart Parmenter <pavlov@netscape.com>
 * @version 0.1
 * @see imagelib2
 */
public interface imgIDecoderObserver extends imgIContainerObserver {

  String IMGIDECODEROBSERVER_IID =
    "{1dfc9189-6421-4281-83b2-d9c1c9ba4d1b}";

  /**
   * called at the same time that nsIRequestObserver::onStartRequest would be
   * (used only for observers of imgIRequest objects, which are nsIRequests,
   * not imgIDecoder objects)
   *
   * Unlike nsIRequestObserver::onStartRequest, this can be called
   * synchronously.
   */
  void onStartRequest(imgIRequest aRequest);

  /**
   * called as soon as the image begins getting decoded
   */
  void onStartDecode(imgIRequest aRequest);

  /**
   * called once the image has been inited and therefore has a width and height
   */
  void onStartContainer(imgIRequest aRequest, imgIContainer aContainer);

  /**
   * called when each frame is created
   */
  void onStartFrame(imgIRequest aRequest, long aFrame);

  /**
   * called when a frame is finished decoding
   */
  void onStopFrame(imgIRequest aRequest, long aFrame);

  /**
   * probably not needed.  called right before onStopDecode
   */
  void onStopContainer(imgIRequest aRequest, imgIContainer aContainer);

  /**
   * called when the decoder is dying off
   */
  void onStopDecode(imgIRequest aRequest, long status, String statusArg);

  /**
   * called at the same time that nsIRequestObserver::onStopRequest would be
   * (used only for observers of imgIRequest objects, which are nsIRequests,
   * not imgIDecoder objects)
   *
   * Unlike nsIRequestObserver::onStartRequest, this can be called
   * synchronously.
   */
  void onStopRequest(imgIRequest aRequest, boolean aIsLastPart);

}