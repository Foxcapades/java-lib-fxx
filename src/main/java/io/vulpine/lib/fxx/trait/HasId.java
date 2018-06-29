package io.vulpine.lib.fxx.trait;

import javafx.beans.property.Property;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;

public interface HasId< T extends HasId >
{
  StringProperty idProperty();

  default T id(String in) {
    idProperty().set(in);
    return (T) this;
  }

  default T bindId(ObservableValue< ? extends String > in) {
    idProperty().bind(in);
    return (T) this;
  }

  default T biBindId(Property< String > in) {
    idProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToId(Property < String > in) {
    in.bind(idProperty());
    return (T) this;
  }
}
