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

public class AllCategoriesAdapter$ViewHolder_ViewBinding implements Unbinder {
  private AllCategoriesAdapter.ViewHolder target;

  @UiThread
  public AllCategoriesAdapter$ViewHolder_ViewBinding(AllCategoriesAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.categIV = Utils.findRequiredViewAsType(source, R.id.categIV, "field 'categIV'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AllCategoriesAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.categIV = null;
  }
}
