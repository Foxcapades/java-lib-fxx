package io.vulpine.lib.fxx.tab;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Side;
import javafx.scene.control.Tab;

import io.vulpine.lib.fxx.internal.mirror.ControlMirror;
import io.vulpine.lib.fxx.internal.trait.HasSelectionModel;

public class TabPane
  extends javafx.scene.control.TabPane
  implements
  ControlMirror < TabPane >,
  HasSelectionModel < Tab, TabPane >

{
  public TabPane() {
  }

  public TabPane(Tab... tabs) {
    super(tabs);
  }


  public TabPane addTab(Tab in) {
    getTabs().add(in);
    return this;
  }

  public TabPane addTabs(Tab... in) {
    getTabs().addAll(in);
    return this;
  }

  public TabPane setTabs(Tab... in) {
    getTabs().setAll(in);
    return this;
  }

  public TabPane side(Side in) {
    sideProperty().set(in);
    return this;
  }

  public TabPane bindSide(ObservableValue< ? extends Side > in) {
    sideProperty().bind(in);
    return this;
  }

  public TabPane biBindSide(Property< Side > in) {
    sideProperty().bindBidirectional(in);
    return this;
  }

  public TabPane bindToSide(Property < Side > in) {
    in.bind(sideProperty());
    return this;
  }

  public TabPane tabClosingPolicy(javafx.scene.control.TabPane.TabClosingPolicy in) {
    tabClosingPolicyProperty().set(in);
    return this;
  }

  public TabPane bindTabClosingPolicy(ObservableValue < ? extends javafx.scene.control.TabPane.TabClosingPolicy > in) {
    tabClosingPolicyProperty().bind(in);
    return this;
  }

  public TabPane biBindTabClosingPolicy(Property < javafx.scene.control.TabPane.TabClosingPolicy > in) {
    tabClosingPolicyProperty().bindBidirectional(in);
    return this;
  }

  public TabPane bindToTabClosingPolicy(Property < javafx.scene.control.TabPane.TabClosingPolicy > in) {
    in.bind(tabClosingPolicyProperty());
    return this;
  }

  public TabPane rotateGraphic(boolean in) {
    rotateGraphicProperty().set(in);
    return this;
  }

  public TabPane bindRotateGraphic(ObservableValue < ? extends Boolean > in) {
    rotateGraphicProperty().bind(in);
    return this;
  }

  public TabPane biBindRotateGraphic(Property < Boolean > in) {
    rotateGraphicProperty().bindBidirectional(in);
    return this;
  }

  public TabPane bindToRotateGraphic(Property < Boolean > in) {
    in.bind(rotateGraphicProperty());
    return this;
  }

  public TabPane tabMinWidth(double in) {
    tabMinWidthProperty().set(in);
    return this;
  }

  public TabPane bindTabMinWidth(ObservableValue < ? extends Number > in) {
    tabMinWidthProperty().bind(in);
    return this;
  }

  public TabPane biBindTabMinWidth(Property < Number > in) {
    tabMinWidthProperty().bindBidirectional(in);
    return this;
  }

  public TabPane bindToTabMinWidth(Property < Number > in) {
    in.bind(tabMinWidthProperty());
    return this;
  }

  public TabPane tabMaxWidth(double in) {
    tabMaxWidthProperty().set(in);
    return this;
  }

  public TabPane bindTabMaxWidth(ObservableValue < ? extends Number > in) {
    tabMaxWidthProperty().bind(in);
    return this;
  }

  public TabPane biBindTabMaxWidth(Property < Number > in) {
    tabMaxWidthProperty().bindBidirectional(in);
    return this;
  }

  public TabPane bindToTabMaxWidth(Property < Number > in) {
    in.bind(tabMaxWidthProperty());
    return this;
  }

  public TabPane tabMinHeight(double in) {
    tabMinHeightProperty().set(in);
    return this;
  }

  public TabPane bindTabMinHeight(ObservableValue < ? extends Number > in) {
    tabMinHeightProperty().bind(in);
    return this;
  }

  public TabPane biBindTabMinHeight(Property < Number > in) {
    tabMinHeightProperty().bindBidirectional(in);
    return this;
  }

  public TabPane bindToTabMinHeight(Property < Number > in) {
    in.bind(tabMinHeightProperty());
    return this;
  }

  public TabPane tabMaxHeight(double in) {
    tabMaxHeightProperty().set(in);
    return this;
  }

  public TabPane bindTabMaxHeight(ObservableValue < ? extends Number > in) {
    tabMaxHeightProperty().bind(in);
    return this;
  }

  public TabPane biBindTabMaxHeight(Property < Number > in) {
    tabMaxHeightProperty().bindBidirectional(in);
    return this;
  }

  public TabPane bindToTabMaxHeight(Property < Number > in) {
    in.bind(tabMaxHeightProperty());
    return this;
  }

  public TabPane tabDragPolicy(javafx.scene.control.TabPane.TabDragPolicy in) {
    tabDragPolicyProperty().set(in);
    return this;
  }

  public TabPane bindTabDragPolicy(ObservableValue < ? extends javafx.scene.control.TabPane.TabDragPolicy > in) {
    tabDragPolicyProperty().bind(in);
    return this;
  }

  public TabPane biBindTabDragPolicy(Property < javafx.scene.control.TabPane.TabDragPolicy > in) {
    tabDragPolicyProperty().bindBidirectional(in);
    return this;
  }

  public TabPane bindToTabDragPolicy(Property < javafx.scene.control.TabPane.TabDragPolicy > in) {
    in.bind(tabDragPolicyProperty());
    return this;
  }
}
