package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ContextMenu;

public interface HasContextMenu < T extends HasContextMenu >
{
  ObjectProperty < ContextMenu > contextMenuProperty();

  default T contextMenu(ContextMenu in) {
    contextMenuProperty().set(in);
    return (T) this;
  }

  default T bindContextMenu(ObservableValue< ? extends ContextMenu > in) {
    contextMenuProperty().bind(in);
    return (T) this;
  }

  default T biBindContextMenu(Property< ContextMenu > in) {
    contextMenuProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToContextMenu(Property < ContextMenu > in) {
    in.bind(contextMenuProperty());
    return (T) this;
  }
}
