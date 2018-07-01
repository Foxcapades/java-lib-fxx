package io.vulpine.lib.fxx.internal.trait.layout;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasMinSize < T extends HasMinSize >
{
  DoubleProperty minWidthProperty();

  default T minimumWidth(double in) {
    minWidthProperty().set(in);
    return (T) this;
  }

  default T bindMinimumWidth(ObservableValue< ? extends Number > in) {
    minWidthProperty().bind(in);
    return (T) this;
  }

  default T biBindMinimumWidth(Property< Number > in) {
    minWidthProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToMinimumWidth(Property < Number > in) {
    in.bind(minWidthProperty());
    return (T) this;
  }

  DoubleProperty minHeightProperty();

  default T minimumHeight(double in) {
    minHeightProperty().set(in);
    return (T) this;
  }

  default T bindMinimumHeight(ObservableValue < ? extends Number > in) {
    minHeightProperty().bind(in);
    return (T) this;
  }

  default T biBindMinimumHeight(Property < Number > in) {
    minHeightProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToMinimumHeight(Property < Number > in) {
    in.bind(minHeightProperty());
    return (T) this;
  }

  default T minimumSize(double w, double h) {
    minWidthProperty().set(w);
    minHeightProperty().set(h);
    return (T) this;
  }
}
