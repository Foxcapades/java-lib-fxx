package io.vulpine.lib.fxx.menu;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.control.MenuItem;

import io.vulpine.lib.fxx.internal.mirror.ButtonBaseMirror;
import io.vulpine.lib.fxx.internal.trait.HasMenuItems;
import io.vulpine.lib.fxx.internal.trait.HasReadOnlyShowing;
import io.vulpine.lib.fxx.internal.trait.event.HasOnHidden;
import io.vulpine.lib.fxx.internal.trait.event.HasOnHiding;
import io.vulpine.lib.fxx.internal.trait.event.HasOnShowing;
import io.vulpine.lib.fxx.internal.trait.event.HasOnShown;

public class MenuButton extends javafx.scene.control.MenuButton
implements
  ButtonBaseMirror < MenuButton >,
  HasMenuItems < MenuButton >,
  HasReadOnlyShowing < MenuButton >,
  HasOnShowing < Event, MenuButton >,
  HasOnShown < Event, MenuButton >,
  HasOnHiding < Event, MenuButton >,
  HasOnHidden < Event, MenuButton >
{
  public MenuButton() {
  }

  public MenuButton(String text) {
    super(text);
  }

  public MenuButton(String text, Node graphic) {
    super(text, graphic);
  }

  public MenuButton(String text, Node graphic, MenuItem... items) {
    super(text, graphic, items);
  }

  public MenuButton popupSide(Side in) {
    popupSideProperty().set(in);
    return this;
  }

  public MenuButton bindPopupSide(ObservableValue < ? extends Side > in) {
    popupSideProperty().bind(in);
    return this;
  }

  public MenuButton biBindPopupSide(Property < Side > in) {
    popupSideProperty().bindBidirectional(in);
    return this;
  }

  public MenuButton bindToPopupSide(Property < Side > in) {
    in.bind(popupSideProperty());
    return this;
  }
}
