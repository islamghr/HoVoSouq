// Generated code from Butter Knife. Do not modify!
package com.hazem.hovosouq.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.hazem.hovosouq.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AllCategories_ViewBinding implements Unbinder {
  private AllCategories target;

  private View view2131230755;

  @UiThread
  public AllCategories_ViewBinding(AllCategories target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AllCategories_ViewBinding(final AllCategories target, View source) {
    this.target = target;

    View view;
    target.all_cateogories = Utils.findRequiredViewAsType(source, R.id.all_categories_recyclerview, "field 'all_cateogories'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.back_arrow, "field 'back_button' and method 'Seeall'");
    target.back_button = Utils.castView(view, R.id.back_arrow, "field 'back_button'", ImageButton.class);
    view2131230755 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.Seeall();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    AllCategories target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.all_cateogories = null;
    target.back_button = null;

    view2131230755.setOnClickListener(null);
    view2131230755 = null;
  }
}
