package io.vulpine.lib.fxx.control;

import io.vulpine.lib.fxx.internal.mirror.TextInputControlMirror;
import io.vulpine.lib.fxx.internal.trait.HasAlignment;
import io.vulpine.lib.fxx.internal.trait.event.HasOnAction;
import io.vulpine.lib.fxx.internal.trait.text.HasPrefColumnCount;

public class TextField extends javafx.scene.control.TextField
implements
  TextInputControlMirror < TextField >,
  HasPrefColumnCount < TextField >,
  HasOnAction < TextField >,
  HasAlignment < TextField >
{
  public TextField() {
  }

  public TextField(String text) {
    super(text);
  }
}
