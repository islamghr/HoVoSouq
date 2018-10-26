// Generated code from Butter Knife. Do not modify!
package com.hazem.hovosouq.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.hazem.hovosouq.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ProductDetails_ViewBinding implements Unbinder {
  private ProductDetails target;

  private View view2131230972;

  private View view2131230786;

  @UiThread
  public ProductDetails_ViewBinding(ProductDetails target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ProductDetails_ViewBinding(final ProductDetails target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.writereview, "field 'writereview' and method 'write_review'");
    target.writereview = Utils.castView(view, R.id.writereview, "field 'writereview'", LinearLayout.class);
    view2131230972 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.write_review();
      }
    });
    view = Utils.findRequiredView(source, R.id.close_products_details, "method 'close'");
    view2131230786 = view;
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
    ProductDetails target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.writereview = null;

    view2131230972.setOnClickListener(null);
    view2131230972 = null;
    view2131230786.setOnClickListener(null);
    view2131230786 = null;
  }
}
