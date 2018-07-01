package io.vulpine.lib.fxx.internal.trait.event;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public interface HasOnAction< T extends HasOnAction >
{
  ObjectProperty < EventHandler < ActionEvent > > onActionProperty();

  default T onAction(EventHandler < ActionEvent > in) {
    onActionProperty().set(in);
    return (T) this;
  }

  default T bindOnAction(ObservableValue < ? extends EventHandler < ActionEvent > > in) {
    onActionProperty().bind(in);
    return (T) this;
  }

  default T biBindOnAction(Property < EventHandler < ActionEvent > > in) {
    onActionProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnAction(Property < EventHandler < ActionEvent > > in) {
    in.bind(onActionProperty());
    return (T) this;
  }
}
