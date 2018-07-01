package io.vulpine.lib.fxx.control;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;

import io.vulpine.lib.fxx.internal.mirror.LabeledMirror;
import io.vulpine.lib.fxx.internal.trait.HasContent;

public class TitledPane extends javafx.scene.control.TitledPane
implements
  LabeledMirror < TitledPane >,
  HasContent < TitledPane >
{
  public TitledPane() {
  }

  public TitledPane(String title, Node content) {
    super(title, content);
  }

  /** @see javafx.scene.control.TitledPane#setExpanded(boolean) */
  public TitledPane expanded(boolean in) {
    expandedProperty().set(in);
    return this;
  }

  /** @see javafx.scene.control.TitledPane#expandedProperty() */
  public TitledPane bindExpanded(ObservableValue < ? extends Boolean > in) {
    expandedProperty().bind(in);
    return this;
  }

  /** @see javafx.scene.control.TitledPane#expandedProperty() */
  public TitledPane biBindExpanded(Property < Boolean > in) {
    expandedProperty().bindBidirectional(in);
    return this;
  }

  /** @see javafx.scene.control.TitledPane#expandedProperty() */
  public TitledPane bindToExpanded(Property < Boolean > in) {
    in.bind(expandedProperty());
    return this;
  }

  /** @see javafx.scene.control.TitledPane#setAnimated(boolean) */
  public TitledPane animated(boolean in) {
    animatedProperty().set(in);
    return this;
  }

  /** @see javafx.scene.control.TitledPane#animatedProperty() */
  public TitledPane bindAnimated(ObservableValue < ? extends Boolean > in) {
    animatedProperty().bind(in);
    return this;
  }

  /** @see javafx.scene.control.TitledPane#animatedProperty() */
  public TitledPane biBindAnimated(Property < Boolean > in) {
    animatedProperty().bindBidirectional(in);
    return this;
  }

  /** @see javafx.scene.control.TitledPane#animatedProperty() */
  public TitledPane bindToAnimated(Property < Boolean > in) {
    in.bind(animatedProperty());
    return this;
  }

  /** @see javafx.scene.control.TitledPane#setCollapsible(boolean) */
  public TitledPane collapsible(boolean in) {
    collapsibleProperty().set(in);
    return this;
  }

  /** @see javafx.scene.control.TitledPane#collapsibleProperty() */
  public TitledPane bindCollapsible(ObservableValue < ? extends Boolean > in) {
    collapsibleProperty().bind(in);
    return this;
  }

  /** @see javafx.scene.control.TitledPane#collapsibleProperty() */
  public TitledPane biBindCollapsible(Property < Boolean > in) {
    collapsibleProperty().bindBidirectional(in);
    return this;
  }

  /** @see javafx.scene.control.TitledPane#collapsibleProperty() */
  public TitledPane bindToCollapsible(Property < Boolean > in) {
    in.bind(collapsibleProperty());
    return this;
  }
}
