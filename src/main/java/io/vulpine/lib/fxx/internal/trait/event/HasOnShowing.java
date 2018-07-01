package io.vulpine.lib.fxx.internal.trait.event;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;

public interface HasOnShowing< E extends Event, T extends HasOnShowing >
{
  ObjectProperty < EventHandler < E > > onShowingProperty();

  default T onShowing(EventHandler < E > in) {
    onShowingProperty().set(in);
    return (T) this;
  }

  default T bindOnShowing(ObservableValue < ? extends EventHandler < E > > in) {
    onShowingProperty().bind(in);
    return (T) this;
  }

  default T biBindOnShowing(Property < EventHandler < E > > in) {
    onShowingProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnShowing(Property < EventHandler < E > > in) {
    in.bind(onShowingProperty());
    return (T) this;
  }
}
