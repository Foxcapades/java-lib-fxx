package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasRotate< T extends HasRotate >
{
  DoubleProperty rotateProperty();

  default T rotate(double in) {
    rotateProperty().set(in);
    return (T) this;
  }

  default T bindRotate(ObservableValue < ? extends Number > in) {
    rotateProperty().bind(in);
    return (T) this;
  }

  default T biBindRotate(Property < Number > in) {
    rotateProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToRotate(Property < Number > in) {
    in.bind(rotateProperty());
    return (T) this;
  }
}
