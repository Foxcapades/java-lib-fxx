package io.vulpine.lib.fxx.layout;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;

import io.vulpine.lib.fxx.internal.mirror.PaneMirror;

public class BorderPane extends javafx.scene.layout.BorderPane
implements
  PaneMirror < BorderPane >
{
  public BorderPane() {
  }

  public BorderPane(Node center) {
    super(center);
  }

  public BorderPane(Node center, Node top, Node right, Node bottom, Node left) {
    super(center, top, right, bottom, left);
  }

  public BorderPane addChild(Node in, Pos alignment) {
    getChildren().add(in);
    setAlignment(in, alignment);
    return this;
  }

  public BorderPane addChild(Node in, Insets margin) {
    getChildren().add(in);
    setMargin(in, margin);
    return this;
  }

  public BorderPane addChild(Node in, Pos alignment, Insets margin) {
    getChildren().add(in);
    setAlignment(in, alignment);
    setMargin(in, margin);
    return this;
  }

  public BorderPane center(Node in) {
    centerProperty().set(in);
    return this;
  }

  public BorderPane bindCenter(ObservableValue< ? extends Node > in) {
    centerProperty().bind(in);
    return this;
  }

  public BorderPane biBindCenter(Property< Node > in) {
    centerProperty().bindBidirectional(in);
    return this;
  }

  public BorderPane bindToCenter(Property < Node > in) {
    in.bind(centerProperty());
    return this;
  }

  public BorderPane top(Node in) {
    topProperty().set(in);
    return this;
  }

  public BorderPane bindTop(ObservableValue < ? extends Node > in) {
    topProperty().bind(in);
    return this;
  }

  public BorderPane biBindTop(Property < Node > in) {
    topProperty().bindBidirectional(in);
    return this;
  }

  public BorderPane bindToTop(Property < Node > in) {
    in.bind(topProperty());
    return this;
  }

  public BorderPane bottom(Node in) {
    bottomProperty().set(in);
    return this;
  }

  public BorderPane bindBottom(ObservableValue < ? extends Node > in) {
    bottomProperty().bind(in);
    return this;
  }

  public BorderPane biBindBottom(Property < Node > in) {
    bottomProperty().bindBidirectional(in);
    return this;
  }

  public BorderPane bindToBottom(Property < Node > in) {
    in.bind(bottomProperty());
    return this;
  }

  public BorderPane left(Node in) {
    leftProperty().set(in);
    return this;
  }

  public BorderPane bindLeft(ObservableValue < ? extends Node > in) {
    leftProperty().bind(in);
    return this;
  }

  public BorderPane biBindLeft(Property < Node > in) {
    leftProperty().bindBidirectional(in);
    return this;
  }

  public BorderPane bindToLeft(Property < Node > in) {
    in.bind(leftProperty());
    return this;
  }

  public BorderPane right(Node in) {
    rightProperty().set(in);
    return this;
  }

  public BorderPane bindRight(ObservableValue < ? extends Node > in) {
    rightProperty().bind(in);
    return this;
  }

  public BorderPane biBindRight(Property < Node > in) {
    rightProperty().bindBidirectional(in);
    return this;
  }

  public BorderPane bindToRight(Property < Node > in) {
    in.bind(rightProperty());
    return this;
  }
}
