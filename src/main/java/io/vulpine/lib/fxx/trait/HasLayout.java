package io.vulpine.lib.fxx.trait;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasLayout< T extends HasLayout >
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
