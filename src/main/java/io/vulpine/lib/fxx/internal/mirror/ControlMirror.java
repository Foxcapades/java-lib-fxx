package io.vulpine.lib.fxx.internal.mirror;

import io.vulpine.lib.fxx.internal.trait.HasContextMenu;
import io.vulpine.lib.fxx.internal.trait.HasSkin;
import io.vulpine.lib.fxx.internal.trait.HasTooltip;

public interface ControlMirror < T extends ControlMirror >
extends
  RegionMirror < T >,
  HasSkin < T >,
  HasTooltip < T >,
  HasContextMenu < T >
{

}
