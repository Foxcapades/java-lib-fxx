package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyBooleanProperty;

public interface HasReadOnlyDisabled < T extends HasReadOnlyDisabled >
{
  ReadOnlyBooleanProperty disabledProperty();

  default T bindToDisabled(Property < Boolean > in) {
    in.bind(disabledProperty());
    return (T) this;
  }
}
