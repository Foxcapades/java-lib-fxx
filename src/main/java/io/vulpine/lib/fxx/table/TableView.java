package io.vulpine.lib.fxx.table;

import javafx.collections.ObservableList;

import io.vulpine.lib.fxx.internal.mirror.ControlMirror;

public class TableView < R > extends javafx.scene.control.TableView < R >
implements ControlMirror < TableView < R > >
{
  public TableView() {
  }

  public TableView(ObservableList < R > items) {
    super(items);
  }
}
