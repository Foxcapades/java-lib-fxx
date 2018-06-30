package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;

public interface HasContent < T extends HasContent >
{
  ObjectProperty < Node > contentProperty();

  default T content(Node in) {
    contentProperty().set(in);
    return (T) this;
  }

  default T bindContent(ObservableValue< ? extends Node > in) {
    contentProperty().bind(in);
    return (T) this;
  }

  default T biBindContent(Property< Node > in) {
    contentProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToContent(Property < Node > in) {
    in.bind(contentProperty());
    return (T) this;
  }
}
