package io.vulpine.lib.fxx.scene;

import javafx.scene.Parent;
import javafx.scene.SceneAntialiasing;

import io.vulpine.lib.fxx.internal.HasRoot;
import io.vulpine.lib.fxx.internal.mirror.NodeMirror;
import io.vulpine.lib.fxx.internal.trait.HasCamera;
import io.vulpine.lib.fxx.internal.trait.HasUserAgentStylesheet;
import io.vulpine.lib.fxx.internal.trait.display.HasFill;
import io.vulpine.lib.fxx.internal.trait.layout.HasHeight;
import io.vulpine.lib.fxx.internal.trait.layout.HasWidth;

public class SubScene extends javafx.scene.SubScene
implements
  NodeMirror < SubScene >,
  HasRoot < SubScene >,
  HasCamera < SubScene >,
  HasWidth < SubScene >,
  HasHeight < SubScene >,
  HasFill< SubScene >,
  HasUserAgentStylesheet < SubScene >
{
  public SubScene(Parent root, double width, double height) {
    super(root, width, height);
  }

  public SubScene(Parent root, double width, double height, boolean depthBuffer, SceneAntialiasing antiAliasing) {
    super(root, width, height, depthBuffer, antiAliasing);
  }
}
