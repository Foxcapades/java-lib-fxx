package io.vulpine.lib.fxx.internal.mirror;

import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyBooleanProperty;

import io.vulpine.lib.fxx.internal.trait.event.HasOnAction;

public interface ButtonBaseMirror < T extends ButtonBaseMirror >
extends
  LabeledMirror < T >,
  HasOnAction < T >
{
  /** @see javafx.scene.control.ButtonBase#armedProperty() */
  ReadOnlyBooleanProperty armedProperty();

  /** @see javafx.scene.control.ButtonBase#armedProperty() */
  default T bindToArmed(Property< Boolean > in) {
    in.bind(armedProperty());
    return (T) this;
  }
}
