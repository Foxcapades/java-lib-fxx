package io.vulpine.lib.fxx.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public interface HasMouseEvents< T extends HasMouseEvents >
{
  ObjectProperty < EventHandler < ? super MouseEvent > > onMouseClickedProperty();

  default T onMouseClicked(EventHandler < ? super MouseEvent > in) {
    onMouseClickedProperty().set(in);
    return (T) this;
  }

  default T bindOnMouseClicked(ObservableValue < ? extends EventHandler < ? super MouseEvent > > in) {
    onMouseClickedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnMouseClicked(Property < EventHandler < ? super MouseEvent > > in) {
    onMouseClickedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnMouseClicked(Property < EventHandler < ? super MouseEvent > > in) {
    in.bind(onMouseClickedProperty());
    return (T) this;
  }

  ObjectProperty < EventHandler < ? super MouseEvent > > onMouseEnteredProperty();

  default T onMouseEntered(EventHandler < ? super MouseEvent > in) {
    onMouseEnteredProperty().set(in);
    return (T) this;
  }

  default T bindOnMouseEntered(ObservableValue < ? extends EventHandler < ? super MouseEvent > > in) {
    onMouseEnteredProperty().bind(in);
    return (T) this;
  }

  default T biBindOnMouseEntered(Property < EventHandler < ? super MouseEvent > > in) {
    onMouseEnteredProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnMouseEntered(Property < EventHandler < ? super MouseEvent > > in) {
    in.bind(onMouseEnteredProperty());
    return (T) this;
  }

  ObjectProperty < EventHandler < ? super MouseEvent > > onMouseExitedProperty();

  default T onMouseExited(EventHandler < ? super MouseEvent > in) {
    onMouseExitedProperty().set(in);
    return (T) this;
  }

  default T bindOnMouseExited(ObservableValue < ? extends EventHandler < ? super MouseEvent > > in) {
    onMouseExitedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnMouseExited(Property < EventHandler < ? super MouseEvent > > in) {
    onMouseExitedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnMouseExited(Property < EventHandler < ? super MouseEvent > > in) {
    in.bind(onMouseExitedProperty());
    return (T) this;
  }

  ObjectProperty < EventHandler < ? super MouseEvent > > onMouseMovedProperty();

  default T onMouseMoved(EventHandler < ? super MouseEvent > in) {
    onMouseMovedProperty().set(in);
    return (T) this;
  }

  default T bindOnMouseMoved(ObservableValue < ? extends EventHandler < ? super MouseEvent > > in) {
    onMouseMovedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnMouseMoved(Property < EventHandler < ? super MouseEvent > > in) {
    onMouseMovedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnMouseMoved(Property < EventHandler < ? super MouseEvent > > in) {
    in.bind(onMouseMovedProperty());
    return (T) this;
  }

  ObjectProperty < EventHandler < ? super MouseEvent > > onMousePressedProperty();

  default T onMousePressed(EventHandler < ? super MouseEvent > in) {
    onMousePressedProperty().set(in);
    return (T) this;
  }

  default T bindOnMousePressed(ObservableValue < ? extends EventHandler < ? super MouseEvent > > in) {
    onMousePressedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnMousePressed(Property < EventHandler < ? super MouseEvent > > in) {
    onMousePressedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnMousePressed(Property < EventHandler < ? super MouseEvent > > in) {
    in.bind(onMousePressedProperty());
    return (T) this;
  }

  ObjectProperty < EventHandler < ? super MouseEvent > > onMouseReleasedProperty();

  default T onMouseReleased(EventHandler < ? super MouseEvent > in) {
    onMouseReleasedProperty().set(in);
    return (T) this;
  }

  default T bindOnMouseReleased(ObservableValue < ? extends EventHandler < ? super MouseEvent > > in) {
    onMouseReleasedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnMouseReleased(Property < EventHandler < ? super MouseEvent > > in) {
    onMouseReleasedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnMouseReleased(Property < EventHandler < ? super MouseEvent > > in) {
    in.bind(onMouseReleasedProperty());
    return (T) this;
  }
}
