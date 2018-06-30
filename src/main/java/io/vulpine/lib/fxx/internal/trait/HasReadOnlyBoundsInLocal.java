package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.geometry.Bounds;

public interface HasReadOnlyBoundsInLocal< T extends HasReadOnlyBoundsInLocal >
{
  ReadOnlyObjectProperty < Bounds > boundsInLocalProperty();

  default T bindToBoundsInLocal(Property < Bounds > in) {
    in.bind(boundsInLocalProperty());
    return (T) this;
  }
}
