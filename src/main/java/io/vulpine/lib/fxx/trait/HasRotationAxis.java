package io.vulpine.lib.fxx.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Point3D;

public interface HasRotationAxis< T extends HasRotationAxis >
{
  ObjectProperty < Point3D > rotationAxisProperty();

  default T rotationAxis(Point3D in) {
    rotationAxisProperty().set(in);
    return (T) this;
  }

  default T bindRotationAxis(ObservableValue < ? extends Point3D > in) {
    rotationAxisProperty().bind(in);
    return (T) this;
  }

  default T biBindRotationAxis(Property < Point3D > in) {
    rotationAxisProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToRotationAxis(Property < Point3D > in) {
    in.bind(rotationAxisProperty());
    return (T) this;
  }
}
