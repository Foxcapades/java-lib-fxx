package io.vulpine.lib.fxx.internal.trait;

import javafx.collections.ObservableList;
import javafx.scene.control.MenuItem;

import io.vulpine.lib.fxx.menu.Menu;

public interface HasMenuItems < T extends HasMenuItems >
{
  ObservableList < MenuItem > getItems();

  default T addMenuItem(MenuItem item) {
    getItems().add(item);
    return (T) this;
  }

  default T addMenuItems(MenuItem ...items) {
    getItems().addAll(items);
    return (T) this;
  }

  default T setMenuItem(MenuItem ...items) {
    getItems().setAll(items);
    return (T) this;
  }

}
