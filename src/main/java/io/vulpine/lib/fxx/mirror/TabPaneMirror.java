package io.vulpine.lib.fxx.mirror;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

import io.vulpine.lib.fxx.trait.HasSelectionModel;

public interface TabPaneMirror< T extends TabPaneMirror >
  extends
  ControlMirror < T >,
  HasSelectionModel < Tab, T >
{
  ObservableList < Tab > getTabs();

  default T addTab(Tab in) {
    getTabs().add(in);
    return (T) this;
  }

  default T addTabs(Tab... in) {
    getTabs().addAll(in);
    return (T) this;
  }

  default T setTabs(Tab... in) {
    getTabs().setAll(in);
    return (T) this;
  }

  ObjectProperty < Side > sideProperty();

  default T side(Side in) {
    sideProperty().set(in);
    return (T) this;
  }

  default T bindSide(ObservableValue < ? extends Side > in) {
    sideProperty().bind(in);
    return (T) this;
  }

  default T biBindSide(Property < Side > in) {
    sideProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToSide(Property < Side > in) {
    in.bind(sideProperty());
    return (T) this;
  }

  ObjectProperty<TabPane.TabClosingPolicy > tabClosingPolicyProperty();

  default T tabClosingPolicy(TabPane.TabClosingPolicy in) {
    tabClosingPolicyProperty().set(in);
    return (T) this;
  }

  default T bindTabClosingPolicy(ObservableValue < ? extends TabPane.TabClosingPolicy > in) {
    tabClosingPolicyProperty().bind(in);
    return (T) this;
  }

  default T biBindTabClosingPolicy(Property < TabPane.TabClosingPolicy > in) {
    tabClosingPolicyProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToTabClosingPolicy(Property < TabPane.TabClosingPolicy > in) {
    in.bind(tabClosingPolicyProperty());
    return (T) this;
  }

  BooleanProperty rotateGraphicProperty();

  default T rotateGraphic(boolean in) {
    rotateGraphicProperty().set(in);
    return (T) this;
  }

  default T bindRotateGraphic(ObservableValue < ? extends Boolean > in) {
    rotateGraphicProperty().bind(in);
    return (T) this;
  }

  default T biBindRotateGraphic(Property < Boolean > in) {
    rotateGraphicProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToRotateGraphic(Property < Boolean > in) {
    in.bind(rotateGraphicProperty());
    return (T) this;
  }

  DoubleProperty tabMinWidthProperty();

  default T tabMinWidth(double in) {
    tabMinWidthProperty().set(in);
    return (T) this;
  }

  default T bindTabMinWidth(ObservableValue < ? extends Number > in) {
    tabMinWidthProperty().bind(in);
    return (T) this;
  }

  default T biBindTabMinWidth(Property < Number > in) {
    tabMinWidthProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToTabMinWidth(Property < Number > in) {
    in.bind(tabMinWidthProperty());
    return (T) this;
  }

  DoubleProperty tabMaxWidthProperty();

  default T tabMaxWidth(double in) {
    tabMaxWidthProperty().set(in);
    return (T) this;
  }

  default T bindTabMaxWidth(ObservableValue < ? extends Number > in) {
    tabMaxWidthProperty().bind(in);
    return (T) this;
  }

  default T biBindTabMaxWidth(Property < Number > in) {
    tabMaxWidthProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToTabMaxWidth(Property < Number > in) {
    in.bind(tabMaxWidthProperty());
    return (T) this;
  }

  DoubleProperty tabMinHeightProperty();

  default T tabMinHeight(double in) {
    tabMinHeightProperty().set(in);
    return (T) this;
  }

  default T bindTabMinHeight(ObservableValue < ? extends Number > in) {
    tabMinHeightProperty().bind(in);
    return (T) this;
  }

  default T biBindTabMinHeight(Property < Number > in) {
    tabMinHeightProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToTabMinHeight(Property < Number > in) {
    in.bind(tabMinHeightProperty());
    return (T) this;
  }

  DoubleProperty tabMaxHeightProperty();

  default T tabMaxHeight(double in) {
    tabMaxHeightProperty().set(in);
    return (T) this;
  }

  default T bindTabMaxHeight(ObservableValue < ? extends Number > in) {
    tabMaxHeightProperty().bind(in);
    return (T) this;
  }

  default T biBindTabMaxHeight(Property < Number > in) {
    tabMaxHeightProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToTabMaxHeight(Property < Number > in) {
    in.bind(tabMaxHeightProperty());
    return (T) this;
  }

  ObjectProperty < TabPane.TabDragPolicy > tabDragPolicyProperty();

  default T tabDragPolicy(TabPane.TabDragPolicy in) {
    tabDragPolicyProperty().set(in);
    return (T) this;
  }

  default T bindTabDragPolicy(ObservableValue < ? extends TabPane.TabDragPolicy > in) {
    tabDragPolicyProperty().bind(in);
    return (T) this;
  }

  default T biBindTabDragPolicy(Property < TabPane.TabDragPolicy > in) {
    tabDragPolicyProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToTabDragPolicy(Property < TabPane.TabDragPolicy > in) {
    in.bind(tabDragPolicyProperty());
    return (T) this;
  }
}
