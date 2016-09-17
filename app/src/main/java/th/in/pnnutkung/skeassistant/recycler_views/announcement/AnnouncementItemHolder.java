package th.in.pnnutkung.skeassistant.recycler_views.announcement;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * Created by nut on 17/9/2559.
 * This class is the item holder in grid view on announcement activity.
 */
public class AnnouncementItemHolder extends RecyclerView.ViewHolder {

    private ViewDataBinding viewDataBinding;

    public AnnouncementItemHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding.getRoot());
        this.viewDataBinding = viewDataBinding;
        this.viewDataBinding.executePendingBindings();
    }

    public ViewDataBinding getViewDataBinding() {
        return this.viewDataBinding;
    }
}