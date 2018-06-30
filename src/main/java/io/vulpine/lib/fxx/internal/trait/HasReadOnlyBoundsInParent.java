package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.geometry.Bounds;

public interface HasReadOnlyBoundsInParent< T extends HasReadOnlyBoundsInParent >
{
  ReadOnlyObjectProperty < Bounds > boundsInParentProperty();

  default T bindToBoundsInParent(Property < Bounds > in) {
    in.bind(boundsInParentProperty());
    return (T) this;
  }
}
