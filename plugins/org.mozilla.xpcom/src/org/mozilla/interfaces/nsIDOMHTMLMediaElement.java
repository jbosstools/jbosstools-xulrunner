/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMHTMLMediaElement.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMHTMLMediaElement interface is an interface to be implemented by the HTML
 * <audio> and <video> elements.
 *
 * For more information on this interface, please see
 * http://www.whatwg.org/specs/web-apps/current-work/#htmlmediaelement
 *
 * @status UNDER_DEVELOPMENT
 */
public interface nsIDOMHTMLMediaElement extends nsIDOMHTMLElement {

  String NS_IDOMHTMLMEDIAELEMENT_IID =
    "{505b523e-4a27-4151-b0eb-750b7258760e}";

  nsIDOMHTMLMediaError getError();

  String getSrc();

  void setSrc(String aSrc);

  String getCurrentSrc();

  int NETWORK_EMPTY = 0;

  int NETWORK_IDLE = 1;

  int NETWORK_LOADING = 2;

  int NETWORK_LOADED = 3;

  int NETWORK_NO_SOURCE = 4;

  int getNetworkState();

  void load();

  String canPlayType(String type);

  int HAVE_NOTHING = 0;

  int HAVE_METADATA = 1;

  int HAVE_CURRENT_DATA = 2;

  int HAVE_FUTURE_DATA = 3;

  int HAVE_ENOUGH_DATA = 4;

  int getReadyState();

  boolean getSeeking();

  float getCurrentTime();

  void setCurrentTime(float aCurrentTime);

  float getDuration();

  boolean getPaused();

  boolean getEnded();

  boolean getMozAutoplayEnabled();

  boolean getAutoplay();

  void setAutoplay(boolean aAutoplay);

  boolean getAutobuffer();

  void setAutobuffer(boolean aAutobuffer);

  void play();

  void pause();

  boolean getControls();

  void setControls(boolean aControls);

  float getVolume();

  void setVolume(float aVolume);

  boolean getMuted();

  void setMuted(boolean aMuted);

  void mozLoadFrom(nsIDOMHTMLMediaElement other);

}