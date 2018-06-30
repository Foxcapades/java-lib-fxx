package io.vulpine.lib.fxx.mirror;

import javafx.beans.property.*;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.shape.Shape;

import io.vulpine.lib.fxx.trait.HasMaxSize;
import io.vulpine.lib.fxx.trait.HasMinSize;
import io.vulpine.lib.fxx.trait.HasPrefSize;

public interface RegionMirror< T extends RegionMirror >
extends
  ParentMirror < T >,
  HasMinSize < T >,
  HasMaxSize < T >,
  HasPrefSize < T >
{
  BooleanProperty snapToPixelProperty();

  default T snapToPixel(boolean in) {
    snapToPixelProperty().set(in);
    return (T) this;
  }

  default T bindSnapToPixel(ObservableValue < ? extends Boolean > in) {
    snapToPixelProperty().bind(in);
    return (T) this;
  }

  default T biBindSnapToPixel(Property < Boolean > in) {
    snapToPixelProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToSnapToPixel(Property < Boolean > in) {
    in.bind(snapToPixelProperty());
    return (T) this;
  }

  ObjectProperty < Insets > paddingProperty();

  default T padding(Insets in) {
    paddingProperty().set(in);
    return (T) this;
  }

  default T bindPadding(ObservableValue < ? extends Insets > in) {
    paddingProperty().bind(in);
    return (T) this;
  }

  default T biBindPadding(Property < Insets > in) {
    paddingProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToPadding(Property < Insets > in) {
    in.bind(paddingProperty());
    return (T) this;
  }

  ObjectProperty < Background > backgroundProperty();

  default T background(Background in) {
    backgroundProperty().set(in);
    return (T) this;
  }

  default T bindBackground(ObservableValue < ? extends Background > in) {
    backgroundProperty().bind(in);
    return (T) this;
  }

  default T biBindBackground(Property < Background > in) {
    backgroundProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToBackground(Property < Background > in) {
    in.bind(backgroundProperty());
    return (T) this;
  }

  ObjectProperty < Border > borderProperty();

  default T border(Border in) {
    borderProperty().set(in);
    return (T) this;
  }

  default T bindBorder(ObservableValue < ? extends Border > in) {
    borderProperty().bind(in);
    return (T) this;
  }

  default T biBindBorder(Property < Border > in) {
    borderProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToBorder(Property < Border > in) {
    in.bind(borderProperty());
    return (T) this;
  }

  ObjectProperty < Insets > opaqueInsetsProperty();

  default T opaqueInsets(Insets in) {
    opaqueInsetsProperty().set(in);
    return (T) this;
  }

  default T bindOpaqueInsets(ObservableValue < ? extends Insets > in) {
    opaqueInsetsProperty().bind(in);
    return (T) this;
  }

  default T biBindOpaqueInsets(Property < Insets > in) {
    opaqueInsetsProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOpaqueInsets(Property < Insets > in) {
    in.bind(opaqueInsetsProperty());
    return (T) this;
  }

  ReadOnlyObjectProperty < Insets > insetsProperty();

  default T bindToInsets(Property < Insets > in) {
    in.bind(insetsProperty());
    return (T) this;
  }

  ReadOnlyDoubleProperty widthProperty();

  default T bindToWidth(Property < Number > in) {
    in.bind(widthProperty());
    return (T) this;
  }

  ReadOnlyDoubleProperty heightProperty();

  default T bindToHeight(Property < Number > in) {
    in.bind(heightProperty());
    return (T) this;
  }

  ObjectProperty < Shape > shapeProperty();

  default T shape(Shape in) {
    shapeProperty().set(in);
    return (T) this;
  }

  default T bindShape(ObservableValue < ? extends Shape > in) {
    shapeProperty().bind(in);
    return (T) this;
  }

  default T biBindShape(Property < Shape > in) {
    shapeProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToShape(Property < Shape > in) {
    in.bind(shapeProperty());
    return (T) this;
  }

  BooleanProperty scaleShapeProperty();

  default T scaleShape(boolean in) {
    scaleShapeProperty().set(in);
    return (T) this;
  }

  default T bindScaleShape(ObservableValue < ? extends Boolean > in) {
    scaleShapeProperty().bind(in);
    return (T) this;
  }

  default T biBindScaleShape(Property < Boolean > in) {
    scaleShapeProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToScaleShape(Property < Boolean > in) {
    in.bind(scaleShapeProperty());
    return (T) this;
  }

  BooleanProperty centerShapeProperty();

  default T centerShape(boolean in) {
    centerShapeProperty().set(in);
    return (T) this;
  }

  default T bindCenterShape(ObservableValue < ? extends Boolean > in) {
    centerShapeProperty().bind(in);
    return (T) this;
  }

  default T biBindCenterShape(Property < Boolean > in) {
    centerShapeProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToCenterShape(Property < Boolean > in) {
    in.bind(centerShapeProperty());
    return (T) this;
  }

  BooleanProperty cacheShapeProperty();

  default T cacheShape(boolean in) {
    cacheShapeProperty().set(in);
    return (T) this;
  }

  default T bindCacheShape(ObservableValue < ? extends Boolean > in) {
    cacheShapeProperty().bind(in);
    return (T) this;
  }

  default T biBindCacheShape(Property < Boolean > in) {
    cacheShapeProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToCacheShape(Property < Boolean > in) {
    in.bind(cacheShapeProperty());
    return (T) this;
  }
}
