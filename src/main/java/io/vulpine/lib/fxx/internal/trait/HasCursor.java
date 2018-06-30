package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Cursor;

public interface HasCursor< T extends HasCursor >
{
  ObjectProperty < Cursor > cursorProperty();

  default T cursor(Cursor in) {
    cursorProperty().set(in);
    return (T) this;
  }

  default T bindCursor(ObservableValue < ? extends Cursor > in) {
    cursorProperty().bind(in);
    return (T) this;
  }

  default T biBindCursor(Property < Cursor > in) {
    cursorProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToCursor(Property < Cursor > in) {
    in.bind(cursorProperty());
    return (T) this;
  }
}
