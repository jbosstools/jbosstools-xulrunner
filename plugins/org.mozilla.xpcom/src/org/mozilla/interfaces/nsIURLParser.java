/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/netwerk/base/public/nsIURLParser.idl
 */

package org.mozilla.interfaces;

/**
 * nsIURLParser specifies the interface to an URL parser that attempts to
 * follow the definitions of RFC 2396.
 */
public interface nsIURLParser extends nsISupports {

  String NS_IURLPARSER_IID =
    "{7281076d-cf37-464a-815e-698235802604}";

  /**
     * The string to parse in the following methods may be given as a null
     * terminated string, in which case the length argument should be -1.
     *
     * Out parameters of the following methods are all optional (ie. the caller
     * may pass-in a NULL value if the corresponding results are not needed).
     * Signed out parameters may hold a value of -1 if the corresponding result
     * is not part of the string being parsed.
     *
     * The parsing routines attempt to be as forgiving as possible.
     */
/**
     * ParseSpec breaks the URL string up into its 3 major components: a scheme,
     * an authority section (hostname, etc.), and a path.
     *
     * spec = <scheme>://<authority><path>
     */
  void parseURL(String spec, int specLen, long[] schemePos, int[] schemeLen, long[] authorityPos, int[] authorityLen, long[] pathPos, int[] pathLen);

  /**
     * ParseAuthority breaks the authority string up into its 4 components:
     * username, password, hostname, and hostport.
     *
     * auth = <username>:<password>@<hostname>:<port>
     */
  void parseAuthority(String authority, int authorityLen, long[] usernamePos, int[] usernameLen, long[] passwordPos, int[] passwordLen, long[] hostnamePos, int[] hostnameLen, int[] port);

  /**
     * userinfo = <username>:<password>
     */
  void parseUserInfo(String userinfo, int userinfoLen, long[] usernamePos, int[] usernameLen, long[] passwordPos, int[] passwordLen);

  /**
     * serverinfo = <hostname>:<port>
     */
  void parseServerInfo(String serverinfo, int serverinfoLen, long[] hostnamePos, int[] hostnameLen, int[] port);

  /**
     * ParsePath breaks the path string up into its 4 major components: a file path,
     * a param string, a query string, and a reference string.
     *
     * path = <filepath>;<param>?<query>#<ref>
     */
  void parsePath(String path, int pathLen, long[] filepathPos, int[] filepathLen, long[] paramPos, int[] paramLen, long[] queryPos, int[] queryLen, long[] refPos, int[] refLen);

  /**
     * ParseFilePath breaks the file path string up into: the directory portion,
     * file base name, and file extension.
     *
     * filepath = <directory><basename>.<extension>
     */
  void parseFilePath(String filepath, int filepathLen, long[] directoryPos, int[] directoryLen, long[] basenamePos, int[] basenameLen, long[] extensionPos, int[] extensionLen);

  /**
     * filename = <basename>.<extension>
     */
  void parseFileName(String filename, int filenameLen, long[] basenamePos, int[] basenameLen, long[] extensionPos, int[] extensionLen);

}