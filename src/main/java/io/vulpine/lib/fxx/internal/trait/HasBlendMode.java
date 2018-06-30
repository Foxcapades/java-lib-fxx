package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.effect.BlendMode;

public interface HasBlendMode < T extends HasBlendMode >
{
  ObjectProperty < BlendMode > blendModeProperty();

  default T blendMode(BlendMode in) {
    blendModeProperty().set(in);
    return (T) this;
  }

  default T bindBlendMode(ObservableValue < ? extends BlendMode > in) {
    blendModeProperty().bind(in);
    return (T) this;
  }

  default T biBindBlendMode(Property < BlendMode > in) {
    blendModeProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToBlendMode(Property< BlendMode > in) {
    in.bind(blendModeProperty());
    return (T) this;
  }
}
