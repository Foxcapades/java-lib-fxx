package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasPickOnBounds < T extends HasPickOnBounds >
{
  BooleanProperty pickOnBoundsProperty();

  default T pickOnBounds(boolean in) {
    pickOnBoundsProperty().set(in);
    return (T) this;
  }

  default T bindPickOnBounds(ObservableValue < ? extends Boolean > in) {
    pickOnBoundsProperty().bind(in);
    return (T) this;
  }

  default T biBindPickOnBounds(Property < Boolean > in) {
    pickOnBoundsProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToPickOnBounds(Property < Boolean > in) {
    in.bind(pickOnBoundsProperty());
    return (T) this;
  }
}
