package io.vulpine.lib.fxx.trait;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasManaged< T extends HasManaged >
{
  BooleanProperty managedProperty();

  default T managed(boolean in) {
    managedProperty().set(in);
    return (T) this;
  }

  default T bindManaged(ObservableValue < ? extends Boolean > in) {
    managedProperty().bind(in);
    return (T) this;
  }

  default T biBindManaged(Property < Boolean > in) {
    managedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToManaged(Property < Boolean > in) {
    in.bind(managedProperty());
    return (T) this;
  }
}
