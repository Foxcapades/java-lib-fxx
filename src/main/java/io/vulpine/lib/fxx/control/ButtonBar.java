package io.vulpine.lib.fxx.control;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;

import io.vulpine.lib.fxx.internal.mirror.ControlMirror;

public class ButtonBar extends javafx.scene.control.ButtonBar
  implements ControlMirror < ButtonBar >
{
  public ButtonBar() {
  }

  public ButtonBar(String buttonOrder) {
    super(buttonOrder);
  }

  public ButtonBar addButton(Node button, ButtonData data) {
    getButtons().add(button);
    setButtonData(button, data);
    return this;
  }

  public ButtonBar addButton(Node button, boolean uniformSize) {
    getButtons().add(button);
    setButtonUniformSize(button, uniformSize);
    return this;
  }

  public ButtonBar addButton(Node button, ButtonData data, boolean uniformSize) {
    getButtons().add(button);
    setButtonData(button, data);
    setButtonUniformSize(button, uniformSize);
    return this;
  }

  public ButtonBar addButton(Node button) {
    getButtons().add(button);
    return this;
  }

  public ButtonBar addButtons(Node... buttons) {
    getButtons().addAll(buttons);
    return this;
  }

  public ButtonBar setButtons(Node... buttons) {
    getButtons().setAll(buttons);
    return this;
  }

  public ButtonBar buttonOrder(String in) {
    buttonOrderProperty().set(in);
    return this;
  }

  public ButtonBar bindButtonOrder(ObservableValue < ? extends String > in) {
    buttonOrderProperty().bind(in);
    return this;
  }

  public ButtonBar biBindButtonOrder(Property < String > in) {
    buttonOrderProperty().bindBidirectional(in);
    return this;
  }

  public ButtonBar bindToButtonOrder(Property < String > in) {
    in.bind(buttonOrderProperty());
    return this;
  }

  public ButtonBar buttonMinWidth(double in) {
    buttonMinWidthProperty().set(in);
    return this;
  }

  public ButtonBar bindButtonMinWidth(ObservableValue < ? extends Number > in) {
    buttonMinWidthProperty().bind(in);
    return this;
  }

  public ButtonBar biBindButtonMinWidth(Property < Number > in) {
    buttonMinWidthProperty().bindBidirectional(in);
    return this;
  }

  public ButtonBar bindToButtonMinWidth(Property < Number > in) {
    in.bind(buttonMinWidthProperty());
    return this;
  }
}
