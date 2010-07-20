/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/libjar/zipwriter/public/nsIZipWriter.idl
 */

package org.mozilla.interfaces;

/**
 * nsIZipWriter
 *
 * An interface for a zip archiver that can be used from script.
 *
 * The interface supports both a synchronous method of archiving data and a
 * queueing system to allow operations to be prepared then run in sequence
 * with notification after completion.
 *
 * Operations added to the queue do not get performed until performQueue is
 * called at which point they will be performed in the order that they were
 * added to the queue.
 *
 * Operations performed on the queue will throw any errors out to the
 * observer.
 *
 * An attempt to perform a synchronous operation while the background queue
 * is in progress will throw NS_ERROR_IN_PROGRESS.
 *
 * Entry names should use /'s as path separators and should not start with
 * a /.
 *
 * It is not generally necessary to add directory entries in order to add file
 * entries within them, however it is possible that some zip programs may
 * experience problems what that.
 */
public interface nsIZipWriter extends nsISupports {

  String NS_IZIPWRITER_IID =
    "{6d4ef074-206c-4649-9884-57bc355864d6}";

  /**
   * Some predefined compression levels
   */
  long COMPRESSION_NONE = 0L;

  long COMPRESSION_FASTEST = 1L;

  long COMPRESSION_DEFAULT = 6L;

  long COMPRESSION_BEST = 9L;

  /**
   * Gets or sets the comment associated with the open zip file.
   *
   * @throws NS_ERROR_NOT_INITIALIZED if no zip file has been opened
   */
  String getComment();

  /**
   * Gets or sets the comment associated with the open zip file.
   *
   * @throws NS_ERROR_NOT_INITIALIZED if no zip file has been opened
   */
  void setComment(String aComment);

  /**
   * Indicates that operations on the background queue are being performed.
   */
  boolean getInQueue();

  /**
   * The file that the zipwriter is writing to.
   */
  nsIFile getFile();

  /**
   * Opens a zip file.
   *
   * @param aFile the zip file to open
   * @param aIoFlags the open flags for the zip file from prio.h
   *
   * @throws NS_ERROR_ALREADY_INITIALIZED if a zip file is already open
   * @throws NS_ERROR_INVALID_ARG if aFile is null
   * @throws NS_ERROR_FILE_NOT_FOUND if aFile does not exist and flags did
   *  not allow for creation
   * @throws NS_ERROR_FILE_CORRUPTED if the file does not contain zip markers
   * @throws <other-error> on failure to open zip file (most likely corrupt
   *  or unsupported form)
   */
  void open(nsIFile aFile, int aIoFlags);

  /**
   * Returns a nsIZipEntry describing a specified zip entry or null if there
   * is no such entry in the zip file
   *
   * @param aZipEntry the path of the entry
   */
  nsIZipEntry getEntry(String aZipEntry);

  /**
   * Checks whether the zipfile contains an entry specified by zipEntry.
   *
   * @param aZipEntry the path of the entry
   */
  boolean hasEntry(String aZipEntry);

  /**
   * Adds a new directory entry to the zip file. If aZipEntry does not end with
   * "/" then it will be added.
   *
   * @param aZipEntry the path of the directory entry
   * @param aModTime the modification time of the entry in microseconds
   * @param aQueue adds the operation to the background queue. Will be
   *        performed when processQueue is called.
   *
   * @throws NS_ERROR_NOT_INITIALIZED if no zip file has been opened
   * @throws NS_ERROR_FILE_ALREADY_EXISTS if the path already exists in the
   *  file
   * @throws NS_ERROR_IN_PROGRESS if another operation is currently in progress
   */
  void addEntryDirectory(String aZipEntry, double aModTime, boolean aQueue);

  /**
   * Adds a new file or directory to the zip file. If the specified file is
   * a directory then this will be equivalent to a call to
   * addEntryDirectory(aZipEntry, aFile.lastModifiedTime, aQueue)
   *
   * @param aZipEntry the path of the file entry
   * @param aCompression the compression level, 0 is no compression, 9 is best
   * @param aFile the file to get the data and modification time from
   * @param aQueue adds the operation to the background queue. Will be
   *        performed when processQueue is called.
   *
   * @throws NS_ERROR_NOT_INITIALIZED if no zip file has been opened
   * @throws NS_ERROR_FILE_ALREADY_EXISTS if the path already exists in the zip
   * @throws NS_ERROR_IN_PROGRESS if another operation is currently in progress
   * @throws NS_ERROR_FILE_NOT_FOUND if file does not exist
   */
  void addEntryFile(String aZipEntry, int aCompression, nsIFile aFile, boolean aQueue);

  /**
   * Adds data from a channel to the zip file. If the operation is performed
   * on the queue then the channel will be opened asynchronously, otherwise
   * the channel must support being opened synchronously.
   *
   * @param aZipEntry the path of the file entry
   * @param aModTime the modification time of the entry in microseconds
   * @param aCompression the compression level, 0 is no compression, 9 is best
   * @param aChannel the channel to get the data from
   * @param aQueue adds the operation to the background queue. Will be
   *        performed when processQueue is called.
   *
   * @throws NS_ERROR_NOT_INITIALIZED if no zip file has been opened
   * @throws NS_ERROR_FILE_ALREADY_EXISTS if the path already exists in the zip
   * @throws NS_ERROR_IN_PROGRESS if another operation is currently in progress
   */
  void addEntryChannel(String aZipEntry, double aModTime, int aCompression, nsIChannel aChannel, boolean aQueue);

  /**
   * Adds data from an input stream to the zip file.
   *
   * @param aZipEntry the path of the file entry
   * @param aModTime the modification time of the entry in microseconds
   * @param aCompression the compression level, 0 is no compression, 9 is best
   * @param aStream the input stream to get the data from
   * @param aQueue adds the operation to the background queue. Will be
   *        performed when processQueue is called.
   *
   * @throws NS_ERROR_NOT_INITIALIZED if no zip file has been opened
   * @throws NS_ERROR_FILE_ALREADY_EXISTS if the path already exists in the zip
   * @throws NS_ERROR_IN_PROGRESS if another operation is currently in progress
   */
  void addEntryStream(String aZipEntry, double aModTime, int aCompression, nsIInputStream aStream, boolean aQueue);

  /**
   * Removes an existing entry from the zip file.
   *
   * @param aZipEntry the path of the entry to be removed
   * @param aQueue adds the operation to the background queue. Will be
   *        performed when processQueue is called.
   *
   * @throws NS_ERROR_NOT_INITIALIZED if no zip file has been opened
   * @throws NS_ERROR_IN_PROGRESS if another operation is currently in progress
   * @throws NS_ERROR_FILE_NOT_FOUND if no entry with the given path exists
   * @throws <other-error> on failure to update the zip file
   */
  void removeEntry(String aZipEntry, boolean aQueue);

  /**
   * Processes all queued items until complete or some error occurs. The
   * observer will be notified when the first operation starts and when the
   * last operation completes. Any failures will be passed to the observer.
   * The zip writer will be busy until the queue is complete or some error
   * halted processing of the queue early. In the event of an early failure,
   * remaining items will stay in the queue and calling processQueue will
   * continue.
   *
   * @throws NS_ERROR_NOT_INITIALIZED if no zip file has been opened
   * @throws NS_ERROR_IN_PROGRESS if the queue is already in progress
   */
  void processQueue(nsIRequestObserver aObserver, nsISupports aContext);

  /**
   * Closes the zip file.
   *
   * @throws NS_ERROR_NOT_INITIALIZED if no zip file has been opened
   * @throws NS_ERROR_IN_PROGRESS if another operation is currently in progress
   * @throws <other-error> on failure to complete the zip file
   */
  void close();

}