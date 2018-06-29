package io.vulpine.lib.fxx.trait;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasLayoutX < T extends HasLayoutX >
{
  DoubleProperty layoutXProperty();

  default T layoutX(double in) {
    layoutXProperty().set(in);
    return (T) this;
  }

  default T bindLayoutX(ObservableValue < ? extends Number > in) {
    layoutXProperty().bind(in);
    return (T) this;
  }

  default T biBindLayoutX(Property < Number > in) {
    layoutXProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToLayoutX(Property < Number > in) {
    in.bind(layoutXProperty());
    return (T) this;
  }
}
