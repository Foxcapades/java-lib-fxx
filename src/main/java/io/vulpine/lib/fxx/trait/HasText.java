package io.vulpine.lib.fxx.trait;

import javafx.beans.property.Property;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;

public interface HasText < T extends HasText >
{
  StringProperty textProperty();

  default T text(String in) {
    textProperty().set(in);
    return (T) this;
  }

  default T bindText(ObservableValue< ? extends String > in) {
    textProperty().bind(in);
    return (T) this;
  }

  default T biBindText(Property< String > in) {
    textProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToText(Property < String > in) {
    in.bind(textProperty());
    return (T) this;
  }

}
