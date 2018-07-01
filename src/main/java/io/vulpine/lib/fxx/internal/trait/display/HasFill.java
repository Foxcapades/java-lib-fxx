package io.vulpine.lib.fxx.internal.trait.display;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.paint.Paint;

public interface HasFill< T extends HasFill >
{
  ObjectProperty < Paint > fillProperty();

  default T fill(Paint in) {
    fillProperty().set(in);
    return (T) this;
  }

  default T bindFill(ObservableValue < ? extends Paint > in) {
    fillProperty().bind(in);
    return (T) this;
  }

  default T biBindFill(Property < Paint > in) {
    fillProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToFill(Property < Paint > in) {
    in.bind(fillProperty());
    return (T) this;
  }
}
