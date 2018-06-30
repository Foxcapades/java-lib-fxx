package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasClosable < T extends HasClosable >
{
  BooleanProperty closableProperty();

  default T closable(boolean in) {
    closableProperty().set(in);
    return (T) this;
  }

  default T bindClosable(ObservableValue< Boolean > in) {
    closableProperty().bind(in);
    return (T) this;
  }

  default T biBindClosable(Property< Boolean > in) {
    closableProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToClosable(Property < Boolean > in) {
    in.bind(closableProperty());
    return (T) this;
  }
}
