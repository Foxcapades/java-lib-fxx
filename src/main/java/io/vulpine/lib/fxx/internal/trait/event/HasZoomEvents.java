package io.vulpine.lib.fxx.internal.trait.event;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.input.ZoomEvent;

public interface HasZoomEvents< T extends HasZoomEvents >
{
  ObjectProperty < EventHandler < ? super ZoomEvent > > onZoomProperty();

  default T onZoom(EventHandler < ? super ZoomEvent > in) {
    onZoomProperty().set(in);
    return (T) this;
  }

  default T bindOnZoom(ObservableValue < ? extends EventHandler < ? super ZoomEvent > > in) {
    onZoomProperty().bind(in);
    return (T) this;
  }

  default T biBindOnZoom(Property < EventHandler < ? super ZoomEvent > > in) {
    onZoomProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnZoom(Property < EventHandler < ? super ZoomEvent > > in) {
    in.bind(onZoomProperty());
    return (T) this;
  }


  ObjectProperty < EventHandler < ? super ZoomEvent > > onZoomStartedProperty();

  default T onZoomStarted(EventHandler < ? super ZoomEvent > in) {
    onZoomStartedProperty().set(in);
    return (T) this;
  }

  default T bindOnZoomStarted(ObservableValue < ? extends EventHandler < ? super ZoomEvent > > in) {
    onZoomStartedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnZoomStarted(Property < EventHandler < ? super ZoomEvent > > in) {
    onZoomStartedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnZoomStarted(Property < EventHandler < ? super ZoomEvent > > in) {
    in.bind(onZoomStartedProperty());
    return (T) this;
  }


  ObjectProperty < EventHandler < ? super ZoomEvent > > onZoomFinishedProperty();

  default T onZoomFinished(EventHandler < ? super ZoomEvent > in) {
    onZoomFinishedProperty().set(in);
    return (T) this;
  }

  default T bindOnZoomFinished(ObservableValue < ? extends EventHandler < ? super ZoomEvent > > in) {
    onZoomFinishedProperty().bind(in);
    return (T) this;
  }

  default T biBindOnZoomFinished(Property < EventHandler < ? super ZoomEvent > > in) {
    onZoomFinishedProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnZoomFinished(Property < EventHandler < ? super ZoomEvent > > in) {
    in.bind(onZoomFinishedProperty());
    return (T) this;
  }
}
