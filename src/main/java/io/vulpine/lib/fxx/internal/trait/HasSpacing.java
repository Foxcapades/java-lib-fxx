package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasSpacing < T extends HasSpacing >
{
  DoubleProperty spacingProperty();

  default T spacing(double in) {
    spacingProperty().set(in);
    return (T) this;
  }

  default T bindSpacing(ObservableValue< ? extends Number > in) {
    spacingProperty().bind(in);
    return (T) this;
  }

  default T biBindSpacing(Property< Number > in) {
    spacingProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToSpacing(Property < Number > in) {
    in.bind(spacingProperty());
    return (T) this;
  }
}
