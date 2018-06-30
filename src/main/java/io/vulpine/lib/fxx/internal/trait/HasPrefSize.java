package io.vulpine.lib.fxx.internal.trait;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;

public interface HasPrefSize < T extends HasPrefSize >
{
  DoubleProperty prefWidthProperty();

  default T preferredWidth(double in) {
    prefWidthProperty().set(in);
    return (T) this;
  }

  default T bindPreferredWidth(ObservableValue< ? extends Number > in) {
    prefWidthProperty().bind(in);
    return (T) this;
  }

  default T biBindPreferredWidth(Property< Number > in) {
    prefWidthProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToPreferredWidth(Property < Number > in) {
    in.bind(prefWidthProperty());
    return (T) this;
  }

  DoubleProperty prefHeightProperty();

  default T preferredHeight(double in) {
    prefHeightProperty().set(in);
    return (T) this;
  }

  default T bindPreferredHeight(ObservableValue < ? extends Number > in) {
    prefHeightProperty().bind(in);
    return (T) this;
  }

  default T biBindPreferredHeight(Property < Number > in) {
    prefHeightProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToPreferredHeight(Property < Number > in) {
    in.bind(prefHeightProperty());
    return (T) this;
  }

  default T preferredSize(double w, double h) {
    prefWidthProperty().set(w);
    prefHeightProperty().set(h);
    return (T) this;
  }
}
