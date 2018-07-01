package io.vulpine.lib.fxx.internal.trait.layout;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasHeight< T extends HasHeight >
{
  DoubleProperty heightProperty();

  default T height(double in) {
    heightProperty().set(in);
    return (T) this;
  }

  default T bindHeight(ObservableValue < ? extends Number > in) {
    heightProperty().bind(in);
    return (T) this;
  }

  default T biBindHeight(Property < Number > in) {
    heightProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToHeight(Property < Number > in) {
    in.bind(heightProperty());
    return (T) this;
  }
}
