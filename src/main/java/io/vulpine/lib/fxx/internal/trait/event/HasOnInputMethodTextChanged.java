package io.vulpine.lib.fxx.internal.trait.event;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.input.InputMethodEvent;

public interface HasOnInputMethodTextChanged < T extends HasOnInputMethodTextChanged >
{
  ObjectProperty< EventHandler< ? super InputMethodEvent > > onInputMethodTextChangedProperty();

  default T onInputMethodTextChanged(EventHandler < ? super InputMethodEvent > in) {
    onInputMethodTextChangedProperty().set(in);
    return (T) this;
  }

  default T bindOnInputMethodTextChanged(ObservableValue< ? extends EventHandler < ? super InputMethodEvent > > in) {
    onInputMethodTextChangedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnInputMethodTextChanged(Property< EventHandler < ? super InputMethodEvent > > in) {
    onInputMethodTextChangedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnInputMethodTextChanged(Property < EventHandler < ? super InputMethodEvent > > in) {
    in.bind(onInputMethodTextChangedProperty());
    return (T) this;
  }
}
