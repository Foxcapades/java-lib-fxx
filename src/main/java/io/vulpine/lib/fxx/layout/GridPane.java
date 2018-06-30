package io.vulpine.lib.fxx.layout;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Node;

import io.vulpine.lib.fxx.internal.mirror.PaneMirror;
import io.vulpine.lib.fxx.internal.trait.HasAlignment;
import io.vulpine.lib.fxx.internal.trait.HasHGap;
import io.vulpine.lib.fxx.internal.trait.HasVGap;

public class GridPane
extends javafx.scene.layout.GridPane
implements
  PaneMirror < GridPane >,
  HasHGap < GridPane >,
  HasVGap < GridPane >,
  HasAlignment < GridPane >
{
  public GridPane() {
  }

  public GridPane addChild(Node in, Integer row, Integer col) {
    getChildren().add(in);
    setRowIndex(in, row);
    setColumnIndex(in, col);
    return this;
  }

  public GridPane addChild(Node in, Insets margin, Integer row, Integer col) {
    addChild(in, row, col);
    setMargin(in, margin);
    return this;
  }

  public GridPane addChild(
    Node in,
    Integer row,
    Integer col,
    Integer rowSpan,
    Integer colSpan
  ) {
    addChild(in, row, col);
    setRowSpan(in, rowSpan);
    setColumnSpan(in, colSpan);
    return this;
  }

  public GridPane addChild(
    Node in,
    Insets margin,
    Integer row,
    Integer col,
    Integer rowSpan,
    Integer colSpan
  ) {
    addChild(in, row, col, rowSpan, colSpan);
    setMargin(in, margin);
    return this;
  }

  public GridPaneCellBuilder buildChild(Node in) {
    getChildren().add(in);
    return new GridPaneCellBuilder(this, in);
  }

  public GridPaneCellBuilder buildChild(Node in, int row, int col) {
    add(in, row, col);
    return new GridPaneCellBuilder(this, in);
  }

  public GridPane gridLinesVisible(boolean in) {
    gridLinesVisibleProperty().set(in);
    return this;
  }

  public GridPane bindGridLinesVisible(ObservableValue< ? extends Boolean > in) {
    gridLinesVisibleProperty().bind(in);
    return this;
  }

  public GridPane biBindGridLinesVisible(Property< Boolean > in) {
    gridLinesVisibleProperty().bindBidirectional(in);
    return this;
  }

  public GridPane bindToGridLinesVisible(Property < Boolean > in) {
    in.bind(gridLinesVisibleProperty());
    return this;
  }
}
