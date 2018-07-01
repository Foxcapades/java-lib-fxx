package io.vulpine.lib.fxx.internal.trait.text;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.text.Font;

public interface HasFont < T extends HasFont >
{
  ObjectProperty< Font > fontProperty();

  default T font(Font in) {
    fontProperty().set(in);
    return (T) this;
  }

  default T bindFont(ObservableValue< ? extends Font > in) {
    fontProperty().bind(in);
    return (T) this;
  }

  default T biBindFont(Property< Font > in) {
    fontProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToFont(Property < Font > in) {
    in.bind(fontProperty());
    return (T) this;
  }
}
