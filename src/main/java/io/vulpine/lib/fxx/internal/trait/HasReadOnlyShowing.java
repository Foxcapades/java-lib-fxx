package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyBooleanProperty;

public interface HasReadOnlyShowing< T extends HasReadOnlyShowing >
{
  ReadOnlyBooleanProperty showingProperty();

  default T bindToShowing(Property < Boolean > in) {
    in.bind(showingProperty());
    return (T) this;
  }
}
