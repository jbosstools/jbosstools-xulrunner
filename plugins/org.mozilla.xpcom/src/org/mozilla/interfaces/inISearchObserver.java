/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/layout/inspector/public/inISearchObserver.idl
 */

package org.mozilla.interfaces;

public interface inISearchObserver extends nsISupports {

  String INISEARCHOBSERVER_IID =
    "{46226d9b-e398-4106-8d9b-225d4d0589f5}";

  short IN_SUCCESS = 1;

  short IN_INTERRUPTED = 2;

  short IN_ERROR = 3;

  void onSearchStart(inISearchProcess aModule);

  void onSearchResult(inISearchProcess aModule);

  void onSearchEnd(inISearchProcess aModule, short aResult);

  void onSearchError(inISearchProcess aModule, String aMessage);

}