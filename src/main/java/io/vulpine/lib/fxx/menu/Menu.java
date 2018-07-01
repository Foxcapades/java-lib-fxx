package io.vulpine.lib.fxx.menu;

import javafx.event.Event;
import javafx.scene.Node;
import javafx.scene.control.MenuItem;

import io.vulpine.lib.fxx.internal.mirror.MenuItemMirror;
import io.vulpine.lib.fxx.internal.trait.HasMenuItems;
import io.vulpine.lib.fxx.internal.trait.HasReadOnlyShowing;
import io.vulpine.lib.fxx.internal.trait.event.HasOnHidden;
import io.vulpine.lib.fxx.internal.trait.event.HasOnHiding;
import io.vulpine.lib.fxx.internal.trait.event.HasOnShowing;
import io.vulpine.lib.fxx.internal.trait.event.HasOnShown;

public class Menu extends javafx.scene.control.Menu
implements
  MenuItemMirror < Menu >,
  HasReadOnlyShowing < Menu >,
  HasOnShowing < Event, Menu >,
  HasOnShown < Event, Menu >,
  HasOnHiding < Event, Menu >,
  HasOnHidden < Event, Menu >,
  HasMenuItems < Menu >
{
  public Menu() {
  }

  public Menu(String text) {
    super(text);
  }

  public Menu(String text, Node graphic) {
    super(text, graphic);
  }

  public Menu(String text, Node graphic, MenuItem... items) {
    super(text, graphic, items);
  }
}
