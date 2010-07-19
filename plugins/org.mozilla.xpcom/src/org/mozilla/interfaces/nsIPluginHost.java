/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/modules/plugin/base/public/nsIPluginHost.idl
 */

package org.mozilla.interfaces;

public interface nsIPluginHost extends nsISupports {

  String NS_IPLUGINHOST_IID =
    "{30c7c529-b05c-4950-b5b8-9af673e46521}";

  /**
   * Causes the plugins directory to be searched again for new plugin 
   * libraries.
   *
   * @param reloadPages - indicates whether currently visible pages should 
   * also be reloaded
   */
  void reloadPlugins(boolean reloadPages);

  nsIPluginTag[] getPluginTags(long[] aPluginCount);

  /**
   * Fetches a URL.
   *
   * (Corresponds to NPN_GetURL and NPN_GetURLNotify.)
   *
   * @param pluginInst - the plugin making the request. If NULL, the URL
   *  is fetched in the background.
   * @param url - the URL to fetch
   * @param target - the target window into which to load the URL, or NULL if
   *  the data should be returned to the plugin via streamListener.
   * @param streamListener - a stream listener to be used to return data to
   *  the plugin. May be NULL if target is not NULL.
   * @param altHost - an IP-address string that will be used instead of the 
   *  host specified in the URL. This is used to prevent DNS-spoofing 
   *  attacks. Can be defaulted to NULL meaning use the host in the URL.
   * @param referrer - the referring URL (may be NULL)
   * @param forceJSEnabled - forces JavaScript to be enabled for 'javascript:'
   *  URLs, even if the user currently has JavaScript disabled (usually 
   *  specify PR_FALSE) 
   * @result - NS_OK if this operation was successful
   */
/**
   * Posts to a URL with post data and/or post headers.
   *
   * (Corresponds to NPN_PostURL and NPN_PostURLNotify.)
   *
   * @param pluginInst - the plugin making the request. If NULL, the URL
   *  is fetched in the background.
   * @param url - the URL to fetch
   * @param postDataLength - the length of postData (if non-NULL)
   * @param postData - the data to POST. NULL specifies that there is not post
   *  data
   * @param isFile - whether the postData specifies the name of a file to 
   *  post instead of data. The file will be deleted afterwards.
   * @param target - the target window into which to load the URL, or NULL if
   *  the data should be returned to the plugin via streamListener.
   * @param streamListener - a stream listener to be used to return data to
   *  the plugin. May be NULL if target is not NULL.
   * @param altHost - an IP-address string that will be used instead of the 
   *  host specified in the URL. This is used to prevent DNS-spoofing 
   *  attacks. Can be defaulted to NULL meaning use the host in the URL.
   * @param referrer - the referring URL (may be NULL)
   * @param forceJSEnabled - forces JavaScript to be enabled for 'javascript:'
   *  URLs, even if the user currently has JavaScript disabled (usually 
   *  specify PR_FALSE) 
   * @param postHeadersLength - the length of postHeaders (if non-NULL)
   * @param postHeaders - the headers to POST. Must be in the form of
   * "HeaderName: HeaderValue\r\n".  Each header, including the last,
   * must be followed by "\r\n".  NULL specifies that there are no
   * post headers
   * @result - NS_OK if this operation was successful
   */
/**
   * Returns the proxy info for a given URL. The caller is required to
   * free the resulting memory with nsIMalloc::Free. The result will be in the
   * following format
   * 
   *   i)   "DIRECT"  -- no proxy
   *   ii)  "PROXY xxx.xxx.xxx.xxx"   -- use proxy
   *   iii) "SOCKS xxx.xxx.xxx.xxx"  -- use SOCKS
   *   iv)  Mixed. e.g. "PROXY 111.111.111.111;PROXY 112.112.112.112",
   *                    "PROXY 111.111.111.111;SOCKS 112.112.112.112"....
   *
   * Which proxy/SOCKS to use is determined by the plugin.
   */
  void findProxyForURL(String aURL, String[] aResult);

}