package io.vulpine.lib.fxx.trait;

import javafx.beans.property.Property;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;

public interface HasStyle < T extends HasStyle >
{
  StringProperty styleProperty();

  default T style(String in) {
    styleProperty().set(in);
    return (T) this;
  }

  default T bindStyle(ObservableValue< ? extends String > in) {
    styleProperty().bind(in);
    return (T) this;
  }

  default T biBindStyle(Property< String > in) {
    styleProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToStyle(Property < String > in) {
    in.bind(styleProperty());
    return (T) this;
  }

}
