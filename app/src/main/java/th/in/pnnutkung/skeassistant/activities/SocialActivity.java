package th.in.pnnutkung.skeassistant.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.MenuItem;

import com.yqritc.recyclerviewflexibledivider.HorizontalDividerItemDecoration;

import java.util.ArrayList;
import java.util.List;

import th.in.pnnutkung.skeassistant.R;
import th.in.pnnutkung.skeassistant.databinding.ActivitySocialBinding;
import th.in.pnnutkung.skeassistant.models.social.SocialItemModel;
import th.in.pnnutkung.skeassistant.recycler_views.social.SocialLinearViewAdapter;

public class SocialActivity extends AppCompatActivity {

    private ActivitySocialBinding binding;
    private List<SocialItemModel> socialItemModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_social);
        initActionBar();
        initChannel();
        initRecyclerView();
    }

    private void initRecyclerView() {
        SocialLinearViewAdapter linearViewAdapter = new SocialLinearViewAdapter(socialItemModels);
        binding.socialRecyclerView.addItemDecoration(new HorizontalDividerItemDecoration.Builder(this).build());
        binding.socialRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.socialRecyclerView.setAdapter(linearViewAdapter);
    }

    private void initChannel() {
        socialItemModels = new ArrayList<>();
        socialItemModels.add(new SocialItemModel("SKE"));
        socialItemModels.add(new SocialItemModel("CPSK"));
        socialItemModels.add(new SocialItemModel("E70"));
        socialItemModels.add(new SocialItemModel("KU74"));
    }

    private void initActionBar() {
        setSupportActionBar(binding.socialToolbarLayout);
        if(getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
