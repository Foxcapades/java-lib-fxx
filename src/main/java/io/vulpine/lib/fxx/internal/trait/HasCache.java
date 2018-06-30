package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasCache < T extends HasCache >
{
  BooleanProperty cacheProperty();

  default T cache(boolean in) {
    cacheProperty().set(in);
    return (T) this;
  }

  default T bindCache(ObservableValue < ? extends Boolean > in) {
    cacheProperty().bind(in);
    return (T) this;
  }

  default T biBindCache(Property < Boolean > in) {
    cacheProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToCache(Property < Boolean > in) {
    in.bind(cacheProperty());
    return (T) this;
  }
}
