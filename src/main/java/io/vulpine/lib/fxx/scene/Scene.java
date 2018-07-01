package io.vulpine.lib.fxx.scene;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventDispatcher;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.SceneAntialiasing;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Paint;
import javafx.stage.Window;

import io.vulpine.lib.fxx.internal.HasRoot;
import io.vulpine.lib.fxx.internal.trait.*;
import io.vulpine.lib.fxx.internal.trait.display.HasCursor;
import io.vulpine.lib.fxx.internal.trait.display.HasFill;
import io.vulpine.lib.fxx.internal.trait.event.*;
import io.vulpine.lib.fxx.internal.trait.layout.HasReadOnlyHeight;
import io.vulpine.lib.fxx.internal.trait.layout.HasReadOnlyWidth;
import io.vulpine.lib.fxx.internal.trait.layout.HasReadOnlyXY;

public class Scene extends javafx.scene.Scene
implements
  HasCamera < Scene >,
  HasCursor< Scene >,
  HasDragEvents < Scene >,
  HasFill< Scene >,
  HasKeyboardEvents < Scene >,
  HasMouseEvents < Scene >,
  HasMouseDragEvents < Scene >,
  HasNodeOrientation < Scene >,
  HasOnContextMenuRequested < Scene >,
  HasOnInputMethodTextChanged < Scene >,
  HasReadOnlyEffectiveNodeOrientation < Scene >,
  HasReadOnlyHeight< Scene >,
  HasReadOnlyWidth< Scene >,
  HasReadOnlyXY< Scene >,
  HasRoot< Scene >,
  HasRotationEvents < Scene >,
  HasScrollEvents < Scene >,
  HasStylesheets < Scene >,
  HasSwipeEvents < Scene >,
  HasTouchEvents < Scene >,
  HasUserAgentStylesheet < Scene >,
  HasZoomEvents < Scene >
{
  public Scene(Parent root) {
    super(root);
  }

  public Scene(Parent root, double width, double height) {
    super(root, width, height);
  }

  public Scene(Parent root, Paint fill) {
    super(root, fill);
  }

  public Scene(Parent root, double width, double height, Paint fill) {
    super(root, width, height, fill);
  }

  public Scene(Parent root, double width, double height, boolean depthBuffer) {
    super(root, width, height, depthBuffer);
  }

  public Scene(Parent root, double width, double height, boolean depthBuffer, SceneAntialiasing antiAliasing) {
    super(root, width, height, depthBuffer, antiAliasing);
  }

  public Scene bindToWindow(Property < Window > in) {
    in.bind(windowProperty());
    return this;
  }

  public Scene bindToFocusOwner(Property < Node > in) {
    in.bind(focusOwnerProperty());
    return this;
  }

  public Scene eventDispatcher(EventDispatcher in) {
    eventDispatcherProperty().set(in);
    return this;
  }

  public Scene bindEventDispatcher(ObservableValue < ? extends EventDispatcher > in) {
    eventDispatcherProperty().bind(in);
    return this;
  }

  public Scene biBindEventDispatcher(Property < EventDispatcher > in) {
    eventDispatcherProperty().bindBidirectional(in);
    return this;
  }

  public Scene bindToEventDispatcher(Property < EventDispatcher > in) {
    in.bind(eventDispatcherProperty());
    return this;
  }

  public Scene addAccelerator(KeyCombination a, Runnable b) {
    getAccelerators().put(a, b);
    return this;
  }
}
