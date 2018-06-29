package io.vulpine.lib.fxx.trait;

import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.geometry.NodeOrientation;

public interface HasReadOnlyEffectiveNodeOrientation< T extends HasReadOnlyEffectiveNodeOrientation >
{
  ReadOnlyObjectProperty < NodeOrientation > effectiveNodeOrientationProperty();

  default T bindToEffectiveNodeOrientation(Property < NodeOrientation > in) {
    in.bind(effectiveNodeOrientationProperty());
    return (T) this;
  }
}
