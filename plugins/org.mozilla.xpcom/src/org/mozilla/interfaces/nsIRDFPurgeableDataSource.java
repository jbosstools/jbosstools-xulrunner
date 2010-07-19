/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/rdf/base/idl/nsIRDFPurgeableDataSource.idl
 */

package org.mozilla.interfaces;

public interface nsIRDFPurgeableDataSource extends nsISupports {

  String NS_IRDFPURGEABLEDATASOURCE_IID =
    "{951700f0-fed0-11d2-bdd9-00104bde6048}";

  boolean mark(nsIRDFResource aSource, nsIRDFResource aProperty, nsIRDFNode aTarget, boolean aTruthValue);

  void sweep();

}