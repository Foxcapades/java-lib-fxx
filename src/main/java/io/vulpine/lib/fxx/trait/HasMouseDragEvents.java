package io.vulpine.lib.fxx.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;

public interface HasMouseDragEvents< T extends HasMouseDragEvents >
{
  ObjectProperty < EventHandler < ? super MouseEvent > > onMouseDraggedProperty();

  default T onMouseDragged(EventHandler < ? super MouseEvent > in) {
    onMouseDraggedProperty().set(in);
    return (T) this;
  }

  default T bindOnMouseDragged(ObservableValue < ? extends EventHandler < ? super MouseEvent > > in) {
    onMouseDraggedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnMouseDragged(Property < EventHandler < ? super MouseEvent > > in) {
    onMouseDraggedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnMouseDragged(Property < EventHandler < ? super MouseEvent > > in) {
    in.bind(onMouseDraggedProperty());
    return (T) this;
  }

  ObjectProperty < EventHandler < ? super MouseDragEvent > > onMouseDragEnteredProperty();

  default T onMouseDragEntered(EventHandler < ? super MouseDragEvent > in) {
    onMouseDragEnteredProperty().set(in);
    return (T) this;
  }

  default T bindOnMouseDragEntered(ObservableValue < ? extends EventHandler < ? super MouseDragEvent > > in) {
    onMouseDragEnteredProperty().bind(in);
    return (T) this;
  }

  default T biBindOnMouseDragEntered(Property < EventHandler < ? super MouseDragEvent > > in) {
    onMouseDragEnteredProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnMouseDragEntered(Property < EventHandler < ? super MouseDragEvent > > in) {
    in.bind(onMouseDragEnteredProperty());
    return (T) this;
  }

  ObjectProperty < EventHandler < ? super MouseDragEvent > > onMouseDragExitedProperty();

  default T onMouseDragExited(EventHandler < ? super MouseDragEvent > in) {
    onMouseDragExitedProperty().set(in);
    return (T) this;
  }

  default T bindOnMouseDragExited(ObservableValue < ? extends EventHandler < ? super MouseDragEvent > > in) {
    onMouseDragExitedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnMouseDragExited(Property < EventHandler < ? super MouseDragEvent > > in) {
    onMouseDragExitedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnMouseDragExited(Property < EventHandler < ? super MouseDragEvent > > in) {
    in.bind(onMouseDragExitedProperty());
    return (T) this;
  }

  ObjectProperty < EventHandler < ? super MouseDragEvent > > onMouseDragOverProperty();

  default T onMouseDragOver(EventHandler < ? super MouseDragEvent > in) {
    onMouseDragOverProperty().set(in);
    return (T) this;
  }

  default T bindOnMouseDragOver(ObservableValue < ? extends EventHandler < ? super MouseDragEvent > > in) {
    onMouseDragOverProperty().bind(in);
    return (T) this;
  }

  default T biBindOnMouseDragOver(Property < EventHandler < ? super MouseDragEvent > > in) {
    onMouseDragOverProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnMouseDragOver(Property < EventHandler < ? super MouseDragEvent > > in) {
    in.bind(onMouseDragOverProperty());
    return (T) this;
  }

  ObjectProperty < EventHandler < ? super MouseDragEvent > > onMouseDragReleasedProperty();

  default T onMouseDragReleased(EventHandler < ? super MouseDragEvent > in) {
    onMouseDragReleasedProperty().set(in);
    return (T) this;
  }

  default T bindOnMouseDragReleased(ObservableValue < ? extends EventHandler < ? super MouseDragEvent > > in) {
    onMouseDragReleasedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnMouseDragReleased(Property < EventHandler < ? super MouseDragEvent > > in) {
    onMouseDragReleasedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnMouseDragReleased(Property < EventHandler < ? super MouseDragEvent > > in) {
    in.bind(onMouseDragReleasedProperty());
    return (T) this;
  }
}
