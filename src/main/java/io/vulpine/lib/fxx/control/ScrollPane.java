package io.vulpine.lib.fxx.control;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Bounds;
import javafx.scene.Node;

import io.vulpine.lib.fxx.internal.mirror.ControlMirror;
import io.vulpine.lib.fxx.internal.trait.HasContent;

public class ScrollPane extends javafx.scene.control.ScrollPane
implements
  ControlMirror < ScrollPane >,
  HasContent < ScrollPane >
{
  public ScrollPane() {
  }

  public ScrollPane(Node content) {
    super(content);
  }

  public ScrollPane hbarPolicy(ScrollBarPolicy in) {
    hbarPolicyProperty().set(in);
    return this;
  }

  public ScrollPane bindHbarPolicy(ObservableValue< ? extends ScrollBarPolicy > in) {
    hbarPolicyProperty().bind(in);
    return this;
  }

  public ScrollPane biBindHbarPolicy(Property < ScrollBarPolicy > in) {
    hbarPolicyProperty().bindBidirectional(in);
    return this;
  }

  public ScrollPane bindToHbarPolicy(Property< ScrollBarPolicy > in) {
    in.bind(hbarPolicyProperty());
    return this;
  }

  public ScrollPane vbarPolicy(ScrollBarPolicy in) {
    vbarPolicyProperty().set(in);
    return this;
  }

  public ScrollPane bindVbarPolicy(ObservableValue < ? extends ScrollBarPolicy > in) {
    vbarPolicyProperty().bind(in);
    return this;
  }

  public ScrollPane biBindVbarPolicy(Property < ScrollBarPolicy > in) {
    vbarPolicyProperty().bindBidirectional(in);
    return this;
  }

  public ScrollPane bindToVbarPolicy(Property < ScrollBarPolicy > in) {
    in.bind(vbarPolicyProperty());
    return this;
  }

  public ScrollPane hvalue(double in) {
    hvalueProperty().set(in);
    return this;
  }

  public ScrollPane bindHvalue(ObservableValue < ? extends Number > in) {
    hvalueProperty().bind(in);
    return this;
  }

  public ScrollPane biBindHvalue(Property < Number > in) {
    hvalueProperty().bindBidirectional(in);
    return this;
  }

  public ScrollPane bindToHvalue(Property < Number > in) {
    in.bind(hvalueProperty());
    return this;
  }

  public ScrollPane vvalue(double in) {
    vvalueProperty().set(in);
    return this;
  }

  public ScrollPane bindVvalue(ObservableValue < ? extends Number > in) {
    vvalueProperty().bind(in);
    return this;
  }

  public ScrollPane biBindVvalue(Property < Number > in) {
    vvalueProperty().bindBidirectional(in);
    return this;
  }

  public ScrollPane bindToVvalue(Property < Number > in) {
    in.bind(vvalueProperty());
    return this;
  }

  public ScrollPane hmin(double in) {
    hminProperty().set(in);
    return this;
  }

  public ScrollPane bindHmin(ObservableValue < ? extends Number > in) {
    hminProperty().bind(in);
    return this;
  }

  public ScrollPane biBindHmin(Property < Number > in) {
    hminProperty().bindBidirectional(in);
    return this;
  }

  public ScrollPane bindToHmin(Property < Number > in) {
    in.bind(hminProperty());
    return this;
  }

  public ScrollPane vmin(double in) {
    vminProperty().set(in);
    return this;
  }

  public ScrollPane bindVmin(ObservableValue < ? extends Number > in) {
    vminProperty().bind(in);
    return this;
  }

  public ScrollPane biBindVmin(Property < Number > in) {
    vminProperty().bindBidirectional(in);
    return this;
  }

  public ScrollPane bindToVmin(Property < Number > in) {
    in.bind(vminProperty());
    return this;
  }

  public ScrollPane hmax(double in) {
    hmaxProperty().set(in);
    return this;
  }

  public ScrollPane bindHmax(ObservableValue < ? extends Number > in) {
    hmaxProperty().bind(in);
    return this;
  }

  public ScrollPane biBindHmax(Property < Number > in) {
    hmaxProperty().bindBidirectional(in);
    return this;
  }

  public ScrollPane bindToHmax(Property < Number > in) {
    in.bind(hmaxProperty());
    return this;
  }

  public ScrollPane vmax(double in) {
    vmaxProperty().set(in);
    return this;
  }

  public ScrollPane bindVmax(ObservableValue < ? extends Number > in) {
    vmaxProperty().bind(in);
    return this;
  }

  public ScrollPane biBindVmax(Property < Number > in) {
    vmaxProperty().bindBidirectional(in);
    return this;
  }

  public ScrollPane bindToVmax(Property < Number > in) {
    in.bind(vmaxProperty());
    return this;
  }

  public ScrollPane fitToWidth(boolean in) {
    fitToWidthProperty().set(in);
    return this;
  }

  public ScrollPane bindFitToWidth(ObservableValue < ? extends Boolean > in) {
    fitToWidthProperty().bind(in);
    return this;
  }

  public ScrollPane biBindFitToWidth(Property < Boolean > in) {
    fitToWidthProperty().bindBidirectional(in);
    return this;
  }

  public ScrollPane bindToFitToWidth(Property < Boolean > in) {
    in.bind(fitToWidthProperty());
    return this;
  }

  public ScrollPane fitToHeight(boolean in) {
    fitToHeightProperty().set(in);
    return this;
  }

  public ScrollPane bindFitToHeight(ObservableValue < ? extends Boolean > in) {
    fitToHeightProperty().bind(in);
    return this;
  }

  public ScrollPane biBindFitToHeight(Property < Boolean > in) {
    fitToHeightProperty().bindBidirectional(in);
    return this;
  }

  public ScrollPane bindToFitToHeight(Property < Boolean > in) {
    in.bind(fitToHeightProperty());
    return this;
  }

  public ScrollPane pannable(boolean in) {
    pannableProperty().set(in);
    return this;
  }

  public ScrollPane bindPannable(ObservableValue < ? extends Boolean > in) {
    pannableProperty().bind(in);
    return this;
  }

  public ScrollPane biBindPannable(Property < Boolean > in) {
    pannableProperty().bindBidirectional(in);
    return this;
  }

  public ScrollPane bindToPannable(Property < Boolean > in) {
    in.bind(pannableProperty());
    return this;
  }

  public ScrollPane prefViewportWidth(double in) {
    prefViewportWidthProperty().set(in);
    return this;
  }

  public ScrollPane bindPrefViewportWidth(ObservableValue < ? extends Number > in) {
    prefViewportWidthProperty().bind(in);
    return this;
  }

  public ScrollPane biBindPrefViewportWidth(Property < Number > in) {
    prefViewportWidthProperty().bindBidirectional(in);
    return this;
  }

  public ScrollPane bindToPrefViewportWidth(Property < Number > in) {
    in.bind(prefViewportWidthProperty());
    return this;
  }

  public ScrollPane prefViewportHeight(double in) {
    prefViewportHeightProperty().set(in);
    return this;
  }

  public ScrollPane bindPrefViewportHeight(ObservableValue < ? extends Number > in) {
    prefViewportHeightProperty().bind(in);
    return this;
  }

  public ScrollPane biBindPrefViewportHeight(Property < Number > in) {
    prefViewportHeightProperty().bindBidirectional(in);
    return this;
  }

  public ScrollPane bindToPrefViewportHeight(Property < Number > in) {
    in.bind(prefViewportHeightProperty());
    return this;
  }

  public ScrollPane minViewportWidth(double in) {
    minViewportWidthProperty().set(in);
    return this;
  }

  public ScrollPane bindMinViewportWidth(ObservableValue < ? extends Number > in) {
    minViewportWidthProperty().bind(in);
    return this;
  }

  public ScrollPane biBindMinViewportWidth(Property < Number > in) {
    minViewportWidthProperty().bindBidirectional(in);
    return this;
  }

  public ScrollPane bindToMinViewportWidth(Property < Number > in) {
    in.bind(minViewportWidthProperty());
    return this;
  }

  public ScrollPane minViewportHeight(double in) {
    minViewportHeightProperty().set(in);
    return this;
  }

  public ScrollPane bindMinViewportHeight(ObservableValue < ? extends Number > in) {
    minViewportHeightProperty().bind(in);
    return this;
  }

  public ScrollPane biBindMinViewportHeight(Property < Number > in) {
    minViewportHeightProperty().bindBidirectional(in);
    return this;
  }

  public ScrollPane bindToMinViewportHeight(Property < Number > in) {
    in.bind(minViewportHeightProperty());
    return this;
  }

  public ScrollPane viewportBounds(Bounds in) {
    viewportBoundsProperty().set(in);
    return this;
  }

  public ScrollPane bindViewportBounds(ObservableValue < ? extends Bounds > in) {
    viewportBoundsProperty().bind(in);
    return this;
  }

  public ScrollPane biBindViewportBounds(Property < Bounds > in) {
    viewportBoundsProperty().bindBidirectional(in);
    return this;
  }

  public ScrollPane bindToViewportBounds(Property < Bounds > in) {
    in.bind(viewportBoundsProperty());
    return this;
  }
}
