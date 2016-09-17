package th.in.pnnutkung.skeassistant.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import th.in.pnnutkung.skeassistant.R;
import th.in.pnnutkung.skeassistant.databinding.FragmentAnnouncementRecyclerViewBinding;

public class HomeworkFragment extends Fragment {

    private FragmentAnnouncementRecyclerViewBinding binding;

    public static HomeworkFragment newInstance() {
        HomeworkFragment fragment = new HomeworkFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_announcement_recycler_view,container, false);
        return binding.getRoot();
    }
}
