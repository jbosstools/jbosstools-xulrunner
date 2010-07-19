/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/rdf/base/idl/nsIRDFPropagatableDataSource.idl
 */

package org.mozilla.interfaces;

/**
 * An nsIRDFPropagatableDataSource provides an ability to suppress
 * synchronization notifications.
 */
public interface nsIRDFPropagatableDataSource extends nsISupports {

  String NS_IRDFPROPAGATABLEDATASOURCE_IID =
    "{5a9b4770-9fcb-4307-a12e-4b6708e78b97}";

  /**
   * Set this value to <code>true</code> to enable synchronization
   * notifications.
   *
   * Set this value to <code>false</code> to disable synchronization
   * notifications.
   *
   * By default, this value is <code>true</code>.
   */
  boolean getPropagateChanges();

  /**
   * Set this value to <code>true</code> to enable synchronization
   * notifications.
   *
   * Set this value to <code>false</code> to disable synchronization
   * notifications.
   *
   * By default, this value is <code>true</code>.
   */
  void setPropagateChanges(boolean aPropagateChanges);

}