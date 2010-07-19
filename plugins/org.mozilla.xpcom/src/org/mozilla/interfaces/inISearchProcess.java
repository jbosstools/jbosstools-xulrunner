/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/layout/inspector/public/inISearchProcess.idl
 */

package org.mozilla.interfaces;

public interface inISearchProcess extends nsISupports {

  String INISEARCHPROCESS_IID =
    "{d5fa765b-2448-4686-b7c1-5ff13acb0fc9}";

  boolean getIsActive();

  int getResultCount();

  boolean getHoldResults();

  void setHoldResults(boolean aHoldResults);

  void searchSync();

  void searchAsync(inISearchObserver aObserver);

  void searchStop();

  boolean searchStep();

  String getStringResultAt(int aIndex);

  int getIntResultAt(int aIndex);

  long getUIntResultAt(int aIndex);

}