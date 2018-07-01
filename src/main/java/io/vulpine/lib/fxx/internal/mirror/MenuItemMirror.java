package io.vulpine.lib.fxx.internal.mirror;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.css.Styleable;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Menu;
import javafx.scene.input.KeyCombination;

import io.vulpine.lib.fxx.internal.trait.*;
import io.vulpine.lib.fxx.internal.trait.event.HasOnAction;
import io.vulpine.lib.fxx.internal.trait.text.HasText;

public interface MenuItemMirror< T extends MenuItemMirror >
  extends
  HasId < T >,
  HasStyle < T >,
  HasText < T >,
  HasGraphic < T >,
  HasOnAction < T >,
  HasDisable < T >,
  HasVisible < T >,
  HasMnemonicParsing < T >,
  HasStyleClasses < T >,
  EventTarget,
  Styleable
{
  ReadOnlyObjectProperty < Menu > parentMenuProperty();

  default T bindToParentMenu(Property < Menu > in) {
    in.bind(parentMenuProperty());
    return (T) this;
  }

  ReadOnlyObjectProperty < ContextMenu > parentPopupProperty();

  default T bindToParentPopup(Property < ContextMenu > in) {
    in.bind(parentPopupProperty());
    return (T) this;
  }

  ObjectProperty < EventHandler < Event > > onMenuValidationProperty();

  default T onMenuValidation(EventHandler < Event > in) {
    onMenuValidationProperty().set(in);
    return (T) this;
  }

  default T bindOnMenuValidation(ObservableValue < ? extends EventHandler < Event > > in) {
    onMenuValidationProperty().bind(in);
    return (T) this;
  }

  default T biBindOnMenuValidation(Property < EventHandler < Event > > in) {
    onMenuValidationProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToOnMenuValidation(Property < EventHandler < Event > > in) {
    in.bind(onMenuValidationProperty());
    return (T) this;
  }

  ObjectProperty < KeyCombination > acceleratorProperty();

  default T accelerator(KeyCombination in) {
    acceleratorProperty().set(in);
    return (T) this;
  }

  default T bindAccelerator(ObservableValue < ? extends KeyCombination > in) {
    acceleratorProperty().bind(in);
    return (T) this;
  }

  default T biBindAccelerator(Property < KeyCombination > in) {
    acceleratorProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToAccelerator(Property < KeyCombination > in) {
    in.bind(acceleratorProperty());
    return (T) this;
  }
}
