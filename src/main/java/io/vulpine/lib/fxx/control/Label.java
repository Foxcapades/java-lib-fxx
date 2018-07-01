package io.vulpine.lib.fxx.control;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;

import io.vulpine.lib.fxx.internal.mirror.LabeledMirror;

public class Label extends javafx.scene.control.Label
  implements LabeledMirror < Label >
{
  public Label() {
  }

  public Label(String text) {
    super(text);
  }

  public Label(String text, Node graphic) {
    super(text, graphic);
  }

  public Label labelFor(Node in) {
    labelForProperty().set(in);
    return this;
  }

  public Label bindLabelFor(ObservableValue < ? extends Node > in) {
    labelForProperty().bind(in);
    return this;
  }

  public Label biBindLabelFor(Property < Node > in) {
    labelForProperty().bindBidirectional(in);
    return this;
  }

  public Label bindToLabelFor(Property < Node > in) {
    in.bind(labelForProperty());
    return this;
  }
}
