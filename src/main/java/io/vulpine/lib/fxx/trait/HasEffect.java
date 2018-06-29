package io.vulpine.lib.fxx.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.effect.Effect;

public interface HasEffect< T extends HasEffect >
{
  ObjectProperty < Effect > effectProperty();

  default T effect(Effect in) {
    effectProperty().set(in);
    return (T) this;
  }

  default T bindEffect(ObservableValue < ? extends Effect > in) {
    effectProperty().bind(in);
    return (T) this;
  }

  default T biBindEffect(Property < Effect > in) {
    effectProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToEffect(Property < Effect > in) {
    in.bind(effectProperty());
    return (T) this;
  }
}
