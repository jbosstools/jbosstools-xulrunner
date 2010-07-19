/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/stylesheets/nsIDOMNSDocumentStyle.idl
 */

package org.mozilla.interfaces;

/**
 * The nsIDOMNSDocumentStyle interface is an extension to the
 * nsIDOMDocumentStyle interface.  This interface exposes more ways to interact
 * with style sheets in the Document Object Model.  This interface is currently
 * very much experimental.
 *
 * NOTE: This interface represents the additions to nsIDOMDocumentStyle defined
 * by <http://whatwg.org/specs/web-apps/current-work/#alternate-style-sheets>.
 * The comments here describe our implementation; if those comments don't match
 * that spec, file bugs.
 */
public interface nsIDOMNSDocumentStyle extends nsIDOMDocumentStyle {

  String NS_IDOMNSDOCUMENTSTYLE_IID =
    "{26311d10-7e24-4c7b-bb3d-17aad86f4d88}";

  /**
   * This attribute must return the preferred style sheet set as set by the
   * author. It is determined from the order of style sheet declarations and
   * the Default-Style HTTP headers, as eventually defined elsewhere in the Web
   * Apps 1.0 specification. If there is no preferred style sheet set, this
   * attribute must return the empty string. The case of this attribute must
   * exactly match the case given by the author where the preferred style sheet
   * is specified or implied. This attribute must never return null.
   */
  String getPreferredStyleSheetSet();

  /**
   * This attribute indicates which style sheet set is in use. This attribute
   * is live; changing the disabled attribute on style sheets directly will
   * change the value of this attribute.
   *
   * If all the sheets that are enabled and have a title have the same title
   * (by case-sensitive comparisons) then the value of this attribute must be
   * exactly equal to the title of the first enabled style sheet with a title
   * in the styleSheets list. Otherwise, if style sheets from different sets
   * are enabled, then the return value must be null (there is no way to
   * determine what the currently selected style sheet set is in those
   * conditions). Otherwise, either all style sheets that have a title are
   * disabled, or there are no alternate style sheets, and
   * selectedStyleSheetSet must return the empty string.
   *
   * Setting this attribute to the null value must have no effect.
   *
   * Setting this attribute to a non-null value must call
   * enableStyleSheetsForSet() with that value as the function's argument, and
   * set lastStyleSheetSet to that value.
   *
   * From the DOM's perspective, all views have the same
   * selectedStyleSheetSet. If a UA supports multiple views with different
   * selected alternate style sheets, then this attribute (and the StyleSheet
   * interface's disabled attribute) must return and set the value for the
   * default view.
   */
  String getSelectedStyleSheetSet();

  /**
   * This attribute indicates which style sheet set is in use. This attribute
   * is live; changing the disabled attribute on style sheets directly will
   * change the value of this attribute.
   *
   * If all the sheets that are enabled and have a title have the same title
   * (by case-sensitive comparisons) then the value of this attribute must be
   * exactly equal to the title of the first enabled style sheet with a title
   * in the styleSheets list. Otherwise, if style sheets from different sets
   * are enabled, then the return value must be null (there is no way to
   * determine what the currently selected style sheet set is in those
   * conditions). Otherwise, either all style sheets that have a title are
   * disabled, or there are no alternate style sheets, and
   * selectedStyleSheetSet must return the empty string.
   *
   * Setting this attribute to the null value must have no effect.
   *
   * Setting this attribute to a non-null value must call
   * enableStyleSheetsForSet() with that value as the function's argument, and
   * set lastStyleSheetSet to that value.
   *
   * From the DOM's perspective, all views have the same
   * selectedStyleSheetSet. If a UA supports multiple views with different
   * selected alternate style sheets, then this attribute (and the StyleSheet
   * interface's disabled attribute) must return and set the value for the
   * default view.
   */
  void setSelectedStyleSheetSet(String aSelectedStyleSheetSet);

  String getLastStyleSheetSet();

  /**
   * This must return the live list of the currently available style sheet
   * sets. This list is constructed by enumerating all the style sheets for
   * this document available to the implementation, in the order they are
   * listed in the styleSheets attribute, adding the title of each style sheet
   * with a title to the list, avoiding duplicates by dropping titles that
   * match (case-sensitively) titles that have already been added to the
   * list.
   */
  nsIDOMDOMStringList getStyleSheetSets();

  /**
   * Calling this method must change the disabled attribute on each StyleSheet
   * object with a title attribute with a length greater than 0 in the
   * styleSheets attribute, so that all those whose title matches the name
   * argument are enabled, and all others are disabled. Title matches must be
   * case-sensitive. Calling this method with the empty string disables all
   * alternate and preferred style sheets (but does not change the state of
   * persistent style sheets, that is those with no title attribute).
   *
   * Calling this method with a null value must have no effect.
   *
   * Style sheets that do not have a title are never affected by this
   * method. This method does not change the values of the lastStyleSheetSet or
   * preferredStyleSheetSet attributes.
   */
  void enableStyleSheetsForSet(String name);

}