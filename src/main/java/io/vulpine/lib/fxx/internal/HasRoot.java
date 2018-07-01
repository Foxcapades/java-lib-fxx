package io.vulpine.lib.fxx.internal;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Parent;

public interface HasRoot< T extends HasRoot >
{
  ObjectProperty < Parent > rootProperty();

  default T root(Parent in) {
    rootProperty().set(in);
    return (T) this;
  }

  default T bindRoot(ObservableValue < ? extends Parent > in) {
    rootProperty().bind(in);
    return (T) this;
  }

  default T biBindRoot(Property < Parent > in) {
    rootProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToRoot(Property < Parent > in) {
    in.bind(rootProperty());
    return (T) this;
  }
}
