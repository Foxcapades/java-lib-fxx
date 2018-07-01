package io.vulpine.lib.fxx.control;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

import io.vulpine.lib.fxx.internal.mirror.TextInputControlMirror;
import io.vulpine.lib.fxx.internal.trait.text.HasPrefColumnCount;

public class TextArea extends javafx.scene.control.TextArea
implements
  TextInputControlMirror < TextArea >,
  HasPrefColumnCount < TextArea >
{
  public TextArea() {
  }

  public TextArea(String text) {
    super(text);
  }

  public TextArea wrapText(boolean in) {
    wrapTextProperty().set(in);
    return this;
  }

  public TextArea bindWrapText(ObservableValue < ? extends Boolean > in) {
    wrapTextProperty().bind(in);
    return this;
  }

  public TextArea biBindWrapText(Property < Boolean > in) {
    wrapTextProperty().bindBidirectional(in);
    return this;
  }

  public TextArea bindToWrapText(Property < Boolean > in) {
    in.bind(wrapTextProperty());
    return this;
  }

  public TextArea prefRowCount(int in) {
    prefRowCountProperty().set(in);
    return this;
  }

  public TextArea bindPrefRowCount(ObservableValue < ? extends Number > in) {
    prefRowCountProperty().bind(in);
    return this;
  }

  public TextArea biBindPrefRowCount(Property < Number > in) {
    prefRowCountProperty().bindBidirectional(in);
    return this;
  }

  public TextArea bindToPrefRowCount(Property < Number > in) {
    in.bind(prefRowCountProperty());
    return this;
  }

  public TextArea scrollTop(double in) {
    scrollTopProperty().set(in);
    return this;
  }

  public TextArea bindScrollTop(ObservableValue < ? extends Number > in) {
    scrollTopProperty().bind(in);
    return this;
  }

  public TextArea biBindScrollTop(Property < Number > in) {
    scrollTopProperty().bindBidirectional(in);
    return this;
  }

  public TextArea bindToScrollTop(Property < Number > in) {
    in.bind(scrollTopProperty());
    return this;
  }

  public TextArea scrollLeft(double in) {
    scrollLeftProperty().set(in);
    return this;
  }

  public TextArea bindScrollLeft(ObservableValue < ? extends Number > in) {
    scrollLeftProperty().bind(in);
    return this;
  }

  public TextArea biBindScrollLeft(Property < Number > in) {
    scrollLeftProperty().bindBidirectional(in);
    return this;
  }

  public TextArea bindToScrollLeft(Property < Number > in) {
    in.bind(scrollLeftProperty());
    return this;
  }
}
