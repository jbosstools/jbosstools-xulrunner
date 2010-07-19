/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIFileStreams.idl
 */

package org.mozilla.interfaces;

/**
 * An output stream that lets you stream to a file.
 */
public interface nsIFileOutputStream extends nsIOutputStream {

  String NS_IFILEOUTPUTSTREAM_IID =
    "{e6f68040-c7ec-11d3-8cda-0060b0fc14a3}";

  /**
     * @param file          file to write to (must QI to nsILocalFile)
     * @param ioFlags       file open flags listed in prio.h (see
     *                      PR_Open documentation) or -1 to open the
     *                      file in default mode (PR_WRONLY |
     *                      PR_CREATE_FILE | PR_TRUNCATE)
     * @param perm          file mode bits listed in prio.h or -1 to
     *                      use the default permissions (0664)
     * @param behaviorFlags flags specifying various behaviors of the class
     *        (currently none supported)
     */
  void init(nsIFile file, int ioFlags, int perm, int behaviorFlags);

}