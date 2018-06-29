package io.vulpine.lib.fxx.tab;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Side;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;

import io.vulpine.lib.fxx.trait.HasSkin;
import io.vulpine.lib.fxx.trait.HasTooltip;

public class TabPane extends javafx.scene.control.TabPane
implements
  HasTooltip < TabPane >,
  HasSkin < TabPane >
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

  public TabPane selectionModel(SingleSelectionModel < Tab > in) {
    setSelectionModel(in);
    return this;
  }

  public TabPane bindSelectionModel(ObservableValue < ? extends SingleSelectionModel < Tab > > in) {
    selectionModelProperty().bind(in);
    return this;
  }

  public TabPane biBindSelectionModel(Property < SingleSelectionModel < Tab > > in) {
    selectionModelProperty().bindBidirectional(in);
    return this;
  }

  public TabPane bindToSelectionModel(Property < SingleSelectionModel < Tab > > in) {
    in.bind(selectionModelProperty());
    return this;
  }

  public TabPane side(Side in) {
    setSide(in);
    return this;
  }

  public TabPane bindSide(ObservableValue < ? extends Side > in) {
    sideProperty().bind(in);
    return this;
  }

  public TabPane biBindSide(Property < Side > in) {
    sideProperty().bindBidirectional(in);
    return this;
  }

  public TabPane bindToSide(Property < Side > in) {
    in.bind(sideProperty());
    return this;
  }

  public TabPane tabClosingPolicy(TabClosingPolicy in) {
    setTabClosingPolicy(in);
    return this;
  }

  public TabPane bindTabClosingPolicy(ObservableValue < ? extends TabClosingPolicy > in) {
    tabClosingPolicyProperty().bind(in);
    return this;
  }

  public TabPane biBindTabClosingPolicy(Property < TabClosingPolicy > in) {
    tabClosingPolicyProperty().bindBidirectional(in);
    return this;
  }

  public TabPane bindToTabClosingPolicy(Property < TabClosingPolicy > in) {
    in.bind(tabClosingPolicyProperty());
    return this;
  }

  public TabPane rotateGraphic(boolean in) {
    setRotateGraphic(in);
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
    setTabMinWidth(in);
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
    setTabMaxWidth(in);
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
    setTabMinHeight(in);
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
    setTabMaxHeight(in);
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

  public TabPane tabDragPolicy(TabDragPolicy in) {
    setTabDragPolicy(in);
    return this;
  }

  public TabPane bindTabDragPolicy(ObservableValue < ? extends TabDragPolicy > in) {
    tabDragPolicyProperty().bind(in);
    return this;
  }

  public TabPane biBindTabDragPolicy(Property < TabDragPolicy > in) {
    tabDragPolicyProperty().bindBidirectional(in);
    return this;
  }

  public TabPane bindToTabDragPolicy(Property < TabDragPolicy > in) {
    in.bind(tabDragPolicyProperty());
    return this;
  }
}
