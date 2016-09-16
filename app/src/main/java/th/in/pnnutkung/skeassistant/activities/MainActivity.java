package th.in.pnnutkung.skeassistant.activities;

import android.databinding.DataBindingUtil;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;

import java.util.ArrayList;
import java.util.List;

import th.in.pnnutkung.skeassistant.R;
import th.in.pnnutkung.skeassistant.callbacks.MainActivityCallback;
import th.in.pnnutkung.skeassistant.databinding.ActivityMainBinding;
import th.in.pnnutkung.skeassistant.managers.misc.Constants;
import th.in.pnnutkung.skeassistant.models.main_activity.MainActivityGridModel;
import th.in.pnnutkung.skeassistant.recyclerViews.main_activity.MainActivityGridViewAdapter;

public class MainActivity extends AppCompatActivity implements MainActivityCallback {

    private ActivityMainBinding binding;
    private List<MainActivityGridModel> gridModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initGridViewItem();
        initRecyclerViewAdapter();
    }

    private void initRecyclerViewAdapter() {
        MainActivityGridViewAdapter gridViewAdapter = new MainActivityGridViewAdapter(gridModelList, this);
        binding.mainActivityRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        binding.mainActivityRecyclerView.setAdapter(gridViewAdapter);
    }

    private void initGridViewItem() {
        gridModelList = new ArrayList<>();
        gridModelList.add(new MainActivityGridModel(ContextCompat.getDrawable(this, R.drawable.ic_announcement),"Annoucement"));
    }

    @Override
    public void startActivityByItem(int position) {
        switch (position) {
            case Constants.ANNOUNCEMENT_BTN:
                break;
            case Constants.SOCIAL_BTN:
                break;
            case Constants.DOCUMENT_BTN:
                break;
            case Constants.VIDEOS_BTN:
                break;
        }
    }
}
