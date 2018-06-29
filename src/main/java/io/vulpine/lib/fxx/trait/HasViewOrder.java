package io.vulpine.lib.fxx.trait;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasViewOrder< T extends HasViewOrder >
{
  DoubleProperty viewOrderProperty();

  default T viewOrder(double in) {
    viewOrderProperty().set(in);
    return (T) this;
  }

  default T bindViewOrder(ObservableValue < ? extends Number > in) {
    viewOrderProperty().bind(in);
    return (T) this;
  }

  default T biBindViewOrder(Property < Number > in) {
    viewOrderProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToViewOrder(Property < Number > in) {
    in.bind(viewOrderProperty());
    return (T) this;
  }
}
