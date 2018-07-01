package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Camera;

public interface HasCamera< T extends HasCamera >
{
  ObjectProperty < Camera > cameraProperty();

  default T camera(Camera in) {
    cameraProperty().set(in);
    return (T) this;
  }

  default T bindCamera(ObservableValue < ? extends Camera > in) {
    cameraProperty().bind(in);
    return (T) this;
  }

  default T biBindCamera(Property < Camera > in) {
    cameraProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToCamera(Property < Camera > in) {
    in.bind(cameraProperty());
    return (T) this;
  }
}
