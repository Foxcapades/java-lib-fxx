package io.vulpine.lib.fxx.text;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.VPos;
import javafx.scene.paint.Paint;
import javafx.scene.shape.PathElement;
import javafx.scene.text.FontSmoothingType;
import javafx.scene.text.TextBoundsType;

import io.vulpine.lib.fxx.internal.mirror.ShapeMirror;
import io.vulpine.lib.fxx.internal.trait.text.*;

public class Text extends javafx.scene.text.Text
implements
  ShapeMirror < Text >,
  HasText < Text >,
  HasFont < Text >,
  HasUnderline < Text >,
  HasTextAlignment < Text >,
  HasLineSpacing < Text >
{
  public Text() {
  }

  public Text(String text) {
    super(text);
  }

  public Text(double x, double y, String text) {
    super(x, y, text);
  }

  /** @see javafx.scene.text.Text#x */
  public Text x(double in) {
    xProperty().set(in);
    return this;
  }

  /** @see javafx.scene.text.Text#x */
  public Text bindX(ObservableValue< ? extends Number > in) {
    xProperty().bind(in);
    return this;
  }

  /** @see javafx.scene.text.Text#x */
  public Text biBindX(Property < Number > in) {
    xProperty().bindBidirectional(in);
    return this;
  }

  /** @see javafx.scene.text.Text#x */
  public Text bindToX(Property< Number > in) {
    in.bind(xProperty());
    return this;
  }

  /** @see javafx.scene.text.Text#y */
  public Text y(double in) {
    yProperty().set(in);
    return this;
  }

  /** @see javafx.scene.text.Text#y */
  public Text bindY(ObservableValue < ? extends Number > in) {
    yProperty().bind(in);
    return this;
  }

  /** @see javafx.scene.text.Text#y */
  public Text biBindY(Property < Number > in) {
    yProperty().bindBidirectional(in);
    return this;
  }

  /** @see javafx.scene.text.Text#y */
  public Text bindToY(Property < Number > in) {
    in.bind(yProperty());
    return this;
  }

  /** @see javafx.scene.text.Text#textOriginProperty() */
  public Text textOrigin(VPos in) {
    textOriginProperty().set(in);
    return this;
  }

  /** @see javafx.scene.text.Text#textOriginProperty() */
  public Text bindTextOrigin(ObservableValue < ? extends VPos > in) {
    textOriginProperty().bind(in);
    return this;
  }

  /** @see javafx.scene.text.Text#textOriginProperty() */
  public Text biBindTextOrigin(Property < VPos > in) {
    textOriginProperty().bindBidirectional(in);
    return this;
  }

  /** @see javafx.scene.text.Text#textOriginProperty() */
  public Text bindToTextOrigin(Property < VPos > in) {
    in.bind(textOriginProperty());
    return this;
  }

  /** @see javafx.scene.text.Text#boundsType */
  public Text boundsType(TextBoundsType in) {
    boundsTypeProperty().set(in);
    return this;
  }

  /** @see javafx.scene.text.Text#boundsType */
  public Text bindBoundsType(ObservableValue < ? extends TextBoundsType > in) {
    boundsTypeProperty().bind(in);
    return this;
  }

  /** @see javafx.scene.text.Text#boundsType */
  public Text biBindBoundsType(Property < TextBoundsType > in) {
    boundsTypeProperty().bindBidirectional(in);
    return this;
  }

  /** @see javafx.scene.text.Text#boundsType */
  public Text bindToBoundsType(Property < TextBoundsType > in) {
    in.bind(boundsTypeProperty());
    return this;
  }

  /** @see javafx.scene.text.Text#wrappingWidth */
  public Text wrappingWidth(double in) {
    wrappingWidthProperty().set(in);
    return this;
  }

  /** @see javafx.scene.text.Text#wrappingWidth */
  public Text bindWrappingWidth(ObservableValue < ? extends Number > in) {
    wrappingWidthProperty().bind(in);
    return this;
  }

  /** @see javafx.scene.text.Text#wrappingWidth */
  public Text biBindWrappingWidth(Property < Number > in) {
    wrappingWidthProperty().bindBidirectional(in);
    return this;
  }

  /** @see javafx.scene.text.Text#wrappingWidth */
  public Text bindToWrappingWidth(Property < Number > in) {
    in.bind(wrappingWidthProperty());
    return this;
  }

  /** @see javafx.scene.text.Text#strikethroughProperty() */
  public Text strikethrough(boolean in) {
    strikethroughProperty().set(in);
    return this;
  }

  /** @see javafx.scene.text.Text#strikethroughProperty() */
  public Text bindStrikethrough(ObservableValue < ? extends Boolean > in) {
    strikethroughProperty().bind(in);
    return this;
  }

  /** @see javafx.scene.text.Text#strikethroughProperty() */
  public Text biBindStrikethrough(Property < Boolean > in) {
    strikethroughProperty().bindBidirectional(in);
    return this;
  }

  /** @see javafx.scene.text.Text#strikethroughProperty() */
  public Text bindToStrikethrough(Property < Boolean > in) {
    in.bind(strikethroughProperty());
    return this;
  }

  /** @see javafx.scene.text.Text#baselineOffsetProperty() */
  public Text bindToBaselineOffset(Property < Number > in) {
    in.bind(baselineOffsetProperty());
    return this;
  }

  /** @see javafx.scene.text.Text#fontSmoothingType */
  public Text fontSmoothingType(FontSmoothingType in) {
    fontSmoothingTypeProperty().set(in);
    return this;
  }

  /** @see javafx.scene.text.Text#fontSmoothingType */
  public Text bindFontSmoothingType(ObservableValue < ? extends FontSmoothingType > in) {
    fontSmoothingTypeProperty().bind(in);
    return this;
  }

  /** @see javafx.scene.text.Text#fontSmoothingType */
  public Text biBindFontSmoothingType(Property < FontSmoothingType > in) {
    fontSmoothingTypeProperty().bindBidirectional(in);
    return this;
  }

  /** @see javafx.scene.text.Text#fontSmoothingType */
  public Text bindToFontSmoothingType(Property < FontSmoothingType > in) {
    in.bind(fontSmoothingTypeProperty());
    return this;
  }

  /** @see javafx.scene.text.Text#getSelectionShape() */
  public Text bindToSelectionShape(Property < PathElement[] > in) {
    in.bind(selectionShapeProperty());
    return this;
  }

  /** @see javafx.scene.text.Text#setSelectionStart(int) */
  public Text selectionStart(int in) {
    selectionStartProperty().set(in);
    return this;
  }

  /** @see javafx.scene.text.Text#setSelectionStart(int) */
  public Text bindSelectionStart(ObservableValue < ? extends Number > in) {
    selectionStartProperty().bind(in);
    return this;
  }

  /** @see javafx.scene.text.Text#setSelectionStart(int) */
  public Text biBindSelectionStart(Property < Number > in) {
    selectionStartProperty().bindBidirectional(in);
    return this;
  }

  /** @see javafx.scene.text.Text#setSelectionStart(int) */
  public Text bindToSelectionStart(Property < Number > in) {
    in.bind(selectionStartProperty());
    return this;
  }

  /** @see javafx.scene.text.Text#setSelectionEnd(int) */
  public Text selectionEnd(int in) {
    selectionEndProperty().set(in);
    return this;
  }

  /** @see javafx.scene.text.Text#setSelectionEnd(int) */
  public Text bindSelectionEnd(ObservableValue < ? extends Number > in) {
    selectionEndProperty().bind(in);
    return this;
  }

  /** @see javafx.scene.text.Text#setSelectionEnd(int) */
  public Text biBindSelectionEnd(Property < Number > in) {
    selectionEndProperty().bindBidirectional(in);
    return this;
  }

  /** @see javafx.scene.text.Text#setSelectionEnd(int) */
  public Text bindToSelectionEnd(Property < Number > in) {
    in.bind(selectionEndProperty());
    return this;
  }

  /** @see javafx.scene.text.Text#selectionFillProperty() */
  public Text selectionFill(Paint in) {
    selectionFillProperty().set(in);
    return this;
  }

  /** @see javafx.scene.text.Text#selectionFillProperty() */
  public Text bindSelectionFill(ObservableValue < ? extends Paint > in) {
    selectionFillProperty().bind(in);
    return this;
  }

  /** @see javafx.scene.text.Text#selectionFillProperty() */
  public Text biBindSelectionFill(Property < Paint > in) {
    selectionFillProperty().bindBidirectional(in);
    return this;
  }

  /** @see javafx.scene.text.Text#selectionFillProperty() */
  public Text bindToSelectionFill(Property < Paint > in) {
    in.bind(selectionFillProperty());
    return this;
  }

  /** @see javafx.scene.text.Text#caretShapeProperty() */
  public Text bindToCaretShape(Property < PathElement[] > in) {
    in.bind(caretShapeProperty());
    return this;
  }

  /** @see javafx.scene.text.Text#setCaretPosition(int) */
  public Text caretPosition(int in) {
    caretPositionProperty().set(in);
    return this;
  }

  /** @see javafx.scene.text.Text#setCaretPosition(int) */
  public Text bindCaretPosition(ObservableValue < ? extends Number > in) {
    caretPositionProperty().bind(in);
    return this;
  }

  /** @see javafx.scene.text.Text#setCaretPosition(int) */
  public Text biBindCaretPosition(Property < Number > in) {
    caretPositionProperty().bindBidirectional(in);
    return this;
  }

  /** @see javafx.scene.text.Text#setCaretPosition(int) */
  public Text bindToCaretPosition(Property < Number > in) {
    in.bind(caretPositionProperty());
    return this;
  }

  /** @see javafx.scene.text.Text#setCaretBias(boolean) */
  public Text caretBias(boolean in) {
    caretBiasProperty().set(in);
    return this;
  }

  /** @see javafx.scene.text.Text#setCaretBias(boolean) */
  public Text bindCaretBias(ObservableValue < ? extends Boolean > in) {
    caretBiasProperty().bind(in);
    return this;
  }

  /** @see javafx.scene.text.Text#setCaretBias(boolean) */
  public Text biBindCaretBias(Property < Boolean > in) {
    caretBiasProperty().bindBidirectional(in);
    return this;
  }

  /** @see javafx.scene.text.Text#setCaretBias(boolean) */
  public Text bindToCaretBias(Property < Boolean > in) {
    in.bind(caretBiasProperty());
    return this;
  }
}
