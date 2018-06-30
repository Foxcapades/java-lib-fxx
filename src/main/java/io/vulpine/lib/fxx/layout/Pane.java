package io.vulpine.lib.fxx.layout;

import javafx.scene.Node;

import io.vulpine.lib.fxx.internal.mirror.PaneMirror;

public class Pane
extends javafx.scene.layout.Pane
implements PaneMirror < Pane >
{
  public Pane() {
  }

  public Pane(Node... children) {
    super(children);
  }
}
