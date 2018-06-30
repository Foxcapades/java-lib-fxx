package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;

public interface HasGraphic < T extends HasGraphic >
{
  ObjectProperty < Node > graphicProperty();

  default T graphic(Node in) {
    graphicProperty().set(in);
    return (T) this;
  }

  default T bindGraphic(ObservableValue< ? extends Node > in) {
    graphicProperty().bind(in);
    return (T) this;
  }

  default T biBindGraphic(Property< Node > in) {
    graphicProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToGraphic(Property < Node > in) {
    in.bind(graphicProperty());
    return (T) this;
  }
}
