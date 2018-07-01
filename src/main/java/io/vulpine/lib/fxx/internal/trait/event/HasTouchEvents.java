package io.vulpine.lib.fxx.internal.trait.event;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.input.TouchEvent;

public interface HasTouchEvents< T extends HasTouchEvents >
{
  ObjectProperty < EventHandler < ? super TouchEvent > > onTouchPressedProperty();

  default T onTouchPressed(EventHandler < ? super TouchEvent > in) {
    onTouchPressedProperty().set(in);
    return (T) this;
  }

  default T bindOnTouchPressed(ObservableValue < ? extends EventHandler < ? super TouchEvent > > in) {
    onTouchPressedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnTouchPressed(Property < EventHandler < ? super TouchEvent > > in) {
    onTouchPressedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnTouchPressed(Property < EventHandler < ? super TouchEvent > > in) {
    in.bind(onTouchPressedProperty());
    return (T) this;
  }


  ObjectProperty < EventHandler < ? super TouchEvent > > onTouchMovedProperty();

  default T onTouchMoved(EventHandler < ? super TouchEvent > in) {
    onTouchMovedProperty().set(in);
    return (T) this;
  }

  default T bindOnTouchMoved(ObservableValue < ? extends EventHandler < ? super TouchEvent > > in) {
    onTouchMovedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnTouchMoved(Property < EventHandler < ? super TouchEvent > > in) {
    onTouchMovedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnTouchMoved(Property < EventHandler < ? super TouchEvent > > in) {
    in.bind(onTouchMovedProperty());
    return (T) this;
  }


  ObjectProperty < EventHandler < ? super TouchEvent > > onTouchReleasedProperty();

  default T onTouchReleased(EventHandler < ? super TouchEvent > in) {
    onTouchReleasedProperty().set(in);
    return (T) this;
  }

  default T bindOnTouchReleased(ObservableValue < ? extends EventHandler < ? super TouchEvent > > in) {
    onTouchReleasedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnTouchReleased(Property < EventHandler < ? super TouchEvent > > in) {
    onTouchReleasedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnTouchReleased(Property < EventHandler < ? super TouchEvent > > in) {
    in.bind(onTouchReleasedProperty());
    return (T) this;
  }


  ObjectProperty < EventHandler < ? super TouchEvent > > onTouchStationaryProperty();

  default T onTouchStationary(EventHandler < ? super TouchEvent > in) {
    onTouchStationaryProperty().set(in);
    return (T) this;
  }

  default T bindOnTouchStationary(ObservableValue < ? extends EventHandler < ? super TouchEvent > > in) {
    onTouchStationaryProperty().bind(in);
    return (T) this;
  }

  default T biBindOnTouchStationary(Property < EventHandler < ? super TouchEvent > > in) {
    onTouchStationaryProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnTouchStationary(Property < EventHandler < ? super TouchEvent > > in) {
    in.bind(onTouchStationaryProperty());
    return (T) this;
  }
}
