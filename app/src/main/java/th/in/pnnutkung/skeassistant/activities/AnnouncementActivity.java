package th.in.pnnutkung.skeassistant.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import th.in.pnnutkung.skeassistant.R;
import th.in.pnnutkung.skeassistant.databinding.ActivityAnnouncementBinding;

public class AnnouncementActivity extends AppCompatActivity {

    private ActivityAnnouncementBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_announcement);
        initActionBar();
    }

    private void initActionBar() {
        binding.announcementToolbarLayout.setTitle("Announcement");
        setSupportActionBar(binding.announcementToolbarLayout);
    }

}
