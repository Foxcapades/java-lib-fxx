package io.vulpine.lib.fxx.text;

import javafx.scene.Node;

import io.vulpine.lib.fxx.internal.mirror.PaneMirror;
import io.vulpine.lib.fxx.internal.trait.text.HasLineSpacing;
import io.vulpine.lib.fxx.internal.trait.text.HasTextAlignment;

public class TextFlow extends javafx.scene.text.TextFlow
implements
  PaneMirror < TextFlow >,
  HasTextAlignment < TextFlow >,
  HasLineSpacing < TextFlow >
{
  public TextFlow() {
  }

  public TextFlow(Node... children) {
    super(children);
  }
}
