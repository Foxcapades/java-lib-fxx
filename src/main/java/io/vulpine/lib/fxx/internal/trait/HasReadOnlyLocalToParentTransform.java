package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.scene.transform.Transform;

public interface HasReadOnlyLocalToParentTransform < T extends HasReadOnlyLocalToParentTransform >
{
  ReadOnlyObjectProperty<Transform> localToParentTransformProperty();

  default T bindToLocalToParentTransform(Property< Transform > in) {
    in.bind(localToParentTransformProperty());
    return (T) this;
  }
}
