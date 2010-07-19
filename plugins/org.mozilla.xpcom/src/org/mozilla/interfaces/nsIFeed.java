/*
 * DO NOT EDIT.  THIS FILE IS GENERATED FROM
 * /builds/slave/mozilla-1.9.2-linux-xulrunner/build/toolkit/components/feeds/public/nsIFeed.idl
 */

package org.mozilla.interfaces;

/**
 * An nsIFeed represents a single Atom or RSS feed.
 */
public interface nsIFeed extends nsIFeedContainer {

  String NS_IFEED_IID =
    "{3b8aae33-80e2-4efa-99c8-a6c5b99f76ea}";

  /** 
  * Uses description, subtitle, and extensions
  * to generate a summary. 
  */
  nsIFeedTextConstruct getSubtitle();

  /** 
  * Uses description, subtitle, and extensions
  * to generate a summary. 
  */
  void setSubtitle(nsIFeedTextConstruct aSubtitle);

  long TYPE_FEED = 0L;

  long TYPE_AUDIO = 1L;

  long TYPE_IMAGE = 2L;

  long TYPE_VIDEO = 4L;

  /**
  * The type of feed. For example, a podcast would be TYPE_AUDIO.
  */
  long getType();

  /**
  * The total number of enclosures found in the feed.
  */
  int getEnclosureCount();

  /**
  * The total number of enclosures found in the feed.
  */
  void setEnclosureCount(int aEnclosureCount);

  /**
  * The items or entries in feed.
  */
  nsIArray getItems();

  /**
  * The items or entries in feed.
  */
  void setItems(nsIArray aItems);

  /**
  * No one really knows what cloud is for.
  *
  * It supposedly enables some sort of interaction with an XML-RPC or
  * SOAP service.
  */
  nsIWritablePropertyBag2 getCloud();

  /**
  * No one really knows what cloud is for.
  *
  * It supposedly enables some sort of interaction with an XML-RPC or
  * SOAP service.
  */
  void setCloud(nsIWritablePropertyBag2 aCloud);

  /**
  * Information about the software that produced the feed.
  */
  nsIFeedGenerator getGenerator();

  /**
  * Information about the software that produced the feed.
  */
  void setGenerator(nsIFeedGenerator aGenerator);

  /**
  * An image url and some metadata (as defined by RSS2).
  *
  */
  nsIWritablePropertyBag2 getImage();

  /**
  * An image url and some metadata (as defined by RSS2).
  *
  */
  void setImage(nsIWritablePropertyBag2 aImage);

  /**
  * No one really knows what textInput is for.
  *
  * See
  * <http://www.cadenhead.org/workbench/news/2894/rss-joy-textinput>
  * for more details.
  */
  nsIWritablePropertyBag2 getTextInput();

  /**
  * No one really knows what textInput is for.
  *
  * See
  * <http://www.cadenhead.org/workbench/news/2894/rss-joy-textinput>
  * for more details.
  */
  void setTextInput(nsIWritablePropertyBag2 aTextInput);

  /**
  * Days to skip fetching. This field was supposed to designate
  * intervals for feed fetching. It's not generally implemented. For
  * example, if this array contained "Monday", aggregators should not
  * fetch the feed on Mondays.
  */
  nsIArray getSkipDays();

  /**
  * Days to skip fetching. This field was supposed to designate
  * intervals for feed fetching. It's not generally implemented. For
  * example, if this array contained "Monday", aggregators should not
  * fetch the feed on Mondays.
  */
  void setSkipDays(nsIArray aSkipDays);

  /**
  * Hours to skip fetching. This field was supposed to designate
  * intervals for feed fetching. It's not generally implemented. See
  * <http://blogs.law.harvard.edu/tech/rss> for more information.
  */
  nsIArray getSkipHours();

  /**
  * Hours to skip fetching. This field was supposed to designate
  * intervals for feed fetching. It's not generally implemented. See
  * <http://blogs.law.harvard.edu/tech/rss> for more information.
  */
  void setSkipHours(nsIArray aSkipHours);

}