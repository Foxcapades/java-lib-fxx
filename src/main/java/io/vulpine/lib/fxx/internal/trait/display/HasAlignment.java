package io.vulpine.lib.fxx.internal.trait.display;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;

public interface HasAlignment < T extends HasAlignment >
{
  ObjectProperty< Pos > alignmentProperty();

  default T alignment(Pos in) {
    alignmentProperty().set(in);
    return (T) this;
  }

  default T bindAlignment(ObservableValue< ? extends Pos > in) {
    alignmentProperty().bind(in);
    return (T) this;
  }

  default T biBindAlignment(Property < Pos > in) {
    alignmentProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToAlignment(Property< Pos > in) {
    in.bind(alignmentProperty());
    return (T) this;
  }
}
