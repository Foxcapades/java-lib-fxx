package io.vulpine.lib.fxx.trait;

import javafx.collections.ObservableList;

public interface HasStylesheets < T extends HasStylesheets >
{
  ObservableList<String> getStylesheets();

  default T styleSheet(String in) {
    getStylesheets().add(in);
    return (T) this;
  }

  default T styleSheets(String... in) {
    getStylesheets().addAll(in);
    return (T) this;
  }

  default T setStyleSheets(String... in) {
    getStylesheets().setAll(in);
    return (T) this;
  }
}
