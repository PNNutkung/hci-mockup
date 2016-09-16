package th.in.pnnutkung.skeassistant.recyclerViews.main_activity;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * Created by nut on 16/9/2559.
 */
public class MainActivityItemHolder extends RecyclerView.ViewHolder {

    private ViewDataBinding viewDataBinding;

    public MainActivityItemHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding.getRoot());
        this.viewDataBinding = viewDataBinding;
        this.viewDataBinding.executePendingBindings();
    }

    public ViewDataBinding getViewDataBinding() {
        return this.viewDataBinding;
    }
}
