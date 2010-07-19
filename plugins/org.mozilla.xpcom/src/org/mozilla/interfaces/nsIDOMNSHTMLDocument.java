/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/html/nsIDOMNSHTMLDocument.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMNSHTMLDocument extends nsISupports {

  String NS_IDOMNSHTMLDOCUMENT_IID =
    "{79beb289-3644-4b54-9432-9fb993945629}";

  int getWidth();

  int getHeight();

  String getAlinkColor();

  void setAlinkColor(String aAlinkColor);

  String getLinkColor();

  void setLinkColor(String aLinkColor);

  String getVlinkColor();

  void setVlinkColor(String aVlinkColor);

  String getBgColor();

  void setBgColor(String aBgColor);

  String getFgColor();

  void setFgColor(String aFgColor);

  String getDomain();

  void setDomain(String aDomain);

  nsIDOMHTMLCollection getEmbeds();

  String getSelection();

  nsIDOMDocument open(String aContentType, boolean aReplace);

  void write();

  void writeln();

  void clear();

  /**
   * @deprecated These are old Netscape 4 methods. Do not use,
   *             the implementation is no-op.
   */
  void captureEvents(int eventFlags);

  void releaseEvents(int eventFlags);

  void routeEvent(nsIDOMEvent evt);

  String getCompatMode();

  nsIDOMHTMLCollection getPlugins();

  /**
    * Midas additions
    */
  String getDesignMode();

  /**
    * Midas additions
    */
  void setDesignMode(String aDesignMode);

  boolean execCommand(String commandID, boolean doShowUI, String value);

  boolean execCommandShowHelp(String commandID);

  boolean queryCommandEnabled(String commandID);

  boolean queryCommandIndeterm(String commandID);

  boolean queryCommandState(String commandID);

  boolean queryCommandSupported(String commandID);

  String queryCommandText(String commandID);

  String queryCommandValue(String commandID);

}