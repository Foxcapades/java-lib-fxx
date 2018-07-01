package io.vulpine.lib.fxx.layout;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.VPos;
import javafx.scene.Node;

import io.vulpine.lib.fxx.internal.mirror.PaneMirror;
import io.vulpine.lib.fxx.internal.trait.display.HasAlignment;
import io.vulpine.lib.fxx.internal.trait.layout.HasHGap;
import io.vulpine.lib.fxx.internal.trait.display.HasOrientation;
import io.vulpine.lib.fxx.internal.trait.layout.HasVGap;

public class FlowPane extends javafx.scene.layout.FlowPane
implements
  PaneMirror < FlowPane >,
  HasHGap < FlowPane >,
  HasVGap < FlowPane >,
  HasAlignment < FlowPane >,
  HasOrientation < FlowPane >
{
  public FlowPane() {
  }

  public FlowPane(Orientation orientation) {
    super(orientation);
  }

  public FlowPane(double hgap, double vgap) {
    super(hgap, vgap);
  }

  public FlowPane(Orientation orientation, double hgap, double vgap) {
    super(orientation, hgap, vgap);
  }

  public FlowPane(Node... children) {
    super(children);
  }

  public FlowPane(Orientation orientation, Node... children) {
    super(orientation, children);
  }

  public FlowPane(double hgap, double vgap, Node... children) {
    super(hgap, vgap, children);
  }

  public FlowPane(Orientation orientation, double hgap, double vgap, Node... children) {
    super(orientation, hgap, vgap, children);
  }

  public FlowPane addChild(Node in, Insets margin) {
    getChildren().add(in);
    setMargin(in, margin);
    return this;
  }

  public FlowPane prefWrapLength(double in) {
    prefWrapLengthProperty().set(in);
    return this;
  }

  public FlowPane bindPrefWrapLength(ObservableValue < ? extends Number > in) {
    prefWrapLengthProperty().bind(in);
    return this;
  }

  public FlowPane biBindPrefWrapLength(Property < Number > in) {
    prefWrapLengthProperty().bindBidirectional(in);
    return this;
  }

  public FlowPane bindToPrefWrapLength(Property < Number > in) {
    in.bind(prefWrapLengthProperty());
    return this;
  }

  public FlowPane columnHAlignment(HPos in) {
    columnHalignmentProperty().set(in);
    return this;
  }

  public FlowPane bindColumnHAlignment(ObservableValue < ? extends HPos > in) {
    columnHalignmentProperty().bind(in);
    return this;
  }

  public FlowPane biBindColumnHAlignment(Property < HPos > in) {
    columnHalignmentProperty().bindBidirectional(in);
    return this;
  }

  public FlowPane bindToColumnHAlignment(Property < HPos > in) {
    in.bind(columnHalignmentProperty());
    return this;
  }

  public FlowPane rowVAlignment(VPos in) {
    rowValignmentProperty().set(in);
    return this;
  }

  public FlowPane bindRowVAlignment(ObservableValue < ? extends VPos > in) {
    rowValignmentProperty().bind(in);
    return this;
  }

  public FlowPane biBindRowVAlignment(Property < VPos > in) {
    rowValignmentProperty().bindBidirectional(in);
    return this;
  }

  public FlowPane bindToRowVAlignment(Property < VPos > in) {
    in.bind(rowValignmentProperty());
    return this;
  }
}
