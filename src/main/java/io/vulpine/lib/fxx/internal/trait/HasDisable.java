package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasDisable < T extends HasDisable >
{
  BooleanProperty disableProperty();

  default T disable(boolean in) {
    disableProperty().set(in);
    return (T) this;
  }

  default T bindDisable(ObservableValue< Boolean > in) {
    disableProperty().bind(in);
    return (T) this;
  }

  default T biBindDisable(Property< Boolean > in) {
    disableProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToDisable(Property < Boolean > in) {
    in.bind(disableProperty());
    return (T) this;
  }
}
