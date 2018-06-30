package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.value.ObservableValue;

public interface HasFocusTraversal < T extends HasFocusTraversal >
{
  ReadOnlyBooleanProperty focusedProperty();

  default T bindToFocused(Property< Boolean > in) {
    in.bind(focusedProperty());
    return (T) this;
  }

  BooleanProperty focusTraversableProperty();

  default T focusTraversable(boolean in) {
    focusTraversableProperty().set(in);
    return (T) this;
  }

  default T bindFocusTraversable(ObservableValue < ? extends Boolean > in) {
    focusTraversableProperty().bind(in);
    return (T) this;
  }

  default T biBindFocusTraversable(Property < Boolean > in) {
    focusTraversableProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToFocusTraversable(Property < Boolean > in) {
    in.bind(focusTraversableProperty());
    return (T) this;
  }
}
