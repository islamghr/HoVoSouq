// Generated code from Butter Knife. Do not modify!
package com.hazem.hovosouq.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.hazem.hovosouq.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainFragment_ViewBinding implements Unbinder {
  private MainFragment target;

  private View view2131230917;

  @UiThread
  public MainFragment_ViewBinding(final MainFragment target, View source) {
    this.target = target;

    View view;
    target.imagesRV = Utils.findRequiredViewAsType(source, R.id.imagesRV, "field 'imagesRV'", RecyclerView.class);
    target.offersRV = Utils.findRequiredViewAsType(source, R.id.offersRV, "field 'offersRV'", RecyclerView.class);
    target.categoryRV = Utils.findRequiredViewAsType(source, R.id.categoryRV, "field 'categoryRV'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.seeall, "field 'seeall' and method 'Seeall'");
    target.seeall = Utils.castView(view, R.id.seeall, "field 'seeall'", TextView.class);
    view2131230917 = view;
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
    MainFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imagesRV = null;
    target.offersRV = null;
    target.categoryRV = null;
    target.seeall = null;

    view2131230917.setOnClickListener(null);
    view2131230917 = null;
  }
}
