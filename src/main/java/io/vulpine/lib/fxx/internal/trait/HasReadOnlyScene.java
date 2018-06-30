package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.scene.Scene;

public interface HasReadOnlyScene < T extends HasReadOnlyScene >
{
  ReadOnlyObjectProperty < Scene > sceneProperty();

  default T bindToScene(ObjectProperty < Scene > in) {
    in.bind(sceneProperty());
    return (T) this;
  }
}
