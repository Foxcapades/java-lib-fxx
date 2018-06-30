package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyBooleanProperty;

public interface HasReadOnlyHover< T extends HasReadOnlyHover >
{
  ReadOnlyBooleanProperty hoverProperty();

  default T bindToHover(Property < Boolean > in) {
    in.bind(hoverProperty());
    return (T) this;
  }
}
