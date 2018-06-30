package io.vulpine.lib.fxx.layout;

import javafx.scene.Node;

import io.vulpine.lib.fxx.internal.mirror.PaneMirror;

public class AnchorPane
extends javafx.scene.layout.AnchorPane
implements PaneMirror < AnchorPane >
{
  public AnchorPane() {
  }

  public AnchorPane(Node... children) {
    super(children);
  }

  public AnchorPane addChild(Node in, Double t, Double r, Double b, Double l) {
    getChildren().add(in);
    setTopAnchor(in, t);
    setBottomAnchor(in, b);
    setLeftAnchor(in, l);
    setRightAnchor(in, r);
    return this;
  }


}
