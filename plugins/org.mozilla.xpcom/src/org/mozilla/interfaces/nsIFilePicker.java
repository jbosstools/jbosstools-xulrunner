/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/widget/public/nsIFilePicker.idl
 */

package org.mozilla.interfaces;

public interface nsIFilePicker extends nsISupports {

  String NS_IFILEPICKER_IID =
    "{d24ef0aa-d555-4117-84af-9cbbb7406909}";

  short modeOpen = 0;

  short modeSave = 1;

  short modeGetFolder = 2;

  short modeOpenMultiple = 3;

  short returnOK = 0;

  short returnCancel = 1;

  short returnReplace = 2;

  int filterAll = 1;

  int filterHTML = 2;

  int filterText = 4;

  int filterImages = 8;

  int filterXML = 16;

  int filterXUL = 32;

  int filterApps = 64;

  int filterAllowURLs = 128;

  /**
  * Initialize the file picker widget.  The file picker is not valid until this
  * method is called.
  *
  * @param      parent   nsIDOMWindow parent.  This dialog will be dependent
  *                      on this parent. parent must be non-null.
  * @param      title    The title for the file widget
  * @param      mode     load, save, or get folder
  *
  */
  void init(nsIDOMWindow parent, String title, short mode);

  /**
  * Append to the  filter list with things from the predefined list
  *
  * @param      filters  mask of filters i.e. (filterAll | filterHTML)
  *
  */
  void appendFilters(int filterMask);

  /**
  * Add a filter
  *
  * @param      title    name of the filter
  * @param      filter   extensions to filter -- semicolon and space separated
  *
  */
  void appendFilter(String title, String filter);

  /**
  * The filename that should be suggested to the user as a default.
  *
  * @throws NS_ERROR_FAILURE on attempts to get
  */
  String getDefaultString();

  /**
  * The filename that should be suggested to the user as a default.
  *
  * @throws NS_ERROR_FAILURE on attempts to get
  */
  void setDefaultString(String aDefaultString);

  /**
  * The extension that should be associated with files of the type we
  * want to work with.  On some platforms, this extension will be
  * automatically appended to filenames the user enters, if needed.  
  */
  String getDefaultExtension();

  /**
  * The extension that should be associated with files of the type we
  * want to work with.  On some platforms, this extension will be
  * automatically appended to filenames the user enters, if needed.  
  */
  void setDefaultExtension(String aDefaultExtension);

  /**
  * The filter which is currently selected in the File Picker dialog
  *
  * @return Returns the index (0 based) of the selected filter in the filter list. 
  */
  int getFilterIndex();

  /**
  * The filter which is currently selected in the File Picker dialog
  *
  * @return Returns the index (0 based) of the selected filter in the filter list. 
  */
  void setFilterIndex(int aFilterIndex);

  /**
  * Set the directory that the file open/save dialog initially displays
  *
  * @param      displayDirectory  the name of the directory
  *
  */
  nsILocalFile getDisplayDirectory();

  /**
  * Set the directory that the file open/save dialog initially displays
  *
  * @param      displayDirectory  the name of the directory
  *
  */
  void setDisplayDirectory(nsILocalFile aDisplayDirectory);

  /**
  * Get the nsILocalFile for the file or directory.
  *
  * @return Returns the file currently selected
  */
  nsILocalFile getFile();

  /**
  * Get the nsIURI for the file or directory.
  *
  * @return Returns the file currently selected
  */
  nsIURI getFileURL();

  /**
  * Get the enumerator for the selected files
  * only works in the modeOpenMultiple mode
  *
  * @return Returns the files currently selected
  */
  nsISimpleEnumerator getFiles();

  /**
  * Show File Dialog. The dialog is displayed modally.
  *
  * @return returnOK if the user selects OK, returnCancel if the user selects cancel
  *
  */
  short show();

}