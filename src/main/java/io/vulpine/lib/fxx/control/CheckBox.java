package io.vulpine.lib.fxx.control;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

import io.vulpine.lib.fxx.internal.mirror.ButtonBaseMirror;

public class CheckBox extends javafx.scene.control.CheckBox
implements ButtonBaseMirror < CheckBox >
{
  public CheckBox() {
  }

  public CheckBox(String text) {
    super(text);
  }

  public CheckBox indeterminate(boolean in) {
    indeterminateProperty().set(in);
    return this;
  }

  public CheckBox bindIndeterminate(ObservableValue< ? extends Boolean > in) {
    indeterminateProperty().bind(in);
    return this;
  }

  public CheckBox biBindIndeterminate(Property < Boolean > in) {
    indeterminateProperty().bindBidirectional(in);
    return this;
  }

  public CheckBox bindToIndeterminate(Property< Boolean > in) {
    in.bind(indeterminateProperty());
    return this;
  }

  public CheckBox selected(boolean in) {
    selectedProperty().set(in);
    return this;
  }

  public CheckBox bindSelected(ObservableValue < ? extends Boolean > in) {
    selectedProperty().bind(in);
    return this;
  }

  public CheckBox biBindSelected(Property < Boolean > in) {
    selectedProperty().bindBidirectional(in);
    return this;
  }

  public CheckBox bindToSelected(Property < Boolean > in) {
    in.bind(selectedProperty());
    return this;
  }

  public CheckBox allowIndeterminate(boolean in) {
    allowIndeterminateProperty().set(in);
    return this;
  }

  public CheckBox bindAllowIndeterminate(ObservableValue < ? extends Boolean > in) {
    allowIndeterminateProperty().bind(in);
    return this;
  }

  public CheckBox biBindAllowIndeterminate(Property < Boolean > in) {
    allowIndeterminateProperty().bindBidirectional(in);
    return this;
  }

  public CheckBox bindToAllowIndeterminate(Property < Boolean > in) {
    in.bind(allowIndeterminateProperty());
    return this;
  }
}
