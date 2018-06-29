package io.vulpine.lib.fxx.trait;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasScale< T extends HasScale >
{
  DoubleProperty scaleXProperty();

  default T scaleX(double in) {
    scaleXProperty().set(in);
    return (T) this;
  }

  default T bindScaleX(ObservableValue < ? extends Number > in) {
    scaleXProperty().bind(in);
    return (T) this;
  }

  default T biBindScaleX(Property < Number > in) {
    scaleXProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToScaleX(Property < Number > in) {
    in.bind(scaleXProperty());
    return (T) this;
  }

  DoubleProperty scaleYProperty();

  default T scaleY(double in) {
    scaleYProperty().set(in);
    return (T) this;
  }

  default T bindScaleY(ObservableValue < ? extends Number > in) {
    scaleYProperty().bind(in);
    return (T) this;
  }

  default T biBindScaleY(Property < Number > in) {
    scaleYProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToScaleY(Property < Number > in) {
    in.bind(scaleYProperty());
    return (T) this;
  }

  DoubleProperty scaleZProperty();

  default T scaleZ(double in) {
    scaleZProperty().set(in);
    return (T) this;
  }

  default T bindScaleZ(ObservableValue < ? extends Number > in) {
    scaleZProperty().bind(in);
    return (T) this;
  }

  default T biBindScaleZ(Property < Number > in) {
    scaleZProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToScaleZ(Property < Number > in) {
    in.bind(scaleZProperty());
    return (T) this;
  }
}
