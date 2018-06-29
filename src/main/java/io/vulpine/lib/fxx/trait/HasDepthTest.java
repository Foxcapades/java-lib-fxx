package io.vulpine.lib.fxx.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.DepthTest;

public interface HasDepthTest< T extends HasDepthTest >
{
  ObjectProperty < DepthTest > depthTestProperty();

  default T depthTest(DepthTest in) {
    depthTestProperty().set(in);
    return (T) this;
  }

  default T bindDepthTest(ObservableValue < ? extends DepthTest > in) {
    depthTestProperty().bind(in);
    return (T) this;
  }

  default T biBindDepthTest(Property < DepthTest > in) {
    depthTestProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToDepthTest(Property < DepthTest > in) {
    in.bind(depthTestProperty());
    return (T) this;
  }
}
