package io.vulpine.lib.fxx.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public interface HasKeyboardEvents< T extends HasKeyboardEvents >
{
  ObjectProperty < EventHandler < ? super KeyEvent > > onKeyPressedProperty();

  default T onKeyPressed(EventHandler < ? super KeyEvent > in) {
    onKeyPressedProperty().set(in);
    return (T) this;
  }

  default T bindOnKeyPressed(ObservableValue < ? extends EventHandler < ? super KeyEvent > > in) {
    onKeyPressedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnKeyPressed(Property < EventHandler < ? super KeyEvent > > in) {
    onKeyPressedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnKeyPressed(Property < EventHandler < ? super KeyEvent > > in) {
    in.bind(onKeyPressedProperty());
    return (T) this;
  }


  ObjectProperty < EventHandler < ? super KeyEvent > > onKeyReleasedProperty();

  default T onKeyReleased(EventHandler < ? super KeyEvent > in) {
    onKeyReleasedProperty().set(in);
    return (T) this;
  }

  default T bindOnKeyReleased(ObservableValue < ? extends EventHandler < ? super KeyEvent > > in) {
    onKeyReleasedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnKeyReleased(Property < EventHandler < ? super KeyEvent > > in) {
    onKeyReleasedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnKeyReleased(Property < EventHandler < ? super KeyEvent > > in) {
    in.bind(onKeyPressedProperty());
    return (T) this;
  }


  ObjectProperty < EventHandler < ? super KeyEvent > > onKeyTypedProperty();

  default T onKeyTyped(EventHandler < ? super KeyEvent > in) {
    onKeyTypedProperty().set(in);
    return (T) this;
  }

  default T bindOnKeyTyped(ObservableValue < ? extends EventHandler < ? super KeyEvent > > in) {
    onKeyTypedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnKeyTyped(Property < EventHandler < ? super KeyEvent > > in) {
    onKeyTypedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnKeyTyped(Property < EventHandler < ? super KeyEvent > > in) {
    in.bind(onKeyTypedProperty());
    return (T) this;
  }
}
