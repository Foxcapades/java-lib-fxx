package io.vulpine.lib.fxx.trait;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasLayoutY < T extends HasLayoutY >
{
  DoubleProperty layoutYProperty();

  default T layoutY(double in) {
    layoutYProperty().set(in);
    return (T) this;
  }

  default T bindLayoutY(ObservableValue < ? extends Number > in) {
    layoutYProperty().bind(in);
    return (T) this;
  }

  default T biBindLayoutY(Property < Number > in) {
    layoutYProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToLayoutY(Property < Number > in) {
    in.bind(layoutYProperty());
    return (T) this;
  }
}
