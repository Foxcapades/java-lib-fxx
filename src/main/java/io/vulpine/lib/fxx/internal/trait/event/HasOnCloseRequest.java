package io.vulpine.lib.fxx.internal.trait.event;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;

public interface HasOnCloseRequest< E extends Event, T extends HasOnCloseRequest >
{
  ObjectProperty < EventHandler < E > > onCloseRequestProperty();

  default T onCloseRequest(EventHandler < E > in) {
    onCloseRequestProperty().set(in);
    return (T) this;
  }

  default T bindOnCloseRequest(ObservableValue < ? extends EventHandler < E > > in) {
    onCloseRequestProperty().bind(in);
    return (T) this;
  }

  default T biBindOnCloseRequest(Property < EventHandler < E > > in) {
    onCloseRequestProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnCloseRequest(Property < EventHandler < E > > in) {
    in.bind(onCloseRequestProperty());
    return (T) this;
  }
}
