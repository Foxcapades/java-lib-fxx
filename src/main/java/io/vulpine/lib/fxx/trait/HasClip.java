package io.vulpine.lib.fxx.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;

public interface HasClip < T extends HasClip >
{
  ObjectProperty < Node > clipProperty();

  default T clip(Node in) {
    clipProperty().set(in);
    return (T) this;
  }

  default T bindClip(ObservableValue< ? extends Node > in) {
    clipProperty().bind(in);
    return (T) this;
  }

  default T biBindClip(Property < Node > in) {
    clipProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToClip(Property< Node > in) {
    in.bind(clipProperty());
    return (T) this;
  }
}
