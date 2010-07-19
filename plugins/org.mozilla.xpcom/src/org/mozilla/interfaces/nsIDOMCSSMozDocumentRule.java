/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/css/nsIDOMCSSMozDocumentRule.idl
 */

package org.mozilla.interfaces;

/**
 * Modified version of nsIDOMCSSMediaRule for @-moz-document rules.
 */
public interface nsIDOMCSSMozDocumentRule extends nsIDOMCSSRule {

  String NS_IDOMCSSMOZDOCUMENTRULE_IID =
    "{4eb9adac-afaf-4b8a-8640-7340863c1587}";

  nsIDOMCSSRuleList getCssRules();

  long insertRule(String rule, long index);

  void deleteRule(long index);

}