// Generated code from Butter Knife. Do not modify!
package com.hazem.hovosouq.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.hazem.hovosouq.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Products_ViewBinding implements Unbinder {
  private Products target;

  private View view2131230785;

  @UiThread
  public Products_ViewBinding(Products target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Products_ViewBinding(final Products target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.close_products, "method 'close'");
    view2131230785 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.close();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131230785.setOnClickListener(null);
    view2131230785 = null;
  }
}
