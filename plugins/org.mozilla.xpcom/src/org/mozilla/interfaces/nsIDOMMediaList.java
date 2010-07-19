/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/stylesheets/nsIDOMMediaList.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMMediaList extends nsISupports {

  String NS_IDOMMEDIALIST_IID =
    "{9b0c2ed7-111c-4824-adf9-ef0da6dad371}";

  /**
 * The nsIDOMMediaList interface is a datatype for a list of media
 * types in the Document Object Model.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-Style
 *
 * @status FROZEN
 */
  String getMediaText();

  /**
 * The nsIDOMMediaList interface is a datatype for a list of media
 * types in the Document Object Model.
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-2-Style
 *
 * @status FROZEN
 */
  void setMediaText(String aMediaText);

  long getLength();

  String item(long index);

  void deleteMedium(String oldMedium);

  void appendMedium(String newMedium);

}