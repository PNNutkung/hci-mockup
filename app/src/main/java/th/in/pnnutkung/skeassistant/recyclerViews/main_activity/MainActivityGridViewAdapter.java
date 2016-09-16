package th.in.pnnutkung.skeassistant.recyclerViews.main_activity;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import th.in.pnnutkung.skeassistant.R;

/**
 * Created by nut on 16/9/2559.
 */
public class MainActivityGridViewAdapter extends RecyclerView.Adapter<MainActivityItemHolder> {

    private final List<String> mainActivityItemList;

    public MainActivityGridViewAdapter(List<String> mainActivityItemList) {
        this.mainActivityItemList = mainActivityItemList;
    }

    @Override
    public MainActivityItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.activity_main_item_holder, parent, false);
        return new MainActivityItemHolder(binding);
    }

    @Override
    public void onBindViewHolder(MainActivityItemHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
