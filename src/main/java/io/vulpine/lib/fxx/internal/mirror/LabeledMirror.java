package io.vulpine.lib.fxx.internal.mirror;

import javafx.beans.property.*;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.control.ContentDisplay;
import javafx.scene.paint.Paint;

import io.vulpine.lib.fxx.internal.trait.behavior.HasMnemonicParsing;
import io.vulpine.lib.fxx.internal.trait.display.HasAlignment;
import io.vulpine.lib.fxx.internal.trait.display.HasGraphic;
import io.vulpine.lib.fxx.internal.trait.text.*;

public interface LabeledMirror< T extends LabeledMirror >
  extends
  ControlMirror < T >,
  HasText< T >,
  HasAlignment< T >,
  HasTextAlignment< T >,
  HasTextOverrun< T >,
  HasGraphic< T >,
  HasFont< T >,
  HasUnderline < T >,
  HasLineSpacing < T >,
  HasMnemonicParsing< T >
{
  StringProperty ellipsisStringProperty();

  default T ellipsisString(String in) {
    ellipsisStringProperty().set(in);
    return (T) this;
  }

  default T bindEllipsisString(ObservableValue < ? extends String > in) {
    ellipsisStringProperty().bind(in);
    return (T) this;
  }

  default T biBindEllipsisString(Property < String > in) {
    ellipsisStringProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToEllipsisString(Property < String > in) {
    in.bind(ellipsisStringProperty());
    return (T) this;
  }

  BooleanProperty wrapTextProperty();

  default T wrapText(boolean in) {
    wrapTextProperty().set(in);
    return (T) this;
  }

  default T bindWrapText(ObservableValue < ? extends Boolean > in) {
    wrapTextProperty().bind(in);
    return (T) this;
  }

  default T biBindWrapText(Property < Boolean > in) {
    wrapTextProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToWrapText(Property < Boolean > in) {
    in.bind(wrapTextProperty());
    return (T) this;
  }

  ObjectProperty < ContentDisplay > contentDisplayProperty();

  default T contentDisplay(ContentDisplay in) {
    contentDisplayProperty().set(in);
    return (T) this;
  }

  default T bindContentDisplay(ObservableValue < ? extends ContentDisplay > in) {
    contentDisplayProperty().bind(in);
    return (T) this;
  }

  default T biBindContentDisplay(Property < ContentDisplay > in) {
    contentDisplayProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToContentDisplay(Property < ContentDisplay > in) {
    in.bind(contentDisplayProperty());
    return (T) this;
  }

  ReadOnlyObjectProperty < Insets > labelPaddingProperty();

  default T bindToLabelPadding(Property < Insets > in) {
    in.bind(labelPaddingProperty());
    return (T) this;
  }

  DoubleProperty graphicTextGapProperty();

  default T graphicTextGap(double in) {
    graphicTextGapProperty().set(in);
    return (T) this;
  }

  default T bindGraphicTextGap(ObservableValue < ? extends Number > in) {
    graphicTextGapProperty().bind(in);
    return (T) this;
  }

  default T biBindGraphicTextGap(Property < Number > in) {
    graphicTextGapProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToGraphicTextGap(Property < Number > in) {
    in.bind(graphicTextGapProperty());
    return (T) this;
  }

  ObjectProperty < Paint > textFillProperty();

  default T textFill(Paint in) {
    textFillProperty().set(in);
    return (T) this;
  }

  default T bindTextFill(ObservableValue < ? extends Paint > in) {
    textFillProperty().bind(in);
    return (T) this;
  }

  default T biBindTextFill(Property < Paint > in) {
    textFillProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToTextFill(Property < Paint > in) {
    in.bind(textFillProperty());
    return (T) this;
  }
}
