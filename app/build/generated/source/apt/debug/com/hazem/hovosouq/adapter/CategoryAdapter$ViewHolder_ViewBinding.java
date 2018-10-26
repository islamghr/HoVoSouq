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

public class CategoryAdapter$ViewHolder_ViewBinding implements Unbinder {
  private CategoryAdapter.ViewHolder target;

  @UiThread
  public CategoryAdapter$ViewHolder_ViewBinding(CategoryAdapter.ViewHolder target, View source) {
    this.target = target;

    target.categIV = Utils.findRequiredViewAsType(source, R.id.categIV, "field 'categIV'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CategoryAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.categIV = null;
  }
}
