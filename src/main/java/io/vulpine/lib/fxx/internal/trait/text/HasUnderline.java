package io.vulpine.lib.fxx.internal.trait.text;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasUnderline < T extends HasUnderline >
{
  BooleanProperty underlineProperty();

  default T underline(boolean in) {
    underlineProperty().set(in);
    return (T) this;
  }

  default T bindUnderline(ObservableValue< ? extends Boolean > in) {
    underlineProperty().bind(in);
    return (T) this;
  }

  default T biBindUnderline(Property< Boolean > in) {
    underlineProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToUnderline(Property < Boolean > in) {
    in.bind(underlineProperty());
    return (T) this;
  }
}
