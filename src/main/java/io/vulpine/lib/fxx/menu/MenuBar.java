package io.vulpine.lib.fxx.menu;

import javafx.beans.property.Property;
import javafx.scene.control.Menu;

import io.vulpine.lib.fxx.internal.mirror.ControlMirror;

public class MenuBar extends javafx.scene.control.MenuBar
  implements
  ControlMirror < MenuBar >
{
  public MenuBar() {
  }

  public MenuBar(Menu... menus) {
    super(menus);
  }

  public MenuBar useSystemMenuBar(boolean in) {
    useSystemMenuBarProperty().set(in);
    return this;
  }

  public MenuBar biBindUseSystemMenuBar(Property < Boolean > in) {
    useSystemMenuBarProperty().bindBidirectional(in);
    return this;
  }

  public MenuBar bindToUseSystemMenuBar(Property < Boolean > in) {
    in.bind(useSystemMenuBarProperty());
    return this;
  }

  public MenuBar addMenu(Menu in) {
    getMenus().add(in);
    return this;
  }

  public MenuBar addMenus(Menu... in) {
    getMenus().addAll(in);
    return this;
  }

  public MenuBar setMenus(Menu... in) {
    getMenus().setAll(in);
    return this;
  }
}
