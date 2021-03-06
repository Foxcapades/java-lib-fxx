package io.vulpine.lib.fxx.layout;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.control.ButtonType;

import io.vulpine.lib.fxx.internal.mirror.PaneMirror;
import io.vulpine.lib.fxx.internal.trait.display.HasGraphic;
import io.vulpine.lib.fxx.internal.trait.text.HasContentText;
import io.vulpine.lib.fxx.internal.trait.text.HasHeaderText;

public class DialogPane extends javafx.scene.control.DialogPane
implements
  PaneMirror < DialogPane >,
  HasGraphic < DialogPane >,
  HasContentText < DialogPane >,
  HasHeaderText < DialogPane >
{
  public DialogPane() {
  }

  public DialogPane header(Node in) {
    headerProperty().set(in);
    return this;
  }

  public DialogPane bindHeader(ObservableValue < ? extends Node > in) {
    headerProperty().bind(in);
    return this;
  }

  public DialogPane biBindHeader(Property < Node > in) {
    headerProperty().bindBidirectional(in);
    return this;
  }

  public DialogPane bindToHeader(Property < Node > in) {
    in.bind(headerProperty());
    return this;
  }

  public DialogPane content(Node in) {
    contentProperty().set(in);
    return this;
  }

  public DialogPane bindContent(ObservableValue < ? extends Node > in) {
    contentProperty().bind(in);
    return this;
  }

  public DialogPane biBindContent(Property < Node > in) {
    contentProperty().bindBidirectional(in);
    return this;
  }

  public DialogPane bindToContent(Property < Node > in) {
    in.bind(contentProperty());
    return this;
  }

  public DialogPane expandableContent(Node in) {
    expandableContentProperty().set(in);
    return this;
  }

  public DialogPane bindExpandableContent(ObservableValue < ? extends Node > in) {
    expandableContentProperty().bind(in);
    return this;
  }

  public DialogPane biBindExpandableContent(Property < Node > in) {
    expandableContentProperty().bindBidirectional(in);
    return this;
  }

  public DialogPane bindToExpandableContent(Property < Node > in) {
    in.bind(expandableContentProperty());
    return this;
  }

  public DialogPane expanded(boolean in) {
    expandedProperty().set(in);
    return this;
  }

  public DialogPane bindExpanded(ObservableValue< ? extends Boolean > in) {
    expandedProperty().bind(in);
    return this;
  }

  public DialogPane biBindExpanded(Property < Boolean > in) {
    expandedProperty().bindBidirectional(in);
    return this;
  }

  public DialogPane bindToExpanded(Property< Boolean > in) {
    in.bind(expandedProperty());
    return this;
  }

  public DialogPane addButtonType(ButtonType in) {
    getButtonTypes().add(in);
    return this;
  }

  public DialogPane addButtonTypes(ButtonType ...in) {
    getButtonTypes().addAll(in);
    return this;
  }

  public DialogPane setButtonTypes(ButtonType ...in) {
    getButtonTypes().setAll(in);
    return this;
  }
}
