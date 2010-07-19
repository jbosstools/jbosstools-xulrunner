/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIFileStreams.idl
 */

package org.mozilla.interfaces;

/**
 * An input stream that allows you to read from a file.
 */
public interface nsIFileInputStream extends nsIInputStream {

  String NS_IFILEINPUTSTREAM_IID =
    "{e3d56a20-c7ec-11d3-8cda-0060b0fc14a3}";

  /**
     * @param file          file to read from (must QI to nsILocalFile)
     * @param ioFlags       file open flags listed in prio.h (see
     *                      PR_Open documentation) or -1 to open the
     *                      file in default mode (PR_RDONLY).
     * @param perm          file mode bits listed in prio.h or -1 to
     *                      use the default value (0)
     * @param behaviorFlags flags specifying various behaviors of the class
     *        (see enumerations in the class)
     */
  void init(nsIFile file, int ioFlags, int perm, int behaviorFlags);

  /**
     * If this is set, the file will be deleted by the time the stream is
     * closed.  It may be removed before the stream is closed if it is possible
     * to delete it and still read from it.
     *
     * If OPEN_ON_READ is defined, and the file was recreated after the first
     * delete, the file will be deleted again when it is closed again.
     */
  int DELETE_ON_CLOSE = 2;

  /**
     * If this is set, the file will close automatically when the end of the
     * file is reached.
     */
  int CLOSE_ON_EOF = 4;

  /**
     * If this is set, the file will be reopened whenever Seek(0) occurs.  If
     * the file is already open and the seek occurs, it will happen naturally.
     * (The file will only be reopened if it is closed for some reason.)
     */
  int REOPEN_ON_REWIND = 8;

}