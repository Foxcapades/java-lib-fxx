package io.vulpine.lib.fxx.layout;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.Priority;

import io.vulpine.lib.fxx.internal.mirror.PaneMirror;
import io.vulpine.lib.fxx.internal.trait.HasSpacing;

public class VBox extends javafx.scene.layout.VBox
implements
  PaneMirror < VBox >,
  HasSpacing < VBox >
{
  public VBox() {
  }

  public VBox(double spacing) {
    super(spacing);
  }

  public VBox(Node... children) {
    super(children);
  }

  public VBox(double spacing, Node... children) {
    super(spacing, children);
  }

  public VBox addChild(Node in, Priority vgrow) {
    getChildren().add(in);
    setVgrow(in, vgrow);
    return this;
  }

  public VBox addChild(Node in, Insets margin) {
    getChildren().add(in);
    setMargin(in, margin);
    return this;
  }

  public VBox fillWidth(boolean in) {
    fillWidthProperty().set(in);
    return this;
  }

  public VBox bindFillWidth(ObservableValue< ? extends Boolean > in) {
    fillWidthProperty().bind(in);
    return this;
  }

  public VBox biBindFillWidth(Property < Boolean > in) {
    fillWidthProperty().bindBidirectional(in);
    return this;
  }

  public VBox bindToFillWidth(Property< Boolean > in) {
    in.bind(fillWidthProperty());
    return this;
  }
}
