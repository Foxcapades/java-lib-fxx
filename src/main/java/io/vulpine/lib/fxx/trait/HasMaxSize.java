package io.vulpine.lib.fxx.trait;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasMaxSize < T extends HasMaxSize >
{
  DoubleProperty maxWidthProperty();

  default T maximumWidth(double in) {
    maxWidthProperty().set(in);
    return (T) this;
  }

  default T bindMaximumWidth(ObservableValue< ? extends Number > in) {
    maxWidthProperty().bind(in);
    return (T) this;
  }

  default T biBindMaximumWidth(Property< Number > in) {
    maxWidthProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToMaximumWidth(Property < Number > in) {
    in.bind(maxWidthProperty());
    return (T) this;
  }

  DoubleProperty maxHeightProperty();

  default T maximumHeight(double in) {
    maxHeightProperty().set(in);
    return (T) this;
  }

  default T bindMaximumHeight(ObservableValue < ? extends Number > in) {
    maxHeightProperty().bind(in);
    return (T) this;
  }

  default T biBindMaximumHeight(Property < Number > in) {
    maxHeightProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToMaximumHeight(Property < Number > in) {
    in.bind(maxHeightProperty());
    return (T) this;
  }

  default T maximumSize(double w, double h) {
    maxWidthProperty().set(w);
    maxHeightProperty().set(h);
    return (T) this;
  }
}
