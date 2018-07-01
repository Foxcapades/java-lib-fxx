package io.vulpine.lib.fxx.internal.trait.display;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasVisible < T extends HasVisible >
{
  BooleanProperty visibleProperty();

  default T visible(boolean in) {
    visibleProperty().set(in);
    return (T) this;
  }

  default T bindVisible(ObservableValue < Boolean > in) {
    visibleProperty().bind(in);
    return (T) this;
  }

  default T biBindVisible(Property < Boolean > in) {
    visibleProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToVisible(Property < Boolean > in) {
    in.bind(visibleProperty());
    return (T) this;
  }
}
