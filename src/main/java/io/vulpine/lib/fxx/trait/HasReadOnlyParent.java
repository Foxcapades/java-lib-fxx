package io.vulpine.lib.fxx.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.scene.Parent;

public interface HasReadOnlyParent < T extends HasReadOnlyParent >
{
  ReadOnlyObjectProperty < Parent > parentProperty();

  default T bindToParent(ObjectProperty < Parent > in) {
    in.bind(parentProperty());
    return (T) this;
  }
}
