package th.in.pnnutkung.skeassistant.recycler_views.announcement;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import th.in.pnnutkung.skeassistant.BR;
import th.in.pnnutkung.skeassistant.R;
import th.in.pnnutkung.skeassistant.models.announcement.AnnouncementItemModel;

/**
 * Created by nut on 17/9/2559.
 * This class use for binding item in linear view on Announce Activity.
 */
public class AnnouncementLinearViewAdapter extends RecyclerView.Adapter<AnnouncementItemHolder> {

    private final List<AnnouncementItemModel> announcementItemModelList;

    public AnnouncementLinearViewAdapter(List<AnnouncementItemModel> announcementItemModelList) {
        this.announcementItemModelList = announcementItemModelList;
    }

    @Override
    public AnnouncementItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.announcement_item_holder, parent, false);
        return new AnnouncementItemHolder(binding);
    }

    @Override
    public void onBindViewHolder(AnnouncementItemHolder holder, int position) {
        ViewDataBinding viewDataBinding = holder.getViewDataBinding();
        viewDataBinding.setVariable(BR.announceItem, announcementItemModelList.get(position));
    }

    @Override
    public int getItemCount() {
        return announcementItemModelList != null ? announcementItemModelList.size() : 0;
    }
}
