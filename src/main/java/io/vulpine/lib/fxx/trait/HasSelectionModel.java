package io.vulpine.lib.fxx.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.SingleSelectionModel;

public interface HasSelectionModel< S, T extends HasSelectionModel >
{
  ObjectProperty < SingleSelectionModel < S > > selectionModelProperty();

  default T selectionModel(SingleSelectionModel < S > in) {
    selectionModelProperty().set(in);
    return (T) this;
  }

  default T bindSelectionModel(ObservableValue < ? extends SingleSelectionModel < S > > in) {
    selectionModelProperty().bind(in);
    return (T) this;
  }

  default T biBindSelectionModel(Property < SingleSelectionModel < S > > in) {
    selectionModelProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToSelectionModel(Property < SingleSelectionModel < S > > in) {
    in.bind(selectionModelProperty());
    return (T) this;
  }
}
