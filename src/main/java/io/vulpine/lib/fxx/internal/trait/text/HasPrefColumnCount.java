package io.vulpine.lib.fxx.internal.trait.text;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasPrefColumnCount < T extends HasPrefColumnCount >
{
  IntegerProperty prefColumnCountProperty();

  default T prefColumnCount(int in) {
    prefColumnCountProperty().set(in);
    return (T) this;
  }

  default T bindPrefColumnCount(ObservableValue< ? extends Number > in) {
    prefColumnCountProperty().bind(in);
    return (T) this;
  }

  default T biBindPrefColumnCount(Property < Number > in) {
    prefColumnCountProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToPrefColumnCount(Property< Number > in) {
    in.bind(prefColumnCountProperty());
    return (T) this;
  }
}
