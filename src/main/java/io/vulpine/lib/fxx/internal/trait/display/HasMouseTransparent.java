package io.vulpine.lib.fxx.internal.trait.display;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasMouseTransparent< T extends HasMouseTransparent >
{
  BooleanProperty mouseTransparentProperty();

  default T mouseTransparent(boolean in) {
    mouseTransparentProperty().set(in);
    return (T) this;
  }

  default T bindMouseTransparent(ObservableValue < Boolean > in) {
    mouseTransparentProperty().bind(in);
    return (T) this;
  }

  default T biBindMouseTransparent(Property < Boolean > in) {
    mouseTransparentProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToMouseTransparent(Property < Boolean > in) {
    in.bind(mouseTransparentProperty());
    return (T) this;
  }
}
