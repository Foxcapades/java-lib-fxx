package io.vulpine.lib.fxx.internal.mirror;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.scene.paint.Paint;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;

import io.vulpine.lib.fxx.internal.trait.display.HasFill;

/** @see javafx.scene.shape.Shape */
public interface ShapeMirror < T extends ShapeMirror >
extends
  NodeMirror < T >,
  HasFill< T >
{
  /** @see javafx.scene.shape.Shape#strokeTypeProperty() */
  ObjectProperty < StrokeType > strokeTypeProperty();

  /** @see javafx.scene.shape.Shape#strokeTypeProperty() */
  default T strokeType(StrokeType in) {
    strokeTypeProperty().set(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeTypeProperty() */
  default T bindStrokeType(ObservableValue< ? extends StrokeType > in) {
    strokeTypeProperty().bind(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeTypeProperty() */
  default T biBindStrokeType(Property < StrokeType > in) {
    strokeTypeProperty().bindBidirectional(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeTypeProperty() */
  default T bindToStrokeType(Property< StrokeType > in) {
    in.bind(strokeTypeProperty());
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeWidthProperty() */
  DoubleProperty strokeWidthProperty();

  /** @see javafx.scene.shape.Shape#strokeWidthProperty() */
  default T strokeWidth(double in) {
    strokeWidthProperty().set(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeWidthProperty() */
  default T bindStrokeWidth(ObservableValue < ? extends Number > in) {
    strokeWidthProperty().bind(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeWidthProperty() */
  default T biBindStrokeWidth(Property < Number > in) {
    strokeWidthProperty().bindBidirectional(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeWidthProperty() */
  default T bindToStrokeWidth(Property < Number > in) {
    in.bind(strokeWidthProperty());
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeLineJoinProperty() */
  ObjectProperty < StrokeLineJoin > strokeLineJoinProperty();

  /** @see javafx.scene.shape.Shape#strokeLineJoinProperty() */
  default T strokeLineJoin(StrokeLineJoin in) {
    strokeLineJoinProperty().set(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeLineJoinProperty() */
  default T bindStrokeLineJoin(ObservableValue < ? extends StrokeLineJoin > in) {
    strokeLineJoinProperty().bind(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeLineJoinProperty() */
  default T biBindStrokeLineJoin(Property < StrokeLineJoin > in) {
    strokeLineJoinProperty().bindBidirectional(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeLineJoinProperty() */
  default T bindToStrokeLineJoin(Property < StrokeLineJoin > in) {
    in.bind(strokeLineJoinProperty());
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeLineCapProperty() */
  ObjectProperty < StrokeLineCap > strokeLineCapProperty();

  /** @see javafx.scene.shape.Shape#strokeLineCapProperty() */
  default T strokeLineCap(StrokeLineCap in) {
    strokeLineCapProperty().set(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeLineCapProperty() */
  default T bindStrokeLineCap(ObservableValue < ? extends StrokeLineCap > in) {
    strokeLineCapProperty().bind(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeLineCapProperty() */
  default T biBindStrokeLineCap(Property < StrokeLineCap > in) {
    strokeLineCapProperty().bindBidirectional(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeLineCapProperty() */
  default T bindToStrokeLineCap(Property < StrokeLineCap > in) {
    in.bind(strokeLineCapProperty());
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeMiterLimitProperty() */
  DoubleProperty strokeMiterLimitProperty();

  /** @see javafx.scene.shape.Shape#strokeMiterLimitProperty() */
  default T strokeMiterLimit(double in) {
    strokeMiterLimitProperty().set(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeMiterLimitProperty() */
  default T bindStrokeMiterLimit(ObservableValue < ? extends Number > in) {
    strokeMiterLimitProperty().bind(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeMiterLimitProperty() */
  default T biBindStrokeMiterLimit(Property < Number > in) {
    strokeMiterLimitProperty().bindBidirectional(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeMiterLimitProperty() */
  default T bindToStrokeMiterLimit(Property < Number > in) {
    in.bind(strokeMiterLimitProperty());
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeDashOffsetProperty() */
  DoubleProperty strokeDashOffsetProperty();

  /** @see javafx.scene.shape.Shape#strokeDashOffsetProperty() */
  default T strokeDashOffset(double in) {
    strokeDashOffsetProperty().set(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeDashOffsetProperty() */
  default T bindStrokeDashOffset(ObservableValue < ? extends Number > in) {
    strokeDashOffsetProperty().bind(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeDashOffsetProperty() */
  default T biBindStrokeDashOffset(Property < Number > in) {
    strokeDashOffsetProperty().bindBidirectional(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#strokeDashOffsetProperty() */
  default T bindToStrokeDashOffset(Property < Number > in) {
    in.bind(strokeDashOffsetProperty());
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#getStrokeDashArray() */
  ObservableList<Double> getStrokeDashArray();

  /** @see javafx.scene.shape.Shape#getStrokeDashArray() */
  default T addStrokeDashSegment(double in) {
    getStrokeDashArray().add(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#getStrokeDashArray() */
  default T addStrokeDashSegments(Double ...in) {
    getStrokeDashArray().addAll(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#getStrokeDashArray() */
  default T setStrokDashSegments(Double ...in) {
    getStrokeDashArray().setAll(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#stroke */
  ObjectProperty < Paint > strokeProperty();

  /** @see javafx.scene.shape.Shape#stroke */
  default T stroke(Paint in) {
    strokeProperty().set(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#stroke */
  default T bindStroke(ObservableValue < ? extends Paint > in) {
    strokeProperty().bind(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#stroke */
  default T biBindStroke(Property < Paint > in) {
    strokeProperty().bindBidirectional(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#stroke */
  default T bindToStroke(Property < Paint > in) {
    in.bind(strokeProperty());
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#smooth */
  BooleanProperty smoothProperty();

  /** @see javafx.scene.shape.Shape#smooth */
  default T smooth(boolean in) {
    smoothProperty().set(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#smooth */
  default T bindSmooth(ObservableValue < ? extends Boolean > in) {
    smoothProperty().bind(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#smooth */
  default T biBindSmooth(Property < Boolean > in) {
    smoothProperty().bindBidirectional(in);
    return (T) this;
  }

  /** @see javafx.scene.shape.Shape#smooth */
  default T bindToSmooth(Property < Boolean > in) {
    in.bind(smoothProperty());
    return (T) this;
  }
}
