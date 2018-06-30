package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.input.ContextMenuEvent;

public interface HasOnContextMenuRequested< T extends HasOnContextMenuRequested >
{
  ObjectProperty < EventHandler < ? super ContextMenuEvent > > onContextMenuRequestedProperty();

  default T onContexMenuRequested(EventHandler < ? super ContextMenuEvent > in) {
    onContextMenuRequestedProperty().set(in);
    return (T) this;
  }

  default T bindOnContextMenuRequested(ObservableValue < ? extends EventHandler < ? super ContextMenuEvent > > in) {
    onContextMenuRequestedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnContextMenuRequested(Property < EventHandler < ? super ContextMenuEvent > > in) {
    onContextMenuRequestedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnContextMenuRequested(Property < EventHandler < ? super ContextMenuEvent > > in) {
    in.bind(onContextMenuRequestedProperty());
    return (T) this;
  }
}
