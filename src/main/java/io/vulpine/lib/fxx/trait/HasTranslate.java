package io.vulpine.lib.fxx.trait;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasTranslate< T extends HasTranslate >
{
  DoubleProperty translateXProperty();

  default T translateX(double in) {
    translateXProperty().set(in);
    return (T) this;
  }

  default T bindTranslateX(ObservableValue < ? extends Number > in) {
    translateXProperty().bind(in);
    return (T) this;
  }

  default T biBindTranslateX(Property < Number > in) {
    translateXProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToTranslateX(Property < Number > in) {
    in.bind(translateXProperty());
    return (T) this;
  }

  DoubleProperty translateYProperty();

  default T translateY(double in) {
    translateYProperty().set(in);
    return (T) this;
  }

  default T bindTranslateY(ObservableValue < ? extends Number > in) {
    translateYProperty().bind(in);
    return (T) this;
  }

  default T biBindTranslateY(Property < Number > in) {
    translateYProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToTranslateY(Property < Number > in) {
    in.bind(translateYProperty());
    return (T) this;
  }

  DoubleProperty translateZProperty();

  default T translateZ(double in) {
    translateZProperty().set(in);
    return (T) this;
  }

  default T bindTranslateZ(ObservableValue < ? extends Number > in) {
    translateZProperty().bind(in);
    return (T) this;
  }

  default T biBindTranslateZ(Property < Number > in) {
    translateZProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToTranslateZ(Property < Number > in) {
    in.bind(translateZProperty());
    return (T) this;
  }
}
