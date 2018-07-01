package io.vulpine.lib.fxx.control;


import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TitledPane;

import io.vulpine.lib.fxx.internal.mirror.ControlMirror;

public class Accordion extends javafx.scene.control.Accordion
  implements ControlMirror < Accordion >
{
  public Accordion() {
  }

  public Accordion(TitledPane... titledPanes) {
    super(titledPanes);
  }

  public Accordion addPane(TitledPane in) {
    getPanes().add(in);
    return this;
  }

  public Accordion addPanes(TitledPane... in) {
    getPanes().addAll(in);
    return this;
  }

  public Accordion setPanes(TitledPane... in) {
    getPanes().setAll(in);
    return this;
  }

  public Accordion expandedPane(TitledPane in) {
    expandedPaneProperty().set(in);
    return this;
  }

  public Accordion bindExpandedPane(ObservableValue < ? extends TitledPane > in) {
    expandedPaneProperty().bind(in);
    return this;
  }

  public Accordion biBindExpandedPane(Property < TitledPane > in) {
    expandedPaneProperty().bindBidirectional(in);
    return this;
  }

  public Accordion bindToExpandedPane(Property < TitledPane > in) {
    in.bind(expandedPaneProperty());
    return this;
  }
}
