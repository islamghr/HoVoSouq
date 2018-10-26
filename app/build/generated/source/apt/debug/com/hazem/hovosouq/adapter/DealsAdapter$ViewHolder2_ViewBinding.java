// Generated code from Butter Knife. Do not modify!
package com.hazem.hovosouq.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hazem.hovosouq.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DealsAdapter$ViewHolder2_ViewBinding implements Unbinder {
  private DealsAdapter.ViewHolder2 target;

  @UiThread
  public DealsAdapter$ViewHolder2_ViewBinding(DealsAdapter.ViewHolder2 target, View source) {
    this.target = target;

    target.background1 = Utils.findRequiredViewAsType(source, R.id.beckground_item2_1, "field 'background1'", RelativeLayout.class);
    target.background2 = Utils.findRequiredViewAsType(source, R.id.beckground_item2_2, "field 'background2'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DealsAdapter.ViewHolder2 target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.background1 = null;
    target.background2 = null;
  }
}
