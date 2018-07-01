package io.vulpine.lib.fxx.internal.trait.text;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasLineSpacing < T extends HasLineSpacing >
{
  DoubleProperty lineSpacingProperty();

  default T lineSpacing(double in) {
    lineSpacingProperty().set(in);
    return (T) this;
  }

  default T bindLineSpacing(ObservableValue< ? extends Number > in) {
    lineSpacingProperty().bind(in);
    return (T) this;
  }

  default T biBindLineSpacing(Property< Number > in) {
    lineSpacingProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToLineSpacing(Property < Number > in) {
    in.bind(lineSpacingProperty());
    return (T) this;
  }

}
