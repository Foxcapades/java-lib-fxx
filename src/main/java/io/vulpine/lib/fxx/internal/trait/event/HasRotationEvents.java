package io.vulpine.lib.fxx.internal.trait.event;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.input.RotateEvent;

public interface HasRotationEvents< T extends HasRotationEvents >
{
  ObjectProperty < EventHandler < ? super RotateEvent > > onRotateProperty();

  default T onRotate(EventHandler < ? super RotateEvent > in) {
    onRotateProperty().set(in);
    return (T) this;
  }

  default T bindOnRotate(ObservableValue < ? extends EventHandler < ? super RotateEvent > > in) {
    onRotateProperty().bind(in);
    return (T) this;
  }

  default T biBindOnRotate(Property < EventHandler < ? super RotateEvent > > in) {
    onRotateProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnRotate(Property < EventHandler < ? super RotateEvent > > in) {
    in.bind(onRotateProperty());
    return (T) this;
  }


  ObjectProperty < EventHandler < ? super RotateEvent > > onRotationStartedProperty();

  default T onRotationStarted(EventHandler < ? super RotateEvent > in) {
    onRotationStartedProperty().set(in);
    return (T) this;
  }

  default T bindOnRotationStarted(ObservableValue < ? extends EventHandler < ? super RotateEvent > > in) {
    onRotationStartedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnRotationStarted(Property < EventHandler < ? super RotateEvent > > in) {
    onRotationStartedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnRotationStarted(Property < EventHandler < ? super RotateEvent > > in) {
    in.bind(onRotationStartedProperty());
    return (T) this;
  }


  ObjectProperty < EventHandler < ? super RotateEvent > > onRotationFinishedProperty();

  default T onRotationFinished(EventHandler < ? super RotateEvent > in) {
    onRotationFinishedProperty().set(in);
    return (T) this;
  }

  default T bindOnRotationFinished(ObservableValue < ? extends EventHandler < ? super RotateEvent > > in) {
    onRotationFinishedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnRotationFinished(Property < EventHandler < ? super RotateEvent > > in) {
    onRotationFinishedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnRotationFinished(Property < EventHandler < ? super RotateEvent > > in) {
    in.bind(onRotationFinishedProperty());
    return (T) this;
  }
}
