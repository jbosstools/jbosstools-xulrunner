/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/css/nsIDOMCSSMediaRule.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMCSSMediaRule extends nsIDOMCSSRule {

  String NS_IDOMCSSMEDIARULE_IID =
    "{a6cf90bc-15b3-11d2-932e-00805f8add32}";

  nsIDOMMediaList getMedia();

  nsIDOMCSSRuleList getCssRules();

  long insertRule(String rule, long index);

  void deleteRule(long index);

}