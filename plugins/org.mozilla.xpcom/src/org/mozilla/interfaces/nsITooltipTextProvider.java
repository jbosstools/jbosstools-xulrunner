/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/embedding/browser/webBrowser/nsITooltipTextProvider.idl
 */

package org.mozilla.interfaces;

/**
 * An interface implemented by a tooltip text provider service. This
 * service is called to discover what tooltip text is associated
 * with the node that the pointer is positioned over.
 *
 * Embedders may implement and register their own tooltip text provider
 * service if they wish to provide different tooltip text. 
 *
 * The default service returns the text stored in the TITLE
 * attribute of the node or a containing parent.
 *
 * @note
 * The tooltip text provider service is registered with the contract
 * defined in NS_TOOLTIPTEXTPROVIDER_CONTRACTID.
 *
 * @see nsITooltipListener
 * @see nsIComponentManager
 * @see nsIDOMNode
 *
 * @status FROZEN
 */
public interface nsITooltipTextProvider extends nsISupports {

  String NS_ITOOLTIPTEXTPROVIDER_IID =
    "{b128a1e6-44f3-4331-8fbe-5af360ff21ee}";

  /**
     * Called to obtain the tooltip text for a node.
     *
     * @arg aNode The node to obtain the text from.
     * @arg aText The tooltip text.
     *
     * @return <CODE>PR_TRUE</CODE> if tooltip text is associated
     *         with the node and was returned in the aText argument;
     *         <CODE>PR_FALSE</CODE> otherwise.
     */
  boolean getNodeText(nsIDOMNode aNode, String[] aText);

}