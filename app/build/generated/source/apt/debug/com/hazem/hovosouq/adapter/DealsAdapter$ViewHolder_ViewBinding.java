// Generated code from Butter Knife. Do not modify!
package com.hazem.hovosouq.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hazem.hovosouq.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DealsAdapter$ViewHolder_ViewBinding implements Unbinder {
  private DealsAdapter.ViewHolder target;

  @UiThread
  public DealsAdapter$ViewHolder_ViewBinding(DealsAdapter.ViewHolder target, View source) {
    this.target = target;

    target.categIV = Utils.findRequiredViewAsType(source, R.id.categIV, "field 'categIV'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DealsAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.categIV = null;
  }
}
