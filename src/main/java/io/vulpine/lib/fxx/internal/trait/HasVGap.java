package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasVGap< T extends HasVGap >
{
  DoubleProperty vgapProperty();

  default T vGap(double in) {
    vgapProperty().set(in);
    return (T) this;
  }

  default T bindVGap(ObservableValue < ? extends Number > in) {
    vgapProperty().bind(in);
    return (T) this;
  }

  default T biBindVGap(Property < Number > in) {
    vgapProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToVGap(Property < Number > in) {
    in.bind(vgapProperty());
    return (T) this;
  }
}
