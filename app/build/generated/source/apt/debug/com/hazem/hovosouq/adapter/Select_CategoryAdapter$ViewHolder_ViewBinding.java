// Generated code from Butter Knife. Do not modify!
package com.hazem.hovosouq.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.hazem.hovosouq.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Select_CategoryAdapter$ViewHolder_ViewBinding implements Unbinder {
  private Select_CategoryAdapter.ViewHolder target;

  private View view2131230722;

  @UiThread
  public Select_CategoryAdapter$ViewHolder_ViewBinding(final Select_CategoryAdapter.ViewHolder target,
      View source) {
    this.target = target;

    View view;
    target.category_item = Utils.findRequiredViewAsType(source, R.id.category_item, "field 'category_item'", RelativeLayout.class);
    view = Utils.findRequiredView(source, R.id.ClickedItems, "field 'button' and method 'getdetailes'");
    target.button = Utils.castView(view, R.id.ClickedItems, "field 'button'", Button.class);
    view2131230722 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.getdetailes();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    Select_CategoryAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.category_item = null;
    target.button = null;

    view2131230722.setOnClickListener(null);
    view2131230722 = null;
  }
}
