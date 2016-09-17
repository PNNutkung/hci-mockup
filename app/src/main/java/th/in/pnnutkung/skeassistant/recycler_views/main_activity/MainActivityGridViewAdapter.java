package th.in.pnnutkung.skeassistant.recycler_views.main_activity;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import th.in.pnnutkung.skeassistant.BR;
import th.in.pnnutkung.skeassistant.R;
import th.in.pnnutkung.skeassistant.callbacks.MainActivityCallback;
import th.in.pnnutkung.skeassistant.models.main_activity.MainActivityGridModel;

/**
 * Created by nut on 16/9/2559.
 * This class use for binding item in grid view on Main Activity.
 */
public class MainActivityGridViewAdapter extends RecyclerView.Adapter<MainActivityItemHolder> {

    private final List<MainActivityGridModel> mainActivityItemList;
    private final MainActivityCallback mainActivityCallback;

    public MainActivityGridViewAdapter(List<MainActivityGridModel> mainActivityItemList, MainActivityCallback callback) {
        this.mainActivityItemList = mainActivityItemList;
        this.mainActivityCallback = callback;
    }

    @Override
    public MainActivityItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.activity_main_item_holder, parent, false);
        return new MainActivityItemHolder(binding);
    }

    @Override
    public void onBindViewHolder(MainActivityItemHolder holder, int position) {
        ViewDataBinding viewDataBinding = holder.getViewDataBinding();
        viewDataBinding.setVariable(BR.mainActivityModel, mainActivityItemList.get(position));
        setOnItemClickListener(holder, position);
    }

    private void setOnItemClickListener(MainActivityItemHolder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivityCallback.startActivityByItem(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mainActivityItemList != null ? mainActivityItemList.size() : 0;
    }
}
