package th.in.pnnutkung.skeassistant.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;

import com.yqritc.recyclerviewflexibledivider.HorizontalDividerItemDecoration;
import com.yqritc.recyclerviewflexibledivider.VerticalDividerItemDecoration;

import java.util.ArrayList;
import java.util.List;

import th.in.pnnutkung.skeassistant.R;
import th.in.pnnutkung.skeassistant.callbacks.MainActivityCallback;
import th.in.pnnutkung.skeassistant.databinding.ActivityMainBinding;
import th.in.pnnutkung.skeassistant.managers.misc.Constants;
import th.in.pnnutkung.skeassistant.models.main_activity.MainActivityGridModel;
import th.in.pnnutkung.skeassistant.recycler_views.main_activity.MainActivityGridViewAdapter;

public class MainActivity extends AppCompatActivity implements MainActivityCallback {

    private ActivityMainBinding binding;
    private List<MainActivityGridModel> gridModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initTitle();
        initGridViewItem();
        initRecyclerViewAdapter();
    }

    private void initTitle() {
        setSupportActionBar(binding.mainActivityToolbarLayout);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle(Constants.MAIN_TITLE);
        }
    }

    private void initRecyclerViewAdapter() {
        MainActivityGridViewAdapter gridViewAdapter = new MainActivityGridViewAdapter(gridModelList, this);
        binding.mainActivityRecyclerView.addItemDecoration(new HorizontalDividerItemDecoration.Builder(this).build());
        binding.mainActivityRecyclerView.addItemDecoration(new VerticalDividerItemDecoration.Builder(this).build());
        binding.mainActivityRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        binding.mainActivityRecyclerView.setAdapter(gridViewAdapter);
    }

    private void initGridViewItem() {
        gridModelList = new ArrayList<>();
        gridModelList.add(new MainActivityGridModel(ContextCompat.getDrawable(this, R.drawable.ic_announcement),"Announcement"));
        gridModelList.add(new MainActivityGridModel(ContextCompat.getDrawable(this, R.drawable.ic_social),"Social"));
        gridModelList.add(new MainActivityGridModel(ContextCompat.getDrawable(this, R.drawable.ic_assignment),"Assignment"));
        gridModelList.add(new MainActivityGridModel(ContextCompat.getDrawable(this, R.drawable.ic_video),"Videos"));
    }

    @Override
    public void startActivityByItem(int position) {
        switch (position) {
            case Constants.ANNOUNCEMENT_BTN:
                startActivity(new Intent(this, AnnouncementActivity.class));
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
