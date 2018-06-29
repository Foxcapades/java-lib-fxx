package io.vulpine.lib.fxx.trait;

import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.scene.transform.Transform;

public interface HasReadOnlyLocalToSceneTransform< T extends HasReadOnlyLocalToSceneTransform >
{
  ReadOnlyObjectProperty<Transform> localToSceneTransformProperty();

  default T bindToLocalToSceneTransform(Property < Transform > in) {
    in.bind(localToSceneTransformProperty());
    return (T) this;
  }
}
