/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/content/html/content/public/nsISelectElement.idl
 */

package org.mozilla.interfaces;

/** 
 * This interface is used to notify a SELECT when OPTION
 * elements are added and removed from its subtree.
 * Note that the nsIDOMHTMLSelectElement and nsIContent 
 * interfaces are the ones to use to access and enumerate
 * OPTIONs within a SELECT element.
 */
public interface nsISelectElement extends nsISupports {

  String NS_ISELECTELEMENT_IID =
    "{35bd8ed5-5f34-4126-8c4f-38ba01681836}";

  /**
   * Checks whether an option is disabled (even if it's part of an optgroup)
   *
   * @param aIndex the index of the option to check
   * @return whether the option is disabled
   */
  boolean isOptionDisabled(int aIndex);

  /**
   * Sets multiple options (or just sets startIndex if select is single)
   * and handles notifications and cleanup and everything under the sun.
   * When this method exits, the select will be in a consistent state.  i.e.
   * if you set the last option to false, it will select an option anyway.
   *
   * @param aStartIndex the first index to set
   * @param aEndIndex the last index to set (set same as first index for one
   *        option)
   * @param aIsSelected whether to set the option(s) to true or false
   * @param aClearAll whether to clear all other options (for example, if you
   *        are normal-clicking on the current option)
   * @param aSetDisabled whether it is permissible to set disabled options
   *        (for JavaScript)
   * @param aNotify whether to notify frames and such
   * @return whether any options were actually changed
   */
  boolean setOptionsSelectedByIndex(int aStartIndex, int aEndIndex, boolean aIsSelected, boolean aClearAll, boolean aSetDisabled, boolean aNotify);

  /**
   * Finds the index of a given option element
   *
   * @param aOption the option to get the index of
   * @param aStartIndex the index to start looking at
   * @param aForward TRUE to look forward, FALSE to look backward
   * @return the option index
   */
  int getOptionIndex(nsIDOMHTMLOptionElement aOption, int aStartIndex, boolean aForward);

  /** Whether or not there are optgroups in this select */
  boolean getHasOptGroups();

}