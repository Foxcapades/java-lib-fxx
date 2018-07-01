package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasUserAgentStylesheet< T extends HasUserAgentStylesheet >
{
  ObjectProperty < String > userAgentStylesheetProperty();

  default T userAgentStylesheet(String in) {
    userAgentStylesheetProperty().set(in);
    return (T) this;
  }

  default T bindUserAgentStylesheet(ObservableValue < ? extends String > in) {
    userAgentStylesheetProperty().bind(in);
    return (T) this;
  }

  default T biBindUserAgentStylesheet(Property < String > in) {
    userAgentStylesheetProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToUserAgentStylesheet(Property < String > in) {
    in.bind(userAgentStylesheetProperty());
    return (T) this;
  }
}
