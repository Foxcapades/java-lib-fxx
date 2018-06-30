package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.CacheHint;

public interface HasCacheHint< T extends HasCacheHint >
{
  ObjectProperty < CacheHint > cacheHintProperty();

  default T cacheHint(CacheHint in) {
    cacheHintProperty().set(in);
    return (T) this;
  }

  default T bindCacheHint(ObservableValue < ? extends CacheHint > in) {
    cacheHintProperty().bind(in);
    return (T) this;
  }

  default T biBindCacheHint(Property < CacheHint > in) {
    cacheHintProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToCacheHint(Property < CacheHint > in) {
    in.bind(cacheHintProperty());
    return (T) this;
  }
}
