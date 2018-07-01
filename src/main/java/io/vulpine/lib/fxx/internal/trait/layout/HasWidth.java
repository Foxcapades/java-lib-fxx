package io.vulpine.lib.fxx.internal.trait.layout;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasWidth< T extends HasWidth >
{
  DoubleProperty widthProperty();

  default T width(double in) {
    widthProperty().set(in);
    return (T) this;
  }

  default T bindWidth(ObservableValue < ? extends Number > in) {
    widthProperty().bind(in);
    return (T) this;
  }

  default T biBindWidth(Property < Number > in) {
    widthProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToWidth(Property < Number > in) {
    in.bind(widthProperty());
    return (T) this;
  }
}
