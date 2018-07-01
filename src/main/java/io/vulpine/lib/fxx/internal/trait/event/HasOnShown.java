package io.vulpine.lib.fxx.internal.trait.event;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;

public interface HasOnShown< E extends Event, T extends HasOnShown >
{
  ObjectProperty < EventHandler < E > > onShownProperty();

  default T onShown(EventHandler < E > in) {
    onShownProperty().set(in);
    return (T) this;
  }

  default T bindOnShown(ObservableValue < ? extends EventHandler < E > > in) {
    onShownProperty().bind(in);
    return (T) this;
  }

  default T biBindOnShown(Property < EventHandler < E > > in) {
    onShownProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnShown(Property < EventHandler < E > > in) {
    in.bind(onShownProperty());
    return (T) this;
  }
}
