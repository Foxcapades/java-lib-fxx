package io.vulpine.lib.fxx.internal.trait;

import javafx.collections.ObservableList;

public interface HasStyleClasses < T extends HasStyleClasses >
{
  ObservableList < String > getStyleClass();

  default T styleClass(String in) {
    getStyleClass().add(in);
    return (T) this;
  }

  default T styleClasses(String... in) {
    getStyleClass().addAll(in);
    return (T) this;
  }

  default T setStyleClasses(String... in) {
    getStyleClass().setAll(in);
    return (T) this;
  }
}
