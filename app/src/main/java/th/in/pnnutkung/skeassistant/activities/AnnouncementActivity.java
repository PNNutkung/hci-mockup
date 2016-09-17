package th.in.pnnutkung.skeassistant.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import th.in.pnnutkung.skeassistant.R;
import th.in.pnnutkung.skeassistant.databinding.ActivityAnnouncementBinding;
import th.in.pnnutkung.skeassistant.fragments.HomeworkFragment;
import th.in.pnnutkung.skeassistant.fragments.ImportantFragment;
import th.in.pnnutkung.skeassistant.managers.misc.Constants;
import th.in.pnnutkung.skeassistant.viewpagers.announcement.ViewPagerAdapter;

public class AnnouncementActivity extends AppCompatActivity {

    private ActivityAnnouncementBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_announcement);
        initActionBar();
        initViewPagerAdapter();
    }

    private void initViewPagerAdapter() {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(ImportantFragment.newInstance(), Constants.IMPORTANT);
        viewPagerAdapter.addFragment(HomeworkFragment.newInstance(), Constants.HOMEWORK);
        binding.announcementViewPager.setAdapter(viewPagerAdapter);
        binding.announcementViewPager.setOffscreenPageLimit(2);
        binding.announcementTabLayout.setupWithViewPager(binding.announcementViewPager);
    }

    private void initActionBar() {
        setSupportActionBar(binding.announcementToolbarLayout);
    }

}
