/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/components/windowwatcher/public/nsIDialogParamBlock.idl
 */

package org.mozilla.interfaces;

/**
 * An interface to pass strings, integers and nsISupports to a dialog
 */
public interface nsIDialogParamBlock extends nsISupports {

  String NS_IDIALOGPARAMBLOCK_IID =
    "{f76c0901-437a-11d3-b7a0-e35db351b4bc}";

  /** Get or set an integer to pass.
   * Index must be in the range 0..7
   */
  int getInt(int inIndex);

  void setInt(int inIndex, int inInt);

  /** Set the maximum number of strings to pass. Default is 16.
   * Use before setting any string (If you want to change it from the default).
   */
  void setNumberStrings(int inNumStrings);

  /** Get or set an string to pass.
    * Index starts at 0
    */
  String getString(int inIndex);

  void setString(int inIndex, String inString);

  /**
   * A place where you can store an nsIMutableArray to pass nsISupports 
   */
  nsIMutableArray getObjects();

  /**
   * A place where you can store an nsIMutableArray to pass nsISupports 
   */
  void setObjects(nsIMutableArray aObjects);

}