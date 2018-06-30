package io.vulpine.lib.fxx.control;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;

import io.vulpine.lib.fxx.internal.trait.*;

public class Tab extends javafx.scene.control.Tab
implements
  HasClosable< Tab >,
  HasContent< Tab >,
  HasContextMenu < Tab >,
  HasDisable < Tab >,
  HasGraphic< Tab >,
  HasId< Tab >,
  HasStyle < Tab >,
  HasStyleClasses < Tab >,
  HasText< Tab >,
  HasTooltip< Tab >
{
  public Tab() {
  }

  public Tab(String text) {
    super(text);
  }

  public Tab(String text, Node content) {
    super(text, content);
  }

  public Tab onSelectionChanged(EventHandler < Event > in) {
    setOnSelectionChanged(in);
    return this;
  }

  public Tab bindOnSelectionChanged(ObservableValue < ? extends EventHandler < Event > > in) {
    onSelectionChangedProperty().bind(in);
    return this;
  }

  public Tab biBindOnSelectionChanged(Property < EventHandler < Event > > in) {
    onSelectionChangedProperty().bindBidirectional(in);
    return this;
  }

  public Tab bindToOnSelectionChanged(Property < EventHandler < Event > > in) {
    in.bind(onSelectionChangedProperty());
    return this;
  }

  public Tab onClosed(EventHandler < Event > in) {
    setOnClosed(in);
    return this;
  }

  public Tab bindOnClosed(ObservableValue < ? extends EventHandler < Event > > in) {
    onClosedProperty().bind(in);
    return this;
  }

  public Tab biBindOnClosed(Property < EventHandler < Event > > in) {
    onClosedProperty().bindBidirectional(in);
    return this;
  }

  public Tab bindToOnClosed(Property < EventHandler < Event > > in) {
    in.bind(onClosedProperty());
    return this;
  }

  public Tab bindToDisabled(Property < Boolean > in) {
    in.bind(disabledProperty());
    return this;
  }

  public Tab onCloseRequest(EventHandler < Event > in) {
    setOnCloseRequest(in);
    return this;
  }

  public Tab bindOnCloseRequest(ObservableValue < EventHandler < Event > > in) {
    onCloseRequestProperty().bind(in);
    return this;
  }

  public Tab biBindOnCloseRequest(Property < EventHandler < Event > > in) {
    onCloseRequestProperty().bindBidirectional(in);
    return this;
  }

  public Tab bindToOnCloseRequest(Property < EventHandler < Event > > in) {
    in.bind(onCloseRequestProperty());
    return this;
  }

  public Tab userData(Object in) {
    setUserData(in);
    return this;
  }
}
