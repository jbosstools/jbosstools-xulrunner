/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/dom/interfaces/xul/nsIDOMXULElement.idl
 */

package org.mozilla.interfaces;

public interface nsIDOMXULElement extends nsIDOMElement {

  String NS_IDOMXULELEMENT_IID =
    "{30a4a815-b42a-4f0b-9c10-1e7f727cd135}";

  String getId();

  void setId(String aId);

  String getClassName();

  void setClassName(String aClassName);

  String getAlign();

  void setAlign(String aAlign);

  String getDir();

  void setDir(String aDir);

  String getFlex();

  void setFlex(String aFlex);

  String getFlexGroup();

  void setFlexGroup(String aFlexGroup);

  String getOrdinal();

  void setOrdinal(String aOrdinal);

  String getOrient();

  void setOrient(String aOrient);

  String getPack();

  void setPack(String aPack);

  boolean getHidden();

  void setHidden(boolean aHidden);

  boolean getCollapsed();

  void setCollapsed(boolean aCollapsed);

  String getObserves();

  void setObserves(String aObserves);

  String getMenu();

  void setMenu(String aMenu);

  String getContextMenu();

  void setContextMenu(String aContextMenu);

  String getTooltip();

  void setTooltip(String aTooltip);

  String getWidth();

  void setWidth(String aWidth);

  String getHeight();

  void setHeight(String aHeight);

  String getMinWidth();

  void setMinWidth(String aMinWidth);

  String getMinHeight();

  void setMinHeight(String aMinHeight);

  String getMaxWidth();

  void setMaxWidth(String aMaxWidth);

  String getMaxHeight();

  void setMaxHeight(String aMaxHeight);

  String getPersist();

  void setPersist(String aPersist);

  String getLeft();

  void setLeft(String aLeft);

  String getTop();

  void setTop(String aTop);

  String getDatasources();

  void setDatasources(String aDatasources);

  String getRef();

  void setRef(String aRef);

  String getTooltipText();

  void setTooltipText(String aTooltipText);

  String getStatusText();

  void setStatusText(String aStatusText);

  boolean getAllowEvents();

  void setAllowEvents(boolean aAllowEvents);

  nsIRDFCompositeDataSource getDatabase();

  nsIXULTemplateBuilder getBuilder();

  nsIRDFResource getResource();

  nsIControllers getControllers();

  nsIBoxObject getBoxObject();

  void focus();

  void blur();

  void click();

  void doCommand();

  nsIDOMNodeList getElementsByAttribute(String name, String value);

  nsIDOMNodeList getElementsByAttributeNS(String namespaceURI, String name, String value);

}