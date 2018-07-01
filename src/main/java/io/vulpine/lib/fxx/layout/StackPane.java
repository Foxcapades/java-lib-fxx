package io.vulpine.lib.fxx.layout;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;

import io.vulpine.lib.fxx.internal.mirror.PaneMirror;
import io.vulpine.lib.fxx.internal.trait.HasAlignment;

public class StackPane extends javafx.scene.layout.StackPane
implements
  PaneMirror < StackPane >,
  HasAlignment < StackPane >
{
  public StackPane() {
  }

  public StackPane(Node... children) {
    super(children);
  }

  public StackPane addChild(Node in, Pos alignment) {
    getChildren().add(in);
    setAlignment(in, alignment);
    return this;
  }

  public StackPane addChild(Node in, Insets margin) {
    getChildren().add(in);
    setMargin(in, margin);
    return this;
  }

  public StackPane addChild(Node in, Pos alignment, Insets margin) {
    getChildren().add(in);
    setAlignment(in, alignment);
    setMargin(in, margin);
    return this;
  }
}
