package io.vulpine.lib.fxx.menu;

import javafx.scene.Node;

import io.vulpine.lib.fxx.internal.mirror.MenuItemMirror;

public class MenuItem extends javafx.scene.control.MenuItem
implements MenuItemMirror < MenuItem >
{
  public MenuItem() {
  }

  public MenuItem(String text) {
    super(text);
  }

  public MenuItem(String text, Node graphic) {
    super(text, graphic);
  }
}
