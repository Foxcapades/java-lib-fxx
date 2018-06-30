package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.NodeOrientation;

public interface HasNodeOrientation< T extends HasNodeOrientation >
{
  ObjectProperty < NodeOrientation > nodeOrientationProperty();

  default T nodeOrientation(NodeOrientation in) {
    nodeOrientationProperty().set(in);
    return (T) this;
  }

  default T bindNodeOrientation(ObservableValue < ? extends NodeOrientation > in) {
    nodeOrientationProperty().bind(in);
    return (T) this;
  }

  default T biBindNodeOrientation(Property < NodeOrientation > in) {
    nodeOrientationProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToNodeOrientation(Property < NodeOrientation > in) {
    in.bind(nodeOrientationProperty());
    return (T) this;
  }
}
