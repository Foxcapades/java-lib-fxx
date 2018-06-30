package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasOpacity < T extends HasOpacity >
{
  DoubleProperty opacityProperty();

  default T opacity(double in) {
    opacityProperty().set(in);
    return (T) this;
  }

  default T bindOpacity(ObservableValue< ? extends Number > in) {
    opacityProperty().bind(in);
    return (T) this;
  }

  default T biBindOpacity(Property < Number > in) {
    opacityProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOpacity(Property< Number > in) {
    in.bind(opacityProperty());
    return (T) this;
  }
}
