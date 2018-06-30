package io.vulpine.lib.fxx.internal.mirror;

import javafx.scene.Node;

import io.vulpine.lib.fxx.internal.trait.HasNeedsLayout;
import io.vulpine.lib.fxx.internal.trait.HasStylesheets;

public interface ParentMirror < T extends ParentMirror >
extends
  NodeMirror < T >,
  HasNeedsLayout < T >,
  HasStylesheets < T >
{
  void toFront(Node node);

  default T sendToFront(Node node) {
    toFront(node);
    return (T) this;
  }

  void toBack(Node node);

  default T sendToBack(Node node) {
    toBack(node);
    return (T) this;
  }

}
