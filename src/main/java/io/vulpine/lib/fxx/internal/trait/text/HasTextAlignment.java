package io.vulpine.lib.fxx.internal.trait.text;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.text.TextAlignment;

public interface HasTextAlignment < T extends HasTextAlignment >
{
  ObjectProperty < TextAlignment > textAlignmentProperty();

  default T textAlignment(TextAlignment in) {
    textAlignmentProperty().set(in);
    return (T) this;
  }

  default T bindTextAlignment(ObservableValue< ? extends TextAlignment > in) {
    textAlignmentProperty().bind(in);
    return (T) this;
  }

  default T biBindTextAlignment(Property < TextAlignment > in) {
    textAlignmentProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToTextAlignment(Property< TextAlignment > in) {
    in.bind(textAlignmentProperty());
    return (T) this;
  }
}
