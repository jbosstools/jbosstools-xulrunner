/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/extensions/spellcheck/idl/mozISpellI18NManager.idl
 */

package org.mozilla.interfaces;

/**
 * This interface contains various I18N related code used in various places
 * by the spell checker.
 */
public interface mozISpellI18NManager extends nsISupports {

  String MOZISPELLI18NMANAGER_IID =
    "{aeb8936f-219c-4d3c-8385-d9382daa551a}";

  /**
   * Get a mozISpellI18NUtil interface that best matches the given language.
   */
  mozISpellI18NUtil getUtil(String language);

}