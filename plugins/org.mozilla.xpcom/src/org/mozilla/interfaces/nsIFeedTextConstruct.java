/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/feeds/public/nsIFeedTextConstruct.idl
 */

package org.mozilla.interfaces;

/**
 * nsIFeedTextConstructs represent feed text fields that can contain
 * one of text, HTML, or XHTML. Some extension elements also have "type"
 * parameters, and this interface could be used there as well.
 */
public interface nsIFeedTextConstruct extends nsISupports {

  String NS_IFEEDTEXTCONSTRUCT_IID =
    "{fc97a2a9-d649-4494-931e-db81a156c873}";

  /**
   * If the text construct contains (X)HTML, relative references in
   * the content should be resolved against this base URI.
   */
  nsIURI getBase();

  /**
   * If the text construct contains (X)HTML, relative references in
   * the content should be resolved against this base URI.
   */
  void setBase(nsIURI aBase);

  /**
   * The language of the text. For example, "en-US" for US English.
   */
  String getLang();

  /**
   * The language of the text. For example, "en-US" for US English.
   */
  void setLang(String aLang);

  /**
   * One of "text", "html", or "xhtml". If the type is (x)html, a '<'
   * character represents markup. To display that character, an escape
   * such as &lt; must be used. If the type is "text", the '<'
   * character represents the character itself, and such text should
   * not be embedded in markup without escaping it first.
   */
  String getType();

  /**
   * One of "text", "html", or "xhtml". If the type is (x)html, a '<'
   * character represents markup. To display that character, an escape
   * such as &lt; must be used. If the type is "text", the '<'
   * character represents the character itself, and such text should
   * not be embedded in markup without escaping it first.
   */
  void setType(String aType);

  /**
   * The content of the text construct.
   */
  String getText();

  /**
   * The content of the text construct.
   */
  void setText(String aText);

  /**
   * Returns the text of the text construct, with all markup stripped 
   * and all entities decoded. If the type attribute's value is "text",
   * this function returns the value of the text attribute unchanged.
   */
  String plainText();

  /**
   * Return an nsIDocumentFragment containing the text and markup.
   */
  nsIDOMDocumentFragment createDocumentFragment(nsIDOMElement element);

}