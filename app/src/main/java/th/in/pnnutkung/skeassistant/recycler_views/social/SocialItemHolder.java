package th.in.pnnutkung.skeassistant.recycler_views.social;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * Created by nut on 17/9/2559.
 */
public class SocialItemHolder extends RecyclerView.ViewHolder {
    private ViewDataBinding viewDataBinding;

    public SocialItemHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding.getRoot());
        this.viewDataBinding = viewDataBinding;
        this.viewDataBinding.executePendingBindings();
    }

    public ViewDataBinding getViewDataBinding() {
        return this.viewDataBinding;
    }
}
