package io.vulpine.lib.fxx.layout;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.layout.Priority;

public class GridPaneCellBuilder
{
  private final GridPane parent;
  private final Node node;

  GridPaneCellBuilder(GridPane parent, Node in) {
    this.parent = parent;
    this.node = in;
  }

  public GridPaneCellBuilder colSpan(int in) {
    GridPane.setColumnSpan(node, in);
    return this;
  }

  public GridPaneCellBuilder rowSpan(int in) {
    GridPane.setRowSpan(node, in);
    return this;
  }

  public GridPaneCellBuilder column(int in) {
    GridPane.setColumnIndex(node, in);
    return this;
  }

  public GridPaneCellBuilder row(int in) {
    GridPane.setRowIndex(node, in);
    return this;
  }

  public GridPaneCellBuilder hGrow(Priority in) {
    GridPane.setHgrow(node, in);
    return this;
  }

  public GridPaneCellBuilder vGrow(Priority in) {
    GridPane.setVgrow(node, in);
    return this;
  }

  public GridPaneCellBuilder hAlign(HPos in) {
    GridPane.setHalignment(node, in);
    return this;
  }

  public GridPaneCellBuilder vAlign(VPos in) {
    GridPane.setValignment(node, in);
    return this;
  }

  public GridPaneCellBuilder margin(Insets in) {
    GridPane.setMargin(node, in);
    return this;
  }

  public GridPaneCellBuilder fillWidth(boolean in) {
    GridPane.setFillWidth(node, in);
    return this;
  }

  public GridPaneCellBuilder fillHeight(boolean in) {
    GridPane.setFillHeight(node, in);
    return this;
  }

  public GridPane finish() {
    return parent;
  }
}
