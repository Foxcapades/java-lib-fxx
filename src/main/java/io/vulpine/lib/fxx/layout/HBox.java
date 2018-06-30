package io.vulpine.lib.fxx.layout;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.Priority;

import io.vulpine.lib.fxx.internal.mirror.PaneMirror;
import io.vulpine.lib.fxx.internal.trait.HasSpacing;

public class HBox extends javafx.scene.layout.HBox
implements
  PaneMirror < HBox >,
  HasSpacing < HBox >
{
  public HBox() {
  }

  public HBox(double spacing) {
    super(spacing);
  }

  public HBox(Node... children) {
    super(children);
  }

  public HBox(double spacing, Node... children) {
    super(spacing, children);
  }

  public HBox addChild(Node in, Priority hgrow) {
    getChildren().add(in);
    setHgrow(in, hgrow);
    return this;
  }

  public HBox addChild(Node in, Insets margin) {
    getChildren().add(in);
    setMargin(in, margin);
    return this;
  }

  public HBox fillHeight(boolean in) {
    fillHeightProperty().set(in);
    return this;
  }

  public HBox bindFillHeight(ObservableValue< ? extends Boolean > in) {
    fillHeightProperty().bind(in);
    return this;
  }

  public HBox biBindFillHeight(Property < Boolean > in) {
    fillHeightProperty().bindBidirectional(in);
    return this;
  }

  public HBox bindToFillHeight(Property< Boolean > in) {
    in.bind(fillHeightProperty());
    return this;
  }
}
