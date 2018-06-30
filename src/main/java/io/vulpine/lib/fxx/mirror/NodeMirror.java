package io.vulpine.lib.fxx.mirror;

import io.vulpine.lib.fxx.trait.*;

public interface NodeMirror< T extends NodeMirror >
extends
  HasAccessibility < T >,
  HasBlendMode < T >,
  HasCache < T >,
  HasCacheHint < T >,
  HasClip < T >,
  HasCursor < T >,
  HasDepthTest < T >,
  HasDisable < T >,
  HasDragEvents< T >,
  HasEffect < T >,
  HasFocusTraversal < T >,
  HasId < T >,
  HasLayout< T >,
  HasManaged < T >,
  HasMouseDragEvents< T >,
  HasMouseEvents < T >,
  HasMouseTransparent < T >,
  HasNodeOrientation < T >,
  HasOpacity < T >,
  HasOnContextMenuRequested < T >,
  HasOnInputMethod < T >,
  HasKeyboardEvents< T >,
  HasPickOnBounds < T >,
  HasReadOnlyBoundsInLocal < T >,
  HasReadOnlyBoundsInParent < T >,
  HasReadOnlyDisabled < T >,
  HasReadOnlyEffectiveNodeOrientation < T >,
  HasReadOnlyHover < T >,
  HasReadOnlyLayoutBounds < T >,
  HasReadOnlyLocalToParentTransform < T >,
  HasReadOnlyLocalToSceneTransform < T >,
  HasReadOnlyParent < T >,
  HasReadOnlyPressed < T >,
  HasReadOnlyScene < T >,
  HasRotate < T >,
  HasRotationAxis < T >,
  HasRotationEvents < T >,
  HasScale< T >,
  HasScrollEvents < T >,
  HasStyle < T >,
  HasStyleClasses < T >,
  HasSwipeEvents < T >,
  HasTouchEvents < T >,
  HasTranslate< T >,
  HasViewOrder < T >,
  HasVisible < T >,
  HasZoomEvents < T >
  {
  void autosize();

  void toBack();

  void toFront();

  void relocate(double x, double y);

  default T sendToBack() {
    toBack();
    return (T) this;
  }

  default T sendToFront() {
    toFront();
    return (T) this;
  }

  default T relocateTo(double x, double y) {
    relocate(x, y);
    return (T) this;
  }

  default T autoSize() {
    autosize();
    return (T) this;
  }
}
