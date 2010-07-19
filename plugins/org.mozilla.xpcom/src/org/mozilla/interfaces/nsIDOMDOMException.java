/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/core/nsIDOMDOMException.idl
 */

package org.mozilla.interfaces;

/**
 * In general, DOM methods return specific error values in ordinary
 * processing situations, such as out-of-bound errors.
 * However, DOM operations can raise exceptions in "exceptional"
 * circumstances, i.e., when an operation is impossible to perform
 * (either for logical reasons, because data is lost, or because the
 * implementation has become unstable)
 *
 * For more information on this interface please see
 * http://www.w3.org/TR/DOM-Level-3-Core/
 *
 * @status FROZEN
 */
public interface nsIDOMDOMException extends nsISupports {

  String NS_IDOMDOMEXCEPTION_IID =
    "{a6cf910a-15b3-11d2-932e-00805f8add32}";

  int INDEX_SIZE_ERR = 1;

  int DOMSTRING_SIZE_ERR = 2;

  int HIERARCHY_REQUEST_ERR = 3;

  int WRONG_DOCUMENT_ERR = 4;

  int INVALID_CHARACTER_ERR = 5;

  int NO_DATA_ALLOWED_ERR = 6;

  int NO_MODIFICATION_ALLOWED_ERR = 7;

  int NOT_FOUND_ERR = 8;

  int NOT_SUPPORTED_ERR = 9;

  int INUSE_ATTRIBUTE_ERR = 10;

  int INVALID_STATE_ERR = 11;

  int SYNTAX_ERR = 12;

  int INVALID_MODIFICATION_ERR = 13;

  int NAMESPACE_ERR = 14;

  int INVALID_ACCESS_ERR = 15;

  int VALIDATION_ERR = 16;

  int TYPE_MISMATCH_ERR = 17;

  long getCode();

}