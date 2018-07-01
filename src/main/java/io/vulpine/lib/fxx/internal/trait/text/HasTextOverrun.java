package io.vulpine.lib.fxx.internal.trait.text;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.OverrunStyle;

public interface HasTextOverrun< T extends HasTextOverrun >
{
  ObjectProperty < OverrunStyle > textOverrunProperty();

  default T textOverrun(OverrunStyle in) {
    textOverrunProperty().set(in);
    return (T) this;
  }

  default T bindTextOverrun(ObservableValue < ? extends OverrunStyle > in) {
    textOverrunProperty().bind(in);
    return (T) this;
  }

  default T biBindTextOverrun(Property < OverrunStyle > in) {
    textOverrunProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToTextOverrun(Property < OverrunStyle > in) {
    in.bind(textOverrunProperty());
    return (T) this;
  }
}
