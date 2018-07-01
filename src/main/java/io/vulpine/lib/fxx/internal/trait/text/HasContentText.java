package io.vulpine.lib.fxx.internal.trait.text;

import javafx.beans.property.Property;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;

public interface HasContentText< T extends HasContentText >
{
  StringProperty contentTextProperty();

  default T contentText(String in) {
    contentTextProperty().set(in);
    return (T) this;
  }

  default T bindContentText(ObservableValue < ? extends String > in) {
    contentTextProperty().bind(in);
    return (T) this;
  }

  default T biBindContentText(Property < String > in) {
    contentTextProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToContentText(Property < String > in) {
    in.bind(contentTextProperty());
    return (T) this;
  }
}
