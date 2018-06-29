package io.vulpine.lib.fxx.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;

public interface HasDragEvents< T extends HasDragEvents >
{
  ObjectProperty < EventHandler < ? super MouseEvent > > onDragDetectedProperty();

  default T onDragDetected(EventHandler < ? super MouseEvent > in) {
    onDragDetectedProperty().set(in);
    return (T) this;
  }

  default T bindOnDragDetected(ObservableValue < ? extends EventHandler < ? super MouseEvent > > in) {
    onDragDetectedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnDragDetected(Property < EventHandler < ? super MouseEvent > > in) {
    onDragDetectedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnDragDetected(Property < EventHandler < ? super MouseEvent > > in) {
    in.bind(onDragDetectedProperty());
    return (T) this;
  }

  ObjectProperty < EventHandler < ? super DragEvent > > onDragDoneProperty();

  default T onDragDone(EventHandler < ? super DragEvent > in) {
    onDragDoneProperty().set(in);
    return (T) this;
  }

  default T bindOnDragDone(ObservableValue < ? extends EventHandler < ? super DragEvent > > in) {
    onDragDoneProperty().bind(in);
    return (T) this;
  }

  default T biBindOnDragDone(Property < EventHandler < ? super DragEvent > > in) {
    onDragDoneProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnDragDone(Property < EventHandler < ? super DragEvent > > in) {
    in.bind(onDragDoneProperty());
    return (T) this;
  }

  ObjectProperty < EventHandler < ? super DragEvent > > onDragDroppedProperty();

  default T onDragDropped(EventHandler < ? super DragEvent > in) {
    onDragDroppedProperty().set(in);
    return (T) this;
  }

  default T bindOnDragDropped(ObservableValue < ? extends EventHandler < ? super DragEvent > > in) {
    onDragDroppedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnDragDropped(Property < EventHandler < ? super DragEvent > > in) {
    onDragDroppedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnDragDropped(Property < EventHandler < ? super DragEvent > > in) {
    in.bind(onDragDroppedProperty());
    return (T) this;
  }

  ObjectProperty < EventHandler < ? super DragEvent > > onDragEnteredProperty();

  default T onDragEntered(EventHandler < ? super DragEvent > in) {
    onDragEnteredProperty().set(in);
    return (T) this;
  }

  default T bindOnDragEntered(ObservableValue < ? extends EventHandler < ? super DragEvent > > in) {
    onDragEnteredProperty().bind(in);
    return (T) this;
  }

  default T biBindOnDragEntered(Property < EventHandler < ? super DragEvent > > in) {
    onDragEnteredProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnDragEntered(Property < EventHandler < ? super DragEvent > > in) {
    in.bind(onDragEnteredProperty());
    return (T) this;
  }

  ObjectProperty < EventHandler < ? super DragEvent > > onDragExitedProperty();

  default T onDragExited(EventHandler < ? super DragEvent > in) {
    onDragExitedProperty().set(in);
    return (T) this;
  }

  default T bindOnDragExited(ObservableValue < ? extends EventHandler < ? super DragEvent > > in) {
    onDragExitedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnDragExited(Property < EventHandler < ? super DragEvent > > in) {
    onDragExitedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnDragExited(Property < EventHandler < ? super DragEvent > > in) {
    in.bind(onDragExitedProperty());
    return (T) this;
  }

  ObjectProperty < EventHandler < ? super DragEvent > > onDragOverProperty();

  default T onDragOver(EventHandler < ? super DragEvent > in) {
    onDragOverProperty().set(in);
    return (T) this;
  }

  default T bindOnDragOver(ObservableValue < ? extends EventHandler < ? super DragEvent > > in) {
    onDragOverProperty().bind(in);
    return (T) this;
  }

  default T biBindOnDragOver(Property < EventHandler < ? super DragEvent > > in) {
    onDragOverProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnDragOver(Property < EventHandler < ? super DragEvent > > in) {
    in.bind(onDragOverProperty());
    return (T) this;
  }
}
