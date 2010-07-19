/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIURL.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIURL interface provides convenience methods that further
 * break down the path portion of nsIURI:
 *
 * http://host/directory/fileBaseName.fileExtension?query
 * http://host/directory/fileBaseName.fileExtension#ref
 * http://host/directory/fileBaseName.fileExtension;param
 *            \          \                       /
 *             \          -----------------------
 *              \                   |          /
 *               \               fileName     /
 *                ----------------------------
 *                            |
 *                        filePath
 *
 * @status FROZEN
 */
public interface nsIURL extends nsIURI {

  String NS_IURL_IID =
    "{d6116970-8034-11d3-9399-00104ba0fd40}";

  /*************************************************************************
     * The URL path is broken down into the following principal components:
     */
/**
     * Returns a path including the directory and file portions of a
     * URL.  For example, the filePath of "http://host/foo/bar.html#baz"
     * is "/foo/bar.html".
     *
     * Some characters may be escaped.
     */
  String getFilePath();

  /*************************************************************************
     * The URL path is broken down into the following principal components:
     */
/**
     * Returns a path including the directory and file portions of a
     * URL.  For example, the filePath of "http://host/foo/bar.html#baz"
     * is "/foo/bar.html".
     *
     * Some characters may be escaped.
     */
  void setFilePath(String aFilePath);

  /**
     * Returns the parameters specified after the ; in the URL. 
     *
     * Some characters may be escaped.
     */
  String getParam();

  /**
     * Returns the parameters specified after the ; in the URL. 
     *
     * Some characters may be escaped.
     */
  void setParam(String aParam);

  /**
     * Returns the query portion (the part after the "?") of the URL.
     * If there isn't one, an empty string is returned.
     *
     * Some characters may be escaped.
     */
  String getQuery();

  /**
     * Returns the query portion (the part after the "?") of the URL.
     * If there isn't one, an empty string is returned.
     *
     * Some characters may be escaped.
     */
  void setQuery(String aQuery);

  /**
     * Returns the reference portion (the part after the "#") of the URL.
     * If there isn't one, an empty string is returned.
     *
     * Some characters may be escaped.
     */
  String getRef();

  /**
     * Returns the reference portion (the part after the "#") of the URL.
     * If there isn't one, an empty string is returned.
     *
     * Some characters may be escaped.
     */
  void setRef(String aRef);

  /*************************************************************************
     * The URL filepath is broken down into the following sub-components:
     */
/**
     * Returns the directory portion of a URL.  If the URL denotes a path to a
     * directory and not a file, e.g. http://host/foo/bar/, then the Directory
     * attribute accesses the complete /foo/bar/ portion, and the FileName is
     * the empty string. If the trailing slash is omitted, then the Directory
     * is /foo/ and the file is bar (i.e. this is a syntactic, not a semantic
     * breakdown of the Path).  And hence don't rely on this for something to
     * be a definitely be a file. But you can get just the leading directory
     * portion for sure.
     *
     * Some characters may be escaped.
     */
  String getDirectory();

  /*************************************************************************
     * The URL filepath is broken down into the following sub-components:
     */
/**
     * Returns the directory portion of a URL.  If the URL denotes a path to a
     * directory and not a file, e.g. http://host/foo/bar/, then the Directory
     * attribute accesses the complete /foo/bar/ portion, and the FileName is
     * the empty string. If the trailing slash is omitted, then the Directory
     * is /foo/ and the file is bar (i.e. this is a syntactic, not a semantic
     * breakdown of the Path).  And hence don't rely on this for something to
     * be a definitely be a file. But you can get just the leading directory
     * portion for sure.
     *
     * Some characters may be escaped.
     */
  void setDirectory(String aDirectory);

  /**
     * Returns the file name portion of a URL.  If the URL denotes a path to a
     * directory and not a file, e.g. http://host/foo/bar/, then the Directory
     * attribute accesses the complete /foo/bar/ portion, and the FileName is
     * the empty string. Note that this is purely based on searching for the
     * last trailing slash. And hence don't rely on this to be a definite file. 
     *
     * Some characters may be escaped.
     */
  String getFileName();

  /**
     * Returns the file name portion of a URL.  If the URL denotes a path to a
     * directory and not a file, e.g. http://host/foo/bar/, then the Directory
     * attribute accesses the complete /foo/bar/ portion, and the FileName is
     * the empty string. Note that this is purely based on searching for the
     * last trailing slash. And hence don't rely on this to be a definite file. 
     *
     * Some characters may be escaped.
     */
  void setFileName(String aFileName);

  /*************************************************************************
     * The URL filename is broken down even further:
     */
/**
     * Returns the file basename portion of a filename in a url.
     *
     * Some characters may be escaped.
     */
  String getFileBaseName();

  /*************************************************************************
     * The URL filename is broken down even further:
     */
/**
     * Returns the file basename portion of a filename in a url.
     *
     * Some characters may be escaped.
     */
  void setFileBaseName(String aFileBaseName);

  /**
     * Returns the file extension portion of a filename in a url.  If a file
     * extension does not exist, the empty string is returned.
     *
     * Some characters may be escaped.
     */
  String getFileExtension();

  /**
     * Returns the file extension portion of a filename in a url.  If a file
     * extension does not exist, the empty string is returned.
     *
     * Some characters may be escaped.
     */
  void setFileExtension(String aFileExtension);

  /**
     * This method takes a uri and compares the two.  The common uri portion
     * is returned as a string.  The minimum common uri portion is the 
     * protocol, and any of these if present:  login, password, host and port
     * If no commonality is found, "" is returned.  If they are identical, the
     * whole path with file/ref/etc. is returned.  For file uris, it is
     * expected that the common spec would be at least "file:///" since '/' is
     * a shared common root.
     *
     * Examples:
     *    this.spec               aURIToCompare.spec        result
     * 1) http://mozilla.org/     http://www.mozilla.org/   ""
     * 2) http://foo.com/bar/     ftp://foo.com/bar/        ""
     * 3) http://foo.com:8080/    http://foo.com/bar/       ""
     * 4) ftp://user@foo.com/     ftp://user:pw@foo.com/    ""
     * 5) ftp://foo.com/bar/      ftp://foo.com/bar         ftp://foo.com/
     * 6) ftp://foo.com/bar/      ftp://foo.com/bar/b.html  ftp://foo.com/bar/
     * 7) http://foo.com/a.htm#i  http://foo.com/b.htm      http://foo.com/
     * 8) ftp://foo.com/c.htm#i   ftp://foo.com/c.htm       ftp://foo.com/c.htm
     * 9) file:///a/b/c.html      file:///d/e/c.html        file:///
     */
  String getCommonBaseSpec(nsIURI aURIToCompare);

  /**
     * This method takes a uri and returns a substring of this if it can be
     * made relative to the uri passed in.  If no commonality is found, the
     * entire uri spec is returned.  If they are identical, "" is returned.
     * Filename, query, etc are always returned except when uris are identical.
     */
  String getRelativeSpec(nsIURI aURIToCompare);

}