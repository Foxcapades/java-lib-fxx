package io.vulpine.lib.fxx.internal.trait.behavior;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasMnemonicParsing< T extends HasMnemonicParsing >
{
  BooleanProperty mnemonicParsingProperty();

  default T mnemonicParsing(boolean in) {
    mnemonicParsingProperty().set(in);
    return (T) this;
  }

  default T bindMnemonicParsing(ObservableValue < ? extends Boolean > in) {
    mnemonicParsingProperty().bind(in);
    return (T) this;
  }

  default T biBindMnemonicParsing(Property < Boolean > in) {
    mnemonicParsingProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToMnemonicParsing(Property < Boolean > in) {
    in.bind(mnemonicParsingProperty());
    return (T) this;
  }
}
