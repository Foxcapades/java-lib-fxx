package io.vulpine.lib.fxx.internal.mirror;

import io.vulpine.lib.fxx.internal.trait.HasNeedsLayout;
import io.vulpine.lib.fxx.internal.trait.HasStylesheets;

public interface ParentMirror < T extends ParentMirror >
extends
  NodeMirror < T >,
  HasNeedsLayout < T >,
  HasStylesheets < T >
{
}
