package io.vulpine.lib.fxx.tab;

import javafx.scene.control.Tab;

import io.vulpine.lib.fxx.mirror.TabPaneMirror;

public class TabPane extends javafx.scene.control.TabPane implements TabPaneMirror < TabPane >
{
  public TabPane() {}

  public TabPane(Tab... tabs) {
    super(tabs);
  }
}
