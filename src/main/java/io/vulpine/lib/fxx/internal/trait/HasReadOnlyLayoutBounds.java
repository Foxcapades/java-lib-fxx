package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.geometry.Bounds;

public interface HasReadOnlyLayoutBounds< T extends HasReadOnlyLayoutBounds >
{
  ReadOnlyObjectProperty < Bounds > layoutBoundsProperty();

  default T bindToLayoutBounds(Property < Bounds > in) {
    in.bind(layoutBoundsProperty());
    return (T) this;
  }
}
