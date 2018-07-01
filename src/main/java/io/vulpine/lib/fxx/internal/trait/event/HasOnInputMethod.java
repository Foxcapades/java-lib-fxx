package io.vulpine.lib.fxx.internal.trait.event;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.InputMethodRequests;

public interface HasOnInputMethod< T extends HasOnInputMethod >
extends HasOnInputMethodTextChanged < T >
{
  ObjectProperty < InputMethodRequests > inputMethodRequestsProperty();


  default T inputMethodRequests(InputMethodRequests in) {
    inputMethodRequestsProperty().set(in);
    return (T) this;
  }

  default T bindInputMethodRequests(ObservableValue < ? extends InputMethodRequests > in) {
    inputMethodRequestsProperty().bind(in);
    return (T) this;
  }

  default T biBindInputMethodRequests(Property < InputMethodRequests > in) {
    inputMethodRequestsProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToInputMethodRequests(Property < InputMethodRequests > in) {
    in.bind(inputMethodRequestsProperty());
    return (T) this;
  }
}
