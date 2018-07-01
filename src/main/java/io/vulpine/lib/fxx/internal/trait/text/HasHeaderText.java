package io.vulpine.lib.fxx.internal.trait.text;

import javafx.beans.property.Property;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;

public interface HasHeaderText< T extends HasHeaderText >
{
  StringProperty headerTextProperty();

  default T headerText(String in) {
    headerTextProperty().set(in);
    return (T) this;
  }

  default T bindHeaderText(ObservableValue < ? extends String > in) {
    headerTextProperty().bind(in);
    return (T) this;
  }

  default T biBindHeaderText(Property < String > in) {
    headerTextProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToHeaderText(Property < String > in) {
    in.bind(headerTextProperty());
    return (T) this;
  }
}
