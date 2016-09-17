package th.in.pnnutkung.skeassistant.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import th.in.pnnutkung.skeassistant.R;
import th.in.pnnutkung.skeassistant.databinding.ActivitySocialBinding;

public class SocialActivity extends AppCompatActivity {

    private ActivitySocialBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_social);
        initActionBar();
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
