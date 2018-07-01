package io.vulpine.lib.fxx.internal.trait.layout;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasHGap < T extends HasHGap >
{
  DoubleProperty hgapProperty();

  default T hGap(double in) {
    hgapProperty().set(in);
    return (T) this;
  }

  default T bindHGap(ObservableValue< ? extends Number > in) {
    hgapProperty().bind(in);
    return (T) this;
  }

  default T biBindHGap(Property< Number > in) {
    hgapProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToHGap(Property < Number > in) {
    in.bind(hgapProperty());
    return (T) this;
  }
}
