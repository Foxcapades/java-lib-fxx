package io.vulpine.lib.fxx.mirror;

import io.vulpine.lib.fxx.trait.HasContextMenu;
import io.vulpine.lib.fxx.trait.HasSkin;
import io.vulpine.lib.fxx.trait.HasTooltip;

public interface ControlMirror < T extends ControlMirror >
extends
  RegionMirror < T >,
  HasSkin < T >,
  HasTooltip < T >,
  HasContextMenu < T >
{

}
