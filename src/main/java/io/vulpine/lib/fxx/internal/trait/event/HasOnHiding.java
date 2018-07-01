package io.vulpine.lib.fxx.internal.trait.event;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;

public interface HasOnHiding< E extends Event, T extends HasOnHiding >
{
  ObjectProperty < EventHandler < E > > onHidingProperty();

  default T onHiding(EventHandler < E > in) {
    onHidingProperty().set(in);
    return (T) this;
  }

  default T bindOnHiding(ObservableValue < ? extends EventHandler < E > > in) {
    onHidingProperty().bind(in);
    return (T) this;
  }

  default T biBindOnHiding(Property < EventHandler < E > > in) {
    onHidingProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnHiding(Property < EventHandler < E > > in) {
    in.bind(onHidingProperty());
    return (T) this;
  }
}
