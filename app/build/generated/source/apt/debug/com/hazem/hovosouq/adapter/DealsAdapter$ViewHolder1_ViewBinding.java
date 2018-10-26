// Generated code from Butter Knife. Do not modify!
package com.hazem.hovosouq.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hazem.hovosouq.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DealsAdapter$ViewHolder1_ViewBinding implements Unbinder {
  private DealsAdapter.ViewHolder1 target;

  @UiThread
  public DealsAdapter$ViewHolder1_ViewBinding(DealsAdapter.ViewHolder1 target, View source) {
    this.target = target;

    target.background = Utils.findRequiredViewAsType(source, R.id.dealtime1_background, "field 'background'", RelativeLayout.class);
    target.button = Utils.findRequiredViewAsType(source, R.id.dealtime1_button, "field 'button'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DealsAdapter.ViewHolder1 target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.background = null;
    target.button = null;
  }
}
