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

public class Rating_ViewBinding implements Unbinder {
  private Rating target;

  private View view2131230784;

  @UiThread
  public Rating_ViewBinding(Rating target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Rating_ViewBinding(final Rating target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.cloase_rating, "method 'close_rating'");
    view2131230784 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.close_rating();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131230784.setOnClickListener(null);
    view2131230784 = null;
  }
}
