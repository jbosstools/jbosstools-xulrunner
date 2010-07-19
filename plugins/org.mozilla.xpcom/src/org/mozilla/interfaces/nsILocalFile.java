/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsILocalFile.idl
 */

package org.mozilla.interfaces;

/**
 * This interface adds methods to nsIFile that are particular to a file
 * that is accessible via the local file system.
 *
 * It follows the same string conventions as nsIFile.
 *
 * @status FROZEN
 */
public interface nsILocalFile extends nsIFile {

  String NS_ILOCALFILE_IID =
    "{aa610f20-a889-11d3-8c81-000064657374}";

  /**
     *  initWith[Native]Path
     *
     *  This function will initialize the nsILocalFile object.  Any
     *  internal state information will be reset.
     *
     *   @param filePath       
     *       A string which specifies a full file path to a 
     *       location.  Relative paths will be treated as an
     *       error (NS_ERROR_FILE_UNRECOGNIZED_PATH).  For 
     *       initWithNativePath, the filePath must be in the native
     *       filesystem charset.
     */
  void initWithPath(String filePath);

  /**
     *  initWithFile
     *
     *  Initialize this object with another file
     *
     *   @param aFile
     *       the file this becomes equivalent to
     */
  void initWithFile(nsILocalFile aFile);

  /**
     *  followLinks
     *
     *  This attribute will determine if the nsLocalFile will auto
     *  resolve symbolic links.  By default, this value will be false
     *  on all non unix systems.  On unix, this attribute is effectively
     *  a noop.  
     */
  boolean getFollowLinks();

  /**
     *  followLinks
     *
     *  This attribute will determine if the nsLocalFile will auto
     *  resolve symbolic links.  By default, this value will be false
     *  on all non unix systems.  On unix, this attribute is effectively
     *  a noop.  
     */
  void setFollowLinks(boolean aFollowLinks);

  long DELETE_ON_CLOSE = 2147483648L;

  long getDiskSpaceAvailable();

  /**
     *  appendRelative[Native]Path
     *
     *  Append a relative path to the current path of the nsILocalFile object.
     *
     *   @param relativeFilePath
     *       relativeFilePath is a native relative path. For security reasons,
     *       this cannot contain .. or cannot start with a directory separator.
     *       For the |appendRelativeNativePath| method, the relativeFilePath 
     *       must be in the native filesystem charset.
     */
  void appendRelativePath(String relativeFilePath);

  /**
     *  Accessor to a null terminated string which will specify
     *  the file in a persistent manner for disk storage.
     *
     *  The character set of this attribute is undefined.  DO NOT TRY TO
     *  INTERPRET IT AS HUMAN READABLE TEXT!
     */
  String getPersistentDescriptor();

  /**
     *  Accessor to a null terminated string which will specify
     *  the file in a persistent manner for disk storage.
     *
     *  The character set of this attribute is undefined.  DO NOT TRY TO
     *  INTERPRET IT AS HUMAN READABLE TEXT!
     */
  void setPersistentDescriptor(String aPersistentDescriptor);

  /** 
     *  reveal
     *
     *  Ask the operating system to open the folder which contains
     *  this file or folder. This routine only works on platforms which 
     *  support the ability to open a folder...
     */
  void reveal();

  /** 
     *  launch
     *
     *  Ask the operating system to attempt to open the file. 
     *  this really just simulates "double clicking" the file on your platform.
     *  This routine only works on platforms which support this functionality.
     */
  void launch();

  /**
     *  getRelativeDescriptor
     *
     *  Returns a relative file path in an opaque, XP format. It is therefore
     *  not a native path.
     *
     *  The character set of the string returned from this function is
     *  undefined.  DO NOT TRY TO INTERPRET IT AS HUMAN READABLE TEXT!
     *
     *   @param fromFile
     *       the file from which the descriptor is relative.
     *       There is no defined result if this param is null.
     */
  String getRelativeDescriptor(nsILocalFile fromFile);

  /**
     *  setRelativeDescriptor
     *
     *  Initializes the file to the location relative to fromFile using
     *  a string returned by getRelativeDescriptor.
     *
     *   @param fromFile
     *       the file to which the descriptor is relative
     *   @param relative
     *       the relative descriptor obtained from getRelativeDescriptor
     */
  void setRelativeDescriptor(nsILocalFile fromFile, String relativeDesc);

}