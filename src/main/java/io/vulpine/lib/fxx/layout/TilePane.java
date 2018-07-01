package io.vulpine.lib.fxx.layout;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;

import io.vulpine.lib.fxx.internal.mirror.PaneMirror;
import io.vulpine.lib.fxx.internal.trait.HasAlignment;
import io.vulpine.lib.fxx.internal.trait.HasHGap;
import io.vulpine.lib.fxx.internal.trait.HasOrientation;
import io.vulpine.lib.fxx.internal.trait.HasVGap;

public class TilePane extends javafx.scene.layout.TilePane
implements
  PaneMirror < TilePane >,
  HasOrientation < TilePane >,
  HasHGap < TilePane >,
  HasVGap < TilePane >,
  HasAlignment < TilePane >
{
  public TilePane() {
  }

  public TilePane(Orientation orientation) {
    super(orientation);
  }

  public TilePane(double hgap, double vgap) {
    super(hgap, vgap);
  }

  public TilePane(Orientation orientation, double hgap, double vgap) {
    super(orientation, hgap, vgap);
  }

  public TilePane(Node... children) {
    super(children);
  }

  public TilePane(Orientation orientation, Node... children) {
    super(orientation, children);
  }

  public TilePane(double hgap, double vgap, Node... children) {
    super(hgap, vgap, children);
  }

  public TilePane(Orientation orientation, double hgap, double vgap, Node... children) {
    super(orientation, hgap, vgap, children);
  }

  public TilePane addChild(Node in, Pos alignment) {
    getChildren().add(in);
    setAlignment(in, alignment);
    return this;
  }

  public TilePane addChild(Node in, Insets margin) {
    getChildren().add(in);
    setMargin(in, margin);
    return this;
  }

  public TilePane addChild(Node in, Pos alignment, Insets margin) {
    getChildren().add(in);
    setAlignment(in, alignment);
    setMargin(in, margin);
    return this;
  }

  public TilePane prefRows(int in) {
    prefRowsProperty().set(in);
    return this;
  }

  public TilePane bindPrefRows(ObservableValue< ? extends Number > in) {
    prefRowsProperty().bind(in);
    return this;
  }

  public TilePane biBindPrefRows(Property < Number > in) {
    prefRowsProperty().bindBidirectional(in);
    return this;
  }

  public TilePane bindToPrefRows(Property< Number > in) {
    in.bind(prefRowsProperty());
    return this;
  }

  public TilePane prefColumns(int in) {
    prefColumnsProperty().set(in);
    return this;
  }

  public TilePane bindPrefColumns(ObservableValue< ? extends Number > in) {
    prefColumnsProperty().bind(in);
    return this;
  }

  public TilePane biBindPrefColumns(Property < Number > in) {
    prefColumnsProperty().bindBidirectional(in);
    return this;
  }

  public TilePane bindToPrefColumns(Property< Number > in) {
    in.bind(prefColumnsProperty());
    return this;
  }

  public TilePane prefTileWidth(double in) {
    prefTileWidthProperty().set(in);
    return this;
  }

  public TilePane bindPrefTileWidth(ObservableValue < ? extends Number > in) {
    prefTileWidthProperty().bind(in);
    return this;
  }

  public TilePane biBindPrefTileWidth(Property < Number > in) {
    prefTileWidthProperty().bindBidirectional(in);
    return this;
  }

  public TilePane bindToPrefTileWidth(Property < Number > in) {
    in.bind(prefTileWidthProperty());
    return this;
  }

  public TilePane prefTileHeight(double in) {
    prefTileHeightProperty().set(in);
    return this;
  }

  public TilePane bindPrefTileHeight(ObservableValue < ? extends Number > in) {
    prefTileHeightProperty().bind(in);
    return this;
  }

  public TilePane biBindPrefTileHeight(Property < Number > in) {
    prefTileHeightProperty().bindBidirectional(in);
    return this;
  }

  public TilePane bindToPrefTileHeight(Property < Number > in) {
    in.bind(prefTileHeightProperty());
    return this;
  }

  public TilePane bindToTileWidth(Property < Number > in) {
    in.bind(tileWidthProperty());
    return this;
  }

  public TilePane bindToTileHeight(Property < Number > in) {
    in.bind(tileHeightProperty());
    return this;
  }

  public TilePane tileAlignment(Pos in) {
    tileAlignmentProperty().set(in);
    return this;
  }

  public TilePane bindTileAlignment(ObservableValue < ? extends Pos > in) {
    tileAlignmentProperty().bind(in);
    return this;
  }

  public TilePane biBindTileAlignment(Property < Pos > in) {
    tileAlignmentProperty().bindBidirectional(in);
    return this;
  }

  public TilePane bindToTileAlignment(Property < Pos > in) {
    in.bind(tileAlignmentProperty());
    return this;
  }
}
