package io.vulpine.lib.fxx.control;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ButtonType;

import io.vulpine.lib.fxx.internal.mirror.DialogMirror;

public class Alert extends javafx.scene.control.Alert
implements DialogMirror < ButtonType, Alert >
{
  public Alert(AlertType alertType) {
    super(alertType);
  }

  public Alert(AlertType alertType, String contentText, ButtonType... buttons) {
    super(alertType, contentText, buttons);
  }

  public Alert alertType(AlertType in) {
    alertTypeProperty().set(in);
    return this;
  }

  public Alert bindAlertType(ObservableValue < ? extends AlertType > in) {
    alertTypeProperty().bind(in);
    return this;
  }

  public Alert biBindAlertType(Property < AlertType > in) {
    alertTypeProperty().bindBidirectional(in);
    return this;
  }

  public Alert bindToAlertType(Property < AlertType > in) {
    in.bind(alertTypeProperty());
    return this;
  }

  public Alert addButtonType(ButtonType in) {
    getButtonTypes().add(in);
    return this;
  }

  public Alert addButtonTypes(ButtonType ...in) {
    getButtonTypes().addAll(in);
    return this;
  }

  public Alert setButtonTypes(ButtonType ...in) {
    getButtonTypes().setAll(in);
    return this;
  }
}
