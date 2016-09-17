package th.in.pnnutkung.skeassistant.recycler_views.social;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import th.in.pnnutkung.skeassistant.BR;
import th.in.pnnutkung.skeassistant.R;
import th.in.pnnutkung.skeassistant.models.social.SocialItemModel;

/**
 * Created by nut on 17/9/2559.
 */
public class SocialLinearViewAdapter extends RecyclerView.Adapter<SocialItemHolder> {

    private final List<SocialItemModel> socialItemModels;

    public SocialLinearViewAdapter(List<SocialItemModel> socialItemModels) {
        this.socialItemModels = socialItemModels;
    }

    @Override
    public SocialItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.social_item_holder, parent, false);
        return new SocialItemHolder(binding);
    }

    @Override
    public void onBindViewHolder(SocialItemHolder holder, int position) {
        ViewDataBinding viewDataBinding = holder.getViewDataBinding();
        viewDataBinding.setVariable(BR.socialModel, socialItemModels.get(position));
    }

    @Override
    public int getItemCount() {
        return socialItemModels != null ? socialItemModels.size() : 0;
    }
}
