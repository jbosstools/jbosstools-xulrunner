/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/libpr0n/public/imgIContainer.idl
 */

package org.mozilla.interfaces;

/**
 * imgIContainer is the interface that represents an image. It allows
 * access to frames as Thebes surfaces, and permits users to extract subregions
 * as other imgIContainers. It also allows drawing of images on to Thebes
 * contexts.
 *
 * Internally, imgIContainer also manages animation of images.
 */
public interface imgIContainer extends nsISupports {

  String IMGICONTAINER_IID =
    "{1bcf7a25-1356-47a8-bf80-e284989ea38f}";

  /**
   * The width of the container rectangle.
   */
  int getWidth();

  /**
   * The height of the container rectangle.
   */
  int getHeight();

  /**
   * Whether this image is animated.
   */
  boolean getAnimated();

  /**
   * Whether the current frame is opaque; that is, needs the background painted
   * behind it.
   */
  boolean getCurrentFrameIsOpaque();

  /************ Internal libpr0n use only below here. *****************/
/**
   * Create a new \a aWidth x \a aHeight sized image container.
   *
   * @param aWidth The width of the container in which all the
   *               frames will fit.
   * @param aHeight The height of the container in which all the
   *                frames will fit.
   * @param aObserver Observer to send animation notifications to.
   */
  void init(int aWidth, int aHeight, imgIContainerObserver aObserver);

  /** 
   * "Disposal" method indicates how the image should be handled before the
   *  subsequent image is displayed.
   *  Don't change these without looking at the implementations using them,
   *  struct gif_struct::disposal_method and gif_write() in particular.
   */
  int kDisposeClearAll = -1;

  int kDisposeNotSpecified = 0;

  int kDisposeKeep = 1;

  int kDisposeClear = 2;

  int kDisposeRestorePrevious = 3;

  int kBlendSource = 0;

  int kBlendOver = 1;

  /**
   * Animation mode Constants
   *   0 = normal
   *   1 = don't animate
   *   2 = loop once
   */
  short kNormalAnimMode = 0;

  short kDontAnimMode = 1;

  short kLoopOnceAnimMode = 2;

  int getAnimationMode();

  void setAnimationMode(int aAnimationMode);

  /**
   * The index of the current frame that would be drawn if the image was to be
   * drawn now.
   */
  long getCurrentFrameIndex();

  /**
   * The total number of frames in this image.
   */
  long getNumFrames();

  /**
   * Get the size, in bytes, of a particular frame's image data.
   */
  long getFrameImageDataLength(long framenumber);

  void getFrameColormap(long framenumber, long[][] paletteData, long[] paletteLength);

  void setFrameDisposalMethod(long framenumber, int aDisposalMethod);

  void setFrameBlendMethod(long framenumber, int aBlendMethod);

  void setFrameTimeout(long framenumber, int aTimeout);

  void setFrameHasNoAlpha(long framenumber);

  void endFrameDecode(long framenumber);

  void decodingComplete();

  void startAnimation();

  void stopAnimation();

  void resetAnimation();

  /**
   * number of times to loop the image.
   * @note -1 means forever.
   */
  int getLoopCount();

  /**
   * number of times to loop the image.
   * @note -1 means forever.
   */
  void setLoopCount(int aLoopCount);

}