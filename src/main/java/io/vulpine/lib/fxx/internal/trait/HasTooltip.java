package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Tooltip;

public interface HasTooltip < T extends HasTooltip >
{
  ObjectProperty < Tooltip > tooltipProperty();

  default T tooltip(Tooltip in) {
    tooltipProperty().set(in);
    return (T) this;
  }

  default T tooltip(String in) {
    return tooltip(new Tooltip(in));
  }

  default T bindTooltip(ObservableValue< Tooltip > in) {
    tooltipProperty().bind(in);
    return (T) this;
  }

  default T biBindTooltip(Property< Tooltip > in) {
    tooltipProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToTooltip(Property < Tooltip > in) {
    in.bind(tooltipProperty());
    return (T) this;
  }

}
