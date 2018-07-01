package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyDoubleProperty;

public interface HasReadOnlyWidth < T extends HasReadOnlyWidth >
{
  ReadOnlyDoubleProperty widthProperty();

  default T bindToWidth(Property< Number > in) {
    in.bind(widthProperty());
    return (T) this;
  }
}
