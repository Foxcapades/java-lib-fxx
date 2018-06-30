package io.vulpine.lib.fxx.trait;

import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyBooleanProperty;

public interface HasNeedsLayout < T extends HasNeedsLayout >
{
  ReadOnlyBooleanProperty needsLayoutProperty();

  default T bindToNeedsLayout(Property< Boolean > in) {
    in.bind(needsLayoutProperty());
    return (T) this;
  }
}
