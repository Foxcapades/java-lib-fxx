package io.vulpine.lib.fxx.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Skin;

public interface HasSkin < T extends HasSkin >
{
  ObjectProperty < Skin< ? > > skinProperty();

  default T skin(Skin < ? > in) {
    skinProperty().set(in);
    return (T) this;
  }

  default T bindSkin(ObservableValue< ? extends Skin < ? > > in) {
    skinProperty().bind(in);
    return (T) this;
  }

  default T biBindSkin(Property< Skin < ? > > in) {
    skinProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToSkin(Property < Skin < ? > > in) {
    in.bind(skinProperty());
    return (T) this;
  }
}
