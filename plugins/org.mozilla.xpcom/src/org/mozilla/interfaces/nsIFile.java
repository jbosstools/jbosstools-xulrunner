/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/xpcom/io/nsIFile.idl
 */

package org.mozilla.interfaces;

/**
 * This is the only correct cross-platform way to specify a file.
 * Strings are not such a way. If you grew up on windows or unix, you
 * may think they are.  Welcome to reality.
 *
 * All methods with string parameters have two forms.  The preferred
 * form operates on UCS-2 encoded characters strings.  An alternate
 * form operates on characters strings encoded in the "native" charset.
 *
 * A string containing characters encoded in the native charset cannot
 * be safely passed to javascript via xpconnect.  Therefore, the "native
 * methods" are not scriptable. 
 *
 * @status FROZEN
 */
public interface nsIFile extends nsISupports {

  String NS_IFILE_IID =
    "{c8c0a080-0868-11d3-915f-d9d889d48e3c}";

  /**
     *  Create Types
     *
     *  NORMAL_FILE_TYPE - A normal file.
     *  DIRECTORY_TYPE   - A directory/folder.
     */
  long NORMAL_FILE_TYPE = 0L;

  long DIRECTORY_TYPE = 1L;

  /**
     *  append[Native]
     *
     *  This function is used for constructing a descendent of the
     *  current nsIFile.
     *
     *   @param node
     *       A string which is intended to be a child node of the nsIFile.
     *       For the |appendNative| method, the node must be in the native
     *       filesystem charset.
     */
  void append(String node);

  /**
     *  Normalize the pathName (e.g. removing .. and . components on Unix).
     */
  void normalize();

  /**
     *  create
     *
     *  This function will create a new file or directory in the
     *  file system. Any nodes that have not been created or
     *  resolved, will be.  If the file or directory already
     *  exists create() will return NS_ERROR_FILE_ALREADY_EXISTS.
     *
     *   @param type
     *       This specifies the type of file system object
     *       to be made.  The only two types at this time
     *       are file and directory which are defined above.
     *       If the type is unrecongnized, we will return an
     *       error (NS_ERROR_FILE_UNKNOWN_TYPE).
     *
     *   @param permissions
     *       The unix style octal permissions.  This may
     *       be ignored on systems that do not need to do
     *       permissions.
     */
  void create(long type, long permissions);

  /**
     *  Accessor to the leaf name of the file itself.      
     *  For the |nativeLeafName| method, the nativeLeafName must 
     *  be in the native filesystem charset.
     */
  String getLeafName();

  /**
     *  Accessor to the leaf name of the file itself.      
     *  For the |nativeLeafName| method, the nativeLeafName must 
     *  be in the native filesystem charset.
     */
  void setLeafName(String aLeafName);

  /**
     *  copyTo[Native]
     *
     *  This will copy this file to the specified newParentDir.
     *  If a newName is specified, the file will be renamed.
     *  If 'this' is not created we will return an error
     *  (NS_ERROR_FILE_TARGET_DOES_NOT_EXIST).
     *
     *  copyTo may fail if the file already exists in the destination 
     *  directory.
     *
     *  copyTo will NOT resolve aliases/shortcuts during the copy.
     *
     *   @param newParentDir
     *       This param is the destination directory. If the
     *       newParentDir is null, copyTo() will use the parent
     *       directory of this file. If the newParentDir is not
     *       empty and is not a directory, an error will be
     *       returned (NS_ERROR_FILE_DESTINATION_NOT_DIR). For the 
     *       |CopyToNative| method, the newName must be in the 
     *       native filesystem charset.
     *
     *   @param newName
     *       This param allows you to specify a new name for
     *       the file to be copied. This param may be empty, in
     *       which case the current leaf name will be used.
     */
  void copyTo(nsIFile newParentDir, String newName);

  /**
     *  copyToFollowingLinks[Native]
     *
     *  This function is identical to copyTo with the exception that,
     *  as the name implies, it follows symbolic links.  The XP_UNIX
     *  implementation always follow symbolic links when copying.  For 
     *  the |CopyToFollowingLinks| method, the newName must be in the 
     *  native filesystem charset.
     */
  void copyToFollowingLinks(nsIFile newParentDir, String newName);

  /**
     *  moveTo[Native]
     *
     *  A method to move this file or directory to newParentDir.
     *  If a newName is specified, the file or directory will be renamed.
     *  If 'this' is not created we will return an error
     *  (NS_ERROR_FILE_TARGET_DOES_NOT_EXIST).
     *  If 'this' is a file, and the destination file already exists, moveTo
     *  will replace the old file.
     *  This object is updated to refer to the new file.
     *
     *  moveTo will NOT resolve aliases/shortcuts during the copy.
     *  moveTo will do the right thing and allow copies across volumes.
     *  moveTo will return an error (NS_ERROR_FILE_DIR_NOT_EMPTY) if 'this' is
     *  a directory and the destination directory is not empty.
     *  moveTo will return an error (NS_ERROR_FILE_ACCESS_DENIED) if 'this' is
     *  a directory and the destination directory is not writable.
     *
     *   @param newParentDir
     *       This param is the destination directory. If the
     *       newParentDir is empty, moveTo() will rename the file
     *       within its current directory. If the newParentDir is
     *       not empty and does not name a directory, an error will
     *       be returned (NS_ERROR_FILE_DESTINATION_NOT_DIR).  For 
     *       the |moveToNative| method, the newName must be in the 
     *       native filesystem charset.
     *
     *   @param newName
     *       This param allows you to specify a new name for
     *       the file to be moved. This param may be empty, in
     *       which case the current leaf name will be used.
     */
  void moveTo(nsIFile newParentDir, String newName);

  /**
     *  This will try to delete this file.  The 'recursive' flag
     *  must be PR_TRUE to delete directories which are not empty.
     *
     *  This will not resolve any symlinks.
     */
  void remove(boolean recursive);

  /**
     *  Attributes of nsIFile.
     */
  long getPermissions();

  /**
     *  Attributes of nsIFile.
     */
  void setPermissions(long aPermissions);

  long getPermissionsOfLink();

  void setPermissionsOfLink(long aPermissionsOfLink);

  /**
     *  File Times are to be in milliseconds from
     *  midnight (00:00:00), January 1, 1970 Greenwich Mean
     *  Time (GMT).
     */
  long getLastModifiedTime();

  /**
     *  File Times are to be in milliseconds from
     *  midnight (00:00:00), January 1, 1970 Greenwich Mean
     *  Time (GMT).
     */
  void setLastModifiedTime(long aLastModifiedTime);

  long getLastModifiedTimeOfLink();

  void setLastModifiedTimeOfLink(long aLastModifiedTimeOfLink);

  /**
     *  WARNING!  On the Mac, getting/setting the file size with nsIFile
     *  only deals with the size of the data fork.  If you need to
     *  know the size of the combined data and resource forks use the
     *  GetFileSizeWithResFork() method defined on nsILocalFileMac.
     */
  long getFileSize();

  /**
     *  WARNING!  On the Mac, getting/setting the file size with nsIFile
     *  only deals with the size of the data fork.  If you need to
     *  know the size of the combined data and resource forks use the
     *  GetFileSizeWithResFork() method defined on nsILocalFileMac.
     */
  void setFileSize(long aFileSize);

  long getFileSizeOfLink();

  /**
     *  target & path
     *
     *  Accessor to the string path.  The native version of these
     *  strings are not guaranteed to be a usable path to pass to
     *  NSPR or the C stdlib.  There are problems that affect
     *  platforms on which a path does not fully specify a file
     *  because two volumes can have the same name (e.g., mac).
     *  This is solved by holding "private", native data in the
     *  nsIFile implementation.  This native data is lost when
     *  you convert to a string.
     *
     *      DO NOT PASS TO USE WITH NSPR OR STDLIB!
     *
     *  target
     *      Find out what the symlink points at.  Will give error
     *      (NS_ERROR_FILE_INVALID_PATH) if not a symlink.
     *
     *  path
     *      Find out what the nsIFile points at.
     *
     *  Note that the ACString attributes are returned in the 
     *  native filesystem charset.
     *
     */
  String getTarget();

  String getPath();

  boolean exists();

  boolean isWritable();

  boolean isReadable();

  boolean isExecutable();

  boolean isHidden();

  boolean isDirectory();

  boolean isFile();

  boolean isSymlink();

  /**
     * Not a regular file, not a directory, not a symlink.
     */
  boolean isSpecial();

  /**
     *  createUnique
     *  
     *  This function will create a new file or directory in the
     *  file system. Any nodes that have not been created or
     *  resolved, will be.  If this file already exists, we try
     *  variations on the leaf name "suggestedName" until we find
     *  one that did not already exist.
     *
     *  If the search for nonexistent files takes too long
     *  (thousands of the variants already exist), we give up and
     *  return NS_ERROR_FILE_TOO_BIG.
     *
     *   @param type
     *       This specifies the type of file system object
     *       to be made.  The only two types at this time
     *       are file and directory which are defined above.
     *       If the type is unrecongnized, we will return an
     *       error (NS_ERROR_FILE_UNKNOWN_TYPE).
     *
     *   @param permissions
     *       The unix style octal permissions.  This may
     *       be ignored on systems that do not need to do
     *       permissions.
     */
  void createUnique(long type, long permissions);

  /**
      * clone()
      *
      * This function will allocate and initialize a nsIFile object to the
      * exact location of the |this| nsIFile.
      *
      *   @param file
      *          A nsIFile which this object will be initialize
      *          with.
      *
      */
  nsIFile _clone();

  /**
     *  Will determine if the inFile equals this.
     */
  boolean _equals(nsIFile inFile);

  /**
     *  Will determine if inFile is a descendant of this file
     *  If |recur| is true, look in subdirectories too
     */
  boolean contains(nsIFile inFile, boolean recur);

  /**
     *  Parent will be null when this is at the top of the volume.
     */
  nsIFile getParent();

  /**
     *  Returns an enumeration of the elements in a directory. Each
     *  element in the enumeration is an nsIFile.
     *
     *   @return NS_ERROR_FILE_NOT_DIRECTORY if the current nsIFile does
     *           not specify a directory.
     */
  nsISimpleEnumerator getDirectoryEntries();

}