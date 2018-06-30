package io.vulpine.lib.fxx.internal.mirror;

import javafx.collections.ObservableList;
import javafx.scene.Node;

public interface PaneMirror < T extends PaneMirror >
extends
  RegionMirror < T >
{
  public ObservableList<Node> getChildren();

  default T addChild(Node in) {
    getChildren().add(in);
    return (T) this;
  }

  default T addChildren(Node ...in) {
    getChildren().addAll(in);
    return (T) this;
  }

  default T setChildren(Node ...in) {
    getChildren().setAll(in);
    return (T) this;
  }
}
