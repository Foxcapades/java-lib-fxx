package io.vulpine.lib.fxx.internal.trait.display;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;

public interface HasOrientation < T extends HasOrientation >
{
  ObjectProperty < Orientation > orientationProperty();

  default T orientation(Orientation in) {
    orientationProperty().set(in);
    return (T) this;
  }

  default T bindOrientation(ObservableValue < ? extends Orientation > in) {
    orientationProperty().bind(in);
    return (T) this;
  }

  default T biBindOrientation(Property < Orientation > in) {
    orientationProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOrientation(Property < Orientation > in) {
    in.bind(orientationProperty());
    return (T) this;
  }
}
