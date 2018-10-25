package org.test;

import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.Core;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.plugins.Plugin;

import java.io.Serializable;

@Plugin(name = "org.test.MyLogAppender", category = Core.CATEGORY_NAME, elementType = Appender.ELEMENT_TYPE)
public class MyLogAppender extends AbstractAppender {

  protected MyLogAppender(String name, Filter filter, Layout<? extends Serializable> layout) {
    super(name, filter, layout);
  }

  @Override
  public void append(LogEvent event) {

  }
}
