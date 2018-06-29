package io.vulpine.lib.fxx.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.input.ScrollEvent;

public interface HasScrollEvents< T extends HasScrollEvents >
{
  ObjectProperty < EventHandler < ? super ScrollEvent > > onScrollProperty();

  default T onScroll(EventHandler < ? super ScrollEvent > in) {
    onScrollProperty().set(in);
    return (T) this;
  }

  default T bindOnScroll(ObservableValue < ? extends EventHandler < ? super ScrollEvent > > in) {
    onScrollProperty().bind(in);
    return (T) this;
  }

  default T biBindOnScroll(Property < EventHandler < ? super ScrollEvent > > in) {
    onScrollProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnScroll(Property < EventHandler < ? super ScrollEvent > > in) {
    in.bind(onScrollProperty());
    return (T) this;
  }


  ObjectProperty < EventHandler < ? super ScrollEvent > > onScrollStartedProperty();

  default T onScrollStarted(EventHandler < ? super ScrollEvent > in) {
    onScrollStartedProperty().set(in);
    return (T) this;
  }

  default T bindOnScrollStarted(ObservableValue < ? extends EventHandler < ? super ScrollEvent > > in) {
    onScrollStartedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnScrollStarted(Property < EventHandler < ? super ScrollEvent > > in) {
    onScrollStartedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnScrollStarted(Property < EventHandler < ? super ScrollEvent > > in) {
    in.bind(onScrollStartedProperty());
    return (T) this;
  }


  ObjectProperty < EventHandler < ? super ScrollEvent > > onScrollFinishedProperty();

  default T onScrollFinished(EventHandler < ? super ScrollEvent > in) {
    onScrollFinishedProperty().set(in);
    return (T) this;
  }

  default T bindOnScrollFinished(ObservableValue < ? extends EventHandler < ? super ScrollEvent > > in) {
    onScrollFinishedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnScrollFinished(Property < EventHandler < ? super ScrollEvent > > in) {
    onScrollFinishedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnScrollFinished(Property < EventHandler < ? super ScrollEvent > > in) {
    in.bind(onScrollFinishedProperty());
    return (T) this;
  }
}
