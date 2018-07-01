package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyDoubleProperty;

public interface HasReadOnlyHeight< T extends HasReadOnlyHeight >
{
  ReadOnlyDoubleProperty heightProperty();

  default T bindToHeight(Property < Number > in) {
    in.bind(heightProperty());
    return (T) this;
  }
}
