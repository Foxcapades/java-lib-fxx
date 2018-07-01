package io.vulpine.lib.fxx.internal.trait.event;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.input.SwipeEvent;

public interface HasSwipeEvents< T extends HasSwipeEvents >
{
  ObjectProperty < EventHandler < ? super SwipeEvent > > onSwipeUpProperty();

  default T onSwipeUp(EventHandler < ? super SwipeEvent > in) {
    onSwipeUpProperty().set(in);
    return (T) this;
  }

  default T bindOnSwipeUp(ObservableValue < ? extends EventHandler < ? super SwipeEvent > > in) {
    onSwipeUpProperty().bind(in);
    return (T) this;
  }

  default T biBindOnSwipeUp(Property < EventHandler < ? super SwipeEvent > > in) {
    onSwipeUpProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnSwipeUp(Property < EventHandler < ? super SwipeEvent > > in) {
    in.bind(onSwipeUpProperty());
    return (T) this;
  }


  ObjectProperty < EventHandler < ? super SwipeEvent > > onSwipeDownProperty();

  default T onSwipeDown(EventHandler < ? super SwipeEvent > in) {
    onSwipeDownProperty().set(in);
    return (T) this;
  }

  default T bindOnSwipeDown(ObservableValue < ? extends EventHandler < ? super SwipeEvent > > in) {
    onSwipeDownProperty().bind(in);
    return (T) this;
  }

  default T biBindOnSwipeDown(Property < EventHandler < ? super SwipeEvent > > in) {
    onSwipeDownProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnSwipeDown(Property < EventHandler < ? super SwipeEvent > > in) {
    in.bind(onSwipeDownProperty());
    return (T) this;
  }


  ObjectProperty < EventHandler < ? super SwipeEvent > > onSwipeLeftProperty();

  default T onSwipeLeft(EventHandler < ? super SwipeEvent > in) {
    onSwipeLeftProperty().set(in);
    return (T) this;
  }

  default T bindOnSwipeLeft(ObservableValue < ? extends EventHandler < ? super SwipeEvent > > in) {
    onSwipeLeftProperty().bind(in);
    return (T) this;
  }

  default T biBindOnSwipeLeft(Property < EventHandler < ? super SwipeEvent > > in) {
    onSwipeLeftProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnSwipeLeft(Property < EventHandler < ? super SwipeEvent > > in) {
    in.bind(onSwipeUpProperty());
    return (T) this;
  }


  ObjectProperty < EventHandler < ? super SwipeEvent > > onSwipeRightProperty();

  default T onSwipeRight(EventHandler < ? super SwipeEvent > in) {
    onSwipeRightProperty().set(in);
    return (T) this;
  }

  default T bindOnSwipeRight(ObservableValue < ? extends EventHandler < ? super SwipeEvent > > in) {
    onSwipeRightProperty().bind(in);
    return (T) this;
  }

  default T biBindOnSwipeRight(Property < EventHandler < ? super SwipeEvent > > in) {
    onSwipeRightProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnSwipeRight(Property < EventHandler < ? super SwipeEvent > > in) {
    in.bind(onSwipeRightProperty());
    return (T) this;
  }
}
