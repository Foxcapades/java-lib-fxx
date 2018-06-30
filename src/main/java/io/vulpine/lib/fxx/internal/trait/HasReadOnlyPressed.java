package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyBooleanProperty;

public interface HasReadOnlyPressed< T extends HasReadOnlyPressed >
{
  ReadOnlyBooleanProperty pressedProperty();

  default T bindToPressed(Property < Boolean > in) {
    in.bind(pressedProperty());
    return (T) this;
  }
}
