package io.vulpine.lib.fxx.internal.trait.event;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;

public interface HasOnHidden< E extends Event, T extends HasOnHidden >
{
  ObjectProperty < EventHandler < E > > onHiddenProperty();

  default T onHidden(EventHandler < E > in) {
    onHiddenProperty().set(in);
    return (T) this;
  }

  default T bindOnHidden(ObservableValue < ? extends EventHandler < E > > in) {
    onHiddenProperty().bind(in);
    return (T) this;
  }

  default T biBindOnHidden(Property < EventHandler < E > > in) {
    onHiddenProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnHidden(Property < EventHandler < E > > in) {
    in.bind(onHiddenProperty());
    return (T) this;
  }
}
