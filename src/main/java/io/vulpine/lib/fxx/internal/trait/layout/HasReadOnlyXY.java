package io.vulpine.lib.fxx.internal.trait.layout;

import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyDoubleProperty;

public interface HasReadOnlyXY< T extends HasReadOnlyXY >
{
  ReadOnlyDoubleProperty xProperty();

  default T bindToX(Property < Number > in) {
    in.bind(xProperty());
    return (T) this;
  }

  ReadOnlyDoubleProperty yProperty();

  default T bindToY(Property < Number > in) {
    in.bind(yProperty());
    return (T) this;
  }
}
