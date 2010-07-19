/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/satchel/public/nsIFormHistory.idl
 */

package org.mozilla.interfaces;

/**
 * nsIFormHistoryImporter is an interface for importing a Mork formhistory.dat
 * file into the new form history storage.
 */
public interface nsIFormHistoryImporter extends nsISupports {

  String NS_IFORMHISTORYIMPORTER_IID =
    "{9e811188-6a5b-4d96-a92d-1bac66a41898}";

  /**
   * Import the given Mork form history file.
   *  @param file     The Mork form history file to import
   *  @param history  A reference to the nsIFormHistory.  This is
   *                  supplied since the importer is invoked during
   *                  form history initialization.
   */
  void importFormHistory(nsIFile file, nsIFormHistory2 formHistory);

}