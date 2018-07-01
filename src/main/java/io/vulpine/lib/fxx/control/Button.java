package io.vulpine.lib.fxx.control;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;

import io.vulpine.lib.fxx.internal.mirror.ButtonBaseMirror;

public class Button extends javafx.scene.control.Button
implements ButtonBaseMirror < Button >
{
  public Button() {
  }

  public Button(String text) {
    super(text);
  }

  public Button(String text, Node graphic) {
    super(text, graphic);
  }

  public Button defaultButton(boolean in) {
    defaultButtonProperty().set(in);
    return this;
  }

  public Button bindDefaultButton(ObservableValue< ? extends Boolean > in) {
    defaultButtonProperty().bind(in);
    return this;
  }

  public Button biBindDefaultButton(Property < Boolean > in) {
    defaultButtonProperty().bindBidirectional(in);
    return this;
  }

  public Button bindToDefaultButton(Property< Boolean > in) {
    in.bind(defaultButtonProperty());
    return this;
  }

  public Button cancelButton(boolean in) {
    cancelButtonProperty().set(in);
    return this;
  }

  public Button bindCancelButton(ObservableValue < ? extends Boolean > in) {
    cancelButtonProperty().bind(in);
    return this;
  }

  public Button biBindCancelButton(Property < Boolean > in) {
    cancelButtonProperty().bindBidirectional(in);
    return this;
  }

  public Button bindToCancelButton(Property < Boolean > in) {
    in.bind(cancelButtonProperty());
    return this;
  }
}
