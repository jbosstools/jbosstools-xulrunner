/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/base/nsIDOMWindowInternal.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMWindowInternal extends nsIDOMWindow2 {

  String NS_IDOMWINDOWINTERNAL_IID =
    "{c2f4433a-8b4c-4676-ab30-3bffd26fb29e}";

  nsIDOMWindowInternal getWindow();

  nsIDOMWindowInternal getSelf();

  nsIDOMNavigator getNavigator();

  nsIDOMScreen getScreen();

  nsIDOMHistory getHistory();

  nsIDOMWindow getContent();

  nsIDOMBarProp getMenubar();

  nsIDOMBarProp getToolbar();

  nsIDOMBarProp getLocationbar();

  nsIDOMBarProp getPersonalbar();

  nsIDOMBarProp getStatusbar();

  nsIDOMBarProp getDirectories();

  boolean getClosed();

  nsIDOMCrypto getCrypto();

  nsIDOMPkcs11 getPkcs11();

  nsIControllers getControllers();

  nsIDOMWindowInternal getOpener();

  void setOpener(nsIDOMWindowInternal aOpener);

  String getStatus();

  void setStatus(String aStatus);

  String getDefaultStatus();

  void setDefaultStatus(String aDefaultStatus);

  nsIDOMLocation getLocation();

  int getInnerWidth();

  void setInnerWidth(int aInnerWidth);

  int getInnerHeight();

  void setInnerHeight(int aInnerHeight);

  int getOuterWidth();

  void setOuterWidth(int aOuterWidth);

  int getOuterHeight();

  void setOuterHeight(int aOuterHeight);

  int getScreenX();

  void setScreenX(int aScreenX);

  int getScreenY();

  void setScreenY(int aScreenY);

  float getMozInnerScreenX();

  float getMozInnerScreenY();

  int getPageXOffset();

  int getPageYOffset();

  int getScrollMaxX();

  int getScrollMaxY();

  long getLength();

  boolean getFullScreen();

  void setFullScreen(boolean aFullScreen);

  void alert(String text);

  boolean confirm(String text);

  String prompt(String aMessage, String aInitial, String aTitle, long aSavePassword);

  void focus();

  void blur();

  void back();

  void forward();

  void home();

  void stop();

  void print();

  void moveTo(int xPos, int yPos);

  void moveBy(int xDif, int yDif);

  void resizeTo(int width, int height);

  void resizeBy(int widthDif, int heightDif);

  void scroll(int xScroll, int yScroll);

  void close();

  void updateCommands(String action);

  boolean find(String str, boolean caseSensitive, boolean backwards, boolean wrapAround, boolean wholeWord, boolean searchInFrames, boolean showDialog);

  String atob(String aAsciiString);

  String btoa(String aBase64Data);

  nsIDOMElement getFrameElement();

  nsIVariant showModalDialog(String aURI, nsIVariant aArgs, String aOptions);

  /**
   * Implements a safe message-passing system which can cross same-origin
   * boundaries.
   *
   * This method, when called, causes a MessageEvent to be asynchronously
   * dispatched at the primary document for the window upon which this method is
   * called.  (Note that the postMessage property on windows is allAccess and
   * thus is readable cross-origin.)  The dispatched event will have message as
   * its data, the calling context's window as its source, and an origin
   * determined by the calling context's main document URI.  The targetOrigin
   * argument specifies a URI and is used to restrict the message to be sent
   * only when the target window has the same origin as targetOrigin (since,
   * when the sender and the target have different origins, neither can read the
   * location of the other).
   * 
   * See the WHATWG HTML5 specification, section 6.4, for more details.
   */
  void postMessage(String message, String targetOrigin);

}